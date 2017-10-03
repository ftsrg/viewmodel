package hu.bme.mit.inf.viewmodel.runtime.transformation.interpreter

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Constraint
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable
import java.util.Collection
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature

interface ILogicModelManager {
	def LogicModel getLogicModel()
	
	def Variable newVariable()

	def Constraint addEquivalenceConstraint(Variable left, Variable right)

	def Constraint addEClassConstraint(Variable variable, EClass eClass)

	def Constraint addJavaClassConstraint(Variable variable, Class<?> javaClass)

	def Constraint addConstantEObjectConstraint(Variable variable, EObject value)

	def Constraint addConstantJavaObjectConstraint(Variable variable, Object value)

	def Constraint addRelationConstraint(Variable left, Variable right, EStructuralFeature relation)

	def void removeVariables(Collection<Variable> variables)

	def void removeConstraints(Collection<Constraint> constraints)
}
