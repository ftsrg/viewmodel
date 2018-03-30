package hu.bme.mit.inf.viewmodel.runtime.transformation.common

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.evm.specific.ExecutionSchemas
import org.eclipse.viatra.transformation.evm.specific.Schedulers

final class ChainableTransformations {
	private new() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}

	static def createExecutionSchema(ViatraQueryEngine queryEngine, IChainableTransformationFactory transformationFactory) {
		val transformation = transformationFactory.createTransformation(queryEngine)
		val schedulerFactory = Schedulers.getQueryEngineSchedulerFactory(queryEngine)
		val conflictResolver = transformation.conflictResolver
		val executionSchema = ExecutionSchemas.createViatraQueryExecutionSchema(queryEngine, schedulerFactory, conflictResolver)
		transformation.startExecution(executionSchema)
		executionSchema
	}
}
