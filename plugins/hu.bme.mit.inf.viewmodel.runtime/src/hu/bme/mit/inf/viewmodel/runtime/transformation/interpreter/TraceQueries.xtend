package hu.bme.mit.inf.viewmodel.runtime.transformation.interpreter

import hu.bme.mit.inf.viewmodel.runtime.specification.ConstraintRuleSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.DependencyRuleSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.RuleSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.VariableInstantiationRuleSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.ViewSpecification
import java.util.HashMap
import org.eclipse.viatra.query.runtime.api.GenericQueryGroup
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine

class TraceQueries {
	val variableInstantiationQueries = new HashMap<IQuerySpecification<?>, TraceQuerySpecification>
	val constraintQueries = new HashMap<String, TraceQuerySpecification>

	new(ViewSpecification<? extends IQuerySpecification<?>, ?> viewSpecification) {
		for (ruleSpecification : viewSpecification.ruleSpecifications) {
			processRuleSpecification(ruleSpecification)
		}
	}

	def getQueryGroup() {
		GenericQueryGroup.of(variableInstantiationQueries.values + constraintQueries.values +
			ViewModelTraceMatcher.DEFAULT_QUERY_GROUP.specifications)
	}

	def getVariableInstantiationTraceQuery(IQuerySpecification<?> preconditionSpecification) {
		val traceQuery = variableInstantiationQueries.get(preconditionSpecification)
		if (traceQuery === null) {
			throw new IllegalArgumentException("No variable trace query for pattern " +
				preconditionSpecification.fullyQualifiedName)
		}
		traceQuery
	}

	def getConstraintTraceQuery(String ruleName) {
		val traceQuery = constraintQueries.get(ruleName)
		if (traceQuery === null) {
			throw new IllegalArgumentException("No constraint trace query for rule " + ruleName)
		}
		traceQuery
	}

	def createMatcher(ViatraQueryEngine queryEngine, ViewModelTraceManager traceManager) {
		new ViewModelTraceMatcher(queryEngine, traceManager, variableInstantiationQueries, constraintQueries)
	}

	protected dispatch def void processRuleSpecification(
		VariableInstantiationRuleSpecification<? extends IQuerySpecification<?>, ?> ruleSpecification) {
		val preconditionQuery = ruleSpecification.preconditionPattern
		val preconditionName = preconditionQuery.fullyQualifiedName
		val preconditionArguments = preconditionQuery.parameterNames
		val traceQuery = new TraceQuerySpecification(preconditionName, preconditionArguments,
			PQueryUtils.VARIABLE_INSTANTIATION_TRACE)
		variableInstantiationQueries.put(preconditionQuery, traceQuery)
	}

	protected dispatch def void processRuleSpecification(
		ConstraintRuleSpecification<? extends IQuerySpecification<?>, ?> ruleSpecification) {
		val ruleName = ruleSpecification.name
		val traceQuery = new TraceQuerySpecification(ruleName, ruleSpecification.parameters,
			PQueryUtils.CONSTRAINT_TRACE)
		constraintQueries.put(ruleName, traceQuery)
	}

	protected dispatch def void processRuleSpecification(
		DependencyRuleSpecification<? extends IQuerySpecification<?>, ?> ruleSpecification) {
		// No tracing queries are required for dependency rules.
	}

	protected dispatch def void processRuleSpecification(
		RuleSpecification<? extends IQuerySpecification<?>, ?> ruleSpecification) {
		throw new IllegalArgumentException("Unknown rule specification: " + ruleSpecification)
	}
}
