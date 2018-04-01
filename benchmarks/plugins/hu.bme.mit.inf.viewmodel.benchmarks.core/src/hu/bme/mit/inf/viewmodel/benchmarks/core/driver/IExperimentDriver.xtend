package hu.bme.mit.inf.viewmodel.benchmarks.core.driver

interface IExperimentDriver {
	def void runExperiment()
	
	def void dispose()
}