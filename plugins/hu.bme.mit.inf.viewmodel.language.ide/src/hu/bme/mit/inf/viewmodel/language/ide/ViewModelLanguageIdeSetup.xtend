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
package hu.bme.mit.inf.viewmodel.language.ide

import com.google.inject.Guice
import hu.bme.mit.inf.viewmodel.language.ViewModelLanguageRuntimeModule
import hu.bme.mit.inf.viewmodel.language.ViewModelLanguageStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class ViewModelLanguageIdeSetup extends ViewModelLanguageStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new ViewModelLanguageRuntimeModule, new ViewModelLanguageIdeModule))
	}
	
}
