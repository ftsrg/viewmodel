package hu.bme.mit.inf.viewmodel.benchmarks.core.context

import hu.bme.mit.inf.viewmodel.benchmarks.core.configuration.BenchmarksConfiguration
import hu.bme.mit.inf.viewmodel.benchmarks.core.configuration.ExperimentConfiguration
import java.util.Collection
import org.eclipse.emf.ecore.EObject

class WarmupContext extends ExperimentContext {
	
	new(BenchmarksConfiguration benchmarksConfiguration, ExperimentConfiguration experimentConfiguration) {
		super(benchmarksConfiguration, experimentConfiguration)
	}
	
	override logValue(String variable, Object value) {
		// Do nothing.
	}
	
	override serializeModel(String fileName, Collection<EObject> eObjects) {
		// Do nothing.
	}
	
}