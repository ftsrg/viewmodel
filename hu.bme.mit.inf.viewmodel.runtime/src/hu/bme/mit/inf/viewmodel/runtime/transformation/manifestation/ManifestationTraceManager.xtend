package hu.bme.mit.inf.viewmodel.runtime.transformation.manifestation

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable
import hu.bme.mit.inf.viewmodel.runtime.model.manifestationtrace.Cluster
import hu.bme.mit.inf.viewmodel.runtime.model.manifestationtrace.InterpretedManifestation
import hu.bme.mit.inf.viewmodel.runtime.model.manifestationtrace.ManifestationTrace
import hu.bme.mit.inf.viewmodel.runtime.model.manifestationtrace.ManifestationTraceFactory
import hu.bme.mit.inf.viewmodel.runtime.model.manifestationtrace.PrimitiveManifestation
import hu.bme.mit.inf.viewmodel.runtime.model.manifestationtrace.RelationSetting
import hu.bme.mit.inf.viewmodel.runtime.model.manifestationtrace.UninterpretedManifestation
import java.util.Collection
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
class ManifestationTraceManager {
	@Accessors(PUBLIC_GETTER) val ManifestationTrace manifestationTrace

	extension val ManifestationTraceFactory = ManifestationTraceFactory.eINSTANCE

	def getLogicModel() {
		manifestationTrace.logicModel
	}

	def getResults() {
		manifestationTrace.results
	}

	def markDirty() {
		manifestationTrace.dirtyClusters = true
	}

	def getQueryGroup() {
		ManifestationTraceMatcher.queryGroup
	}

	def getMatcher(ViatraQueryEngine queryEngine) {
		new ManifestationTraceMatcher(this, queryEngine)
	}

	def createCluster(Collection<Variable> variables) {
		manifestationTrace.clusters += createCluster => [
			it.variables.addAll(variables)
		]
	}

	/**
	 * Removes the clusters without removing any referencing relation settings.
	 * 
	 * Use {@link ManifestationTraceManager#removeClusters(Collection<Cluster>)} instead
	 * to remove clusters while maintaining consistency.
	 * 
	 * @param clusters The clusters to remove.
	 */
	def void forceRemoveClusters(Collection<Cluster> clusters) {
		manifestationTrace.clusters.removeAll(clusters)
	}

	def void addVariables(Cluster cluster, Collection<Variable> variables) {
		cluster.variables.addAll(variables)
	}

	def void removeVariables(Cluster cluster, Collection<Variable> variables) {
		cluster.variables.removeAll(variables)
	}

	def void addRelationSetting(Cluster leftCluster, Cluster rightCluster, EStructuralFeature targetFeature) {
		val left = getManifestedEObject(leftCluster)
		if (targetFeature instanceof EReference && (targetFeature as EReference).EOpposite !== null) {
			val targetReference = targetFeature as EReference
			val oppositeReference = targetReference.EOpposite
			val right = getManifestedEObject(rightCluster)
			if (targetReference.upperBound > 1) {
				addToListOnce(left.eGet(targetReference) as List<EObject>, right)
			} else if (oppositeReference.upperBound > 1) {
				addToListOnce(right.eGet(oppositeReference) as List<EObject>, left)
			} else {
				left.eSet(targetReference, right)
			}
		} else {
			val right = getManifestedObject(rightCluster)
			if (targetFeature.upperBound > 1) {
				addToListOnce(left.eGet(targetFeature) as List<Object>, right)
			} else {
				left.eSet(targetFeature, right)
			}
		}
		manifestationTrace.relationSettings += createRelationSetting => [
			it.left = leftCluster
			it.right = rightCluster
			it.targetRelation = targetFeature
		]
	}

	protected def unsetRelationSetting(RelationSetting relationSetting) {
		val targetFeature = relationSetting.targetRelation
		val rightCluster = relationSetting.right
		val left = getManifestedEObjectOrNull(relationSetting.left)
		if (left === null) {
			return
		}
		if (targetFeature instanceof EReference) {
			val rightEObject = getManifestedEObjectOrNull(rightCluster)
			if (rightEObject !== null) {
				if (targetFeature.isContainment) {
					if (rightEObject.eContainer == left && rightEObject.eContainingFeature == targetFeature) {
						// Adding the right object to the top-level container steals it from the left container.
						manifestationTrace.results.add(rightEObject)
					}
				}
				if (targetFeature.EOpposite !== null) {
					val oppositeFeature = targetFeature.EOpposite
					if (left.eContainer == rightEObject && left.eContainingFeature == oppositeFeature) {
						manifestationTrace.results.add(left)
					} else {
						removeFromFeature(rightEObject, oppositeFeature, rightEObject)
					}
				}
			}
		}
		val right = getManifestedObjectOrNull(rightCluster)
		if (right === null) {
			return
		}
		removeFromFeature(left, targetFeature, right)
	}

	protected def <T> void addToListOnce(List<? super T> list, T t) {
		if (!list.contains(t)) {
			list.add(t)
		}
	}

	protected def void removeFromFeature(EObject left, EStructuralFeature feature, Object right) {
		if (feature.upperBound > 1) {
			(left.eGet(feature) as List<Object>).removeIf[it == right]
		} else {
			val currentvalue = left.eGet(feature)
			if (currentvalue == right) {
				val defaultValue = feature.defaultValue
				left.eSet(feature, defaultValue)
			}
		}
	}

	def removeRelationSetting(RelationSetting relationSetting) {
		unsetRelationSetting(relationSetting)
		manifestationTrace.relationSettings -= relationSetting
	}

	def removeRelationSettings(Collection<RelationSetting> relationSettings) {
		for (relationSetting : relationSettings) {
			unsetRelationSetting(relationSetting)
		}
		manifestationTrace.relationSettings.removeAll(relationSettings)
	}

	protected def getManifestedEObject(Cluster cluster) {
		switch (manifestation : cluster.manifestation) {
			InterpretedManifestation: manifestation.manifestedEObject
			UninterpretedManifestation: throw new IllegalArgumentException("Attempt to modify a source object.")
			PrimitiveManifestation: throw new IllegalArgumentException("Attempt to modify a primitive object.")
			case null: throw new IllegalArgumentException("Attempt to get manifestation from unmanifested cluster.")
			default: throw new IllegalArgumentException("Unknown manifestation: " + manifestation)
		}
	}

	protected def getManifestedObject(Cluster cluster) {
		switch (manifestation : cluster.manifestation) {
			InterpretedManifestation: manifestation.manifestedEObject
			UninterpretedManifestation: manifestation.sourceEObject
			PrimitiveManifestation: manifestation.value
			case null: throw new IllegalArgumentException("Attempt to get manifestation from unmanifested cluster.")
			default: throw new IllegalArgumentException("Unknown manifestation: " + manifestation)
		}
	}

	protected def getManifestedEObjectOrNull(Cluster cluster) {
		switch (manifestation : cluster.manifestation) {
			InterpretedManifestation: manifestation.manifestedEObject
			default: null
		}
	}

	protected def getManifestedObjectOrNull(Cluster cluster) {
		switch (manifestation : cluster.manifestation) {
			InterpretedManifestation: manifestation.manifestedEObject
			UninterpretedManifestation: manifestation.sourceEObject
			PrimitiveManifestation: manifestation.value
			default: null
		}
	}
}
