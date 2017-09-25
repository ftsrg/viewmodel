package hu.bme.mit.inf.viewmodel.language.specification

import com.google.common.collect.ImmutableList
import com.google.common.collect.ImmutableMap
import com.google.common.collect.LinkedHashMultiset
import com.google.inject.Inject
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Lookup
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.RuleDefinition
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Variable
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewDefinitionModel
import hu.bme.mit.inf.viewmodel.runtime.specification.AssignmentConstraintSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.ConstraintRuleSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.EquivalenceConstraintSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.LookupPreconditionSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.LookupVariableReference
import hu.bme.mit.inf.viewmodel.runtime.specification.MatchPreconditionSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.TemplateConstraintSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.VariableInstantiationRuleSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.ViewSpecification
import hu.bme.mit.inf.viewmodel.runtime.utils.VariableNameGenerator
import java.util.LinkedHashSet
import java.util.Map
import java.util.Set
import org.eclipse.viatra.query.patternlanguage.helper.CorePatternLanguageHelper
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern
import org.eclipse.xtext.naming.IQualifiedNameProvider

import static extension hu.bme.mit.inf.viewmodel.language.ViewModelLanguageUtils.nullOrProxy

class ViewModelSpecificationInitializer {
	static val RULE_LOOKUP_NAME = "<rule>"
	static val OTHER_LOOKUP_NAME = "<lookup>"

	@Inject IQualifiedNameProvider qualifiedNameProvider

	protected extension val ViewSpecification.Builder<Pattern, Pattern> builder = ViewSpecification.builder
	var Map<Variable, String> uniqueVariableNames

	def void createViewModelSpecification(ViewDefinitionModel viewDefinitionModel) {
		name = qualifiedNameProvider.getFullyQualifiedName(viewDefinitionModel)?.toString ?: ""
		uniqueVariableNames = disambiguateVariableNames(viewDefinitionModel)
		for (ruleDefinition : viewDefinitionModel.ruleDefinitions) {
			addRuleSpecifications(ruleDefinition)
		}
	}

	def build() {
		builder.build
	}

	protected def void addRuleSpecifications(RuleDefinition ruleDefinition) {
		val preconditionPattern = ruleDefinition.precondition?.pattern
		if (preconditionPattern.nullOrProxy) {
			return
		}
		val rightVariables = collectRightVariables(ruleDefinition)
		addVariableInstantiationRule [
			setPreconditionPattern(ruleDefinition.precondition.pattern)
			for (variable : rightVariables) {
				addVariable(variable.uniqueName)
			}
		]
		val validLookups = ruleDefinition.lookups.filter [ lookup |
			!lookup.ruleDefinition?.precondition?.pattern.nullOrProxy
		]
		val atomicLookups = validLookups.filter[atomic]
		val rulePrecondtionArgumentNames = ruleDefinition.precondition.arguments.map[uniqueName]
		val ruleLookupPreconditionSpecification = LookupPreconditionSpecification.of(RULE_LOOKUP_NAME,
			preconditionPattern, rulePrecondtionArgumentNames)
		val template = ruleDefinition.result?.pattern
		val ruleName = CorePatternLanguageHelper.getFullyQualifiedName(preconditionPattern)
		if (ruleName === null) {
			throw new IllegalStateException("Pattern " + preconditionPattern + " must have a qualified name.")
		}
		val mainConstraintRule = ConstraintRuleSpecification.create [
			name = ruleName + "<rule>"
			addParameters(rulePrecondtionArgumentNames)
			addPrecondition(ruleLookupPreconditionSpecification)
			for (preconditionArgument : ruleDefinition.precondition.arguments) {
				if (rightVariables.contains(preconditionArgument)) {
					val variableName = preconditionArgument.uniqueName
					val variableReference = LookupVariableReference.of(RULE_LOOKUP_NAME, variableName)
					addConstraint(AssignmentConstraintSpecification.of(variableReference, variableName))
				}
			}
			if (!template.nullOrProxy) {
				val templateArguments = ruleDefinition.result.arguments.map [ argument |
					LookupVariableReference.of(RULE_LOOKUP_NAME, argument.uniqueName)
				]
				addConstraint(TemplateConstraintSpecification.of(template, templateArguments))
			}
			var int atomicLookupWithRightSideIndex = 0
			for (atomicLookup : atomicLookups) {
				if (isLookupWithRightSide(atomicLookup)) {
					val lookupName = "<atomic" + atomicLookupWithRightSideIndex + ">"
					atomicLookupWithRightSideIndex++
					addLookupEquivalenceConstraint(atomicLookup, lookupName, rightVariables)
				} else {
					addAtomicLookupPrecondition(atomicLookup)
				}
			}
		]
		if (!mainConstraintRule.constraintSpecifications.empty) {
			addRule(mainConstraintRule)
		}
		val lookupsWithRightSide = validLookups.filter[!atomic && lookupWithRightSide]
		for (pair : lookupsWithRightSide.indexed) {
			val index = pair.key
			val lookup = pair.value
			addConstraintRule [
				name = ruleName + "<lookup" + index + ">"
				addParameters(rulePrecondtionArgumentNames)
				addPrecondition(ruleLookupPreconditionSpecification)
				for (atomicLookup : atomicLookups) {
					addAtomicLookupPrecondition(atomicLookup)
				}
				addLookupEquivalenceConstraint(lookup, OTHER_LOOKUP_NAME, rightVariables)
			]
		}
		for (lookup : validLookups) {
			val referencedPattern = lookup.ruleDefinition.precondition.pattern
			val lookupArgumentNames = lookup.preconditionArguments.map[uniqueName]
			addDependencyRule [
				addParameters(rulePrecondtionArgumentNames)
				precondition = MatchPreconditionSpecification.of(preconditionPattern, rulePrecondtionArgumentNames)
				consequence = MatchPreconditionSpecification.of(referencedPattern, lookupArgumentNames)
			]
		}
	}

