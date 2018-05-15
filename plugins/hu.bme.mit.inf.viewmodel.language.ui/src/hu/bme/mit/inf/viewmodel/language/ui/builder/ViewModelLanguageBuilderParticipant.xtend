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
package hu.bme.mit.inf.viewmodel.language.ui.builder

import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.viatra.query.patternlanguage.emf.util.IErrorFeedback
import org.eclipse.xtext.builder.BuilderParticipant
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2
import org.eclipse.xtext.generator.OutputConfiguration

class ViewModelLanguageBuilderParticipant extends BuilderParticipant {

	override protected cleanOutput(IBuildContext ctx, OutputConfiguration config,
		EclipseResourceFileSystemAccess2 access, IProgressMonitor monitor) throws CoreException {
		ctx.builtProject.deleteMarkers(IErrorFeedback.FRAGMENT_ERROR_TYPE, true, IResource.DEPTH_INFINITE)
		super.cleanOutput(ctx, config, access, monitor)
	}

}
