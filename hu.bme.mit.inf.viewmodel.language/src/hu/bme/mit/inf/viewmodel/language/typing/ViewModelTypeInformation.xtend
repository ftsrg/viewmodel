package hu.bme.mit.inf.viewmodel.language.typing

import com.google.inject.Inject
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.RuleDefinition
import java.util.HashSet
import org.eclipse.viatra.query.patternlanguage.typing.ITypeSystem
import org.eclipse.viatra.query.patternlanguage.typing.TypeInformation

class ViewModelTypeInformation extends TypeInformation {
	
	val processedRuleDefinitions = new HashSet<RuleDefinition>
	
	@Inject
	new(ITypeSystem typeSystem) {
		super(typeSystem)
	}
	
	def isProcessed(RuleDefinition pattern) {
		processedRuleDefinitions.contains(pattern)
	}
	
	def void setProcessed(RuleDefinition pattern) {
		processedRuleDefinitions.add(pattern)
	}
}