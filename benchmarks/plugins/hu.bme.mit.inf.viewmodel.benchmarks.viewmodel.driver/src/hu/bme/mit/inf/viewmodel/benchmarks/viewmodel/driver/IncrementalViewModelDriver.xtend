package hu.bme.mit.inf.viewmodel.benchmarks.viewmodel.driver

import hu.bme.mit.inf.viewmodel.benchmarks.core.context.ExperimentContext

class IncrementalViewModelDriver extends ViewModelDriver {
	
	new(ExperimentContext experimentContext, ManifestationMode manifestationMode) {
		super(experimentContext, manifestationMode)
	}
	
	override protected doRunExperiment() {
		stopwatch("batchTransform") [
			loadModel()
			createQueryEngine()
			initTransformation()
			chainedTransformation.startExecution(executionSchema)
		]
		logSource("before")
		logManifestationTrace("before")
		logTarget("before")
		serializeModel("before.xmi", manifestationManager.results)
		gcBarrier
		stopwatch("modelModification") [
			applyModelModification()
		]
		logSource("after")
		gcBarrier
		stopwatch("synchronization") [
			executionSchema.startUnscheduledExecution
		]
		logManifestationTrace("after")
		logTarget("after")
		serializeModel("after.xmi", manifestationManager.results)
	}
}