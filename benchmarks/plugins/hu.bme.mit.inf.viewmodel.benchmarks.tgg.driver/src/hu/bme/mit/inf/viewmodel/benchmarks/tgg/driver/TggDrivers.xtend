package hu.bme.mit.inf.viewmodel.benchmarks.tgg.driver

import com.google.common.collect.ImmutableMap
import hu.bme.mit.inf.viewmodel.benchmarks.core.driver.IDriverFactory

class TggDrivers {
	public static val DRIVER_FACTORIES = ImmutableMap.<String, IDriverFactory>builder
		.put("tgg-batch", [new BatchTggDriver(it)])
		.put("tgg-incremental", [new IncrementalTggDriver(it)])
		.build

	private new() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}	
}