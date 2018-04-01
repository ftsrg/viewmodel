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
