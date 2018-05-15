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

import org.eclipse.core.runtime.Platform
import org.eclipse.equinox.app.IApplication
import org.eclipse.equinox.app.IApplicationContext

class BenchmarksApplication implements IApplication {
	override Object start(IApplicationContext context) throws Exception {
		BenchmarksMain.main(Platform.applicationArgs)
		IApplication.EXIT_OK
	}

	override void stop() {
		// We just exit silently.
	}
}
