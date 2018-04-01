package hu.bme.mit.inf.viewmodel.benchmarks.core.context

import hu.bme.mit.inf.viewmodel.benchmarks.core.configuration.BenchmarksConfiguration
import hu.bme.mit.inf.viewmodel.benchmarks.core.configuration.ExperimentConfiguration
import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter
import java.util.Collection
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl

class LoggingContext extends ExperimentContext {
	val boolean saveTargets
	val String outputPath
	val String logPrefix
	val PrintWriter logWriter

	new(BenchmarksConfiguration benchmarksConfiguration, ExperimentConfiguration experimentConfiguration, int rerun,
		PrintWriter logWriter) {
		super(benchmarksConfiguration, experimentConfiguration)
		saveTargets = benchmarksConfiguration.saveTargets
		val modelName = experimentConfiguration.modelName
		val caseName = experimentConfiguration.getTransformationCase
		val experimentName = experimentConfiguration.experimentName
		val modificationName = experimentConfiguration.modificationMixNameOrDefault
		outputPath = #[benchmarksConfiguration.outputPath, modelName, caseName, experimentName, modificationName,
			rerun].join(File.pathSeparator)
		if (saveTargets) {
			new File(outputPath).mkdirs
		}
		logPrefix = '''«modelName»,«caseName»,«experimentName»,«modificationName»,rerun,'''
		this.logWriter = logWriter
	}

	override logValue(String variable, Object value) {
		val outputLine = logPrefix + variable + "," + value
		System.out.println(outputLine)
		printlnFlush(logWriter, outputLine)
	}

	override serializeModel(String fileName, Collection<EObject> eObjects) {
		if (!saveTargets) {
			return
		}
		val resource = new XMIResourceImpl
		resource.contents += EcoreUtil.copyAll(eObjects)
		resource.encoding = "utf-8"
		val outputStream = new FileOutputStream(outputPath + File.pathSeparator + fileName)
		try {
			resource.save(outputStream, emptyMap)
		} finally {
			outputStream.close
		}
	}

	private static def printlnFlush(PrintWriter writer, String s) {
		writer.println(s)
		writer.flush
	}

}
