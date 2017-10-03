package hu.bme.mit.inf.viewmodel.runtime.transformation.common

import com.google.common.collect.ImmutableList
import java.util.HashSet
import java.util.List
import org.eclipse.viatra.query.runtime.api.GenericQueryGroup
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
class TransformationChain implements IChainableTransformation {
	
	val List<IChainableTransformation> transformations
	
	override getQueryGroup() {
		val queries = new HashSet
		for (transformation : transformations) {
			queries.addAll(transformation.queryGroup.specifications)
		}
		new GenericQueryGroup(queries)
	}
	
	override createRuleGroup(ViatraQueryEngine queryEngine) {
		PrioritisedRuleGroup.chainedCopyOf(transformations.map[createRuleGroup(queryEngine)])
	}
	
	static def of(IChainableTransformation... transformations) {
		new TransformationChain(ImmutableList.copyOf(transformations))
	}
}