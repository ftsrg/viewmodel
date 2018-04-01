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
