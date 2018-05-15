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
import com.google.common.collect.Maps
import hu.bme.mit.inf.viewmodel.runtime.specification.LookupPreconditionSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.MatchPreconditionSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.PreconditionSpecification
import java.util.ArrayList
import java.util.Collections
import java.util.List
import java.util.Map
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples
import org.eclipse.xtend.lib.annotations.Accessors

class PreconditionPQuery extends BaseGeneratedEMFPQuery {
	@Accessors(PUBLIC_GETTER) val String fullyQualifiedName
	val List<? extends PreconditionSpecification<? extends IQuerySpecification<?>>> preconditionSpecifications
	val TraceQueries traceQueryManager
	val PParameter traceModelIdParameter
	val List<PParameter> matchArgumentParameters
	val List<PParameter> lookupParameters
	@Accessors(PUBLIC_GETTER) val List<PParameter> parameters

	new(
		String name,
		List<String> argumentNames,
		List<? extends PreconditionSpecification<? extends IQuerySpecification<?>>> preconditionSpecifications,
		TraceQueries traceQueryManager
	) {
		fullyQualifiedName = name
		this.preconditionSpecifications = preconditionSpecifications
		this.traceQueryManager = traceQueryManager
		val parametersBuilder = ImmutableList.builder
		traceModelIdParameter = PQueryUtils.newTraceModelIdParameter
		parametersBuilder.add(traceModelIdParameter)
		matchArgumentParameters = PQueryUtils.newMatchArgumentParameters(argumentNames)
		parametersBuilder.addAll(matchArgumentParameters)
		lookupParameters = new ArrayList
		for (preconditionSpecification : preconditionSpecifications) {
			if (LookupPreconditionSpecification.isInstance(preconditionSpecification)) {
				val lookupSpecification = preconditionSpecification as LookupPreconditionSpecification<? extends IQuerySpecification<?>>
				val lookupParameter = PQueryUtils.newTraceParameter(lookupSpecification.name,
					PQueryUtils.VARIABLE_INSTANTIATION_TRACE)
				lookupParameters.add(lookupParameter)
				parametersBuilder.add(lookupParameter)
			}
		}
		parameters = parametersBuilder.build
	}

	override protected doGetContainedBodies() throws QueryInitializationException {
		val body = new PBody(this)
		val symbolicParameters = Lists.newArrayListWithExpectedSize(parameters.size)
		val traceModelIdVariable = PQueryUtils.newTraceModelIdVariable(body)
		symbolicParameters += new ExportedParameter(body, traceModelIdVariable, traceModelIdParameter)
		val matchArgumentVariablesMap = Maps.newHashMapWithExpectedSize(matchArgumentParameters.size)
		for (matchArgumentParameter : matchArgumentParameters) {
			val matchArgumentName = matchArgumentParameter.name
			val matchArgumentVariable = body.getOrCreateVariableByName(matchArgumentName)
			symbolicParameters += new ExportedParameter(body, matchArgumentVariable, matchArgumentParameter)
			matchArgumentVariablesMap.put(matchArgumentName, matchArgumentVariable)
		}
		val lookupVariablesMap = Maps.newHashMapWithExpectedSize(lookupParameters.size)
		for (lookupParameter : lookupParameters) {
			val lookupParameterName = lookupParameter.name
			val lookupVariable = body.getOrCreateVariableByName(lookupParameterName)
			symbolicParameters += new ExportedParameter(body, lookupVariable, lookupParameter)
			lookupVariablesMap.put(lookupParameterName, lookupVariable)
		}
		for (preconditionSpecification : preconditionSpecifications) {
			if (MatchPreconditionSpecification.isInstance(preconditionSpecification)) {
				val matchSpecification = preconditionSpecification as MatchPreconditionSpecification<? extends IQuerySpecification<?>>
				val collectedArguments = collectArguments(matchSpecification.arguments, matchArgumentVariablesMap)
				val argumentTuple = toFlatTuple(collectedArguments)
				new PositivePatternCall(body, argumentTuple,
					matchSpecification.preconditionPattern.internalQueryRepresentation)
			} else if (LookupPreconditionSpecification.isInstance(preconditionSpecification)) {
				val lookupSpecification = preconditionSpecification as LookupPreconditionSpecification<? extends IQuerySpecification<?>>
				val lookupArguments = collectArguments(lookupSpecification.arguments, matchArgumentVariablesMap)
				val argumentList = Lists.newArrayListWithExpectedSize(lookupArguments.size + 2)
				argumentList += traceModelIdVariable
				argumentList += lookupArguments
				argumentList += lookupVariablesMap.get(lookupSpecification.name)
				val argumentTuple = toFlatTuple(argumentList)
				val preconditionPattern = lookupSpecification.preconditionPattern
				val tracedQuery = traceQueryManager.getVariableInstantiationTraceQuery(preconditionPattern)
				new PositivePatternCall(body, argumentTuple, tracedQuery.internalQueryRepresentation)
				// Allow the precondition match disappear even if the variable instantiation trace was not removed.
				new PositivePatternCall(body, toFlatTuple(lookupArguments),
					preconditionPattern.internalQueryRepresentation)
			} else {
				throw new IllegalArgumentException("Unknown precondition specification: " + preconditionSpecification)
			}
		}
		body.symbolicParameters = symbolicParameters
		Collections.singleton(body)
	}

	private def collectArguments(List<String> argumentNames, Map<String, PVariable> argumentVariables) {
		argumentNames.map [ argumentName |
			val argumentParameter = argumentVariables.get(argumentName)
			if (argumentParameter === null) {
				throw new IllegalArgumentException("Unknown parameter: " + argumentName)
			}
			argumentParameter
		]
	}

	private def toFlatTuple(List<?> elements) {
		Tuples.flatTupleOf(elements.toArray)
	}
}
