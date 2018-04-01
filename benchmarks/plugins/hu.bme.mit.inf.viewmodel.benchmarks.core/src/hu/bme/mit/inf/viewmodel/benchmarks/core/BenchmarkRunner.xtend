package hu.bme.mit.inf.viewmodel.benchmarks.core

import com.google.gson.GsonBuilder
import hu.bme.mit.inf.viewmodel.benchmarks.core.configuration.BenchmarksConfiguration
import hu.bme.mit.inf.viewmodel.benchmarks.core.configuration.ExperimentConfiguration
import hu.bme.mit.inf.viewmodel.benchmarks.core.context.LoggingContext
import hu.bme.mit.inf.viewmodel.benchmarks.core.context.WarmupContext
import hu.bme.mit.inf.viewmodel.benchmarks.core.driver.IDriverFactory
import java.io.File
import java.io.FileReader
import java.io.PrintWriter
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Map
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

class BenchmarkRunner {
	val BenchmarksConfiguration benchmarksConfiguration
	val Map<String, IDriverFactory> driverFactories

	String outputPath
	PrintWriter logOutput

	@FinalFieldsConstructor
	new() {
	}
	
	new(String configFilePath, Map<String, IDriverFactory> driverFactories) {
		this(loadConfigFile(configFilePath), driverFactories)
	}
	
	private static def loadConfigFile(String configFilePath) {
		val gson = new GsonBuilder().create
		val reader = new FileReader(configFilePath)
		try {
			gson.fromJson(reader, BenchmarksConfiguration)
		} finally {
			reader.close
		}
	}

	def runBenchmarks() {
		outputPath = if (benchmarksConfiguration.timestampOutput) {
			val dateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss")
			benchmarksConfiguration.outputPath + File.separator + dateFormat.format(new Date)
		} else {
			benchmarksConfiguration.outputPath
		}
		new File(outputPath).mkdirs
		val logFileName = benchmarksConfiguration.logFileName ?: BenchmarkUtils.LOG_NAME
		logOutput = BenchmarkUtils.newLogFile(outputPath + File.separator + logFileName)
		try {
			for (experimentConfiguration : benchmarksConfiguration.experimentConfigurations) {
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
		val reruns = benchmarksConfiguration.iterations
		for (var int rerun = -benchmarksConfiguration.warmupIterations; rerun < reruns; rerun++) {
			val context = createContext(experimentConfiguration, rerun)
			try {
				val driver = factory.createDriver(context)
				try {
					driver.runExperiment
				} finally {
					driver.dispose
				}
				context.waitForGc
			} finally {
				context.dispose
			}
		}
	}

	def createContext(ExperimentConfiguration experimentConfiguration, int rerun) {
		if (rerun < 0) {
			new WarmupContext(benchmarksConfiguration, experimentConfiguration)
		} else {
			new LoggingContext(benchmarksConfiguration, experimentConfiguration, rerun, outputPath, logOutput)
		}
	}
}
