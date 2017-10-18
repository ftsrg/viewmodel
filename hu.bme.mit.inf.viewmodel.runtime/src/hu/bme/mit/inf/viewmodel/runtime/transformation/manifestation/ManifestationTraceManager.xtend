package hu.bme.mit.inf.viewmodel.runtime.transformation.manifestation

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Cluster
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable
import hu.bme.mit.inf.viewmodel.runtime.model.manifestationtrace.InterpretedManifestation
import hu.bme.mit.inf.viewmodel.runtime.model.manifestationtrace.Manifestation
import hu.bme.mit.inf.viewmodel.runtime.model.manifestationtrace.ManifestationTrace
import hu.bme.mit.inf.viewmodel.runtime.model.manifestationtrace.ManifestationTraceFactory
import hu.bme.mit.inf.viewmodel.runtime.model.manifestationtrace.PrimitiveManifestation
import hu.bme.mit.inf.viewmodel.runtime.model.manifestationtrace.UninterpretedManifestation
import java.util.List
import java.util.UUID
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
class ManifestationTraceManager {
	@Accessors(PUBLIC_GETTER) val ManifestationTrace manifestationTrace

	extension val ManifestationTraceFactory = ManifestationTraceFactory.eINSTANCE

	new(LogicModel logicModel) {
		this(ManifestationTraceFactory.eINSTANCE.createManifestationTrace => [
			it.traceModelId = UUID.randomUUID.toString
			it.logicModel = logicModel
		])
	}

	new(Resource resource, LogicModel logicModel) {
		this(logicModel)
		resource.contents += manifestationTrace
	}

	def getLogicModel() {
		manifestationTrace.logicModel
	}

	def getResults() {
		manifestationTrace.results
	}

	def getTraceModelId() {
		manifestationTrace.traceModelId
	}

	def getMatcher(ViatraQueryEngine queryEngine) {
		new ManifestationTraceMatcher(traceModelId, queryEngine)
	}

	def void manifestInterpretedEObject(Cluster cluster, EClass type) {
		val manifestedEObject = type.EPackage.EFactoryInstance.create(type)
		manifestationTrace.results += manifestedEObject
		manifestationTrace.manifestations += createInterpretedManifestation => [
			it.clusterId = cluster.id
			it.manifestedEObject = manifestedEObject
			it.type = type
		]
	}

	def void manifestUninterpretedEObject(Cluster cluster, EObject sourceEObject) {
		manifestationTrace.manifestations += createUninterpretedManifestation => [
			it.clusterId = cluster.id
			it.sourceEObject = sourceEObject
		]
	}

	def void manifestPrimitive(Cluster cluster, Object value) {
		manifestationTrace.manifestations += createPrimitiveManifestation => [
			it.clusterId = cluster.id
			it.value = value
		]
	}

	def void removeManifestation(Manifestation manifestation) {
		manifestationTrace.manifestations -= manifestation
		if (manifestation instanceof InterpretedManifestation) {
			manifestationTrace.results -= manifestation.manifestedEObject
		}
	}

	def void setRelation(InterpretedManifestation leftManifestation, Manifestation rightManifestation,
		EStructuralFeature targetFeature) {
		val left = leftManifestation.manifestedEObject
		if (targetFeature instanceof EReference && (targetFeature as EReference).EOpposite !== null) {
			val targetReference = targetFeature as EReference
			val oppositeReference = targetReference.EOpposite
			val right = getManifestedEObject(rightManifestation)
			if (targetReference.many) {
				addToListOnce(left.eGet(targetReference) as List<EObject>, right)
			} else if (oppositeReference.many) {
				throw new IllegalArgumentException(
					"Manifested feature must be strong and strong features cannot have an upper bound lower than their eOpposite. See the strongRelation/2 predicate.")
			} else {
				left.eSet(targetReference, right)
			}
		} else {
			val right = getManifestedObject(rightManifestation)
			if (targetFeature.many) {
				addToListOnce(left.eGet(targetFeature) as List<Object>, right)
			} else {
				left.eSet(targetFeature, right)
			}
		}
	}

	def unsetRelation(InterpretedManifestation leftManifestation, Manifestation rightManifestation,
		EStructuralFeature targetFeature) {
		val left = leftManifestation.manifestedEObject
		if (targetFeature instanceof EReference) {
			val rightEObject = getManifestedEObject(rightManifestation)
			if (targetFeature.isContainment) {
				if (rightEObject.eContainer == left && rightEObject.eContainingFeature == targetFeature) {
					// Adding the right object to the top-level container steals it from the left container.
					manifestationTrace.results.add(rightEObject)
				}
			}
			if (targetFeature.EOpposite !== null) {
				val oppositeFeature = targetFeature.EOpposite
				if (left.eContainer == rightEObject && left.eContainingFeature == oppositeFeature) {
					throw new IllegalArgumentException(
						"Manifested feature must be strong and strong features cannot have a containment eOpposite. See the strongRelation/2 predicate.")
				} else {
					removeFromFeature(rightEObject, oppositeFeature, rightEObject)
				}
			}
		}
		val right = getManifestedObject(rightManifestation)
		removeFromFeature(left, targetFeature, right)
	}

	protected def <T> void addToListOnce(List<? super T> list, T t) {
		if (!list.contains(t)) {
			list.add(t)
		}
	}

	protected def void removeFromFeature(EObject left, EStructuralFeature feature, Object right) {
		if (feature.many) {
			(left.eGet(feature) as List<Object>).remove(right)
		} else {
			val currentvalue = left.eGet(feature)
			if (currentvalue == right) {
				val defaultValue = feature.defaultValue
				left.eSet(feature, defaultValue)
			}
		}
	}

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
