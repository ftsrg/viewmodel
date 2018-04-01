package hu.bme.mit.inf.viewmodel.benchmarks.core

import java.io.PrintWriter
import java.lang.management.GarbageCollectorMXBean
import java.lang.management.ManagementFactory

final class BenchmarkUtils {
	public static val LOG_NAME = "benchmarks.log"
	public static val LOG_HEADER = "model,transformationCase,experiment,modificationMix,rerun,variable,value"

	private new() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}

	static def newLogFile(String fileName) {
		val writer = new PrintWriter(fileName)
		try {
			writer.println(LOG_HEADER)
			writer.flush
			writer
		} catch (Exception e) {
			writer.close
			throw e
		}
	}
	
	static private def long getGcCount() {
		var long sum = 0
		for (GarbageCollectorMXBean b : ManagementFactory.garbageCollectorMXBeans) {
			val count = b.collectionCount
			if (count != -1) {
				sum += count
			}
		}
		sum
	}

	static def forceGc() {
		// https://cruftex.net/2017/03/28/The-6-Memory-Metrics-You-Should-Track-in-Your-Java-Benchmarks.html#metric-used-memory-after-forced-gc
		val before = gcCount
		Runtime.runtime.gc
		while (gcCount == before) {
			Thread.sleep(1)
		}
	}
}
