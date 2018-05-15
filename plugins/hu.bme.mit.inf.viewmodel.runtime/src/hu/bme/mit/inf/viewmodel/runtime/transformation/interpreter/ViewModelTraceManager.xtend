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

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Constraint
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ConstraintTrace
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.Trace
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.TraceState
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.VariableInstantiationTrace
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTrace
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTraceFactory
import hu.bme.mit.inf.viewmodel.runtime.specification.ConstraintRuleSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.VariableInstantiationRuleSpecification
import java.util.Collection
import java.util.Map
import java.util.UUID
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
class ViewModelTraceManager {
	@Accessors(PUBLIC_GETTER) val ViewModelTrace traceModel

	new(LogicModel logicModel) {
		this(ViewModelTraceFactory.eINSTANCE.createViewModelTrace => [
			traceModelId = UUID.randomUUID.toString
			it.logicModel = logicModel
		])
	}

	new(Resource resource, LogicModel logicModel) {
		this(logicModel)
		resource.contents += traceModel
	}

	def getTraceModelId() {
		traceModel.traceModelId
	}

	def createVariableInstantiationTrace(
		VariableInstantiationRuleSpecification<? extends IQuerySpecification<?>, ?> ruleSpecification,
		IPatternMatch patternMatch, Map<String, Variable> variables, VariableInstantiationTrace traceToReuse) {
		val trace = traceToReuse ?: ViewModelTraceFactory.eINSTANCE.createVariableInstantiationTrace
		trace.traceName = ruleSpecification.preconditionPattern.fullyQualifiedName
		trace.argumentTuple = createArgumentTuple(ruleSpecification.preconditionPattern.parameterNames, patternMatch)
		trace.state = TraceState.USED
		for (pair : variables.entrySet) {
			trace.variables += ViewModelTraceFactory.eINSTANCE.createStringVariablePair => [
				key = pair.key
				value = pair.value
			]
		}
		traceModel.traces += trace
	}

	def newConstraintTrace(ConstraintRuleSpecification<? extends IQuerySpecification<?>, ?> ruleSpecification,
		IPatternMatch patternMatch, Collection<Variable> localVariables, Collection<Constraint> constraints,
		ConstraintTrace traceToReuse) {
		val trace = traceToReuse ?: ViewModelTraceFactory.eINSTANCE.createConstraintTrace
		trace.traceName = ruleSpecification.name
		trace.argumentTuple = createArgumentTuple(ruleSpecification.parameters, patternMatch)
		trace.state = TraceState.USED
		// Do not use addAll(), because it is slow due to uniqueness checking.
		for (variable : localVariables) {
			trace.localVariables += variable
		}
		for (constraint : constraints) {
			trace.constraints += constraint
		}
		traceModel.traces += trace
	}

	def removeTraceLazy(Trace trace) {
		trace.state = TraceState.UNUSED
		trace.traceName = null
		trace.argumentTuple = null
		switch (trace) {
			VariableInstantiationTrace:
				trace.variables.clear
			ConstraintTrace: {
				trace.localVariables.clear
				trace.constraints.clear
			}
			default:
				throw new IllegalArgumentException("Unknown trace: " + trace)
		}
	}

	def removeTraces(Collection<Trace> traces) {
		if (!traces.empty) {
			traceModel.traces.removeAll(traces)
		}
	}

	protected def createArgumentTuple(Iterable<String> argumentNames, IPatternMatch originalMatch) {
		val tuple = ViewModelTraceFactory.eINSTANCE.createMatchArgumentTuple
		for (argumentName : argumentNames) {
			val argument = originalMatch.get(argumentName)
			tuple.elements += if (argument instanceof EObject) {
				ViewModelTraceFactory.eINSTANCE.createEObjectMatchArgument => [
					parameterName = argumentName
					value = argument
				]
			} else {
				ViewModelTraceFactory.eINSTANCE.createJavaObjectMatchArgument => [
					parameterName = argumentName
					value = argument
				]
			}
		}
		tuple
	}
}
