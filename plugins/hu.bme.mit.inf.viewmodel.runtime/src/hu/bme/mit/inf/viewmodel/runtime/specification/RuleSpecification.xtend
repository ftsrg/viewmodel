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

import hu.bme.mit.inf.viewmodel.runtime.specification.ConstraintRuleSpecification.ConstraintAcceptor
import java.util.function.BiConsumer
import java.util.function.Function

abstract class RuleSpecification<Pattern, Template> {
	package new() {
	}

	def <Pattern2, Template2> RuleSpecification<Pattern2, Template2> bimap(
		Function<? super Pattern, ? extends Pattern2> patternF,
		Function<? super Template, ? extends Template2> templateF
	)

	def <Template2> RuleSpecification<Pattern, Template2> parseTemplates(
		BiConsumer<? super ConstraintAcceptor<Template2>, ? super TemplateConstraintSpecification<? extends Template>> parser)
}

abstract class TemplateBivariantRuleSpecification<Pattern, Template> extends RuleSpecification<Pattern, Template> {
	package new() {
	}

	def <Pattern2, Template2> TemplateBivariantRuleSpecification<Pattern2, Template2> map(
		Function<? super Pattern, ? extends Pattern2> f)

	override <Pattern2, Template2> bimap(Function<? super Pattern, ? extends Pattern2> patternF,
		Function<? super Template, ? extends Template2> templateF) {
		map(patternF)
	}

	override <Template2> parseTemplates(
		BiConsumer<? super ConstraintAcceptor<Template2>, ? super TemplateConstraintSpecification<? extends Template>> parser) {
		map(Function.identity)
	}
}
