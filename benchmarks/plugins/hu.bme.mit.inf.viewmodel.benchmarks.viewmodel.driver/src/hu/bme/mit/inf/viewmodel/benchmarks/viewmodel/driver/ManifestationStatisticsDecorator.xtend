package hu.bme.mit.inf.viewmodel.benchmarks.viewmodel.driver

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Cluster
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.InterpretedManifestation
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Manifestation
import hu.bme.mit.inf.viewmodel.runtime.transformation.manifestation.IManifestationTraceManager
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.Delegate
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
package class ManifestationStatisticsDecorator implements IManifestationTraceManager {
	@Delegate val IManifestationTraceManager delegateTraceManager

	@Accessors(PUBLIC_GETTER) var int eObjectsCreated = 0
	@Accessors(PUBLIC_GETTER) var int eObjectConstantsCreated = 0
	@Accessors(PUBLIC_GETTER) var int primitiveConstantsCreated = 0
	@Accessors(PUBLIC_GETTER) var int manifestationsRemoved = 0
	@Accessors(PUBLIC_GETTER) var int relationsSet = 0
	@Accessors(PUBLIC_GETTER) var int relationsUnset = 0

	def resetStatistics() {
		eObjectsCreated = 0
		eObjectConstantsCreated = 0
		primitiveConstantsCreated = 0
		manifestationsRemoved = 0
		relationsSet = 0
		relationsUnset = 0
	}

	override manifestInterpretedEObject(Cluster cluster, EClass type) {
		eObjectsCreated++
		delegateTraceManager.manifestInterpretedEObject(cluster, type)
	}

	override manifestPrimitive(Cluster cluster, Object value) {
		primitiveConstantsCreated++
		delegateTraceManager.manifestPrimitive(cluster, value)
	}

	override manifestUninterpretedEObject(Cluster cluster, EObject sourceEObject) {
		eObjectConstantsCreated++
		delegateTraceManager.manifestUninterpretedEObject(cluster, sourceEObject)
	}

	override removeManifestation(Cluster cluster) {
		manifestationsRemoved++
		delegateTraceManager.removeManifestation(cluster)
	}

	override setRelation(InterpretedManifestation leftManifestation, Manifestation rightManifestation,
		EStructuralFeature targetFeature) {
		relationsSet++
		delegateTraceManager.setRelation(leftManifestation, rightManifestation, targetFeature)
	}

	override unsetRelation(InterpretedManifestation leftManifestation, Manifestation rightManifestation,
		EStructuralFeature targetFeature) {
		relationsUnset++
		delegateTraceManager.unsetRelation(leftManifestation, rightManifestation, targetFeature)
	}

}
