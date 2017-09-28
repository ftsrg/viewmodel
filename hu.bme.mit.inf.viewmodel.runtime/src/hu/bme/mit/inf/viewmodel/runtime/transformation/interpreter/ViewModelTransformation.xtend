package hu.bme.mit.inf.viewmodel.runtime.transformation.interpreter

import com.google.common.collect.ImmutableMultimap
import com.google.common.collect.Maps
import hu.bme.mit.inf.viewmodel.runtime.specification.ConstraintRuleSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.DependencyRuleSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.RuleSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.VariableInstantiationRuleSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.ViewSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.viatraquery.QuerySpecificationTemplateParser
import hu.bme.mit.inf.viewmodel.runtime.transformation.common.IChainableTransformation
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

class ViewModelTransformation implements IChainableTransformation {
	static val VARIABLE_INSTANTIATION_RULE_PRIORITY = 0
	static val CONSTRAINT_RULE_PRIORITY = 1

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
		GenericQueryGroup.of(traceQueries.queryGroup.specifications + preconditionQueries.queryGroup.specifications)
	}

	def getTraceModel() {
		traceManager.traceModel
	}

	def getLogicModel() {
		logicModelManager.logicModel
	}

	override createRuleGroup(ViatraQueryEngine queryEngine) {
		val traceMatcher = traceQueries.createMatcher(queryEngine, traceManager)
		val builder = ImmutableMultimap.builder
		for (ruleSpecification : viewSpecification.ruleSpecifications) {
			val rules = createRules(ruleSpecification, traceMatcher)
			for (pair : rules) {
				builder.put(pair.key, pair.value)
			}
		}
		new PrioritisedRuleGroup(builder.build)
	}

	protected dispatch def Iterable<Pair<Integer, ? extends EventDrivenTransformationRule<?, ?>>> createRules(
		VariableInstantiationRuleSpecification<? extends IQuerySpecification<?>, ? extends Void> ruleSpecification,
		ViewModelTraceMatcher traceMatcher) {
		val pattern = ruleSpecification.preconditionPattern as IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>
		val rule = createRule.precondition(pattern).action(CRUDActivationStateEnum.CREATED) [ match |
			val variables = Maps.newHashMapWithExpectedSize(ruleSpecification.variables.size)
			for (variableName : ruleSpecification.variables) {
				val variable = logicModelManager.newVariable
				variables.put(variableName, variable)
			}
			traceManager.createVariableInstantiationTrace(ruleSpecification, match, variables)
		].action(CRUDActivationStateEnum.DELETED) [ match |
			val trace = traceMatcher.getVariableInstantiationTrace(ruleSpecification, match)
			logicModelManager.removeVariables(trace.variables.values)
			traceManager.removeTrace(trace)
		].build
		Collections.singleton(VARIABLE_INSTANTIATION_RULE_PRIORITY -> rule)
	}

	protected dispatch def Iterable<Pair<Integer, ? extends EventDrivenTransformationRule<?, ?>>> createRules(
		ConstraintRuleSpecification<? extends IQuerySpecification<?>, ? extends Void> ruleSpecification,
		ViewModelTraceMatcher traceMatcher) {
		val precondition = preconditionQueries.getConstraintPreconditionQuery(ruleSpecification)
		val rule = createRule.precondition(precondition).filter [
			get(PQueryUtils.TRACE_MODEL_ID_PARAMETER) == traceManager.traceModelId
		].action(CRUDActivationStateEnum.CREATED) [ match |
			val interpreter = new ConstraintInterpreter(ruleSpecification, match, logicModelManager)
			traceManager.newConstraintTrace(ruleSpecification, match, interpreter.localVariables,
				interpreter.constraints)
		].action(CRUDActivationStateEnum.DELETED) [ match |
			val trace = traceMatcher.getConstraintTrace(ruleSpecification, match)
			logicModelManager.removeVariables(trace.localVariables)
			logicModelManager.removeConstraints(trace.constraints)
			traceManager.removeTrace(trace)
		].build
		Collections.singleton(CONSTRAINT_RULE_PRIORITY -> rule)
	}

	protected dispatch def Iterable<Pair<Integer, ? extends EventDrivenTransformationRule<?, ?>>> createRules(
		DependencyRuleSpecification<? extends IQuerySpecification<?>, ? extends Void> ruleSpecification,
		ViewModelTraceMatcher traceMatcher) {
		emptyList
	}

	protected dispatch def Iterable<Pair<Integer, ? extends EventDrivenTransformationRule<?, ?>>> createRules(
		RuleSpecification<? extends IQuerySpecification<?>, ? extends Void> ruleSpecification,
		ViewModelTraceMatcher traceMatcher) {
		throw new IllegalArgumentException("Unknown rule specification: " + ruleSpecification)
	}

	static def of(
		ViewSpecification<? extends IQuerySpecification<?>, ? extends IQuerySpecification<?>> viewSpecification,
		ViewModelTraceManager traceManager,
		LogicModelManager logicModelManager
	) {
		val transformedSpecification = viewSpecification.parseTemplates(new QuerySpecificationTemplateParser)
		new ViewModelTransformation(transformedSpecification, traceManager, logicModelManager)
	}
}
