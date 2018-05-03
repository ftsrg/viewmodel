package hu.bme.mit.inf.viewmodel.benchmarks.viatra.driver

import hu.bme.mit.inf.viewmodel.benchmarks.core.context.ExperimentContext
import hu.bme.mit.inf.viewmodel.runtime.utils.NullScheduler

class IncrementalViatraDriver extends ViatraDriver {
	
	new(ExperimentContext experimentContext, PreconditionStyle preconditionStyle) {
		super(experimentContext, preconditionStyle)
	}
	
	override protected doRunExperiment() {
		stopwatch("batchTransform") [
			loadModel()
			loadTransformation()
			transformation.createQueryEngine()
			transformation.createTransformation(NullScheduler.factory)
			transformation.startUnscheduledExecution
		]
		logSource("before")
		logTrace("before")
		logTarget("before")
		serializeModel("before.xmi", transformation.targetResource.contents)
		gcBarrier
		stopwatch("modelModification") [
			applyModelModification()
		]
		logSource("after")
		gcBarrier
		stopwatch("synchronization") [
			transformation.startUnscheduledExecution
		]
		logTrace("after")
		logTarget("after")
		serializeModel("after.xmi", transformation.targetResource.contents)
	}
	
}