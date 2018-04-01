package hu.bme.mit.inf.viewmodel.benchmarks.core

import hu.bme.mit.inf.viewmodel.benchmarks.core.configuration.BenchmarksConfiguration
import hu.bme.mit.inf.viewmodel.benchmarks.core.configuration.ExperimentConfiguration
import hu.bme.mit.inf.viewmodel.benchmarks.core.context.LoggingContext
import hu.bme.mit.inf.viewmodel.benchmarks.core.context.WarmupContext
import hu.bme.mit.inf.viewmodel.benchmarks.core.driver.IDriverFactory
import java.io.File
import java.io.PrintWriter
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Map
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
class BenchmarkRunner {
	val BenchmarksConfiguration benchmarkConfiguration
	val Map<String, IDriverFactory> driverFactories

	PrintWriter logOutput

	def runBenchmarks() {
		val dateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss")
		val dirName = benchmarkConfiguration.outputPath + File.pathSeparator + dateFormat.format(new Date)
		new File(dirName).mkdirs
		logOutput = BenchmarkUtils.newLogFile(dirName + File.pathSeparator + BenchmarkUtils.LOG_NAME)
		try {
			for (experimentConfiguration : benchmarkConfiguration.experimentConfigurations) {
				runExperiment(experimentConfiguration)
			}
		} finally {
			logOutput.flush
			logOutput.close
		}
	}

	private def runExperiment(ExperimentConfiguration experimentConfiguration) {
		val factory = driverFactories.get(experimentConfiguration.experimentName)
		if (factory === null) {
			throw new IllegalArgumentException("Unknown experiment: " + experimentConfiguration.experimentName)
		}
		val reruns = benchmarkConfiguration.iterations
		for (var int rerun = -benchmarkConfiguration.warmupIterations; rerun < reruns; rerun++) {
			val context = createContext(experimentConfiguration, rerun)
			try {
				val driver = factory.createDriver(context)
				try {
					driver.runExperiment
				} finally {
					driver.dispose
				}
			} finally {
				context.dispose
			}
		}
	}

	def createContext(ExperimentConfiguration experimentConfiguration, int rerun) {
		if (rerun < 0) {
			new WarmupContext(benchmarkConfiguration, experimentConfiguration)
		} else {
			new LoggingContext(benchmarkConfiguration, experimentConfiguration, rerun, logOutput)
		}
	}
}
