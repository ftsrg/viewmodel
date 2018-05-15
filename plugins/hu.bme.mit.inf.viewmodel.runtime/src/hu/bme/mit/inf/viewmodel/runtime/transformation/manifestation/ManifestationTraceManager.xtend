/********************************************************************************
 * Copyright (c) 2018 Contributors to the ViewModel project
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * SPDX-License-Identifier: EPL-1.0
 ********************************************************************************/
package hu.bme.mit.inf.viewmodel.runtime.transformation.manifestation

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Cluster
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.InterpretedManifestation
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Manifestation
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.resource.Resource

class ManifestationTraceManager extends AbstractManifestationTraceManager {

	new(LogicModel logicModel) {
		super(logicModel)
	}

	new(Resource resource, LogicModel logicModel) {
		super(resource, logicModel)
	}

	protected override doManifestInterpretedEObject(Cluster cluster, EClass type) {
		val manifestedEObject = type.EPackage.EFactoryInstance.create(type)
		manifestationTrace.results += manifestedEObject
		cluster.manifestation = createInterpretedManifestation => [
			it.manifestedEObject = manifestedEObject
			it.type = type
		]
	}

	protected override doRemoveInterpretedManifestation(InterpretedManifestation manifestation) {
		manifestationTrace.results -= manifestation.manifestedEObject
	}

	override setRelation(InterpretedManifestation leftManifestation, Manifestation rightManifestation,
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

	override unsetRelation(InterpretedManifestation leftManifestation, Manifestation rightManifestation,
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
}
