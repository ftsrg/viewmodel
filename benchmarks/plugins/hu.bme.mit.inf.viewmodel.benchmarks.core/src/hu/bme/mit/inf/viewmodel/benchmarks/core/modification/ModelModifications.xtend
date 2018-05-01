package hu.bme.mit.inf.viewmodel.benchmarks.core.modification

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Segment
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch
import java.util.Map

class ModelModifications extends AbstractModelModifications {
	
	new(long randomSeed, RailwayContainer railwayContainer, Map<ModelModification, Integer> mix) {
		super(randomSeed, railwayContainer, mix, railwayContainer)
	}
	
	override protected switchCreated(Switch ^switch) {
		// Nothing to do.
	}
	
	override protected segmentCreated(Segment segment) {
		// Nothing to do.
	}
	
	override protected routeCreated(Route route) {
		// Nothing to do.
	}
	
	override protected routeRemoved(Route route) {
		// Nothing to do.
	}
	
}