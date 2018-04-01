package hu.bme.mit.inf.viewmodel.benchmarks.viewmodel.driver

import com.google.common.collect.ImmutableMap
import hu.bme.mit.inf.viewmodel.benchmarks.core.driver.IDriverFactory

final class ViewModelDrivers {
	public static val DRIVER_FACTORIES = ImmutableMap.<String, IDriverFactory>builder
		.put("viewModel-batch-physical", [new BatchViewModelDriver(it, ManifestationMode.PHYSICAL)])
		.put("viewModel-batch-mock", [new BatchViewModelDriver(it, ManifestationMode.MOCK)])
		.put("viewModel-incremental-physical", [new IncrementalViewModelDriver(it, ManifestationMode.PHYSICAL)])
		.put("viewModel-incremental-mock", [new IncrementalViewModelDriver(it, ManifestationMode.MOCK)])
		.build

	private new() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}
}
