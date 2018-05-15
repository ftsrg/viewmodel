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
package hu.bme.mit.inf.viewmodel.benchmarks.core.modification

import com.google.gson.annotations.SerializedName

enum ModelModification {
	@SerializedName("createSwitch")
	CREATE_SWITCH,
	
	@SerializedName("createSegment")
	CREATE_SEGMENT,
	
	@SerializedName("connectTrackElements")
	CONNECT_TRACK_ELEMENTS,
	
	@SerializedName("disconnectTrackElements")
	DISCONNECT_TRACK_ELEMENTS,
	
	@SerializedName("createRoute")
	CREATE_ROUTE,
	
	@SerializedName("removeRoute")
	REMOVE_ROUTE,
	
	@SerializedName("addSwitchToRoute")
	ADD_SWITCH_TO_ROUTE,
	
	@SerializedName("removeSwitchFromRoute")
	REMOVE_SWITCH_FROM_ROUTE,
	
	@SerializedName("setSwitchFailed")
	SET_SWITCH_FAILED,
	
	@SerializedName("setSwitchOperational")
	SET_SWITCH_OPERATIONAL
}
