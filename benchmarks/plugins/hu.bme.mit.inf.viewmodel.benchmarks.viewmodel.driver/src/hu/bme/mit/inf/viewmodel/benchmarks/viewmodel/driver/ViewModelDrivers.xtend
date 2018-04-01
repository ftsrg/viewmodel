package hu.bme.mit.inf.viewmodel.benchmarks.viewmodel.driver

final class ViewModelDrivers {
	public static val DRIVER_FACTORIES = #{
		"viewModel-batch-physical" -> [new BatchViewModelDriver(it, ManifestationMode.PHYSICAL)],
		"viewModel-batch-mock" -> [new BatchViewModelDriver(it, ManifestationMode.MOCK)],
		"viewModel-incremental-physical" -> [new IncrementalViewModelDriver(it, ManifestationMode.PHYSICAL)],
		"viewModel-incremental-mock" -> [new IncrementalViewModelDriver(it, ManifestationMode.MOCK)]
	}

	private new() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}
}
