package hu.bme.mit.inf.viewmodel.benchmarks.viatra.driver

import hu.bme.mit.inf.viewmodel.benchmarks.core.context.ExperimentContext
import hu.bme.mit.inf.viewmodel.benchmarks.core.modification.ModificationStatisticsAdapter
import hu.bme.mit.inf.viewmodel.runtime.utils.NullScheduler

class ModificationStatisticsViatraDriver extends ViatraDriver {

	new(ExperimentContext experimentContext, PreconditionStyle preconditionStyle) {
		super(experimentContext, preconditionStyle)
	}

	override protected doRunExperiment() {
		loadModel()
		val sourceAdapter = new ModificationStatisticsAdapter
		sourceAdapter.target = railwayContainer
		loadTransformation()
		transformation.createQueryEngine()
		transformation.createTransformation(NullScheduler.factory)
		val targetAdapter = new ModificationStatisticsAdapter
		transformation.startUnscheduledExecution
		targetAdapter.target = transformation.targetResource
		logSource("before")
		logTrace("before")
		logTarget("before")
		sourceAdapter.reset()
		targetAdapter.reset()
		serializeModel("before.xmi", transformation.targetResource.contents)
		applyModelModification()
		logSource("after")
		transformation.startUnscheduledExecution
		logTrace("after")
		logTarget("after")
		sourceAdapter.logValues(experimentContext, "modification", "source")
		targetAdapter.logValues(experimentContext, "modification", "target")
		serializeModel("after.xmi", transformation.targetResource.contents)
	}

}
