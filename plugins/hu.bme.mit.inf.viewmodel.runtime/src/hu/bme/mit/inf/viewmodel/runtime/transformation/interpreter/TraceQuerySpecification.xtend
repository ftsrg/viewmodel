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
package hu.bme.mit.inf.viewmodel.runtime.transformation.interpreter

import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecificationWithGenericMatcher

class TraceQuerySpecification extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
	new(String traceName, List<String> argumentNames, EClass traceClass) {
		super(new TracePQuery(traceName, argumentNames, traceClass))
	}
	
	def getTraceName() {
		(internalQueryRepresentation as TracePQuery).traceName
	}
	
	def getArgumentNames() {
		(internalQueryRepresentation as TracePQuery).argumentNames
	}
	
	def getTraceClass() {
		(internalQueryRepresentation as TracePQuery).traceClass
	}
}