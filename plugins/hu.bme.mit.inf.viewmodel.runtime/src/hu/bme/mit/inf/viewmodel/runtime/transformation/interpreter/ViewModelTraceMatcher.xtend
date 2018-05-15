/********************************************************************************
 * Copyright (c) 2018 Contributors to the ViewModel project
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * SPDX-License-Identifier: EPL-1.0
 ********************************************************************************/
package hu.bme.mit.inf.viewmodel.runtime.transformation.interpreter

import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ConstraintTrace
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.Trace
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.VariableInstantiationTrace
import hu.bme.mit.inf.viewmodel.runtime.queries.viewmodeltrace.LonelyVariableMatcher
import hu.bme.mit.inf.viewmodel.runtime.queries.viewmodeltrace.UnusedConstraintTraceMatcher
import hu.bme.mit.inf.viewmodel.runtime.queries.viewmodeltrace.UnusedTraceMatcher
import hu.bme.mit.inf.viewmodel.runtime.queries.viewmodeltrace.UnusedVariableInstantiationTraceMatcher
import hu.bme.mit.inf.viewmodel.runtime.queries.viewmodeltrace.util.LonelyVariableQuerySpecification
import hu.bme.mit.inf.viewmodel.runtime.queries.viewmodeltrace.util.UnusedConstraintTraceQuerySpecification
import hu.bme.mit.inf.viewmodel.runtime.queries.viewmodeltrace.util.UnusedTraceQuerySpecification
import hu.bme.mit.inf.viewmodel.runtime.queries.viewmodeltrace.util.UnusedVariableInstantiationTraceQuerySpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.ConstraintRuleSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.VariableInstantiationRuleSpecification
import java.util.Map
import org.eclipse.viatra.query.runtime.api.GenericPatternMatcher
import org.eclipse.viatra.query.runtime.api.GenericQueryGroup
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine

class ViewModelTraceMatcher {
	public static val DEFAULT_QUERY_GROUP = new GenericQueryGroup(#{
		LonelyVariableQuerySpecification.instance,
		UnusedVariableInstantiationTraceQuerySpecification.instance,
		UnusedConstraintTraceQuerySpecification.instance,
		UnusedTraceQuerySpecification.instance
	})
	
	val ViewModelTraceManager viewModelTraceManager
	val Map<IQuerySpecification<?>, GenericPatternMatcher> variableInstantiationMatchers
	val Map<String, GenericPatternMatcher> constraintMatchers
	val LonelyVariableMatcher lonelyVariableMatcher
	val UnusedVariableInstantiationTraceMatcher unusedVariableInstantiationTraceMatcher
	val UnusedConstraintTraceMatcher unusedConstraintTraceMatcher
	val UnusedTraceMatcher unusedTraceMatcher

	new(ViatraQueryEngine queryEngine, ViewModelTraceManager viewModelTraceManager,
		Map<IQuerySpecification<?>, TraceQuerySpecification> variableInstantiationQueries,
		Map<String, TraceQuerySpecification> constraintQueries) {
		this.viewModelTraceManager = viewModelTraceManager
		variableInstantiationMatchers = variableInstantiationQueries.mapValues [ querySpecification |
			querySpecification.getMatcher(queryEngine)
		]
		constraintMatchers = constraintQueries.mapValues [ querySpecification |
			querySpecification.getMatcher(queryEngine)
		]
		lonelyVariableMatcher = LonelyVariableMatcher.on(queryEngine)
		unusedVariableInstantiationTraceMatcher = UnusedVariableInstantiationTraceMatcher.on(queryEngine)
		unusedConstraintTraceMatcher = UnusedConstraintTraceMatcher.on(queryEngine)
		unusedTraceMatcher = UnusedTraceMatcher.on(queryEngine)
	}
	
	def getTraceModelId() {
		viewModelTraceManager.traceModelId
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
	
	def getLonelyVariables() {
		lonelyVariableMatcher.getAllValuesOfVar(traceModelId)
	}
	
	def getNextUnusedVariableInstantiationTrace() {
		unusedVariableInstantiationTraceMatcher.getOneArbitraryMatch(traceModelId, null)?.trace
	}
	
	def getNextUnusedConstraintTrace() {
		unusedConstraintTraceMatcher.getOneArbitraryMatch(traceModelId, null)?.trace
	}
	
	def getUnusedTraces() {
		unusedTraceMatcher.getAllValuesOfTrace(traceModelId)
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
