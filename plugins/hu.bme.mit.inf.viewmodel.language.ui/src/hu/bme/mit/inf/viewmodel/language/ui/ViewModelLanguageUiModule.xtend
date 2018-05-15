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
package hu.bme.mit.inf.viewmodel.language.ui

import com.google.inject.Binder
import com.google.inject.multibindings.Multibinder
import hu.bme.mit.inf.viewmodel.language.ui.builder.ViewModelLanguageBuilderParticipant
import org.eclipse.viatra.query.patternlanguage.emf.scoping.IMetamodelProviderInstance
import org.eclipse.viatra.query.patternlanguage.emf.ui.util.JavaProjectClassLoaderProvider
import org.eclipse.viatra.query.patternlanguage.emf.util.IClassLoaderProvider
import org.eclipse.viatra.query.tooling.core.generator.genmodel.GenModelMetamodelProviderService
import org.eclipse.viatra.query.tooling.core.generator.genmodel.IVQGenmodelProvider
import org.eclipse.viatra.query.tooling.core.targetplatform.ITargetPlatformMetamodelLoader
import org.eclipse.viatra.query.tooling.core.targetplatform.TargetPlatformMetamodelProviderService
import org.eclipse.viatra.query.tooling.core.targetplatform.TargetPlatformMetamodelsIndex
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class ViewModelLanguageUiModule extends AbstractViewModelLanguageUiModule {

	override bindIXtextBuilderParticipant() {
		ViewModelLanguageBuilderParticipant
	}

	def configureIMetamodelProviderInstance(Binder binder) {
		val metamodelProviderBinder = Multibinder.newSetBinder(binder, IMetamodelProviderInstance)
		metamodelProviderBinder.addBinding.to(GenModelMetamodelProviderService)
		metamodelProviderBinder.addBinding.to(TargetPlatformMetamodelProviderService)
	}

	def Class<? extends IVQGenmodelProvider> bindIEVQGenmodelProvider() {
		GenModelMetamodelProviderService
	}

	def Class<? extends ITargetPlatformMetamodelLoader> bindTargetPlatformMetamodelLoader() {
		TargetPlatformMetamodelsIndex
	}

	def Class<? extends IClassLoaderProvider> bindIClassLoaderProvider() {
		JavaProjectClassLoaderProvider
	}
}
