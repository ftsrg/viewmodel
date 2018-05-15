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
package hu.bme.mit.inf.viewmodel.runtime.specification.viatraquery;

public enum TemplateParserOptimizationLevel {
	NONE(false, false),
	FLATTEN(true, false),
	FLATTEN_IMPLIED(true, true);
	
	private final boolean flattenAndNormalize;
	private final boolean calculateImpliedTypes;
	
	private TemplateParserOptimizationLevel(boolean flattenAndNormalize, boolean calculateImpliedTypes) {
		this.flattenAndNormalize = flattenAndNormalize;
		this.calculateImpliedTypes = calculateImpliedTypes;
	}

	public boolean isFlattenAndNormalize() {
		return flattenAndNormalize;
	}

	public boolean isCalculateImpliedTypes() {
		return calculateImpliedTypes;
	}	
}
