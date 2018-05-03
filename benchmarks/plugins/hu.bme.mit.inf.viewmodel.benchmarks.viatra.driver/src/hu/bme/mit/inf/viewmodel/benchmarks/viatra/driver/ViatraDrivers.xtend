package hu.bme.mit.inf.viewmodel.benchmarks.viatra.driver

import com.google.common.collect.ImmutableMap
import hu.bme.mit.inf.viewmodel.benchmarks.core.driver.IDriverFactory

class ViatraDrivers {
	public static val DRIVER_FACTORIES = ImmutableMap.<String, IDriverFactory>builder
		.put("viatra-batch", [new BatchViatraDriver(it, PreconditionStyle.WITH_TRACE)])
		.put("viatra-incremental", [new IncrementalViatraDriver(it, PreconditionStyle.WITH_TRACE)])
		.put("viatra-statistics", [new ModificationStatisticsViatraDriver(it, PreconditionStyle.WITH_TRACE)])
		.put("viatra-batch-priorities", [new BatchViatraDriver(it, PreconditionStyle.PRIORITIES_ONLY)])
		.put("viatra-incremental-priorities", [new IncrementalViatraDriver(it, PreconditionStyle.PRIORITIES_ONLY)])
		.put("viatra-statistics-priorities", [new ModificationStatisticsViatraDriver(it, PreconditionStyle.PRIORITIES_ONLY)])
		.build

	private new() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}	
}