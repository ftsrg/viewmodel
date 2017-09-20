package hu.bme.mit.inf.viewmodel.language.specification

import com.google.inject.Provider
import com.google.inject.Singleton
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewDefinitionModel
import javax.inject.Inject
import org.eclipse.xtext.util.IResourceScopeCache

@Singleton
class ViewModelSpecificationCompiler {
	@Inject Provider<ViewModelSpecificationInitializer> initializerProvider
	@Inject IResourceScopeCache cache

	def getSpecification(ViewDefinitionModel viewDefinition) {
		cache.get(viewDefinition, viewDefinition.eResource) [
			createSpecification(viewDefinition)
		]
	}
	
	protected def createSpecification(ViewDefinitionModel viewDefinition) {
		val initializer = initializerProvider.get
		initializer.createViewModelSpecification(viewDefinition)
		initializer.build
	}
}
