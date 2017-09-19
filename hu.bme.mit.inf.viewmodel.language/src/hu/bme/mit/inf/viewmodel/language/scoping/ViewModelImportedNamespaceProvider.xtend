package hu.bme.mit.inf.viewmodel.language.scoping

import com.google.inject.Singleton
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewDefinitionModel
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.ImportNormalizer
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider

@Singleton
class ViewModelImportedNamespaceProvider extends ImportedNamespaceAwareLocalScopeProvider {

	protected override getImportedNamespaceResolvers(EObject context, boolean ignoreCase) {
		// Use the imports from the import section in the whole model.
		val rootModel = EcoreUtil2.getContainerOfType(context, ViewDefinitionModel)
		val importSectionContext = rootModel?.importSection ?: context
		val resolvers = super.getImportedNamespaceResolvers(importSectionContext, ignoreCase)
		if (rootModel !== null) {
			// Elements of the current package should also be imported.
			val packageName = qualifiedNameConverter.toQualifiedName(rootModel.packageName)
			resolvers += new ImportNormalizer(packageName, true, ignoreCase)
		}
		resolvers
	}

	def createImportNormalizedScope(IScope elements, EObject context, EReference reference) {
		val ignoreCase = isIgnoreCase(reference)
		val type = reference.EReferenceType
		val namespaceResolvers = getImportedNamespaceResolvers(context, ignoreCase)
		createImportScope(elements, namespaceResolvers, null, type, ignoreCase)
	}
}
