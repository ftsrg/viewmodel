package hu.bme.mit.inf.viewmodel.benchmarks.tgg.driver

import hu.bme.mit.inf.viewmodel.benchmarks.core.context.ExperimentContext
import hu.bme.mit.inf.viewmodel.benchmarks.core.driver.ExperimentDriver
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.StochasticpetrinetPackage
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper

abstract class TggDriver extends ExperimentDriver {
	protected SynchronizationHelper helper

	new(ExperimentContext experimentContext) {
		super(experimentContext)
	}

	protected def void loadTransformation() {
		val corrPackage = switch (transformationCase) {
			case PETRI_NET: StochasticpetrinetPackage.eINSTANCE
			default: throw new IllegalArgumentException("Unknown transformation case: " + transformationCase)
		}
		helper = new PlatformPluginSynchronizationHelper(corrPackage, resourceSet)
		helper.src = railwayContainer
	}

	protected def logCorr(String checkpoint) {
		val corrSize = helper.corr.correspondences.size
		logValue(checkpoint, "corr", "count", corrSize)
	}

	protected def logTarget(String checkpoint) {
		logValue(checkpoint, "target", "rootCount", 1)
		logModelStatistics(checkpoint, "target", helper.trg)
	}
}
