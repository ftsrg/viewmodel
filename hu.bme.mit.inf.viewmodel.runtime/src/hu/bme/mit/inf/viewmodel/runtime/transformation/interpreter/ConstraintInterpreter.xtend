package hu.bme.mit.inf.viewmodel.runtime.transformation.interpreter

import com.google.common.collect.ImmutableList
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Constraint
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.VariableInstantiationTrace
import hu.bme.mit.inf.viewmodel.runtime.specification.AssignmentConstraintSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.ConstantConstraintSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.ConstraintRuleSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.ConstraintSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.EquivalenceConstraintSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.LocalVariableReference
import hu.bme.mit.inf.viewmodel.runtime.specification.LookupVariableReference
import hu.bme.mit.inf.viewmodel.runtime.specification.TypeConstraintSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.VariableReference
import java.util.Collections
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.viatra.query.runtime.api.GenericPatternMatch
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey

class ConstraintInterpreter {
	val GenericPatternMatch match
	val LogicModelManager logicModelManager
	val Map<String, Variable> localVariables
	val List<Constraint> constraints

	new(ConstraintRuleSpecification<?, ? extends Void> ruleSpecification, GenericPatternMatch match,
		LogicModelManager logicModelManager) {
		this.match = match
		this.logicModelManager = logicModelManager
		localVariables = ruleSpecification.localVariables.toMap([name], [logicModelManager.newVariable()])
		constraints = ImmutableList.copyOf(ruleSpecification.constraintSpecifications.flatMap[createConstraints])
	}

	def getLocalVariables() {
		localVariables.values
	}

	def getConstraints() {
		constraints
	}

	protected dispatch def Iterable<Constraint> createConstraints(
		EquivalenceConstraintSpecification<? extends Void> constraintSpecification) {
		val left = getVariable(constraintSpecification.left)
		val right = getVariable(constraintSpecification.right)
		Collections.singleton(logicModelManager.addEquivalenceConstraint(left, right))
	}

	protected dispatch def Iterable<Constraint> createConstraints(
		TypeConstraintSpecification<? extends Void> constraintSpecification) {
		switch (constraintSpecification.arguments.size) {
			case 1: {
				val variable = getVariable(constraintSpecification.arguments.get(0))
				switch (inputKey : constraintSpecification.inputKey) {
					EClassTransitiveInstancesKey:
						Collections.singleton(logicModelManager.addEClassConstraint(variable, inputKey.emfKey))
					EDataTypeInSlotsKey:
						Collections.singleton(
							logicModelManager.addJavaClassConstraint(variable, inputKey.emfKey.instanceClass))
					JavaTransitiveInstancesKey:
						Collections.singleton(
							logicModelManager.addJavaClassConstraint(variable, inputKey.wrapperInstanceClass))
					default:
						throw new IllegalArgumentException("Unknown unary IInputKey: " + inputKey)
				}
			}
			case 2: {
				val left = getVariable(constraintSpecification.arguments.get(0))
				val right = getVariable(constraintSpecification.arguments.get(1))
				switch (inputKey : constraintSpecification.inputKey) {
					EStructuralFeatureInstancesKey:
						Collections.singleton(logicModelManager.addRelationConstraint(left, right, inputKey.emfKey))
					default:
						throw new IllegalArgumentException("Unknown unary IInputKey: " + inputKey)
				}
			}
			default:
				throw new IllegalArgumentException("Only unary and binary IInputKeys are supported.")
		}
	}
	
	protected dispatch def Iterable<Constraint> createConstraints(
		AssignmentConstraintSpecification<? extends Void> constraintSpecification) {
		val variable = getVariable(constraintSpecification.left)
		val value = match.get(constraintSpecification.right)
		if (value === null) {
			throw new IllegalArgumentException("Unknown match argument: " + constraintSpecification.right)
		}
		createConstantConstraints(variable, value)
	}
	
	protected dispatch def Iterable<Constraint> createConstraints(
		ConstantConstraintSpecification<? extends Void> constraintSpecification) {
		val variable = getVariable(constraintSpecification.left)
		val value = constraintSpecification.right
		createConstantConstraints(variable, value)
	}
	
	protected def Iterable<Constraint> createConstantConstraints(Variable variable, Object value) {
		if (value instanceof EObject) {
			Collections.singleton(logicModelManager.addConstantEObjectConstraint(variable, value))
		} else {
			Collections.singleton(logicModelManager.addConstantJavaObjectConstraint(variable, value))
		}
	}

	protected dispatch def Iterable<Constraint> createConstraints(
		ConstraintSpecification<? extends Void> constraintSpecification) {
		throw new IllegalArgumentException("Unknown constraint: " + constraintSpecification)
	}

	protected dispatch def Variable getVariable(LookupVariableReference reference) {
		val matchArgument = match.get(reference.lookupName)
		if (!(matchArgument instanceof VariableInstantiationTrace)) {
			throw new IllegalArgumentException("Unknown lookup: " + reference.lookupName)
		}
		val trace = matchArgument as VariableInstantiationTrace
		val variable = trace.variables.get(reference.variableName)
		if (variable === null) {
			throw new IllegalArgumentException("Unknown trace variable: " + reference.variableName)
		}
		variable
	}

	protected dispatch def Variable getVariable(LocalVariableReference reference) {
		val variable = localVariables.get(reference.variableName)
		if (variable === null) {
			throw new IllegalArgumentException("Unknown local variable: " + reference.variableName)
		}
		variable
	}

	protected dispatch def Variable getVariable(VariableReference reference) {
		throw new IllegalArgumentException("Unknown variable reference: " + reference)
	}
}
