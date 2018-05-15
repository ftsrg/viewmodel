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
import com.google.common.collect.Lists
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTracePackage
import hu.bme.mit.inf.viewmodel.runtime.queries.viewmodeltrace.util.NamedMatchArgumentQuerySpecification
import hu.bme.mit.inf.viewmodel.runtime.queries.viewmodeltrace.util.NamedTraceQuerySpecification
import java.util.Collections
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples
import org.eclipse.xtend.lib.annotations.Accessors

class TracePQuery extends BaseGeneratedEMFPQuery {
	@Accessors(PUBLIC_GETTER) val String traceName
	@Accessors(PUBLIC_GETTER) val List<String> argumentNames
	val PParameter traceModelIdParameter
	val List<PParameter> matchArgumentParameters
	val PParameter traceParameter
	@Accessors(PUBLIC_GETTER) val EClass traceClass
	@Accessors(PUBLIC_GETTER) val List<PParameter> parameters

	new(String traceName, List<String> argumentNames, EClass traceClass) {
		this.traceName = traceName
		this.argumentNames = ImmutableList.copyOf(argumentNames)
		this.matchArgumentParameters = PQueryUtils.newMatchArgumentParameters(argumentNames)
		this.traceClass = traceClass
		val parametersBuilder = ImmutableList.builder
		traceModelIdParameter = PQueryUtils.newTraceModelIdParameter
		parametersBuilder.add(traceModelIdParameter)
		parametersBuilder.addAll(matchArgumentParameters)
		traceParameter = PQueryUtils.newTraceParameter(PQueryUtils.TRACE_PARAMETER, traceClass)
		parametersBuilder.add(traceParameter)
		parameters = parametersBuilder.build
	}

	override protected doGetContainedBodies() throws QueryInitializationException {
		val body = new PBody(this)
		val symbolicParameters = Lists.newArrayListWithExpectedSize(parameters.size)
		val traceModelIdVariable = PQueryUtils.newTraceModelIdVariable(body)
		symbolicParameters += new ExportedParameter(body, traceModelIdVariable, traceModelIdParameter)
		val traceVariable = PQueryUtils.newTraceVariable(body, PQueryUtils.TRACE_PARAMETER, traceClass)
		val argumentTupleVariable = PQueryUtils.newVariable(body, PQueryUtils.ARGUMENT_TUPLE_VARIABLE,
			ViewModelTracePackage.Literals.MATCH_ARGUMENT_TUPLE)
		val traceNameVariable = body.newConstantVariable(traceName)
		new PositivePatternCall(body,
			Tuples.flatTupleOf(traceModelIdVariable, traceNameVariable, argumentTupleVariable, traceVariable),
			NamedTraceQuerySpecification.instance.internalQueryRepresentation)
		for (parameter : matchArgumentParameters) {
			val elementVariable = body.getOrCreateVariableByName(parameter.name)
			symbolicParameters += new ExportedParameter(body, elementVariable, parameter)
			val nameVariable = body.newConstantVariable(parameter.name)
			new PositivePatternCall(body, Tuples.flatTupleOf(argumentTupleVariable, nameVariable, elementVariable),
				NamedMatchArgumentQuerySpecification.instance.internalQueryRepresentation)
		}
		symbolicParameters += new ExportedParameter(body, traceVariable, traceParameter)
		body.symbolicParameters = symbolicParameters
		Collections.singleton(body)
	}

	override getFullyQualifiedName() {
		traceName + "<trace>"
	}
}