	private def isLookupWithRightSide(Lookup lookup) {
		!lookup.ruleDefinition?.result.nullOrProxy && !lookup.result.nullOrProxy
	}

	protected def void addAtomicLookupPrecondition(ConstraintRuleSpecification.Builder<Pattern, Pattern> it,
		Lookup lookup) {
		if (!lookup.atomic) {
			throw new IllegalArgumentException("Only atomic lookups should be added as match preconditions.")
		}
		val referencedPattern = lookup.ruleDefinition.precondition.pattern
		val argumentNames = lookup.preconditionArguments.map[uniqueName]
		addPrecondition(MatchPreconditionSpecification.of(referencedPattern, argumentNames))
	}

	protected def void addLookupEquivalenceConstraint(ConstraintRuleSpecification.Builder<Pattern, Pattern> it,
		Lookup lookup, String lookupName, Set<Variable> rightVariables) {
		val referencedPattern = lookup.ruleDefinition.precondition.pattern
		val preconditionArgumentNames = lookup.preconditionArguments.map[uniqueName]
		addPrecondition(LookupPreconditionSpecification.of(lookupName, referencedPattern, preconditionArgumentNames))
		val resultArguments = lookup.result.resultArguments
		val referencedTemplateArguments = lookup.ruleDefinition.result.arguments
		val count = Math.min(resultArguments.size, referencedTemplateArguments.size)
		for (var int i = 0; i < count; i++) {
			val resultArgument = resultArguments.get(i)
			if (rightVariables.contains(resultArgument)) {
				val resultArgumentReference = LookupVariableReference.of(RULE_LOOKUP_NAME, resultArgument.uniqueName)
				val referencedTemplateArgument = referencedTemplateArguments.get(i)
				val referencedTemplateArgumentReference = LookupVariableReference.of(lookupName,
					referencedTemplateArgument.uniqueName)
				addConstraint(EquivalenceConstraintSpecification.of(resultArgumentReference,
					referencedTemplateArgumentReference))
			}
		}
	}

	private def disambiguateVariableNames(ViewDefinitionModel viewDefinitionModel) {
		val builder = ImmutableMap.builder
		for (ruleDefinition : viewDefinitionModel.ruleDefinitions) {
			val variables = collectAllVariables(ruleDefinition)
			// Variable names only need to be unique within a pattern.
			val nameGenerator = new VariableNameGenerator
			for (variable : variables) {
				val name = nameGenerator.getNextName(variable.name)
				builder.put(variable, name)
			}
		}
		builder.build
	}

	protected def getUniqueName(Variable variable) {
		uniqueVariableNames.get(variable)
	}

	/**
	 * Collects all variables in the order they appear in the view model rule body.
	 * 
	 * @param ruleDefinition The view model rule definition.
	 * @returns The collected variables in the order of appearance.
	 */
	private def collectAllVariables(RuleDefinition ruleDefinition) {
		val variables = new LinkedHashSet
		val precondition = ruleDefinition.precondition
		if (precondition !== null) {
			variables.addAll(precondition.arguments)
		}
		val result = ruleDefinition.result
		if (result !== null) {
			variables.addAll(result.arguments)
		}
		for (lookup : ruleDefinition.lookups) {
			variables.addAll(lookup.preconditionArguments)
			val lookupResult = lookup.result
			if (lookupResult !== null) {
				variables.addAll(lookupResult.resultArguments)
			}
		}
		ImmutableList.copyOf(variables)
	}

	/**
	 * Collects variables that should appear in the
	 * {@link VariableInstantiationRuleSpecification} of a view model rule.
	 * 
	 * These variables are those appearing in the main template argument list,
	 * as well as any non-singleton variables that are used as lookup template arguments.
	 * 
	 * @param ruleDefinition The view model rule definition.
	 * @returns The collected variables as set with iteration order fixed to the order of variable appearance.
	 */
	protected def collectRightVariables(RuleDefinition ruleDefinition) {
		val variables = new LinkedHashSet
		val result = ruleDefinition.result
		if (result !== null) {
			variables.addAll(result.arguments)
		}
		val lookupArguments = LinkedHashMultiset.create
		for (lookup : ruleDefinition.lookups) {
			val lookupResult = lookup.result
			if (lookupResult !== null) {
				lookupArguments.addAll(lookupResult.resultArguments)
			}
		}
		for (entry : lookupArguments.entrySet) {
			if (entry.count > 1) {
				variables.add(entry.element)
			}
		}
		variables
	}
}
