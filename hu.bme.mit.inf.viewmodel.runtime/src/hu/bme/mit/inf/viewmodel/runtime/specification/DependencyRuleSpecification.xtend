package hu.bme.mit.inf.viewmodel.runtime.specification

import com.google.common.collect.ImmutableList
import hu.bme.mit.inf.viewmodel.runtime.specification.ConstraintRuleSpecification.ConstraintAcceptor
import java.util.List
import java.util.function.BiConsumer
import java.util.function.Consumer
import java.util.function.Function
import org.eclipse.xtend.lib.annotations.Data

@Data
final class DependencyRuleSpecification<Pattern, Template> extends TemplateBivariantRuleSpecification<Pattern, Template> {
	val List<String> parameters
	val MatchPreconditionSpecification<Pattern> precondition
	val MatchPreconditionSpecification<Pattern> consequence

	override <Pattern2, Template2> DependencyRuleSpecification<Pattern2, Template2> bimap(
		Function<? super Pattern, ? extends Pattern2> patternF,
		Function<? super Template, ? extends Template2> templateF
	) {
		super.<Pattern2, Template2>bimap(patternF, templateF) as DependencyRuleSpecification<Pattern2, Template2>
	}

	override <Pattern2, Template2> DependencyRuleSpecification<Pattern2, Template2> map(
		Function<? super Pattern, ? extends Pattern2> f) {
		new DependencyRuleSpecification(
			parameters,
			precondition.map(f),
			consequence.map(f)
		)
	}

	override <Template2> DependencyRuleSpecification<Pattern, Template2> parseTemplates(
		BiConsumer<? super ConstraintAcceptor<Pattern, Template2>, ? super TemplateConstraintSpecification<? extends Template>> parser) {
		super.<Template2>parseTemplates(parser) as DependencyRuleSpecification<Pattern, Template2>
	}

	static def <Pattern> builder() {
		new Builder<Pattern>
	}

	static def <Pattern, Template> create(Consumer<? super Builder<Pattern>> initializer) {
		val newBuilder = builder
		initializer.accept(newBuilder)
		newBuilder.<Template>build
	}

	static def <Pattern, Template, E extends Throwable> createOrThrow(
		ThrowingConsumer<? super Builder<Pattern>, E> initializer) throws E {
		val builder = builder
		initializer.accept(builder)
		builder.<Template>build
	}

	static final class Builder<Pattern> {
		val parameters = ImmutableList.<String>builder
		var MatchPreconditionSpecification<Pattern> precondition
		var MatchPreconditionSpecification<Pattern> consequence

		def addParameter(String argument) {
			parameters.add(argument)
			this
		}

		def addParameters(Iterable<String> parameters) {
			this.parameters.addAll(parameters)
			this
		}

		def setPrecondition(MatchPreconditionSpecification<Pattern> precondition) {
			this.precondition = precondition
			this
		}

		def setConsequence(MatchPreconditionSpecification<Pattern> consequence) {
			this.consequence = consequence
			this
		}

		def <Template> build() {
			new DependencyRuleSpecification<Pattern, Template>(
				parameters.build,
				precondition,
				consequence
			)
		}
	}
}
