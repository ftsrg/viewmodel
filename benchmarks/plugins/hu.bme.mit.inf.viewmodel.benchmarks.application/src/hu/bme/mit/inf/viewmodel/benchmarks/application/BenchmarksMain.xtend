/********************************************************************************
 * Copyright (c) 2018 Contributors to the ViewModel project
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * SPDX-License-Identifier: EPL-1.0
 ********************************************************************************/
package hu.bme.mit.inf.viewmodel.benchmarks.application

import com.google.common.collect.ImmutableMap
import hu.bme.mit.inf.viewmodel.benchmarks.atl.driver.AtlDrivers
import hu.bme.mit.inf.viewmodel.benchmarks.core.BenchmarkRunner
import hu.bme.mit.inf.viewmodel.benchmarks.core.driver.IDriverFactory
import hu.bme.mit.inf.viewmodel.benchmarks.core.modification.DependabiltyModelGenerator
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.driver.TggDrivers
import hu.bme.mit.inf.viewmodel.benchmarks.viatra.driver.ViatraDrivers
import hu.bme.mit.inf.viewmodel.benchmarks.viewmodel.driver.ViewModelDrivers
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

class BenchmarksMain {
	public static val CONFIG_FILE_ARGUMENT = "-benchmarks"
	public static val DEFAULT_CONFIG_FILE = "benchmarks.json"
	public static val CREATE_DEPENDABILITY_ARGUMENT = "-createDependability"

	val String[] args

	@FinalFieldsConstructor
	protected new() {
	}

	def run() {
		var configFilePath = DEFAULT_CONFIG_FILE
		for (var int i = 0; i < args.length; i++) {
			val arg = args.get(i)
			if (arg == CONFIG_FILE_ARGUMENT) {
				if (i < args.length - 1) {
					configFilePath = args.get(i + 1)
					i++
				} else {
					throw new IllegalArgumentException("Missing config file path")
				}
			} else if (arg == CREATE_DEPENDABILITY_ARGUMENT) {
				if (i < args.length - 2) {
					val railwayModelUrl = URI.createFileURI(args.get(i + 1))
					val dependabilityModelUri = URI.createFileURI(args.get(i + 2))
					createDependabilityModel(railwayModelUrl, dependabilityModelUri)
					return
				} else {
					throw new IllegalArgumentException("Missing model file paths")
				}
			}
		}
		val runner = new BenchmarkRunner(configFilePath, driverFactories)
		runner.runBenchmarks
	}

	protected def Map<String, IDriverFactory> getDriverFactories() {
		ImmutableMap.builder.putAll(AtlDrivers.DRIVER_FACTORIES).putAll(TggDrivers.DRIVER_FACTORIES).putAll(
			ViatraDrivers.DRIVER_FACTORIES).putAll(ViewModelDrivers.DRIVER_FACTORIES).build
	}
	
	protected def void createDependabilityModel(URI railwayModelUrl, URI dependabilityModelUri) {
		val generator = new DependabiltyModelGenerator(railwayModelUrl, dependabilityModelUri)
		generator.createErrorModels
	}

	public static def void main(String[] args) {
		val benchmarksMain = new BenchmarksMain(args)
		benchmarksMain.run()
	}
}
