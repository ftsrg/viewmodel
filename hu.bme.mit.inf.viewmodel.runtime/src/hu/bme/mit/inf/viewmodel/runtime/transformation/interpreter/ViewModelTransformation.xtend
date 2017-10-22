package hu.bme.mit.inf.viewmodel.runtime.transformation.interpreter

import com.google.common.collect.ImmutableMultimap
import com.google.common.collect.Maps
import hu.bme.mit.inf.viewmodel.runtime.queries.logicmodel.util.DirtyLogicModelQuerySpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.ConstraintRuleSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.DependencyRuleSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.RuleSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.VariableInstantiationRuleSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.ViewSpecification
import hu.bme.mit.inf.viewmodel.runtime.transformation.common.BasicChainableTransformationFactory
import hu.bme.mit.inf.viewmodel.runtime.transformation.common.CreateDeletePriority
import hu.bme.mit.inf.viewmodel.runtime.transformation.common.Lazy
import hu.bme.mit.inf.viewmodel.runtime.transformation.common.PrioritisedRuleGroup
import java.util.Collections
import org.eclipse.viatra.query.runtime.api.GenericQueryGroup
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRuleFactory

class ViewModelTransformation extends BasicChainableTransformationFactory {
	static val VARIABLE_INSTANTIATION_RULE_PRIORITY = CreateDeletePriority.of(20, -10)
	static val CONSTRAINT_RULE_PRIORITY = CreateDeletePriority.of(10, -20)
	static val CLUSTER_SPLIT_PRIORITY = CreateDeletePriority.of(30, 30)

	val ViewSpecification<? extends IQuerySpecification<?>, Void> viewSpecification
	val TraceQueries traceQueries
	val PreconditionQueries preconditionQueries
	val ViewModelTraceManager traceManager
	val LogicModelManager logicModelManager
	extension val EventDrivenTransformationRuleFactory = new EventDrivenTransformationRuleFactory

	new(ViewSpecification<? extends IQuerySpecification<?>, Void> viewSpecification, ViewModelTraceManager traceManager,
		LogicModelManager logicModelManager) {
		this.viewSpecification = viewSpecification
		traceQueries = new TraceQueries(viewSpecification)
		preconditionQueries = new PreconditionQueries(viewSpecification, traceQueries)
		this.traceManager = traceManager
		this.logicModelManager = logicModelManager
	}

	override getQueryGroup() {
		GenericQueryGroup.of(
			traceQueries.queryGroup.specifications + preconditionQueries.queryGroup.specifications +
				logicModelManager.constraintManagerQueryGroup.specifications +
				#{DirtyLogicModelQuerySpecification.instance})
	}

	def getTraceModel() {
		traceManager.traceModel
	}

	def getLogicModel() {
		logicModelManager.logicModel
	}

	override createRuleGroup(ViatraQueryEngine queryEngine) {
		val constraintManager = Lazy.of[logicModelManager.createConstraintManager(queryEngine)]
		val traceMatcher = Lazy.of[traceQueries.createMatcher(queryEngine, traceManager)]
		val builder = ImmutableMultimap.builder
		for (ruleSpecification : viewSpecification.ruleSpecifications) {
			val rules = createRules(ruleSpecification, constraintManager, traceMatcher)
			for (pair : rules) {
				builder.put(pair.key, pair.value)
			}
		}
		val clusterSplitRule = createRule.precondition(DirtyLogicModelQuerySpecification.instance).action(
			CRUDActivationStateEnum.CREATED) [
			constraintManager.get.splitClusters
		].filter [
			logicModelId == logicModelManager.logicModelId
		].build
		builder.put(CLUSTER_SPLIT_PRIORITY, clusterSplitRule)
		new PrioritisedRuleGroup(builder.build)
	}

	protected dispatch def Iterable<Pair<CreateDeletePriority, ? extends EventDrivenTransformationRule<?, ?>>> createRules(
		VariableInstantiationRuleSpecification<? extends IQuerySpecification<?>, ? extends Void> ruleSpecification,
		Lazy<LogicModelConstraintManager> constraintManager, Lazy<ViewModelTraceMatcher> traceMatcher) {
		val pattern = ruleSpecification.preconditionPattern as IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>
		val rule = createRule.precondition(pattern).action(CRUDActivationStateEnum.CREATED) [ match |
			val variables = Maps.newHashMapWithExpectedSize(ruleSpecification.variables.size)
			for (variableName : ruleSpecification.variables) {
				val variable = logicModelManager.newVariable
				variables.put(variableName, variable)
			}
			traceManager.createVariableInstantiationTrace(ruleSpecification, match, variables)
			constraintManager.get.registerVariables(variables.values)
		// println(match)
		].action(CRUDActivationStateEnum.DELETED) [ match |
			val trace = traceMatcher.get.getVariableInstantiationTrace(ruleSpecification, match)
			constraintManager.get.unregisterVariables(trace.variables.map[value])
			traceManager.removeTrace(trace)
		].build
		Collections.singleton(VARIABLE_INSTANTIATION_RULE_PRIORITY -> rule)
	}

	protected dispatch def Iterable<Pair<CreateDeletePriority, ? extends EventDrivenTransformationRule<?, ?>>> createRules(
		ConstraintRuleSpecification<? extends IQuerySpecification<?>, ? extends Void> ruleSpecification,
		Lazy<LogicModelConstraintManager> constraintManager, Lazy<ViewModelTraceMatcher> traceMatcher) {
		val precondition = preconditionQueries.getConstraintPreconditionQuery(ruleSpecification)
		val rule = createRule.precondition(precondition).filter [
			get(PQueryUtils.TRACE_MODEL_ID_PARAMETER) == traceManager.traceModelId
		].action(CRUDActivationStateEnum.CREATED) [ match |
			val interpreter = new ConstraintInterpreter(ruleSpecification, match, logicModelManager)
			traceManager.newConstraintTrace(ruleSpecification, match, interpreter.localVariables,
				interpreter.constraints)
			val theConstraintManager = constraintManager.get
			theConstraintManager.registerConstraints(interpreter.constraints)
			theConstraintManager.registerVariables(interpreter.localVariables)
		// println(match)
		].action(CRUDActivationStateEnum.DELETED) [ match |
			val trace = traceMatcher.get.getConstraintTrace(ruleSpecification, match)
			val theConstraintManager = constraintManager.get
			// Remove constraints first to allow clusters to update.
			theConstraintManager.unregisterConstraints(trace.constraints)
			theConstraintManager.unregisterVariables(trace.localVariables)
			traceManager.removeTrace(trace)
		].build
		Collections.singleton(CONSTRAINT_RULE_PRIORITY -> rule)
	}

	protected dispatch def Iterable<Pair<CreateDeletePriority, ? extends EventDrivenTransformationRule<?, ?>>> createRules(
		DependencyRuleSpecification<? extends IQuerySpecification<?>, ? extends Void> ruleSpecification,
		Lazy<LogicModelConstraintManager> constraintManager, Lazy<ViewModelTraceMatcher> traceMatcher) {
		emptyList
	}

	protected dispatch def Iterable<Pair<CreateDeletePriority, ? extends EventDrivenTransformationRule<?, ?>>> createRules(
		RuleSpecification<? extends IQuerySpecification<?>, ? extends Void> ruleSpecification,
		Lazy<LogicModelConstraintManager> constraintManager, Lazy<ViewModelTraceMatcher> traceMatcher) {
		throw new IllegalArgumentException("Unknown rule specification: " + ruleSpecification)
	}
}
