package net.minidev.ovh.api.price.dedicatedcloud._2013v1.rbx2a.host;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Enum of Monthlys
 */
public enum OvhMonthlyEnum {
	L("L"),
	@JsonProperty("L+")
	LPlus("L+"),
	@JsonProperty("L++")
	LPlusPlus("L++"),
	L2("L2"),
	@JsonProperty("L2+")
	L2Plus("L2+"),
	M("M"),
	S("S"),
	@JsonProperty("S++")
	SPlusPlus("S++"),
	XL("XL"),
	@JsonProperty("XL+")
	XLPlus("XL+");

	final String value;

	OvhMonthlyEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
