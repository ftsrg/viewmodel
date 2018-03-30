package hu.bme.mit.inf.viewmodel.language.typing

import com.google.common.base.Predicate
import com.google.inject.Inject
import com.google.inject.Provider
import com.google.inject.Singleton
import com.google.inject.name.Named
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Lookup
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.PatternReference
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.RuleDefinition
import java.util.ArrayDeque
import java.util.HashSet
import java.util.List
import java.util.Set
import org.eclipse.viatra.query.patternlanguage.helper.CorePatternLanguageHelper
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Constraint
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Expression
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Variable
import org.eclipse.viatra.query.patternlanguage.typing.AbstractTypeInferrer
import org.eclipse.viatra.query.patternlanguage.typing.ITypeInferrer
import org.eclipse.viatra.query.patternlanguage.typing.PatternLanguageTypeRules
import org.eclipse.viatra.query.patternlanguage.typing.TypeInformation
import org.eclipse.viatra.query.patternlanguage.typing.judgements.ParameterTypeJudgement
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.util.IResourceScopeCache

@Singleton
class ViewModelTypeInferrer extends AbstractTypeInferrer {

	public static val TYPE_INFERRER_DELEGATE = "hu.bme.mit.inf.viewmodel.language.typing.ViewModelTypeInferrer.TYPE_INFERRER_DELEGATE"
	static val Predicate<Pattern> UNTYPED_PATTERN_PREDICATE = [
		it !== null && parameters.exists[type === null]
	]

	@Inject Provider<ViewModelTypeInformation> typeInformationProvider
	@Inject PatternLanguageTypeRules typeRules
	@Inject IResourceScopeCache cache
	@Inject @Named(TYPE_INFERRER_DELEGATE) ITypeInferrer typeInferrerDelegate

	override getDeclaredType(Expression ex) {
		typeInferrerDelegate.getDeclaredType(ex) ?: super.getDeclaredType(ex)
	}

	override getAllPossibleTypes(Expression ex) {
		val ruleDefinition = EcoreUtil2.getContainerOfType(ex, RuleDefinition)
		if (ruleDefinition === null) {
			typeInferrerDelegate.getAllPossibleTypes(ex)
		} else {
			val typeInformation = getOrCollectConstraints(ruleDefinition)
			// No CorePatternLanguageHelper.isParameter trickery is needed,
			// rule definitions do not have parameters with inferred types.
			typeInformation.getAllTypes(ex)
		}
	}

	override getInferredType(Expression ex) {
		val ruleDefinition = EcoreUtil2.getContainerOfType(ex, RuleDefinition)
		if (ruleDefinition === null) {
			typeInferrerDelegate.getInferredType(ex)
		} else {
			val typeInformation = getOrCollectConstraints(ruleDefinition)
			typeInformation.getType(ex)
		}
	}

	protected def getOrCollectConstraints(RuleDefinition ruleDefinition) {
		val typeInformation = cache.get(this, ruleDefinition.eResource, typeInformationProvider)
		val rulesToCheck = getReferencedRulesTransitive(ruleDefinition)
		val patternsToCheck = getReferencedPatternsTransitive(rulesToCheck)
		for (pattern : patternsToCheck) {
			collectConstraints(typeInformation, pattern)
		}
		for (rule : rulesToCheck) {
			collectConstraints(typeInformation, rule)
		}
		typeInformation
	}

	protected def collectConstraints(ViewModelTypeInformation typeInformation, RuleDefinition ruleDefinition) {
		if (typeInformation.isProcessed(ruleDefinition)) {
			return
		}
		inferTypes(typeInformation, ruleDefinition.precondition)
		inferTypes(typeInformation, ruleDefinition.result)
		for (lookupDefinition : ruleDefinition.lookups) {
			inferTypes(typeInformation, lookupDefinition)
		}
		typeInformation.setProcessed(ruleDefinition)
	}

	protected def inferTypes(TypeInformation typeInformation, PatternReference patternReference) {
		if (patternReference !== null && patternReference.pattern !== null) {
			addZippedJudgements(typeInformation, patternReference.arguments, patternReference.pattern.parameters)
		}
	}

