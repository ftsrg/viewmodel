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
class LogicModelManager {
	@Accessors(PUBLIC_GETTER) val LogicModel logicModel
	var long variableId = 0

	new() {
		this(LogicModelFactory.eINSTANCE.createLogicModel)
	}
	
	new(Resource resource) {
		this()
		resource.contents += logicModel
	}

	def newVariable() {
		val variable = LogicModelFactory.eINSTANCE.createVariable
		variable.id = variableId
		variableId++
		logicModel.variables += variable
		variable
	}
	
	def addEquivalenceConstraint(Variable left, Variable right) {
		val constraint = LogicModelFactory.eINSTANCE.createEquivalenceConstraint
		constraint.left = left
		constraint.right = right
		logicModel.constraints += constraint
		constraint
	}

	def addEClassConstraint(Variable variable, EClass eClass) {
		val constraint = LogicModelFactory.eINSTANCE.createEClassConstraint
		constraint.variable = variable
		constraint.targetEClass = eClass
		logicModel.constraints += constraint
		constraint
	}

	def addJavaClassConstraint(Variable variable, Class<?> javaClass) {
		val constraint = LogicModelFactory.eINSTANCE.createJavaClassConstraint
		constraint.variable = variable
		constraint.targetClass = javaClass
		logicModel.constraints += constraint
		constraint
	}

	def addConstantEObjectConstraint(Variable variable, EObject value) {
		val constraint = LogicModelFactory.eINSTANCE.createConstantEObjectConstraint
		constraint.variable = variable
		constraint.value = value
		logicModel.constraints += constraint
		constraint
	}

	def addConstantJavaObjectConstraint(Variable variable, Object value) {
		val constraint = LogicModelFactory.eINSTANCE.createConstantJavaObjectConstraint
		constraint.variable = variable
		constraint.value = value
		logicModel.constraints += constraint
		constraint
	}

	def addRelationConstraint(Variable left, Variable right, EStructuralFeature relation) {
		val constraint = LogicModelFactory.eINSTANCE.createRelationConstraint
		constraint.left = left
		constraint.right = right
		constraint.targetRelation = relation
		logicModel.constraints += constraint
		constraint
	}
	
	def void removeVariables(Collection<Variable> variables) {
		logicModel.variables.removeAll(variables)
	}
	
	def void removeConstraints(Collection<Constraint> constraints) {
		logicModel.constraints.removeAll(constraints)
	}
}
