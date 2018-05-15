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
package hu.bme.mit.inf.viewmodel.language.validation

import com.google.common.collect.HashMultiset
import com.google.inject.Inject
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Lookup
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.PatternReference
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.RuleDefinition
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewDefinitionModel
import hu.bme.mit.inf.viewmodel.language.typing.ReferencedEPackagesInferrer
import hu.bme.mit.inf.viewmodel.language.typing.VariableKindInferrer
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.Optional
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.InternalEObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.viatra.query.patternlanguage.emf.types.EMFTypeSystem
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Variable
import org.eclipse.viatra.query.patternlanguage.typing.ITypeInferrer
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey
import org.eclipse.xtext.validation.Check

import static hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguagePackage.Literals.*

import static extension hu.bme.mit.inf.viewmodel.language.ViewModelLanguageUtils.nullOrProxy

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class ViewModelLanguageValidator extends AbstractViewModelLanguageValidator {

	static val PREFIX = "hu.bme.mit.inf.viewmodel.language.validation.ViewModelLanguageValidator."
	public static val DUPLICATE_RULE = PREFIX + "DUPLICATE_RULE"
	public static val PRIVATE_PATTERN_CALLED = PREFIX + "PRIVATE_PATTERN_CALLED"
	public static val BAD_ARGUMENT_COUNT = PREFIX + "BAD_ARGUMENT_COUNT"
	public static val DUPLICATE_RULE_PRECONDITION_ARGUMENT = PREFIX + "DUPLICATE_RULE_PRECONDITION_ARGUMENT"
	public static val INVALID_RESULT_PATTERN = PREFIX + "INVALID_RESULT_PATTERN"
	public static val LEFT_ARGUMENT_NOT_MARKED_ON_TEMPLATE = PREFIX + "LEFT_ARGUMENT_NOT_MARKED_ON_TEMPLATE"
	public static val LOOKUP_WITH_EXTRANENOUS_RESULT = PREFIX + "LOOKUP_WITH_EXTRANENOUS_RESULT"
	public static val INVALID_LOOKUP_PRECONDITION_ARGUMENT = PREFIX + "INVALID_LOOKUP_PRECONDITION_ARGUMENT"
	public static val LOOKUP_IGNORED = PREFIX + "LOOKUP_IGNORED"
	public static val TYPE_ERROR = PREFIX + "TYPE_ERROR"

	@Inject ITypeInferrer typeInferrer
	@Inject EMFTypeSystem typeSystem
	@Inject VariableKindInferrer kindInferrer
	@Inject ReferencedEPackagesInferrer referencedEPackagesInferrer

	@Check
	def checkDuplicateRules(ViewDefinitionModel viewDefinitionModel) {
		val patternsIterable = viewDefinitionModel.ruleDefinitions.map[precondition?.pattern].filter[!nullOrProxy]
		val patternsMultiset = HashMultiset.create(patternsIterable)
		for (ruleDefinition : viewDefinitionModel.ruleDefinitions) {
			val pattern = ruleDefinition.precondition?.pattern
			if (!pattern.nullOrProxy && patternsMultiset.count(pattern) > 1) {
				error(
					"Duplicate rule definition for pattern " + pattern.name + ".",
					ruleDefinition.precondition,
					PATTERN_REFERENCE__PATTERN,
					DUPLICATE_RULE
				)
			}
		}
	}

	@Check
	def checkPrivatePatternCall(PatternReference patternReference) {
		val modifiers = patternReference.pattern?.modifiers
		if (!modifiers.nullOrProxy && modifiers.private) {
			error(
				"Cannot access private pattern " + patternReference.pattern.name + ".",
				patternReference,
				PATTERN_REFERENCE__PATTERN,
				PRIVATE_PATTERN_CALLED
			)
		}
	}

	@Check
	def checkArgumentCount(PatternReference patternReference) {
		val pattern = patternReference.pattern
		if (pattern.nullOrProxy) {
			return
		}
		val providedArgumentCount = patternReference.arguments.size
		val requiredArgumentCount = pattern.parameters.size
		if (providedArgumentCount != requiredArgumentCount) {
			error(
				"Pattern " + pattern.name + " expects " + requiredArgumentCount + " arguments, but got " +
					providedArgumentCount + " arguments instead.",
				patternReference,
				PATTERN_REFERENCE__PATTERN,
				BAD_ARGUMENT_COUNT
			)
		}
	}

	@Check
	def checkNoDuplicatePreconditionArguments(RuleDefinition ruleDefinition) {
		val precondition = ruleDefinition.precondition
		if (precondition.nullOrProxy) {
			return
		}
		val preconditionArgumentMultiset = HashMultiset.create(precondition.arguments)
		for (pair : precondition.arguments.indexed) {
			if (preconditionArgumentMultiset.count(pair.value) > 1) {
				error(
					"The rule precondition may only refer to each variable once.",
					precondition,
					PATTERN_REFERENCE__ARGUMENTS,
					pair.key,
					DUPLICATE_RULE_PRECONDITION_ARGUMENT
				)
			}
		}
	}

	@Check
	def checkRuleResult(RuleDefinition ruleDefinition) {
		val result = ruleDefinition.result
		val template = result?.pattern
		if (template.nullOrProxy) {
			return
		}
		if (!kindInferrer.isTemplatePattern(template)) {
			error(
				template.name + " is not a template. Use the @Template pattern annotation to mark template patterns.",
				result,
				PATTERN_REFERENCE__PATTERN,
				DUPLICATE_RULE_PRECONDITION_ARGUMENT
			)
			return
		}
		val count = Math.min(result.arguments.size, template.parameters.size)
		for (var int i = 0; i < count; i++) {
			val argument = result.arguments.get(i)
			val parameter = template.parameters.get(i)
			if (kindInferrer.isLeftVariable(argument) && !kindInferrer.isLeftPatternParameter(parameter)) {
				val message = getArgumentKindErrorMessage(template, parameter)
				error(message, result, PATTERN_REFERENCE__ARGUMENTS, i, LEFT_ARGUMENT_NOT_MARKED_ON_TEMPLATE)
			}
		}
	}

	private def getArgumentKindErrorMessage(Pattern template, Variable parameter) {
		val messageBuilder = new StringBuilder
		messageBuilder.append("Parameter ").append(parameter.name).append(
			" is not marked as a left parameter of the template ").append(template.name).append(". ")
		messageBuilder.append("Use the @Template(left={").append(parameter.name).append(
			"}) pattern annotation to pass precondition match arguments to templates.")
		messageBuilder.toString
	}

	@Check
	def checkLookupPreconditionArgumentCount(Lookup lookup) {
		val referencedPattern = lookup.ruleDefinition?.precondition?.pattern
		if (referencedPattern.nullOrProxy) {
			return
		}
		val providedArgumentCount = lookup.preconditionArguments.size
		val requiredArgumentCount = referencedPattern.parameters.size
		if (providedArgumentCount != requiredArgumentCount) {
			error(
				"Rule " + referencedPattern.name + " expects " + requiredArgumentCount +
					" precondition arguments, but got " + providedArgumentCount + " arguments instead.",
				lookup,
				LOOKUP__RULE_DEFINITION,
				BAD_ARGUMENT_COUNT
			)
		}
	}

	@Check
	def checkNoNewLookupPreconditionArguments(Lookup lookup) {
		for (pair : lookup.preconditionArguments.indexed) {
			if (!kindInferrer.isPreconditionVariable(pair.value)) {
				val targetRuleName = lookup?.ruleDefinition.precondition?.pattern?.name ?: "(null)"
				error(
					"Lookups may not introduce new variables to the left side of the transformation. Move the variable into a the " +
						targetRuleName + " rule instead.",
					lookup,
					LOOKUP__PRECONDITION_ARGUMENTS,
					pair.key,
					INVALID_LOOKUP_PRECONDITION_ARGUMENT
				)
			}
		}
	}

	@Check
	def checkLookupWithoutResult(Lookup lookup) {
		val referencedRule = lookup.ruleDefinition
		if (referencedRule.nullOrProxy || referencedRule.result !== null) {
			return
		}
		if (lookup.result !== null) {
			error(
				"Cannot provide result arguments for a rule lookup without an associated template.",
				lookup,
				LOOKUP__RESULT,
				LOOKUP_WITH_EXTRANENOUS_RESULT
			)
		}
	}

	@Check
	def checkLookupResultArguments(Lookup lookup) {
		val referencedTemplateParameters = lookup.ruleDefinition?.result?.pattern?.parameters
		val resultArguments = lookup.result?.resultArguments
		if (referencedTemplateParameters === null || resultArguments === null) {
			return
		}
		val providedArgumentCount = resultArguments.size
		val requiredArgumentCount = referencedTemplateParameters.size
		if (providedArgumentCount != requiredArgumentCount) {
			val referencedPatternName = lookup.ruleDefinition.precondition?.pattern?.name ?: "(null)"
			error(
				"Rule " + referencedPatternName + " expects " + requiredArgumentCount +
					" template arguments, but got " + providedArgumentCount + " arguments instead.",
				lookup,
				LOOKUP__RESULT,
				BAD_ARGUMENT_COUNT
			)
		}
		val count = Math.min(providedArgumentCount, requiredArgumentCount)
		for (var int i = 0; i < count; i++) {
			val argument = resultArguments.get(i)
			val parameter = referencedTemplateParameters.get(i)
			if (kindInferrer.isLeftVariable(argument) && !kindInferrer.isLeftPatternParameter(parameter)) {
				val message = getArgumentKindErrorMessage(lookup.ruleDefinition.result.pattern, parameter)
				error(message, lookup.result, LOOKUP_RESULT__RESULT_ARGUMENTS, i, LEFT_ARGUMENT_NOT_MARKED_ON_TEMPLATE)
			}
		}
	}

	@Check
	def checkNonAtomicLookupResult(Lookup lookup) {
		if (!lookup.atomic && lookup.result === null) {
			warning("Lookups without a result argument list or the atomic keyword are ignored.", lookup,
				LOOKUP__RULE_DEFINITION, LOOKUP_IGNORED)
		}
	}

	@Check
	def checkInferredVariableTypes(RuleDefinition ruleDefinition) {
		// Trigger lazy linking and the creation of all variables.
		EcoreUtil.resolveAll(ruleDefinition)
		val errorMessages = new HashMap
		for (variable : ruleDefinition.variables) {
			getVariableTypeErrorMessage(variable).ifPresent [ errorMessage |
				errorMessages.put(variable, errorMessage)
			]
		}
		applyArgumentListErrorMessages(errorMessages, ruleDefinition.precondition, PATTERN_REFERENCE__ARGUMENTS)
		applyArgumentListErrorMessages(errorMessages, ruleDefinition.result, PATTERN_REFERENCE__ARGUMENTS)
		for (lookup : ruleDefinition.lookups) {
			applyArgumentListErrorMessages(errorMessages, lookup, LOOKUP__PRECONDITION_ARGUMENTS)
			applyArgumentListErrorMessages(errorMessages, lookup.result, LOOKUP_RESULT__RESULT_ARGUMENTS)
		}
	}

	protected def getVariableTypeErrorMessage(Variable variable) {
		if (variable.nullOrProxy) {
			return Optional.empty
		}
		val allPossibleTypes = typeInferrer.getAllPossibleTypes(variable)
		val possibleClassifiers = allPossibleTypes.map [ inputKey |
			switch (inputKey) {
				EClassTransitiveInstancesKey: inputKey.emfKey
				EDataTypeInSlotsKey: inputKey.emfKey
				default: null
			}
		].filterNull.toSet
		// TODO If the type has a single EClassifier but also incompatible Java types,
		// this generates no error, which is consistent with the EMFPatternLanguageJavaValidator.
		// However, this is incorrect and should be reported upstream to the VIATRA team.
		if (possibleClassifiers.size <= 1) {
			return Optional.empty
		}
		val classifierNames = possibleClassifiers.map[name].toSet
		val classifierPackages = possibleClassifiers.map[EPackage?.name].filterNull.toSet
		if (possibleClassifiers.size > 1 && classifierNames.size == 1 && classifierPackages.size <= 1) {
			val message = '''
				Variable «variable.name» has type «classifierNames.iterator.next», which has multiple definitions:
					«FOR classifier : possibleClassifiers»
						«IF classifier.eIsProxy»
							«(classifier as InternalEObject).eProxyURI»
						«ELSE»
							«classifier.eResource.URI»
						«ENDIF»
					«ENDFOR»
			'''
			return Optional.of(message)
		}
		val ePackages = referencedEPackagesInferrer.getReferencedEPackages(variable)
		if (!typeSystem.hasCommonSubtype(allPossibleTypes, ePackages)) {
			val typeNamesSet = allPossibleTypes.map[typeSystem.typeString(it)].toSet
			val message = '''The types of the variable «variable.name» have no common subtype: «FOR typeName : typeNamesSet SEPARATOR ", "»«typeName»«ENDFOR»'''
			return Optional.of(message)
		}
		Optional.empty
	}

	private def applyArgumentListErrorMessages(Map<?, String> errorMessages, EObject obj, EReference reference) {
		if (obj.nullOrProxy) {
			return
		}
		val parameters = obj.eGet(reference)
		if (parameters instanceof List<?>) {
			for (pair : parameters.indexed) {
				val errorMessage = errorMessages.get(pair.value)
				if (errorMessage !== null) {
					error(errorMessage, obj, reference, pair.key, TYPE_ERROR)
				}
			}
		} else {
			throw new IllegalArgumentException("The " + reference.name + " of " + obj + " must be a list.")
		}
	}
}
