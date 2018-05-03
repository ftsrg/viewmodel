package hu.bme.mit.inf.viewmodel.benchmarks.viatra.driver

import hu.bme.mit.inf.viewmodel.benchmarks.core.context.ExperimentContext
import hu.bme.mit.inf.viewmodel.benchmarks.core.driver.ExperimentDriver
import hu.bme.mit.inf.viewmodel.benchmarks.viatra.transformation.DependabilityModel2StochasticPetriNet
import hu.bme.mit.inf.viewmodel.benchmarks.viatra.transformation.DependabilityModel2StochasticPetriNetPrioritised
import hu.bme.mit.inf.viewmodel.benchmarks.viatra.transformation.HandCodedTransformation
import hu.bme.mit.inf.viewmodel.benchmarks.viatra.transformation.RailwayModel2StochasticPetriNet
import hu.bme.mit.inf.viewmodel.benchmarks.viatra.transformation.RailwayModel2VirtualSwitchModel
import hu.bme.mit.inf.viewmodel.benchmarks.viatra.transformation.RailwayModel2VirtualSwitchModelPrioritised

abstract class ViatraDriver extends ExperimentDriver {

	val PreconditionStyle preconditionStyle

	protected HandCodedTransformation transformation

	new(ExperimentContext experimentContext, PreconditionStyle preconditionStyle) {
		super(experimentContext)
		this.preconditionStyle = preconditionStyle
	}

	protected def loadTransformation() {
		transformation = switch (preconditionStyle) {
			case WITH_TRACE:
				switch (transformationCase) {
					case PETRI_NET:
						new RailwayModel2StochasticPetriNet(railwayContainer, resourceSet)
					case VIRTUAL_SWITCH:
						new RailwayModel2VirtualSwitchModel(railwayContainer, resourceSet)
					case DEPENDABILITY:
						new DependabilityModel2StochasticPetriNet(railwayContainer, dependabilityModel, resourceSet)
					default:
						throw new IllegalArgumentException("Unknown case: " + transformationCase)
				}
			case PRIORITIES_ONLY:
				switch (transformationCase) {
					case VIRTUAL_SWITCH:
						new RailwayModel2VirtualSwitchModelPrioritised(railwayContainer, resourceSet)
					case DEPENDABILITY:
						new DependabilityModel2StochasticPetriNetPrioritised(railwayContainer, dependabilityModel, resourceSet)
					default:
						throw new IllegalArgumentException("Unknown case: " + transformationCase)
				}
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
