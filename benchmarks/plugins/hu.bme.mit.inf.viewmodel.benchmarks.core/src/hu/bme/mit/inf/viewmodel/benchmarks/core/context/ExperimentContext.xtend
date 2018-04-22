package hu.bme.mit.inf.viewmodel.benchmarks.core.context

import com.google.common.collect.ImmutableList
import hu.bme.mit.inf.viewmodel.benchmarks.core.BenchmarkUtils
import hu.bme.mit.inf.viewmodel.benchmarks.core.configuration.BenchmarksConfiguration
import hu.bme.mit.inf.viewmodel.benchmarks.core.configuration.ExperimentConfiguration
import hu.bme.mit.inf.viewmodel.benchmarks.core.configuration.TransformationCase
import hu.bme.mit.inf.viewmodel.benchmarks.core.modification.ModelModification
import hu.bme.mit.inf.viewmodel.benchmarks.core.modification.ModelModifications
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityModel
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer
import java.io.File
import java.lang.management.ManagementFactory
import java.lang.management.MemoryType
import java.util.Collection
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtend.lib.annotations.Accessors

abstract class ExperimentContext {
	val int gcSleep
	val long seed
	val String modelsDirectory
	val String modelPath
	val String dependabilityModelPath
	@Accessors val TransformationCase transformationCase
	val Map<ModelModification, Integer> modelModificationMix

	var ModelModifications modelModifications
	var long previousHeapMemory = 0
	var long previousNonHeapMemory = 0

	@Accessors(PUBLIC_GETTER) Resource resource
	@Accessors(PUBLIC_GETTER) RailwayContainer railwayContainer
	@Accessors(PUBLIC_GETTER) DependabilityModel dependabilityModel

	new(BenchmarksConfiguration benchmarksConfiguration, ExperimentConfiguration experimentConfiguration) {
		gcSleep = benchmarksConfiguration.gcSleep
		seed = benchmarksConfiguration.randomSeed
		modelsDirectory = benchmarksConfiguration.modelPath
		modelPath = getAbsolutePath(experimentConfiguration.modelName)
		dependabilityModelPath = experimentConfiguration.dependabilityModelName?.absolutePath
		transformationCase = experimentConfiguration.transformationCase
		val mixName = experimentConfiguration.modificationMixName
		modelModificationMix = if (mixName === null) {
			null
		} else {
			val mix = benchmarksConfiguration.modificationMixes?.get(mixName)
			if (mix === null) {
				throw new IllegalArgumentException("No such modification mix: " + mixName)
			}
			mix
		}
	}

	private def getAbsolutePath(String modelName) {
		// Model file URIs must be absolute, because the dependability model
		// uses a relative reference to the railway model.
		// See https://www.eclipse.org/forums/index.php?t=msg&th=171122&goto=544062&#msg_544062
		val file = new File(modelsDirectory + File.separator + modelName + ".xmi")
		file.absolutePath
	}

	def loadModel() {
		loadModel(new ResourceSetImpl)
	}

	def void loadModel(ResourceSet resourceSet) {
		resource = resourceSet.getResource(URI.createFileURI(modelPath), true)
		railwayContainer = resource.contents.head as RailwayContainer
		if (dependabilityModelPath !== null) {
			val dependabilityResource = resourceSet.getResource(URI.createFileURI(dependabilityModelPath), true)
			dependabilityModel = dependabilityResource.contents.head as DependabilityModel
			// Move the dependability model to the same resource as the railway model,
			// so that the VIATRA Query scope roots can be managed more easily.
			resource.contents += dependabilityModel
		}
		if (modelModificationMix !== null) {
			modelModifications = new ModelModifications(seed, railwayContainer, modelModificationMix)
		}
	}

	def applyModelModification() {
		if (modelModificationMix === null) {
			// Nothing to modify.
			return
		}
		if (modelModifications === null) {
			throw new IllegalStateException(
				"The model is not loaded, or the current experiment has no model modification mix.")
		}
		modelModifications.apply
	}

	def stopwatch(String intervalName, Runnable r) {
		val start = System.currentTimeMillis
		logValue(intervalName, "time", "start", start)
		r.run
		val end = System.currentTimeMillis
		logValue(intervalName, "time", "end", end)
		logValue(intervalName, "time", "duration", end - start)
		logMemory(intervalName)
	}

	def gcBarrier() {
		waitForGc
		for (mbean : ManagementFactory.memoryPoolMXBeans) {
			mbean.resetPeakUsage
		}
	}

	def waitForGc() {
		BenchmarkUtils.forceGc
		BenchmarkUtils.forceGc
		BenchmarkUtils.forceGc
		BenchmarkUtils.forceGc
		Thread.sleep(gcSleep)
		BenchmarkUtils.forceGc
	}

	def logMemory(String checkpoint) {
		waitForGc
		var long currentHeap = 0
		var long currentNonHeap = 0
		var long peakHeap = 0
		var long peakNonHeap = 0
		for (mbean : ManagementFactory.memoryPoolMXBeans) {
			if (mbean.type == MemoryType.HEAP) {
				currentHeap += mbean.usage.used
				peakHeap += mbean.peakUsage.used
			} else {
				currentNonHeap += mbean.usage.used
				peakNonHeap += mbean.peakUsage.used
			}
			mbean.resetPeakUsage
		}
		logValue(checkpoint, "memory", "peakHeap", peakHeap)
		logValue(checkpoint, "memory", "peakNonHeap", peakNonHeap)
		logValue(checkpoint, "memory", "peakTotal", peakHeap + peakNonHeap)
		logValue(checkpoint, "memory", "afterGcHeap", currentHeap)
		logValue(checkpoint, "memory", "afterGcNonHeap", currentNonHeap)
		logValue(checkpoint, "memory", "afterGcTotal", currentHeap + currentNonHeap)
		logValue(checkpoint, "memory", "peakHeapChange", peakHeap - previousHeapMemory)
		logValue(checkpoint, "memory", "peakNonHeapChange", peakNonHeap - previousNonHeapMemory)
		logValue(checkpoint, "memory", "peakTotalChange",
			peakHeap + peakNonHeap - previousHeapMemory - previousNonHeapMemory)
		logValue(checkpoint, "memory", "afterGcHeapChange", currentHeap - previousHeapMemory)
		logValue(checkpoint, "memory", "afterGcNonHeapChange", currentNonHeap - previousNonHeapMemory)
		logValue(checkpoint, "memory", "afterGcTotalChange",
			currentHeap + currentNonHeap - previousHeapMemory - previousNonHeapMemory)
		previousHeapMemory = currentHeap
		previousNonHeapMemory = currentNonHeap
	}

	def logValue(String category, String variable, Object value) {
		logValue(category + "-" + variable, value)
	}

	def logValue(String category, String category2, String variable, Object value) {
		logValue(category + "-" + category2 + "-" + variable, value)
	}

	abstract def void logValue(String variable, Object value)

	def serializeModel(String fileName, EObject... eObjects) {
		serializeModel(fileName, ImmutableList.copyOf(eObjects))
	}

	abstract def void serializeModel(String fileName, Collection<EObject> eObjects)

	def void dispose() {
		if (modelModifications !== null) {
			modelModifications.dispose
		}
	}
}
