package hu.bme.mit.inf.viewmodel.benchmarks.viatra.transformation

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Railway2VirtualSwitchViewFactory
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Railway2VirtualSwitchViewTrace
import hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.VirtualSwitchViewFactory
import hu.bme.mit.inf.viewmodel.benchmarks.queries.virtualswitchview.VirtualSwitchTraceMatcher
import hu.bme.mit.inf.viewmodel.benchmarks.queries.virtualswitchview.util.ConnectedToQuerySpecification
import hu.bme.mit.inf.viewmodel.benchmarks.queries.virtualswitchview.util.CountConnectedInFailureQuerySpecification
import hu.bme.mit.inf.viewmodel.benchmarks.queries.virtualswitchview.util.VirtualSwitchesQuerySpecification
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.viatra.query.runtime.api.GenericQueryGroup
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.evm.specific.resolver.InvertedDisappearancePriorityConflictResolver
import org.eclipse.viatra.transformation.runtime.emf.rules.EventDrivenTransformationRuleGroup
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule
import org.eclipse.xtend.lib.annotations.Accessors

class RailwayModel2VirtualSwitchModelPrioritised extends HandCodedTransformation {
	@Accessors(PUBLIC_GETTER) Railway2VirtualSwitchViewTrace traceModel

	VirtualSwitchTraceMatcher virtualSwitchTracedMatcher

	EventDrivenTransformationRule<?, ?> virtualSwitchRule
	EventDrivenTransformationRule<?, ?> connectedSwitchesRule
	EventDrivenTransformationRule<?, ?> countConnectedInFailureRule

	new(RailwayContainer railwayContainer, ResourceSet resourceSet) {
		super(railwayContainer, resourceSet)
	}

	protected override createTraceModel(RailwayContainer railwayContainer) {
		traceModel = Railway2VirtualSwitchViewFactory.eINSTANCE.createRailway2VirtualSwitchViewTrace => [
			source = railwayContainer
		]
	}

	override getTraceLinkCount() {
		traceModel.traceLinks.size
	}

	protected override getQueryGroup() {
		GenericQueryGroup.of(
			VirtualSwitchesQuerySpecification.instance,
			ConnectedToQuerySpecification.instance,
			CountConnectedInFailureQuerySpecification.instance
		)
	}

	protected override createMatchers(ViatraQueryEngine queryEngine) {
		virtualSwitchTracedMatcher = VirtualSwitchTraceMatcher.on(queryEngine)
	}

	override protected createRules() {
		extension val VirtualSwitchViewFactory = VirtualSwitchViewFactory.eINSTANCE
		extension val Railway2VirtualSwitchViewFactory = Railway2VirtualSwitchViewFactory.eINSTANCE

		virtualSwitchRule = createRule.precondition(VirtualSwitchesQuerySpecification.instance).action(
			CRUDActivationStateEnum.CREATED) [
			val virtualSwitch = createVirtualSwitch
			val traceLink = createSwitch2VirtualSwitch
			traceLink.^switch = ^switch
			traceLink.virtualSwitch = virtualSwitch
			traceModel.traceLinks += traceLink
			targetResource.contents += virtualSwitch
		].action(CRUDActivationStateEnum.DELETED) [
			for (traceLink : virtualSwitchTracedMatcher.getAllValuesOfTraceLink(traceModel, ^switch)) {
				traceModel.traceLinks -= traceLink
				targetResource.contents -= traceLink.virtualSwitch
			}
		].build

		connectedSwitchesRule = createRule.precondition(ConnectedToQuerySpecification.instance).action(
			CRUDActivationStateEnum.CREATED) [
			getVirtualSwitch(left).connectedTo += getVirtualSwitch(right)
		].action(CRUDActivationStateEnum.DELETED) [
			getVirtualSwitch(left).connectedTo -= getVirtualSwitch(right)
		].build

		countConnectedInFailureRule = createRule.precondition(CountConnectedInFailureQuerySpecification.instance).
			action(CRUDActivationStateEnum.CREATED) [
				getVirtualSwitch(^switch).countConnectedInFailure = n
			].build
	}

	protected override getTransformationRuleGroup() {
		new EventDrivenTransformationRuleGroup(virtualSwitchRule, connectedSwitchesRule, countConnectedInFailureRule)
	}

	override protected getConflictResolver() {
		val resolver = new InvertedDisappearancePriorityConflictResolver
		resolver.setPriority(virtualSwitchRule.ruleSpecification, 0)
		// Only connect switches after the appropriate virtual switch was created.
		resolver.setPriority(connectedSwitchesRule.ruleSpecification, 10)
		resolver.setPriority(countConnectedInFailureRule.ruleSpecification, 10)
		resolver
	}

	private def getVirtualSwitch(Switch ^switch) {
		virtualSwitchTracedMatcher.getOneArbitraryMatch(traceModel, ^switch, null).traceLink.virtualSwitch
	}
}
