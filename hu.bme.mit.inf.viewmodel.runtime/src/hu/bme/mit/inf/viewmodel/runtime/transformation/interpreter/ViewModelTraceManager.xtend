package hu.bme.mit.inf.viewmodel.runtime.transformation.interpreter

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Constraint
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.Trace
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

	new(LogicModelManager logicModelManager) {
		this(ViewModelTraceFactory.eINSTANCE.createViewModelTrace => [
			traceModelId = UUID.randomUUID.toString
			logicModel = logicModelManager.logicModel
		])
	}
	
	new(Resource resource, LogicModelManager logicModelManager) {
		this(logicModelManager)
		resource.contents += traceModel
	}

	def getTraceModelId() {
		traceModel.traceModelId
	}
	
	def createVariableInstantiationTrace(
		VariableInstantiationRuleSpecification<? extends IQuerySpecification<?>, ?> ruleSpecification,
		IPatternMatch patternMatch, Map<String, Variable> variables) {
		traceModel.traces += ViewModelTraceFactory.eINSTANCE.createVariableInstantiationTrace => [
			traceName = ruleSpecification.preconditionPattern.fullyQualifiedName
			argumentTuple = createArgumentTuple(ruleSpecification.preconditionPattern.parameterNames, patternMatch)
			for (pair : variables.entrySet) {
				it.variables.put(pair.key, pair.value)
			}
		]
	}

	def newConstraintTrace(ConstraintRuleSpecification<? extends IQuerySpecification<?>, ?> ruleSpecification,
		IPatternMatch patternMatch, Collection<Variable> localVariables, Collection<Constraint> constraints) {
		val trace = ViewModelTraceFactory.eINSTANCE.createConstraintTrace => [
			traceName = ruleSpecification.name
			argumentTuple = createArgumentTuple(ruleSpecification.parameters, patternMatch)
			it.localVariables.addAll(localVariables)
			it.constraints.addAll(constraints)
		]
		traceModel.traces += trace
	}

	def removeTrace(Trace trace) {
		traceModel.traces -= trace
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
