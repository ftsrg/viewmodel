package hu.bme.mit.inf.viewmodel.benchmarks.application

import com.google.common.collect.ImmutableMap
import hu.bme.mit.inf.viewmodel.benchmarks.atl.driver.AtlDrivers
import hu.bme.mit.inf.viewmodel.benchmarks.core.BenchmarkRunner
import hu.bme.mit.inf.viewmodel.benchmarks.core.driver.IDriverFactory
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.driver.TggDrivers
import hu.bme.mit.inf.viewmodel.benchmarks.viewmodel.driver.ViewModelDrivers
import java.util.Map

class BenchmarksMain {
	public static val CONFIG_FILE_ARGUMENT = "-benchmarks"
	public static val DEFAULT_CONFIG_FILE = "benchmarks.json"
	
	val String configFilePath
	
	protected new(String[] args) {
		configFilePath = getConfigFilePath(args)
	}
	
	def run() {
		val runner = new BenchmarkRunner(configFilePath, driverFactories)
		runner.runBenchmarks
	}
	
	protected def Map<String, IDriverFactory> getDriverFactories() {
		ImmutableMap.builder
			.putAll(AtlDrivers.DRIVER_FACTORIES)
			.putAll(TggDrivers.DRIVER_FACTORIES)
			.putAll(ViewModelDrivers.DRIVER_FACTORIES)
			.build
	}
	
	public static def void main(String[] args) {
		val benchmarksMain = new BenchmarksMain(args)
		benchmarksMain.run()
	}
	
	private static def getConfigFilePath(String[] args) {
		for (var int i = 0; i < args.length - 1; i++) {
			if (args.get(i) == CONFIG_FILE_ARGUMENT) {
				return args.get(i + 1)
			}
		}
		DEFAULT_CONFIG_FILE
	}
}
