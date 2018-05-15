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
package hu.bme.mit.inf.viewmodel.benchmarks.core.configuration;

import com.google.gson.annotations.SerializedName;

public enum TransformationCase {
	@SerializedName("petriNet")
	PETRI_NET("petriNet"),

	@SerializedName("virtualSwitch")
	VIRTUAL_SWITCH("virtualSwitch"),
	
	@SerializedName("dependability")
	DEPENDABILITY("dependability");

	private final String name;
	
	private TransformationCase(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}