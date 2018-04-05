package hu.bme.mit.inf.viewmodel.benchmarks.viatra.driver

import com.google.common.collect.ImmutableMap
import hu.bme.mit.inf.viewmodel.benchmarks.core.driver.IDriverFactory

class ViatraDrivers {
	public static val DRIVER_FACTORIES = ImmutableMap.<String, IDriverFactory>builder
		.put("viatra-batch", [new BatchViatraDriver(it)])
		.put("viatra-incremental", [new IncrementalViatraDriver(it)])
		.build

	private new() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}	
}