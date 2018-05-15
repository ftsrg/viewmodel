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
package hu.bme.mit.inf.viewmodel.runtime.specification

import org.eclipse.xtend.lib.annotations.Data

abstract class VariableReference {
	package new() {
	}
}

@Data
final class LookupVariableReference extends VariableReference {
	val String lookupName
	val String variableName

	static def of(String lookupName, String variableName) {
		new LookupVariableReference(lookupName, variableName)
	}
}

@Data
final class LocalVariableReference extends VariableReference {
	val String variableName

	static def of(String variableName) {
		new LocalVariableReference(variableName)
	}
}
