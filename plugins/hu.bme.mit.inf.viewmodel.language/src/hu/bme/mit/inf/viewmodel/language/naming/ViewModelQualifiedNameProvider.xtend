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
