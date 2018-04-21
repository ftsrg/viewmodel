package hu.bme.mit.inf.viewmodel.benchmarks.viewmodel.driver

import hu.bme.mit.inf.viewmodel.benchmarks.core.context.ExperimentContext
import hu.bme.mit.inf.viewmodel.benchmarks.core.modification.ModificationStatisticsAdapter
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel
import org.eclipse.emf.ecore.resource.Resource

class ModificationStatisticsViewModelDriver extends ViewModelDriver {

	ModificationStatisticsAdapter targetAdapter

	new(ExperimentContext experimentContext) {
		super(experimentContext, ManifestationMode.PHYSICAL)
	}

	override protected doRunExperiment() {
		loadModel()
		val sourceAdapter = new ModificationStatisticsAdapter
		sourceAdapter.target = railwayContainer
		createQueryEngine()
		initTransformation()
		chainedTransformation.startExecution(executionSchema)
		logSource("before")
		logLogicModel("before")
		logViewModelTrace("before")
		logManifestationTrace("before")
		logTarget("before")
		sourceAdapter.reset
		targetAdapter.reset
		serializeModel("before.xmi", manifestationManager.results)
		applyModelModification()
		executionSchema.startUnscheduledExecution
		logLogicModel("after")
		logViewModelTrace("after")
		logManifestationTrace("after")
		logTarget("after")
		sourceAdapter.logValues(experimentContext, "modification", "source")
		targetAdapter.logValues(experimentContext, "modification", "target")
		serializeModel("after.xmi", manifestationManager.results)
	}

	override protected getBaseManifestationManager(Resource resource, LogicModel logicModel) {
		val manager = new ModificationStatisticsTraceManager(resource, logicModel)
		targetAdapter = manager.adapter
		manager
	}

}
