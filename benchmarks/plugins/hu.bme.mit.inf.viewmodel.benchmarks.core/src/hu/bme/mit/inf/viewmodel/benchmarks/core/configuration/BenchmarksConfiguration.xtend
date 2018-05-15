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
package hu.bme.mit.inf.viewmodel.benchmarks.core.configuration

import com.google.gson.annotations.SerializedName
import hu.bme.mit.inf.viewmodel.benchmarks.core.modification.ModelModification
import java.util.List
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class BenchmarksConfiguration {

	@SerializedName("randomSeed")
	long randomSeed

	@SerializedName("warmup")
	int warmupIterations

	@SerializedName("iterations")
	int iterations

	@SerializedName("gcSleep")
	int gcSleep

	@SerializedName("modelPath")
	String modelPath

	@SerializedName("outputPath")
	String outputPath

	@SerializedName("logFileName")
	String logFileName
	
	@SerializedName("saveTargets")
	boolean saveTargets

	@SerializedName("timestampOutput")
	boolean timestampOutput

	@SerializedName("modificationMixes")
	Map<String, Map<ModelModification, Integer>> modificationMixes

	@SerializedName("experiments")
	List<ExperimentConfiguration> experimentConfigurations
}
