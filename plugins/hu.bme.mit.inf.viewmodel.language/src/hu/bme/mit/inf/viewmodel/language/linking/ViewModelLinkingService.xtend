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
package hu.bme.mit.inf.viewmodel.language.linking

import com.google.inject.Inject
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.RuleDefinition
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguageFactory
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguagePackage
import java.util.Collections
import java.util.WeakHashMap
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.linking.impl.DefaultLinkingService
import org.eclipse.xtext.linking.impl.IllegalNodeException
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.nodemodel.INode

class ViewModelLinkingService extends DefaultLinkingService {

	@Inject IQualifiedNameConverter qualifiedNameConverter

	val cache = new WeakHashMap<INode, EObject>

	override getLinkedObjects(EObject context, EReference ref, INode node) throws IllegalNodeException {
		val requiredType = ref.EReferenceType
		if (requiredType === null) {
			return emptyList
		}
		if (!ViewModelLanguagePackage.Literals.VARIABLE.isSuperTypeOf(requiredType)) {
			return super.getLinkedObjects(context, ref, node)
		}
		val rule = EcoreUtil2.getContainerOfType(context, RuleDefinition)
		if (rule === null) {
			return super.getLinkedObjects(context, ref, node)
		}
		val crossRefString = getCrossRefNodeAsString(node)
		if (crossRefString.nullOrEmpty) {
			return emptyList
		}
		val scope = getScope(context, ref)
		val qualifiedLinkName = qualifiedNameConverter.toQualifiedName(crossRefString)
		val eObjectDescription = scope.getSingleElement(qualifiedLinkName)
		if (eObjectDescription === null) {
			// Avoid duplicate (singleton) variables when the model is partially re-parsed.
			val variable = cache.computeIfAbsent(node) [
				createVariable(rule, crossRefString)
			]
			Collections.singletonList(variable)
		} else {
			Collections.singletonList(eObjectDescription.EObjectOrProxy)
		}
	}

	protected def createVariable(RuleDefinition rule, String name) {
		val variable = ViewModelLanguageFactory.eINSTANCE.createVariable
		variable.name = name
		rule.variables += variable
		variable
	}
}
