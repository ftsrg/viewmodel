package hu.bme.mit.inf.viewmodel.language.typing

import com.google.common.collect.ImmutableSet
import com.google.inject.Inject
import com.google.inject.Singleton
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewDefinitionModel
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.PatternModel
import org.eclipse.viatra.query.patternlanguage.emf.helper.EMFPatternLanguageHelper
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.util.IResourceScopeCache

@Singleton
class ReferencedEPackagesInferrer {
	@Inject IResourceScopeCache cache
	
	def Iterable<EPackage> getReferencedEPackages(EObject context) {
		if (context === null) {
			return emptySet
		}
		val patternModel = EcoreUtil2.getContainerOfType(context, PatternModel)
		if (patternModel !== null) {
			return cache.get(patternModel, patternModel.eResource) [
				ImmutableSet.copyOf(EMFPatternLanguageHelper.getEPackageImportsIterable(patternModel))
			]
		}
		val viewDefinitionModel = EcoreUtil2.getContainerOfType(context, ViewDefinitionModel)
		if (viewDefinitionModel !== null) {
			return cache.get(viewDefinitionModel, viewDefinitionModel.eResource) [
				doGetReferencedEPackages(viewDefinitionModel)
			]
		}
		emptySet
	}
	
	protected def doGetReferencedEPackages(ViewDefinitionModel viewDefinitionModel) {
		val referencedEPackages = ImmutableSet.builder
		for (rule : viewDefinitionModel.ruleDefinitions) {
			referencedEPackages.addAll(getReferencedEPackages(rule.precondition?.pattern))
			referencedEPackages.addAll(getReferencedEPackages(rule.result?.pattern))
		}
		referencedEPackages.build
	}
}