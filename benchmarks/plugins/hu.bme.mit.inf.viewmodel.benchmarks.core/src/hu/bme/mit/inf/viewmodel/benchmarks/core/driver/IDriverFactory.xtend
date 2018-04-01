package hu.bme.mit.inf.viewmodel.benchmarks.core.driver

import hu.bme.mit.inf.viewmodel.benchmarks.core.context.ExperimentContext

@FunctionalInterface
interface IDriverFactory {
	def IExperimentDriver createDriver(ExperimentContext experimentContext)
}