	protected def inferTypes(TypeInformation typeInformation, Lookup lookupDefinition) {
		val referencedRuleDefinition = lookupDefinition.ruleDefinition
		if (referencedRuleDefinition === null) {
			return
		}
		val precondition = referencedRuleDefinition.precondition
		if (precondition !== null) {
			addZippedJudgements(typeInformation, lookupDefinition.preconditionArguments, precondition.arguments)
			// Also add constraints for the pattern so that we have type information from the lookup
			// even if type inference for the referenced rule's arguments fails.
			addZippedJudgements(typeInformation, lookupDefinition.preconditionArguments,
				precondition.pattern?.parameters)
		}
		val referencedResult = referencedRuleDefinition.result
		val lookupResult = lookupDefinition.result
		if (referencedResult !== null && lookupResult !== null) {
			addZippedJudgements(typeInformation, lookupResult.resultArguments, referencedResult.arguments)
			addZippedJudgements(typeInformation, lookupResult.resultArguments, referencedResult.pattern?.parameters)
		}
	}

	protected def addZippedJudgements(TypeInformation typeInformation, List<? extends Expression> expressions,
		List<? extends Variable> variables) {
		if (expressions === null || variables === null) {
			return
		}
		val count = Math.min(expressions.size, variables.size)
		for (var int i = 0; i < count; i++) {
			val expression = expressions.get(i)
			val variable = variables.get(i)
			val judgement = new ParameterTypeJudgement(expression, variable)
			typeInformation.provideType(judgement)
		}
	}

	protected def collectConstraints(TypeInformation typeInformation, Pattern pattern) {
		if (typeInformation.isProcessed(pattern)) {
			return
		}
		// HACK PatternLanguage should really offer an API for this.
		// Copied form org.eclipse.viatra.query.patternlanguage.emf.types.EMFTypeInferrer#collectConstraints(Pattern pattern)
		typeRules.inferTypes(pattern, typeInformation)
		for (patternBody : pattern.bodies) {
			val treeIterator = patternBody.eAllContents
			while (treeIterator.hasNext) {
				val obj = treeIterator.next
				if (obj instanceof Constraint || obj instanceof Expression) {
					typeRules.inferTypes(obj, typeInformation)
				}
			}
		}
		typeInformation.setProcessed(pattern)
	}

	protected def getReferencedRulesTransitive(RuleDefinition ruleDefinition) {
		val referencedRules = new HashSet
		val queue = new ArrayDeque
		referencedRules.add(ruleDefinition)
		queue.add(ruleDefinition)
		while (!queue.empty) {
			val current = queue.remove
			for (lookup : current.lookups) {
				val referencedRule = lookup.ruleDefinition
				if (referencedRule !== null && !referencedRules.contains(referencedRule)) {
					referencedRules.add(referencedRule)
					queue.add(referencedRule)
				}
			}
		}
		referencedRules
	}

	protected def getReferencedPatternsTransitive(Pattern pattern) {
		CorePatternLanguageHelper.getReferencedPatternsTransitive(pattern, false, UNTYPED_PATTERN_PREDICATE)
	}

	protected def getReferencedPatternsTransitive(Iterable<RuleDefinition> ruleDefinitions) {
		// TODO Order the patterns topologically for better type inference performance.
		val referencedPatterns = new HashSet
		for (rule : ruleDefinitions) {
			addReferencedPatternsTransitive(referencedPatterns, rule)
		}
		referencedPatterns
	}

	protected def addReferencedPatternsTransitive(Set<Pattern> referencedPatterns, RuleDefinition ruleDefinition) {
		addReferencedPatternsTransitive(referencedPatterns, ruleDefinition.precondition?.pattern)
		addReferencedPatternsTransitive(referencedPatterns, ruleDefinition.result?.pattern)
	}

	protected def addReferencedPatternsTransitive(Set<Pattern> referencedPatterns, Pattern pattern) {
		if (UNTYPED_PATTERN_PREDICATE.apply(pattern) && !referencedPatterns.contains(pattern)) {
			referencedPatterns.add(pattern)
			referencedPatterns.addAll(getReferencedPatternsTransitive(pattern))
		}
	}
}
