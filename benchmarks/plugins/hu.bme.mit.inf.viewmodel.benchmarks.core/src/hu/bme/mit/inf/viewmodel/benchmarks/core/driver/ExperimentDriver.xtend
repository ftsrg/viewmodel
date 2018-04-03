package hu.bme.mit.inf.viewmodel.benchmarks.core.driver

import hu.bme.mit.inf.viewmodel.benchmarks.core.context.ExperimentContext
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer
import java.util.Collections
import java.util.Iterator
import java.util.List
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
abstract class ExperimentDriver implements IExperimentDriver {
	protected extension val ExperimentContext experimentContext

	protected var ResourceSet resourceSet
	protected var Resource resource
	protected var RailwayContainer railwayContainer

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
		railwayContainer = loadModel(resourceSet)
		resource = railwayContainer.eResource
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
