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
package hu.bme.mit.inf.viewmodel.benchmarks.viewmodel.driver

import com.google.common.collect.ImmutableMap
import hu.bme.mit.inf.viewmodel.benchmarks.core.driver.IDriverFactory

final class ViewModelDrivers {
	public static val DRIVER_FACTORIES = ImmutableMap.<String, IDriverFactory>builder
		.put("viewModel-batch-physical", [new BatchViewModelDriver(it, ManifestationMode.PHYSICAL)])
		.put("viewModel-batch-mock", [new BatchViewModelDriver(it, ManifestationMode.MOCK)])
		.put("viewModel-incremental-physical", [new IncrementalViewModelDriver(it, ManifestationMode.PHYSICAL)])
		.put("viewModel-incremental-mock", [new IncrementalViewModelDriver(it, ManifestationMode.MOCK)])
		.put("viewModel-statistics", [new ModificationStatisticsViewModelDriver(it)])
		.build

	private new() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}
}
