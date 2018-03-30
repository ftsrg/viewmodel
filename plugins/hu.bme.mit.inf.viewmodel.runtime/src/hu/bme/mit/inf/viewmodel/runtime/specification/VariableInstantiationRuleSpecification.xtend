package hu.bme.mit.inf.viewmodel.runtime.specification

import com.google.common.collect.ImmutableList
import hu.bme.mit.inf.viewmodel.runtime.specification.ConstraintRuleSpecification.ConstraintAcceptor
import java.util.List
import java.util.function.BiConsumer
import java.util.function.Consumer
import java.util.function.Function
import org.eclipse.xtend.lib.annotations.Data

@Data
final class VariableInstantiationRuleSpecification<Pattern, Template> extends TemplateBivariantRuleSpecification<Pattern, Template> {
	val Pattern preconditionPattern
	val List<String> variables

	override <Pattern2, Template2> VariableInstantiationRuleSpecification<Pattern2, Template2> bimap(
		Function<? super Pattern, ? extends Pattern2> patternF,
		Function<? super Template, ? extends Template2> templateF
	) {
		super.<Pattern2, Template2>bimap(patternF,
			templateF) as VariableInstantiationRuleSpecification<Pattern2, Template2>
	}

	override <Pattern2, Template2> map(Function<? super Pattern, ? extends Pattern2> f) {
		new VariableInstantiationRuleSpecification(f.apply(preconditionPattern), variables)
	}

	override <Template2> VariableInstantiationRuleSpecification<Pattern, Template2> parseTemplates(
		BiConsumer<? super ConstraintAcceptor<Template2>, ? super TemplateConstraintSpecification<? extends Template>> parser) {
		super.<Template2>parseTemplates(parser) as VariableInstantiationRuleSpecification<Pattern, Template2>
	}

	static def <T> builder() {
		new Builder<T>
	}

	static def <Pattern, Template> create(Consumer<? super Builder<Pattern>> initializer) {
		val builder = builder
		initializer.accept(builder)
		builder.<Template>build
	}
	
	static def <Pattern, Template, E extends Throwable> createOrThrow(
		ThrowingConsumer<? super Builder<Pattern>, E> initializer) throws E {
		val builder = builder
		initializer.accept(builder)
		builder.<Template>build
	}

	final static class Builder<T> {
		var T preconditionPattern
		val variables = ImmutableList.<String>builder

		private new() {
		}

		def setPreconditionPattern(T preconditionPattern) {
			this.preconditionPattern = preconditionPattern
			this
		}

		def addVariable(String variable) {
			variables.add(variable)
			this
		}
		
		def addVariables(Iterable<String> variables) {
			this.variables.addAll(variables)
			this
		}

		def <Template> build() {
			return new VariableInstantiationRuleSpecification<T, Template>(preconditionPattern, variables.build)
		}
	}
}
