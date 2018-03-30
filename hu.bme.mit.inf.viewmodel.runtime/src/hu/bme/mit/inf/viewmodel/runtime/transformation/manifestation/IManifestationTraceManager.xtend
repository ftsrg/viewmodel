package hu.bme.mit.inf.viewmodel.runtime.transformation.manifestation

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Cluster
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel
import hu.bme.mit.inf.viewmodel.runtime.model.manifestationtrace.InterpretedManifestation
import hu.bme.mit.inf.viewmodel.runtime.model.manifestationtrace.Manifestation
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature

interface IManifestationTraceManager {

	def LogicModel getLogicModel()

	def List<EObject> getResults()

	def String getTraceModelId()

	def void manifestInterpretedEObject(Cluster cluster, EClass type)

	def void manifestUninterpretedEObject(Cluster cluster, EObject sourceEObject)

	def void manifestPrimitive(Cluster cluster, Object value)

	def void removeManifestation(Cluster cluster)

	def void setRelation(InterpretedManifestation leftManifestation, Manifestation rightManifestation,
		EStructuralFeature targetFeature)

	def void unsetRelation(InterpretedManifestation leftManifestation, Manifestation rightManifestation,
		EStructuralFeature targetFeature)
}
