package hu.bme.mit.inf.viewmodel.runtime.transformation.interpreter

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Constraint
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelFactory
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable
import java.util.Collection
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
class LogicModelManager implements ILogicModelManager {
	@Accessors(PUBLIC_GETTER) val LogicModel logicModel
	var long variableId = 0

	new() {
		this(LogicModelFactory.eINSTANCE.createLogicModel)
	}

	new(Resource resource) {
		this()
		resource.contents += logicModel
	}

	override newVariable() {
		val variable = LogicModelFactory.eINSTANCE.createVariable
		variable.id = variableId
		variableId++
		logicModel.variables += variable
		variable
	}

	override addEquivalenceConstraint(Variable left, Variable right) {
		val constraint = LogicModelFactory.eINSTANCE.createEquivalenceConstraint
		constraint.left = left
		constraint.right = right
		logicModel.constraints += constraint
		constraint
	}

	override addEClassConstraint(Variable variable, EClass eClass) {
		val constraint = LogicModelFactory.eINSTANCE.createEClassConstraint
		constraint.variable = variable
		constraint.targetEClass = eClass
		logicModel.constraints += constraint
		constraint
	}

	override addJavaClassConstraint(Variable variable, Class<?> javaClass) {
		val constraint = LogicModelFactory.eINSTANCE.createJavaClassConstraint
		constraint.variable = variable
		constraint.targetClass = javaClass
		logicModel.constraints += constraint
		constraint
	}

	override addConstantEObjectConstraint(Variable variable, EObject value) {
		val constraint = LogicModelFactory.eINSTANCE.createConstantEObjectConstraint
		constraint.variable = variable
		constraint.value = value
		constraint.valueType = value.eClass
		logicModel.constraints += constraint
		constraint
	}

	override addConstantJavaObjectConstraint(Variable variable, Object value) {
		val constraint = LogicModelFactory.eINSTANCE.createConstantJavaObjectConstraint
		constraint.variable = variable
		constraint.value = value
		constraint.valueType = value.class
		logicModel.constraints += constraint
		constraint
	}

	override addRelationConstraint(Variable left, Variable right, EStructuralFeature relation) {
		val constraint = LogicModelFactory.eINSTANCE.createRelationConstraint
		constraint.left = left
		constraint.right = right
		constraint.targetRelation = relation
		logicModel.constraints += constraint
		constraint
	}

	override void removeVariables(Collection<Variable> variables) {
		logicModel.variables.removeAll(variables)
	}

	override void removeConstraints(Collection<Constraint> constraints) {
		logicModel.constraints.removeAll(constraints)
	}
}
