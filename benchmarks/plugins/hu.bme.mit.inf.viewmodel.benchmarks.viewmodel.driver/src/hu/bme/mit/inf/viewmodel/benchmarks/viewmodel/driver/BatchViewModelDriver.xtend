package hu.bme.mit.inf.viewmodel.benchmarks.viewmodel.driver

import hu.bme.mit.inf.viewmodel.benchmarks.core.context.ExperimentContext

class BatchViewModelDriver extends ViewModelDriver {
	
	new(ExperimentContext experimentContext, ManifestationMode manifestationMode) {
		super(experimentContext, manifestationMode)
	}
	
	override protected doRunExperiment() {
		logMemory("initial")
		stopwatch("modelLoad") [
			loadModel()
			applyModelModification()
		]
		logSource("modelLoad")
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
		logViewModelTrace("s2ptExecute")
		gcBarrier
		stopwatch("pt2tRete") [
			manifestationTransformation.queryGroup.prepare(queryEngine)
		]
		stopwatch("pt2tExecute") [
			manifestationTransformation.startExecution(executionSchema)
		]
		logManifestationTrace("pt2tExecute")
		logTarget("pt2tExecute")
		serializeModel("batch.xmi", manifestationManager.results)
	}
	
}