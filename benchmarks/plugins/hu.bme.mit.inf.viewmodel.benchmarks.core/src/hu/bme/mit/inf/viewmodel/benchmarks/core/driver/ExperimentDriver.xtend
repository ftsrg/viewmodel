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
package hu.bme.mit.inf.viewmodel.benchmarks.core.driver

import hu.bme.mit.inf.viewmodel.benchmarks.core.context.ExperimentContext
import java.util.Collections
import java.util.Iterator
import java.util.List
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
abstract class ExperimentDriver implements IExperimentDriver {
	protected extension val ExperimentContext experimentContext

	protected var ResourceSet resourceSet

	override void dispose() {
	}

	override void runExperiment() {
		logMemory("initial")
		doRunExperiment
	}

	abstract protected def void doRunExperiment()

	protected def loadModel() {
		if (resourceSet === null) {
			resourceSet = new ResourceSetImpl
		}
		loadModel(resourceSet)
	}

	protected def logSource(String checkpoint) {
		logModelStatistics(checkpoint, "source", railwayContainer)
	}
	
	protected def logModelStatistics(String checkpoint, String category, EObject eObject) {
		val iterator = Collections.singleton(eObject).iterator + eObject.eAllContents
		logModelStatistics(checkpoint, category, iterator)
	}

	protected def logModelStatistics(String checkpoint, String category, Iterator<EObject> iterator) {
		var int results = 0
		var int resultReferences = 0
		var int resultAttributes = 0
		while (iterator.hasNext) {
			val eObj = iterator.next
			results++
			for (feature : eObj.eClass.EAllStructuralFeatures) {
				val featureSize = getFeatureSize(eObj, feature)
				switch (feature) {
					EReference:
						resultReferences += featureSize
					EAttribute:
						resultAttributes += featureSize
					default:
						throw new IllegalStateException("Unknown EStructuralFeature: " + feature)
				}
			}
		}
		logValue(checkpoint, category, "count", results)
		logValue(checkpoint, category, "referenceCount", resultReferences)
		logValue(checkpoint, category, "attributeCount", resultAttributes)
	}

	private def getFeatureSize(EObject eObj, EStructuralFeature feature) {
		if (feature.many) {
			(eObj.eGet(feature) as List<?>).size
		} else {
			1
		}
	}
}
