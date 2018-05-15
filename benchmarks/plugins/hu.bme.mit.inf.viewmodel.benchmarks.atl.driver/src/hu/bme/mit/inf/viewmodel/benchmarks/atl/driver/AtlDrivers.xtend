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
package hu.bme.mit.inf.viewmodel.benchmarks.atl.driver

import com.google.common.collect.ImmutableMap
import hu.bme.mit.inf.viewmodel.benchmarks.core.driver.IDriverFactory

class AtlDrivers {
	public static val DRIVER_FACTORIES = ImmutableMap.<String, IDriverFactory>builder
		.put("atl-batch", [new BatchAtlDriver(it, false)])
		.put("atl-batch-imperative", [new BatchAtlDriver(it, true)])
		.build

	private new() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}	
}