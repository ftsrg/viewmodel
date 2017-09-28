package hu.bme.mit.inf.viewmodel.runtime.transformation.common

import com.google.common.collect.ImmutableMultimap
import com.google.common.collect.Multimap
import org.eclipse.viatra.transformation.evm.specific.ConflictResolvers
import org.eclipse.viatra.transformation.runtime.emf.rules.EventDrivenTransformationRuleGroup
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

class PrioritisedRuleGroup {
	public static val DEFAULT_PRIORITY = 0

	@Accessors(PUBLIC_GETTER) val Multimap<Integer, EventDrivenTransformationRule<?, ?>> rules

	@FinalFieldsConstructor
	new() {
	}
	
	def toTransformationRuleGroup() {
		new EventDrivenTransformationRuleGroup(rules.values)
	}
	
	def toFixedPriorityResolver() {
		val resolver = ConflictResolvers.createFixedPriorityResolver
		for (pair : rules.entries) {
			resolver.setPriority(pair.value.ruleSpecification, pair.key)
		}
		resolver
	}

	def minimumPriority() {
		rules.keySet.min
	}
	
	def maximumPriority() {
		rules.keySet.max
	}

	static def of(EventDrivenTransformationRule<?, ?>... rules) {
		copyOf(rules)
	}

	static def copyOf(Iterable<EventDrivenTransformationRule<?, ?>> rules) {
		new PrioritisedRuleGroup(ImmutableMultimap.builder.putAll(DEFAULT_PRIORITY, rules).build)
	}
	
	static def chained(PrioritisedRuleGroup... groups) {
		chainedCopyOf(groups)
	}
	
	static def chainedCopyOf(Iterable<PrioritisedRuleGroup> groups) {
		val builder = ImmutableMultimap.builder
		var priority = DEFAULT_PRIORITY
		for (group : groups) {
			val min = group.minimumPriority
			for (entry : group.rules.entries) {
				builder.put(entry.key - min + priority, entry.value)
			}
			priority += group.maximumPriority - min + 1
		}
	}
}
