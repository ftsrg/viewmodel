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
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class ExperimentConfiguration {
	public static val DEFAULT_MODIFICATION_MIX = "none"

	@SerializedName("model")
	String modelName
	
	@SerializedName("dependabilityModel")
	String dependabilityModelName

	@SerializedName("transformationCase")
	TransformationCase transformationCase

	@SerializedName("experiment")
	String experimentName

	@SerializedName("modificationMix")
	String modificationMixName

	def getModificationMixNameOrDefault() {
		modificationMixName ?: DEFAULT_MODIFICATION_MIX
	}
}
