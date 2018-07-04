package net.minidev.ovh.api.price.vps._2018v2.ssd;

/**
 * Enum of Options
 */
public enum OvhOptionEnum {
	ip("ip");

	final String value;

	OvhOptionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
