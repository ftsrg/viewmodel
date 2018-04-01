package hu.bme.mit.inf.viewmodel.benchmarks.viewmodel.driver

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Cluster
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.InterpretedManifestation
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Manifestation
import hu.bme.mit.inf.viewmodel.runtime.transformation.manifestation.AbstractManifestationTraceManager
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.resource.Resource

package class MockManifestationTraceManager extends AbstractManifestationTraceManager {

	new(LogicModel logicModel) {
		super(logicModel)
	}

	new(Resource resource, LogicModel logicModel) {
		super(resource, logicModel)
	}

	override protected doManifestInterpretedEObject(Cluster cluster, EClass type) {
		cluster.manifestation = createInterpretedManifestation => [
			it.manifestedEObject = null
			it.type = type
		]
	}

	override protected doRemoveInterpretedManifestation(InterpretedManifestation interpretedManifestation) {
		// Ignore, the trace link itself is removed by the superclass.
	}

	override setRelation(InterpretedManifestation leftManifestation, Manifestation rightManifestation,
		EStructuralFeature targetFeature) {
		// Ignore.
	}

	override unsetRelation(InterpretedManifestation leftManifestation, Manifestation rightManifestation,
		EStructuralFeature targetFeature) {
		// Ignore.
	}

}
