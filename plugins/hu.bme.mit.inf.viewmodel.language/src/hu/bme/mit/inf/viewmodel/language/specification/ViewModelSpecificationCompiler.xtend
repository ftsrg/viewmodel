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
