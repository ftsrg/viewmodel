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
package hu.bme.mit.inf.viewmodel.benchmarks.core.context

import hu.bme.mit.inf.viewmodel.benchmarks.core.configuration.BenchmarksConfiguration
import hu.bme.mit.inf.viewmodel.benchmarks.core.configuration.ExperimentConfiguration
import java.util.Collection
import org.eclipse.emf.ecore.EObject

class WarmupContext extends ExperimentContext {
	
	new(BenchmarksConfiguration benchmarksConfiguration, ExperimentConfiguration experimentConfiguration) {
		super(benchmarksConfiguration, experimentConfiguration)
	}
	
	override logValue(String variable, Object value) {
		// Do nothing.
	}
	
	override serializeModel(String fileName, Collection<EObject> eObjects) {
		// Do nothing.
	}
	
}