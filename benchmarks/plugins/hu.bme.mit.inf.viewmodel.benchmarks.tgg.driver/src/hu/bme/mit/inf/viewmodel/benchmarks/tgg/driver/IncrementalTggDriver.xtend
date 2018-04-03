package hu.bme.mit.inf.viewmodel.benchmarks.tgg.driver

import hu.bme.mit.inf.viewmodel.benchmarks.core.context.ExperimentContext

class IncrementalTggDriver extends TggDriver {
	
	new(ExperimentContext experimentContext) {
		super(experimentContext)
	}
	
	override protected doRunExperiment() {
		stopwatch("batchTransform") [
			loadModel()
			loadTransformation()
			helper.integrateForward
		]
		logSource("before")
		logCorr("before")
		logTarget("before")
		serializeModel("before.xmi", helper.trg)
		gcBarrier
		stopwatch("modifySynchronize") [
			helper.changeSrc = [applyModelModification()]
			helper.integrateForward
		]
		logSource("after")
		logCorr("after")
		logTarget("after")
		serializeModel("after.xmi", helper.trg)
	}
	
}