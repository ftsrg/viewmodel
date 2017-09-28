package hu.bme.mit.inf.viewmodel.runtime.transformation.interpreter

import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ConstraintTrace
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.Trace
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.VariableInstantiationTrace
import hu.bme.mit.inf.viewmodel.runtime.specification.ConstraintRuleSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.VariableInstantiationRuleSpecification
import java.util.Map
import org.eclipse.viatra.query.runtime.api.GenericPatternMatcher
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine

class ViewModelTraceMatcher {
	val String traceModelId
	val Map<IQuerySpecification<?>, GenericPatternMatcher> variableInstantiationMatchers
	val Map<String, GenericPatternMatcher> constraintMatchers

	new(ViatraQueryEngine queryEngine, String traceModelId,
		Map<IQuerySpecification<?>, TraceQuerySpecification> variableInstantiationQueries,
		Map<String, TraceQuerySpecification> constraintQueries) {
		this.traceModelId = traceModelId
		variableInstantiationMatchers = variableInstantiationQueries.mapValues [ querySpecification |
			querySpecification.getMatcher(queryEngine)
		]
		constraintMatchers = constraintQueries.mapValues [ querySpecification |
			querySpecification.getMatcher(queryEngine)
		]
	}

	def getVariableInstantiationTrace(
		VariableInstantiationRuleSpecification<? extends IQuerySpecification<?>, ?> ruleSpecification,
		IPatternMatch patternMatch) {
		val preconditionQuery = ruleSpecification.preconditionPattern
		val matcher = getVariableInstantiationTraceMatcher(preconditionQuery)
		getTrace(matcher, preconditionQuery.parameterNames, patternMatch, VariableInstantiationTrace)
	}

	def getConstraintTrace(ConstraintRuleSpecification<?, ?> ruleSpecification, IPatternMatch patternMatch) {
		val matcher = getConstraintTraceMatcher(ruleSpecification.name)
		getTrace(matcher, ruleSpecification.parameters, patternMatch, ConstraintTrace)
	}

	protected def getVariableInstantiationTraceMatcher(IQuerySpecification<?> preconditionSpecification) {
		val traceQuery = variableInstantiationMatchers.get(preconditionSpecification)
		if (traceQuery === null) {
			throw new IllegalArgumentException("No variable trace matcher for pattern " +
				preconditionSpecification.fullyQualifiedName)
		}
		traceQuery
	}

	protected def getConstraintTraceMatcher(String ruleName) {
		val traceQuery = constraintMatchers.get(ruleName)
		if (traceQuery === null) {
			throw new IllegalArgumentException("No constraint trace matcher for rule " + ruleName)
		}
		traceQuery
	}

	protected def <T extends Trace> getTrace(GenericPatternMatcher traceMatcher, Iterable<String> argumentNames,
		IPatternMatch originalMatch, Class<? extends T> traceClass) {
		val match = traceMatcher.newEmptyMatch
		match.set(PQueryUtils.TRACE_MODEL_ID_PARAMETER, traceModelId)
		for (argumentName : argumentNames) {
			match.set(argumentName, originalMatch.get(argumentName))
		}
		val traces = traceMatcher.getAllValues(PQueryUtils.TRACE_PARAMETER, match).filter(traceClass)
		val iterator = traces.iterator
		if (!iterator.hasNext) {
			throw new IllegalArgumentException("No trace matches: " + match)
		}
		val trace = iterator.next
		if (iterator.hasNext) {
			throw new IllegalArgumentException("Ambiguous trace matches: " + match)
		}
		trace
	}
}
