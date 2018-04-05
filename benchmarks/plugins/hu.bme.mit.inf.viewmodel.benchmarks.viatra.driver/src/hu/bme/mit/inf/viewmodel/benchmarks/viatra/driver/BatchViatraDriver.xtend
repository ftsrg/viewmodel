package hu.bme.mit.inf.viewmodel.benchmarks.viatra.driver

import hu.bme.mit.inf.viewmodel.benchmarks.core.context.ExperimentContext
import hu.bme.mit.inf.viewmodel.runtime.utils.NullScheduler

class BatchViatraDriver extends ViatraDriver {
	
	new(ExperimentContext experimentContext) {
		super(experimentContext)
	}
	
	override protected doRunExperiment() {
		stopwatch("modelLoad") [
			loadModel()
			applyModelModification()
		]
		logSource("batch")
		gcBarrier
		stopwatch("modelQuery") [
			loadTransformation()
			transformation.createQueryEngine()
		]
		stopwatch("transformInit") [
			transformation.createTransformation(NullScheduler.factory)
		]
		stopwatch("execute") [
			transformation.startUnscheduledExecution
		]
		logTrace("batch")
		logTarget("batch")
		serializeModel("batch.xmi", transformation.targetResource.contents)
	}
	
}