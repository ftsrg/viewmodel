package hu.bme.mit.inf.viewmodel.runtime.specification

import com.google.common.collect.ImmutableList
import hu.bme.mit.inf.viewmodel.runtime.utils.FunctionalUtils
import hu.bme.mit.inf.viewmodel.runtime.utils.VariableNameGenerator
import java.util.List
import java.util.function.BiConsumer
import java.util.function.Consumer
import java.util.function.Function
import org.eclipse.xtend.lib.annotations.Data

@Data
final class ConstraintRuleSpecification<Pattern, Template> extends RuleSpecification<Pattern, Template> {
	val String name
	val List<String> parameters
	val List<VariableSpecification> localVariables
	val List<PreconditionSpecification<? extends Pattern>> preconditionSpecifications
	val List<ConstraintSpecification<? extends Template>> constraintSpecifications

	override <Pattern2, Template2> ConstraintRuleSpecification<Pattern2, Template2> bimap(
		Function<? super Pattern, ? extends Pattern2> patternF,
		Function<? super Template, ? extends Template2> templateF
	) {
		new ConstraintRuleSpecification(
			name,
			parameters,
			localVariables,
			ImmutableList.copyOf(preconditionSpecifications.map[map(patternF)]),
			ImmutableList.copyOf(constraintSpecifications.map[map(templateF)])
		)
	}

	override <Template2> ConstraintRuleSpecification<Pattern, Template2> parseTemplates(
		BiConsumer<? super ConstraintAcceptor<Pattern, Template2>, ? super TemplateConstraintSpecification<? extends Template>> parser) {
		val builder = new ConstraintAcceptor(parameters, localVariables, preconditionSpecifications)
		for (constraintSpecification : constraintSpecifications) {
			switch (constraintSpecification) {
				TemplateConstraintSpecification<? extends Template>:
					parser.accept(builder, constraintSpecification)
				default:
					builder.acceptConstraint(constraintSpecification.map(FunctionalUtils.absurd))
			}
		}
		builder.build
	}

	static def <Pattern, Template> builder() {
		new Builder<Pattern, Template>
	}

	static def <Pattern, Template> create(Consumer<? super Builder<Pattern, Template>> initializer) {
		val builder = builder
		initializer.accept(builder)
		builder.build
	}

	static def <Pattern, Template, E extends Throwable> createOrThrow(
		ThrowingConsumer<? super Builder<Template, Pattern>, E> initializer) throws E {
		val builder = builder
		initializer.accept(builder)
		builder.build
	}

	final static class Builder<Pattern, Template> {
		var String name
		val parameters = ImmutableList.<String>builder
		val localVariables = ImmutableList.<VariableSpecification>builder
		val preconditionSpecifications = ImmutableList.<PreconditionSpecification<? extends Pattern>>builder
		val constraintSpecifications = ImmutableList.<ConstraintSpecification<? extends Template>>builder

		private new() {
		}

		private new(List<String> parameters, List<VariableSpecification> localVariables,
			List<PreconditionSpecification<? extends Pattern>> preconditionSpecifications) {
			this.parameters.addAll(parameters)
			this.localVariables.addAll(localVariables)
			this.preconditionSpecifications.addAll(preconditionSpecifications)
		}

		def setName(String name) {
			this.name = name
			this
		}

		def addParameter(String parameter) {
			parameters.add(parameter)
			this
		}

		def addParameters(Iterable<String> parameters) {
			this.parameters.addAll(parameters)
			this
		}

		def addLocalVariable(VariableSpecification localVariable) {
			localVariables.add(localVariable)
			this
		}

		def addLocalVariable(String name) {
			localVariables.add(VariableSpecification.of(name))
			this
		}

		def addPrecondition(PreconditionSpecification<? extends Pattern> preconditionSpecification) {
			preconditionSpecifications.add(preconditionSpecification)
			this
		}

		def addConstraint(ConstraintSpecification<? extends Template> constraintSpecification) {
			constraintSpecifications.add(constraintSpecification)
			this
		}

		def build() {
			new ConstraintRuleSpecification(name, parameters.build, localVariables.build,
				preconditionSpecifications.build, constraintSpecifications.build)
		}
	}

	final static class ConstraintAcceptor<Pattern, Template> {
		val Builder<Pattern, Template> builder
		val VariableNameGenerator nameGenerator

		private new(List<String> parameters, List<VariableSpecification> localVariables,
			List<PreconditionSpecification<? extends Pattern>> preconditionSpecifications) {
			builder = new Builder(parameters, localVariables, preconditionSpecifications)
			nameGenerator = new VariableNameGenerator(localVariables.map[name])
		}

		def newLocalVariable(String prefix) {
			val name = nameGenerator.getNextName(prefix)
			builder.addLocalVariable(name)
		}

		def acceptConstraint(ConstraintSpecification<? extends Template> constraintSpecification) {
			builder.addConstraint(constraintSpecification)
		}

		private def build() {
			builder.build
		}
	}
}
