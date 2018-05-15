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
package hu.bme.mit.inf.viewmodel.runtime.utils

import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.viatra.query.runtime.base.comprehension.WellbehavingDerivedFeatureRegistry

final class BadlyBehavingFeatureUtils {
	private new() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}
	
	static def registerEcorePackageAsWellBehaving() {
		WellbehavingDerivedFeatureRegistry.registerWellbehavingDerivedPackage(EcorePackage.eINSTANCE)
	}
}
