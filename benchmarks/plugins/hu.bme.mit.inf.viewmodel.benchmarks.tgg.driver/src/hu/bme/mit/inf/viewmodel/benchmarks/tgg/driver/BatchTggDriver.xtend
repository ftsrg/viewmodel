package hu.bme.mit.inf.viewmodel.benchmarks.tgg.driver

import hu.bme.mit.inf.viewmodel.benchmarks.core.context.ExperimentContext

class BatchTggDriver extends TggDriver {

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
		stopwatch("transformLoad") [
			loadTransformation()
		]
		stopwatch("execute") [
			helper.integrateForward()
		]
		logCorr("batch")
		logTarget("batch")
		serializeModel("batch.xmi", helper.trg)
	}
}
