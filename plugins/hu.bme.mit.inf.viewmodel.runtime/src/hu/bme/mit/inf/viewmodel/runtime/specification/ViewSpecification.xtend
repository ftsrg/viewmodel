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
package hu.bme.mit.inf.viewmodel.runtime.specification

import com.google.common.collect.ImmutableList
import hu.bme.mit.inf.viewmodel.runtime.specification.ConstraintRuleSpecification.ConstraintAcceptor
import java.util.List
import java.util.function.BiConsumer
import java.util.function.Consumer
import java.util.function.Function
import org.eclipse.xtend.lib.annotations.Data

@Data
final class ViewSpecification<Pattern, Template> {
	val String name
	val List<String> requiredMetamodels
	val List<RuleSpecification<? extends Pattern, ? extends Template>> ruleSpecifications

	def <Pattern2, Template2> bimap(Function<? super Pattern, ? extends Pattern2> patternF,
		Function<? super Template, ? extends Template2> templateF) {
		val newRuleSpecifications = ruleSpecifications.map[bimap(patternF, templateF)]
		new ViewSpecification(name, requiredMetamodels, ImmutableList.copyOf(newRuleSpecifications))
	}

	def <Template2> parseTemplates(
		BiConsumer<? super ConstraintAcceptor<Template2>, ? super TemplateConstraintSpecification<? extends Template>> parser) {
		val newRuleSpecifications = ruleSpecifications.map[parseTemplates(parser)]
		new ViewSpecification<Pattern, Template2>(name, requiredMetamodels, ImmutableList.copyOf(newRuleSpecifications))
	}

	static def <Pattern, Template> builder() {
		new Builder<Pattern, Template>
	}

	static def <Pattern, Template> create(Consumer<Builder<Pattern, Template>> initializer) {
		val builder = builder
		initializer.accept(builder)
		builder.build
	}

	static def <Pattern, Template, E extends Throwable> createOrThrow(
		ThrowingConsumer<Builder<Pattern, Template>, E> initializer) throws E {
		val builder = builder
		initializer.accept(builder)
		builder.build
	}

	final static class Builder<Pattern, Template> {
		var String name
		val requiredMetamodels = ImmutableList.<String>builder
		val ruleSpecifications = ImmutableList.<RuleSpecification<? extends Pattern, ? extends Template>>builder

		private new() {
		}

		def setName(String name) {
			this.name = name
			this
		}
		
		def addRequiredMetamodel(String requiredMetamodel) {
			requiredMetamodels.add(requiredMetamodel)
			this
		}

		def addRule(RuleSpecification<? extends Pattern, ? extends Template> ruleSpecification) {
			ruleSpecifications.add(ruleSpecification)
			this
		}

		def addVariableInstantiationRule(
			Consumer<? super VariableInstantiationRuleSpecification.Builder<Pattern>> initializer) {
			val rule = VariableInstantiationRuleSpecification.create(initializer)
			addRule(rule)
		}

		def <E extends Throwable> addVariableInstantiationRuleOrThrow(
			ThrowingConsumer<? super VariableInstantiationRuleSpecification.Builder<Pattern>, E> initializer) throws E {
			val rule = VariableInstantiationRuleSpecification.createOrThrow(initializer)
			addRule(rule)
		}

		def addConstraintRule(Consumer<? super ConstraintRuleSpecification.Builder<Pattern, Template>> initializer) {
			val rule = ConstraintRuleSpecification.create(initializer)
			addRule(rule)
		}

		def <E extends Throwable> addConstraintRuleOrThrow(
			ThrowingConsumer<? super ConstraintRuleSpecification.Builder<Pattern, Template>, E> initializer) throws E {
			val rule = ConstraintRuleSpecification.createOrThrow(initializer)
			addRule(rule)
		}

		def addDependencyRule(Consumer<? super DependencyRuleSpecification.Builder<Pattern>> initializer) {
			val rule = DependencyRuleSpecification.create(initializer)
			addRule(rule)
		}

		def <E extends Throwable> addDependencyRuleOrThrow(
			ThrowingConsumer<? super DependencyRuleSpecification.Builder<Pattern>, E> initializer) throws E  {
			val rule = DependencyRuleSpecification.createOrThrow(initializer)
			addRule(rule)
		}

		def build() {
			new ViewSpecification(name, requiredMetamodels.build, ruleSpecifications.build)
		}
	}
}
