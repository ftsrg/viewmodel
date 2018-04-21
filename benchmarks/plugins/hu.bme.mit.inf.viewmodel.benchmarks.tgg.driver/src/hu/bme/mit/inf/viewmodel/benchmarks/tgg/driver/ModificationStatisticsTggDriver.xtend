package hu.bme.mit.inf.viewmodel.benchmarks.tgg.driver

import hu.bme.mit.inf.viewmodel.benchmarks.core.context.ExperimentContext
import hu.bme.mit.inf.viewmodel.benchmarks.core.modification.ModificationStatisticsAdapter

class ModificationStatisticsTggDriver extends TggDriver {

	new(ExperimentContext experimentContext) {
		super(experimentContext)
	}

	override protected doRunExperiment() {
		loadModel()
		val sourceAdapter = new ModificationStatisticsAdapter
		sourceAdapter.target = railwayContainer
		loadTransformation()
		helper.integrateForward
		val targetAdapter = new ModificationStatisticsAdapter
		targetAdapter.target = helper.trg.eResource
		logSource("before")
		logCorr("before")
		logTarget("before")
		sourceAdapter.reset
		targetAdapter.reset
		serializeModel("before.xmi", helper.trg)
		helper.changeSrc = [applyModelModification()]
		helper.integrateForward
		logSource("after")
		logCorr("after")
		logTarget("after")
		println(targetAdapter.target === helper.trg)
		sourceAdapter.logValues(experimentContext, "modification", "source")
		targetAdapter.logValues(experimentContext, "modification", "target")
		serializeModel("after.xmi", helper.trg)
	}

}
