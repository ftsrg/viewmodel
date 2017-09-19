package hu.bme.mit.inf.viewmodel.language.specification

import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.RuleDefinition
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewDefinitionModel
import hu.bme.mit.inf.viewmodel.runtime.specification.ViewSpecification
import javax.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName

class ViewModelSpecificationCompiler {
	@Inject IQualifiedNameProvider qualifiedNameProvider

	def getSpecification(ViewDefinitionModel viewDefinition) {
		ViewSpecification.create [
			name = qualifiedNameProvider.getFullyQualifiedName(viewDefinition)?.toString ?: ""
			for (ruleDefinition : viewDefinition.ruleDefinitions) {
				addRuleSpecifications(ruleDefinition)
			}
		]
	}

	def addRuleSpecifications(ViewSpecification.Builder<QualifiedName, QualifiedName> it,
		RuleDefinition ruleDefinition) {
		val precondition = ruleDefinition.precondition
		if (precondition === null) {
			return
		}
	}
}
