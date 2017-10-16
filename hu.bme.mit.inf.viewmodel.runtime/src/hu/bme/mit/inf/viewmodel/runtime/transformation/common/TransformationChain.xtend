package hu.bme.mit.inf.viewmodel.runtime.transformation.common

import com.google.common.collect.ImmutableList
import java.util.HashSet
import java.util.List
import org.eclipse.viatra.query.runtime.api.GenericQueryGroup
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.evm.api.ExecutionSchema
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
class TransformationChain implements IChainableTransformationFactory {

	val List<IChainableTransformationFactory> transformationFactories

	override createTransformation(ViatraQueryEngine queryEngine) {
		val builder = ImmutableList.builder
		for (factory : transformationFactories) {
			val transformation = factory.createTransformation(queryEngine)
			if (transformation.queryEngine != queryEngine) {
				throw new IllegalStateException("Chained transformations must be over the same query engine.")
			}
			builder.add(transformation)
		}
		new ChainedTransformation(queryEngine, builder.build, false)
	}

	static def of(IChainableTransformationFactory... transformationFactories) {
		new TransformationChain(ImmutableList.copyOf(transformationFactories))
	}

	@FinalFieldsConstructor
	static class ChainedTransformation implements IChainableTransformation {
		@Accessors(PUBLIC_GETTER) val ViatraQueryEngine queryEngine
		val List<IChainableTransformation> transformations
		val boolean prepareAllQueries

		override getQueryGroup() {
			val queries = new HashSet
			for (transformation : transformations) {
				queries.addAll(transformation.queryGroup.specifications)
			}
			new GenericQueryGroup(queries)
		}

		override getRuleGroup() {
			PrioritisedRuleGroup.chainedCopyOf(transformations.map[ruleGroup])
		}

		override startExecution(ExecutionSchema executionSchema) {
			if (prepareAllQueries) {
				queryGroup.prepare(queryEngine)
			}
			for (transformation : transformations) {
				transformation.startExecution(executionSchema)
			}
		}

	}

}
