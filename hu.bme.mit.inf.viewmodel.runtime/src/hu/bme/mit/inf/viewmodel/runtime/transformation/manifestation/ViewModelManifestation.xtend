package hu.bme.mit.inf.viewmodel.runtime.transformation.manifestation

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Cluster
import hu.bme.mit.inf.viewmodel.runtime.queries.manifestationtrace.ManifestationTraceQueries
import hu.bme.mit.inf.viewmodel.runtime.queries.manifestationtrace.util.ManifestableConcreteVariableQuerySpecification
import hu.bme.mit.inf.viewmodel.runtime.queries.manifestationtrace.util.ManifestableEObjectConstantValueQuerySpecification
import hu.bme.mit.inf.viewmodel.runtime.queries.manifestationtrace.util.ManifestableJavaObjectConstantValueQuerySpecification
import hu.bme.mit.inf.viewmodel.runtime.queries.manifestationtrace.util.ManifestableRelationQuerySpecification
import hu.bme.mit.inf.viewmodel.runtime.transformation.common.BasicChainableTransformationFactory
import hu.bme.mit.inf.viewmodel.runtime.transformation.common.Lazy
import hu.bme.mit.inf.viewmodel.runtime.transformation.common.PrioritisedRuleGroup
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRuleFactory
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
class ViewModelManifestation extends BasicChainableTransformationFactory {
	static val MANIFESTATION_PRIORITY = 0
	static val REFERENCE_PRIORITY = 10

	val ManifestationTraceManager traceManager
	extension val EventDrivenTransformationRuleFactory = new EventDrivenTransformationRuleFactory

	override getQueryGroup() {
		ManifestationTraceQueries.instance
	}

	override createRuleGroup(ViatraQueryEngine queryEngine) {
		val traceMatcher = Lazy.of[traceManager.getMatcher(queryEngine)]
		PrioritisedRuleGroup.of(
			MANIFESTATION_PRIORITY ->
				createRule.precondition(ManifestableConcreteVariableQuerySpecification.instance).action(
					CRUDActivationStateEnum.CREATED) [
					// println("CREATED " + rep + " : " + type.name)
					traceManager.manifestInterpretedEObject(rep, type)
				].action(CRUDActivationStateEnum.DELETED) [
					// println("DELETED " + rep + " : " + type.name)
					removeManifestation(rep, traceMatcher.get)
				].filter[traceModelId == traceManager.traceModelId].build,
			MANIFESTATION_PRIORITY ->
				createRule.precondition(ManifestableEObjectConstantValueQuerySpecification.instance).action(
					CRUDActivationStateEnum.CREATED) [
					// println("CREATED " + rep + " = " + value)
					traceManager.manifestUninterpretedEObject(rep, value)
				].action(CRUDActivationStateEnum.DELETED) [
					// println("DELETED " + rep + " = " + value)
					removeManifestation(rep, traceMatcher.get)
				].filter[traceModelId == traceManager.traceModelId].build,
			MANIFESTATION_PRIORITY ->
				createRule.precondition(ManifestableJavaObjectConstantValueQuerySpecification.instance).action(
					CRUDActivationStateEnum.CREATED) [
					// println("CREATED " + rep + " = " + value)
					traceManager.manifestPrimitive(rep, value)
				].action(CRUDActivationStateEnum.DELETED) [
					// println("DELETED " + rep + " = " + value)
					removeManifestation(rep, traceMatcher.get)
				].filter[traceModelId == traceManager.traceModelId].build,
			REFERENCE_PRIORITY ->
				createRule.precondition(ManifestableRelationQuerySpecification.instance).action(
					CRUDActivationStateEnum.CREATED) [
					// println("CREATED " + leftManifestation + " -[" + relation.name + "]-> " + rightManifestation)
					traceManager.setRelation(leftManifestation, rightManifestation, relation)
				].action(CRUDActivationStateEnum.DELETED) [
					// println("DELETED " + leftManifestation + " -[" + relation.name + "]-> " + rightManifestation)
					traceManager.unsetRelation(leftManifestation, rightManifestation, relation)
				].filter[traceModelId == traceManager.traceModelId].build
		)
	}

	protected def removeManifestation(Cluster cluster, ManifestationTraceMatcher traceMatcher) {
		val manifestation = traceMatcher.getManifestation(cluster.id)
		traceManager.removeManifestation(manifestation)
	}
}
