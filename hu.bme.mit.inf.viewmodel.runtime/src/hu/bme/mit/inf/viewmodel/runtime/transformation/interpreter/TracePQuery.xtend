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
	val String traceName
	val PParameter traceModelIdParameter
	val List<PParameter> matchArgumentParameters
	val PParameter traceParameter
	val EClass traceClass
	@Accessors(PUBLIC_GETTER) val List<PParameter> parameters

	new(String traceName, List<String> argumentNames, EClass traceClass) {
		this.traceName = traceName
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
		symbolicParameters += new ExportedParameter(body, traceVariable, traceParameter)
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
		body.symbolicParameters = symbolicParameters
		Collections.singleton(body)
	}

	override getFullyQualifiedName() {
		traceName + "<trace>"
	}
}
