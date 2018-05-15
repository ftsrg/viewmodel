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
package hu.bme.mit.inf.viewmodel.language.jvmmodel

import com.google.inject.Inject
import org.eclipse.viatra.query.patternlanguage.emf.util.IErrorFeedback
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.xbase.jvmmodel.JvmModelAssociator

class ViewModelLanguageJvmModelAssociator extends JvmModelAssociator {
	
	@Inject IErrorFeedback feedback
	
	override installDerivedState(DerivedStateAwareResource resource, boolean preIndexingPhase) {
		feedback.clearMarkers(resource, IErrorFeedback.JVMINFERENCE_ERROR_TYPE)
		super.installDerivedState(resource, preIndexingPhase)
	}
}