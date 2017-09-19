package hu.bme.mit.inf.viewmodel.language.typing

import com.google.inject.Inject
import com.google.inject.Singleton
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Lookup
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.RuleDefinition
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Variable
import org.eclipse.viatra.query.patternlanguage.helper.CorePatternLanguageHelper
import org.eclipse.viatra.query.patternlanguage.patternLanguage.ListValue
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern
import org.eclipse.viatra.query.patternlanguage.patternLanguage.VariableValue
import org.eclipse.viatra.query.patternlanguage.typing.ITypeInferrer
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey
import org.eclipse.viatra.query.runtime.matchers.context.IInputKey
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.util.IResourceScopeCache

@Singleton
class VariableKindInferrer {
	public static val TEMPLATE_ANNOTATION_NAME = "Template"
	public static val LEFT_ANNOTATION_PARAMETER_NAME = "left"

	@Inject ITypeInferrer typeInferrer
	@Inject IResourceScopeCache leftVariableCache
	@Inject IResourceScopeCache leftPatternParameterCache

	def isPreconditionVariable(Variable variable) {
		val precondition = EcoreUtil2.getContainerOfType(variable, RuleDefinition)?.precondition
		if (precondition === null) {
			false
		} else {
			precondition.arguments.contains(variable)
		}
	}

	def boolean isLeftVariable(Variable variable) {
		leftVariableCache.get(variable, variable.eResource) [
			if (isPreconditionVariable(variable)) {
				return true
			}
			val ruleDefinition = EcoreUtil2.getContainerOfType(variable, RuleDefinition)
			if (ruleDefinition === null) {
				return false
			}
			for (lookup : ruleDefinition.lookups) {
				if (isLeftResultArgument(lookup, variable)) {
					return true
				}
			}
			false
		]
	}

	private def isLeftResultArgument(Lookup lookup, Variable variable) {
		val result = lookup.result
		if (result === null) {
			return false
		}
		val referencedTemplate = lookup.ruleDefinition?.result?.pattern
		if (referencedTemplate === null) {
			return false
		}
		val count = Math.min(result.resultArguments.size, referencedTemplate.parameters.size)
		for (var i = 0; i < count; i++) {
			// We do not need to check the lookups inside the referenced pattern recursively,
			// because in a valid rule all left variables in the result argument list
			// are also marked as left arguments of the template pattern.
			if (result.resultArguments.get(i) == variable &&
				isLeftPatternParameter(referencedTemplate.parameters.get(i))) {
				return true
			}
		}
		false
	}

	def isTemplatePattern(Pattern pattern) {
		CorePatternLanguageHelper.getFirstAnnotationByName(pattern, TEMPLATE_ANNOTATION_NAME) !== null
	}

	def boolean isLeftPatternParameter(org.eclipse.viatra.query.patternlanguage.patternLanguage.Variable parameter) {
		leftPatternParameterCache.get(parameter, parameter.eResource) [
			val inputKey = typeInferrer.getType(parameter)
			isPrimitiveType(inputKey) || isMarkedAsLeftPatternParameter(parameter)
		]
	}

	private def isMarkedAsLeftPatternParameter(
		org.eclipse.viatra.query.patternlanguage.patternLanguage.Variable parameter) {
		val pattern = EcoreUtil2.getContainerOfType(parameter, Pattern)
		if (pattern === null) {
			return false
		}
		val annotation = CorePatternLanguageHelper.getFirstAnnotationByName(pattern, TEMPLATE_ANNOTATION_NAME)
		if (annotation === null) {
			return false
		}
		val leftArguments = CorePatternLanguageHelper.getFirstAnnotationParameter(annotation,
			LEFT_ANNOTATION_PARAMETER_NAME)
		if (leftArguments instanceof ListValue) {
			for (value : leftArguments.values) {
				if (value instanceof VariableValue && (value as VariableValue).value.variable == parameter) {
					return true
				}
			}
		}
		false
	}
	
	protected def isPrimitiveType(IInputKey inputKey) {
		inputKey instanceof EDataTypeInSlotsKey || inputKey instanceof JavaTransitiveInstancesKey
	}
}
