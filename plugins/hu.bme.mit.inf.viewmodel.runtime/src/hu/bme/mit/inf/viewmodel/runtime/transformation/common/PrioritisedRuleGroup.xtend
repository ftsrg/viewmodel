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
package hu.bme.mit.inf.viewmodel.runtime.transformation.common

import com.google.common.collect.ImmutableMultimap
import com.google.common.collect.Multimap
import org.eclipse.viatra.transformation.evm.api.resolver.ConflictResolver
import org.eclipse.viatra.transformation.runtime.emf.rules.EventDrivenTransformationRuleGroup
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

class PrioritisedRuleGroup {
	public static val DEFAULT_PRIORITY = CreateDeletePriority.DEFAULT

	@Accessors(PUBLIC_GETTER) val Multimap<CreateDeletePriority, EventDrivenTransformationRule<?, ?>> rules

	@FinalFieldsConstructor
	new() {
	}
	
	def toTransformationRuleGroup() {
		new EventDrivenTransformationRuleGroup(rules.values)
	}
	
	def ConflictResolver toConflictResolver() {
		val resolver = new CreateDeletePriorityConflictResolver
		for (pair : rules.entries) {
			resolver.setPriority(pair.value.ruleSpecification, pair.key)
		}
		resolver
	}

	def minimumPriority() {
		rules.keySet.map[min].min
	}
	
	def maximumPriority() {
		rules.keySet.map[max].max
	}

	static def of(EventDrivenTransformationRule<?, ?>... rules) {
		copyOf(rules)
	}
	
	static def of(Pair<CreateDeletePriority, EventDrivenTransformationRule<?, ?>>... rules) {
		val builder = ImmutableMultimap.builder
		for (rule : rules) {
			builder.put(rule.key, rule.value)
		}
		new PrioritisedRuleGroup(builder.build)
	}

	static def copyOf(Iterable<EventDrivenTransformationRule<?, ?>> rules) {
		new PrioritisedRuleGroup(ImmutableMultimap.builder.putAll(DEFAULT_PRIORITY, rules).build)
	}
	
	static def chained(PrioritisedRuleGroup... groups) {
		chainedCopyOf(groups)
	}
	
	static def chainedCopyOf(Iterable<PrioritisedRuleGroup> groups) {
		val builder = ImmutableMultimap.builder
		var priority = 0
		for (group : groups) {
			val min = group.minimumPriority
			for (entry : group.rules.entries) {
				builder.put(entry.key + (priority - min), entry.value)
			}
			priority += group.maximumPriority - min + 1
		}
		new PrioritisedRuleGroup(builder.build)
	}
}
