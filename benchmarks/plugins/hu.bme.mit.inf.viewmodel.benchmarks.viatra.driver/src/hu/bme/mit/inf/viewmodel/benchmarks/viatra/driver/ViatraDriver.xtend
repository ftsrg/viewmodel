package hu.bme.mit.inf.viewmodel.benchmarks.viatra.driver

import hu.bme.mit.inf.viewmodel.benchmarks.core.context.ExperimentContext
import hu.bme.mit.inf.viewmodel.benchmarks.core.driver.ExperimentDriver
import hu.bme.mit.inf.viewmodel.benchmarks.viatra.transformation.HandCodedTransformation
import hu.bme.mit.inf.viewmodel.benchmarks.viatra.transformation.RailwayModel2StochasticPetriNet
import hu.bme.mit.inf.viewmodel.benchmarks.viatra.transformation.RailwayModel2VirtualSwitchModel
import hu.bme.mit.inf.viewmodel.benchmarks.viatra.transformation.DependabilityModel2StochasticPetriNet

abstract class ViatraDriver extends ExperimentDriver {

	protected HandCodedTransformation transformation

	new(ExperimentContext experimentContext) {
		super(experimentContext)
	}

	protected def loadTransformation() {
		transformation = switch (transformationCase) {
			case PETRI_NET:
				new RailwayModel2StochasticPetriNet(railwayContainer, resourceSet)
			case VIRTUAL_SWITCH:
				new RailwayModel2VirtualSwitchModel(railwayContainer, resourceSet)
			case DEPENDABILITY:
				new DependabilityModel2StochasticPetriNet(railwayContainer, dependabilityModel, resourceSet)
			default:
				throw new IllegalArgumentException("Unknown case: " + transformationCase)
		}
	}

	protected def logTrace(String checkpoint) {
		logValue(checkpoint, "trace", "count", transformation.traceLinkCount)
	}

	protected def logTarget(String checkpoint) {
		val res = transformation.targetResource
		logValue(checkpoint, "target", "rootCount", res.contents.size)
		logModelStatistics(checkpoint, "target", res.allContents)
	}

	override dispose() {
		if (transformation !== null) {
			transformation.dispose
		}
		super.dispose()
	}

}
