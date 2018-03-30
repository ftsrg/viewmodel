package hu.bme.mit.inf.viewmodel.language.naming

import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewDefinitionModel
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider

class ViewModelQualifiedNameProvider extends XbaseQualifiedNameProvider {

	protected def qualifiedName(ViewDefinitionModel viewDefinition) {
		val fileName = viewDefinition?.eResource?.URI?.lastSegment
		if (fileName.nullOrEmpty) {
			return null
		}
		val packageName = EcoreUtil2.getContainerOfType(viewDefinition, ViewDefinitionModel)?.getPackageName
		if (packageName.nullOrEmpty) {
			return null
		}
		val dotIndex = fileName.lastIndexOf(".")
		val name = if (dotIndex < 0) {
				fileName
			} else if (dotIndex == 0) {
				fileName.substring(1)
			} else {
				fileName.substring(0, dotIndex)
			}
		converter.toQualifiedName(packageName).append(name)
	}

}
