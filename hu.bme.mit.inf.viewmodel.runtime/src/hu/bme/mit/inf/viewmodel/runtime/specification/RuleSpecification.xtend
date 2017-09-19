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
		BiConsumer<? super ConstraintAcceptor<? extends Pattern, ? extends Template2>, ? super TemplateConstraintSpecification<? extends Template>> parser)
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
		BiConsumer<? super ConstraintAcceptor<? extends Pattern, ? extends Template2>, ? super TemplateConstraintSpecification<? extends Template>> parser) {
		map(Function.identity)
	}
}
