package net.minidev.ovh.api.price.dedicatedcloud._2018v1.waw1c.infrastructure.host;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Enum of Monthlys
 */
public enum OvhMonthlyEnum {
	@JsonProperty("SDDC-128")
	SDDC_128("SDDC-128"),
	@JsonProperty("SDDC-256")
	SDDC_256("SDDC-256"),
	@JsonProperty("SDDC-512")
	SDDC_512("SDDC-512"),
	@JsonProperty("SDDC-64")
	SDDC_64("SDDC-64");

	final String value;

	OvhMonthlyEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}