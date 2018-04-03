package hu.bme.mit.inf.viewmodel.benchmarks.atl.driver

import hu.bme.mit.inf.viewmodel.benchmarks.core.context.ExperimentContext
import hu.bme.mit.inf.viewmodel.benchmarks.core.driver.ExperimentDriver
import java.util.ArrayList
import java.util.LinkedHashMap
import java.util.List
import java.util.Map
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceImpl
import org.eclipse.m2m.atl.core.IModel
import org.eclipse.m2m.atl.core.IReferenceModel
import org.eclipse.m2m.atl.core.emf.EMFInjector
import org.eclipse.m2m.atl.core.emf.EMFModel
import org.eclipse.m2m.atl.core.emf.EMFModelFactory
import org.eclipse.m2m.atl.core.emf.EMFReferenceModel
import org.eclipse.m2m.atl.engine.emfvm.ASM
import org.eclipse.m2m.atl.engine.emfvm.ASMXMLReader
import org.eclipse.m2m.atl.engine.emfvm.adapter.EMFModelAdapter
import org.eclipse.m2m.atl.engine.emfvm.adapter.IModelAdapter
import org.eclipse.xtend.lib.annotations.Data

class BatchAtlDriver extends ExperimentDriver {
	static val MODULE_ROOT = "/hu.bme.mit.inf.viewmodel.benchmarks.atl/transformation/"
	static val INPUT_METAMODEL_URI = URI.createURI("platform:/plugin/hu.bme.mit.inf.viewmodel.benchmarks.models/model/railway.ecore")
	static val INPUT_METAMODEL_NAME = "Railway"
	static val INPUT_MODEL_NAME = "IN"
	static val OUTPUT_MODEL_NAME = "OUT"

	EMFModelFactory modelFactory
	EMFInjector injector
	ASM asm
	EMFModel targetModel
	IModelAdapter modelAdapter
	List<EMFModel> emfModels = new ArrayList
	Map<String, IModel> models = new LinkedHashMap

	new(ExperimentContext experimentContext) {
		super(experimentContext)
	}

	override protected doRunExperiment() {
		stopwatch("modelLoad") [
			modelFactory = new EMFModelFactory
			resourceSet = modelFactory.resourceSet
			loadModel()
			applyModelModification()
		]
		logSource("batch")
		gcBarrier
		stopwatch("transformLoad") [
			loadTransformation
		]
		stopwatch("execute") [
			asm.run(null, models, emptyMap, emptyList, emptyMap, new NullProgressMonitor, modelAdapter)
		]
		logTarget("batch")
		serializeModel("batch.xmi", resultsResource.contents)
	}

	protected def loadTransformation() {
		injector = new EMFInjector
		val atlCase = atlTransformationCase
		val uriConverter = resourceSet.URIConverter
		val moduleStream = uriConverter.createInputStream(atlCase.moduleUri)
		asm = try {
			new ASMXMLReader().read(moduleStream)
		} finally {
			moduleStream.close
		}

		val sourceMetamodel = loadMetamodel(INPUT_METAMODEL_URI, INPUT_METAMODEL_NAME)
		val targetMetamodel = loadMetamodel(atlCase.outputMetamodelUri, atlCase.outputMetamodelName)
		loadSourceModel(sourceMetamodel)
		targetModel = loadTargetModel(targetMetamodel)

		modelAdapter = new EMFModelAdapter
		modelAdapter.allowInterModelReferences = false
	}

	protected def loadMetamodel(URI uri, String metamodelName) {
		val path = uri.toString
		val metamodel = modelFactory.newReferenceModel(#{
			"modelName" -> metamodelName,
			"path" -> path
		}) as EMFReferenceModel
		injector.inject(metamodel, path)
		emfModels += metamodel
		models.put(metamodelName, metamodel)
		metamodel
	}

	protected def loadSourceModel(IReferenceModel metamodel) {
		val path = "source-model.xmi"
		val model = modelFactory.newModel(metamodel, #{
			"modelName" -> INPUT_MODEL_NAME,
			"path" -> path,
			"newModel" -> false
		}) as EMFModel
		injector.inject(model, resource)
		model.isTarget = false
		emfModels += model
		models.put(INPUT_MODEL_NAME, model)
		model
	}

	protected def loadTargetModel(IReferenceModel metamodel) {
		val path = "target-model.xmi"
		val model = modelFactory.newModel(metamodel, #{
			"modelName" -> OUTPUT_MODEL_NAME,
			"path" -> path,
			"newModel" -> true
		}) as EMFModel
		model.isTarget = true
		emfModels += model
		models.put(OUTPUT_MODEL_NAME, model)
		model
	}

	def resultsResource() {
		targetModel.resource ?: new ResourceImpl
	}

	protected def logTarget(String checkpoint) {
		val res = resultsResource
		logValue(checkpoint, "target", "rootCount", res.contents.size)
		logModelStatistics(checkpoint, "target", res.allContents)
	}

	override dispose() {
		if (modelFactory !== null) {
			for (model : emfModels) {
				modelFactory.unload(model)
			}
		}
		super.dispose()
	}

	protected def getAtlTransformationCase() {
		switch (transformationCase) {
			case PETRI_NET:
				new AtlTransformationCase(
					URI.createPlatformPluginURI(MODULE_ROOT + "TrainBenchmark2PetriNet.asm", false),
					URI.createURI("platform:/plugin/hu.bme.mit.inf.viewmodel.benchmarks.models/model/stochasticpetrinet.ecore"), "SPN")
			case VIRTUAL_SWITCH:
				new AtlTransformationCase(
					URI.createPlatformPluginURI(MODULE_ROOT + "RailwayModel2VirtualSwitchModel.asm", false),
					URI.createURI("platform:/plugin/hu.bme.mit.inf.viewmodel.benchmarks.models/model/virtualswitchview.ecore"), "VS")
			default:
				throw new IllegalArgumentException("Unknown case: " + transformationCase)
		}
	}

	@Data
	private static class AtlTransformationCase {
		val URI moduleUri
		val URI outputMetamodelUri
		val String outputMetamodelName
	}
}
