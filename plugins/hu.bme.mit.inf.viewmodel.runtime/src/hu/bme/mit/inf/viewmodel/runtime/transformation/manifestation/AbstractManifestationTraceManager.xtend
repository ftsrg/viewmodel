package hu.bme.mit.inf.viewmodel.runtime.transformation.manifestation

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.BinaryConstraint
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Cluster
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.InterpretedManifestation
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelFactory
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Manifestation
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ManifestationTrace
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.PrimitiveManifestation
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.UnaryConstraint
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.UninterpretedManifestation
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ConstraintTrace
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTrace
import java.util.UUID
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
abstract class AbstractManifestationTraceManager implements IManifestationTraceManager {
	@Accessors(PUBLIC_GETTER) val ManifestationTrace manifestationTrace

	protected extension val LogicModelFactory = LogicModelFactory.eINSTANCE

	new(LogicModel logicModel) {
		this(LogicModelFactory.eINSTANCE.createManifestationTrace => [
			it.traceModelId = UUID.randomUUID.toString
			it.logicModel = logicModel
		])
	}

	new(Resource resource, LogicModel logicModel) {
		this(logicModel)
		resource.contents += manifestationTrace
	}

	override getLogicModel() {
		manifestationTrace.logicModel
	}

	override getResults() {
		manifestationTrace.results
	}

	override getTraceModelId() {
		manifestationTrace.traceModelId
	}

	override manifestInterpretedEObject(Cluster cluster, EClass type) {
		assertNotManifested(cluster)
		doManifestInterpretedEObject(cluster, type)
	}

	protected abstract def void doManifestInterpretedEObject(Cluster cluster, EClass type)

	override manifestUninterpretedEObject(Cluster cluster, EObject sourceEObject) {
		assertNotManifested(cluster)
		cluster.manifestation = createUninterpretedManifestation => [
			it.sourceEObject = sourceEObject
		]
	}

	override manifestPrimitive(Cluster cluster, Object value) {
		assertNotManifested(cluster)
		cluster.manifestation = createPrimitiveManifestation => [
			it.value = value
		]
	}

	protected def assertManifested(Cluster cluster) {
		if (cluster.manifestation === null) {
			throw new IllegalArgumentException("Cluster not manifested: " + cluster)
		}
	}

	protected def assertNotManifested(Cluster cluster) {
		if (cluster.manifestation !== null) {
			// unsafePrintConstraint(cluster)
			throw new IllegalArgumentException("Cluster already manifested: " + cluster)
		}
	}

	protected def unsafePrintConstraints(Cluster cluster) {
		val traceModel = cluster.eResource.contents.filter(ViewModelTrace).head
		println('---')
		for (trace : traceModel.traces.filter(ConstraintTrace)) {
			for (constraint : trace.constraints) {
				switch (constraint) {
					UnaryConstraint:
						if (constraint.variable.cluster == cluster) {
							println(constraint.variable + ' --> ' + constraint)
						}
					BinaryConstraint: {
						if (constraint.left.cluster == cluster) {
							println('left ' + constraint.left + ' --> ' + constraint)
						}
						if (constraint.right.cluster == cluster) {
							println('right ' + constraint.right + ' --> ' + constraint)
						}
					}
				}
			}
		}
	}

	override removeManifestation(Cluster cluster) {
		assertManifested(cluster)
		val manifestation = cluster.manifestation
		cluster.manifestation = null
		if (manifestation instanceof InterpretedManifestation) {
			doRemoveInterpretedManifestation(manifestation)
		}
	}

	protected abstract def void doRemoveInterpretedManifestation(InterpretedManifestation interpretedManifestation)

	protected def getManifestedEObject(Manifestation manifestation) {
		switch (manifestation) {
			InterpretedManifestation: manifestation.manifestedEObject
			UninterpretedManifestation: throw new IllegalArgumentException("Attempt to modify a source object.")
			PrimitiveManifestation: throw new IllegalArgumentException("Attempt to modify a primitive object.")
			default: throw new IllegalArgumentException("Unknown manifestation: " + manifestation)
		}
	}

	protected def getManifestedObject(Manifestation manifestation) {
		switch (manifestation) {
			InterpretedManifestation: manifestation.manifestedEObject
			UninterpretedManifestation: manifestation.sourceEObject
			PrimitiveManifestation: manifestation.value
			default: throw new IllegalArgumentException("Unknown manifestation: " + manifestation)
		}
	}
}
