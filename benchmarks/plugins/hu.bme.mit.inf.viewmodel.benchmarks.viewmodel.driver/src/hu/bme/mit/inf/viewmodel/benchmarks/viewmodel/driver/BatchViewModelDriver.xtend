package hu.bme.mit.inf.viewmodel.benchmarks.viewmodel.driver

import hu.bme.mit.inf.viewmodel.benchmarks.core.context.ExperimentContext

class BatchViewModelDriver extends ViewModelDriver {
	
	new(ExperimentContext experimentContext, ManifestationMode manifestationMode) {
		super(experimentContext, manifestationMode)
	}
	
	override protected doRunExperiment() {
		stopwatch("modelLoad") [
			loadModel()
			applyModelModification()
		]
		logSource("batch")
		gcBarrier
		stopwatch("modelQuery") [
			createQueryEngine()
		]
		stopwatch("transformInit") [
			initTransformation()
		]
		stopwatch("s2ptRete") [
			viewTransformation.queryGroup.prepare(queryEngine)
		]
		stopwatch("s2ptExecute") [
			viewTransformation.startExecution(executionSchema)
		]
		logViewModelTrace("batch")
		gcBarrier
		stopwatch("pt2tRete") [
			manifestationTransformation.queryGroup.prepare(queryEngine)
		]
		stopwatch("pt2tExecute") [
			manifestationTransformation.startExecution(executionSchema)
		]
		logManifestationTrace("batch")
		logTarget("batch")
		serializeModel("batch.xmi", manifestationManager.results)
	}
	
}