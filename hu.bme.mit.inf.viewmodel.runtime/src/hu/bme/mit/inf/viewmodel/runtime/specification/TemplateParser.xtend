package hu.bme.mit.inf.viewmodel.runtime.specification

import hu.bme.mit.inf.viewmodel.runtime.specification.ConstraintRuleSpecification.ConstraintAcceptor
import java.util.function.BiConsumer

interface TemplateParser<Template, Template2> extends BiConsumer<ConstraintAcceptor<? super Template2>, TemplateConstraintSpecification<? extends Template>> {
}
