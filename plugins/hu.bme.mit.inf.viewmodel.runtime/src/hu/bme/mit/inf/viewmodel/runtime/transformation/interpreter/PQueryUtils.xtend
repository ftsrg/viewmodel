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

import com.google.common.collect.ImmutableList
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ConstraintTrace
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.VariableInstantiationTrace
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTracePackage
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples

package final class PQueryUtils {
	public static val TRACE_MODEL_ID_PARAMETER = "<traceModelId>"
	public static val TRACE_PARAMETER = "<trace>"
	public static val ARGUMENT_TUPLE_VARIABLE = "<argumentTuple>"
	static val RESERVED_NAMES = #[TRACE_MODEL_ID_PARAMETER, TRACE_PARAMETER, ARGUMENT_TUPLE_VARIABLE]

	public static val VARIABLE_INSTANTIATION_TRACE = ViewModelTracePackage.Literals.VARIABLE_INSTANTIATION_TRACE
	public static val CONSTRAINT_TRACE = ViewModelTracePackage.Literals.CONSTRAINT_TRACE

	private new() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}

	static def newTraceModelIdParameter() {
		new PParameter(PQueryUtils.TRACE_MODEL_ID_PARAMETER, String.name,
			new EDataTypeInSlotsKey(EcorePackage.Literals.ESTRING))
	}

	static def newTraceModelIdVariable(PBody body) {
		val traceVariable = body.getOrCreateVariableByName(PQueryUtils.TRACE_MODEL_ID_PARAMETER)
		new TypeConstraint(body, Tuples.flatTupleOf(traceVariable),
			new EDataTypeInSlotsKey(EcorePackage.Literals.ESTRING))
		traceVariable
	}

	static def newTraceParameter(String name, EClass traceClass) {
		checkTraceClass(traceClass)
		val className = switch (traceClass) {
			case VARIABLE_INSTANTIATION_TRACE:
				VariableInstantiationTrace.name
			case CONSTRAINT_TRACE:
				ConstraintTrace.name
			default:
				throw new IllegalArgumentException("Unknown trace class: " + traceClass)
		}
		new PParameter(name, className, new EClassTransitiveInstancesKey(traceClass))
	}

	static def newTraceVariable(PBody body, String name, EClass traceClass) {
		checkTraceClass(traceClass)
		newVariable(body, name, traceClass)
	}

	static def newMatchArgumentParameters(Iterable<String> parameterNames) {
		checkReservedNames(parameterNames)
		ImmutableList.copyOf(parameterNames.map[name|new PParameter(name)])
	}

	static def newVariable(PBody body, String name, EClass eClass) {
		val variable = body.getOrCreateVariableByName(name)
		new TypeConstraint(body, Tuples.flatTupleOf(variable), new EClassTransitiveInstancesKey(eClass))
		variable
	}

	private static def checkReservedNames(Iterable<String> argumentNames) {
		for (reservedName : RESERVED_NAMES) {
			if (argumentNames.exists[it == reservedName]) {
				throw new IllegalArgumentException(reservedName + " is a reserved parameter name.")
			}
		}
	}

	private static def checkTraceClass(EClass traceClass) {
		if (traceClass != ViewModelTracePackage.Literals.TRACE &&
			!traceClass.EAllSuperTypes.contains(ViewModelTracePackage.Literals.TRACE)) {
			throw new IllegalArgumentException("A descendant of viewmodeltrace.Trace is required as traceClass.")
		}
	}
}
