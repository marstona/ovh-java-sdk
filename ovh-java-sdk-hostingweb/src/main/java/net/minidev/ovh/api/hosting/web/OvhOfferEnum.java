package net.minidev.ovh.api.hosting.web;

/**
 * Hosting's offer
 */
public enum OvhOfferEnum {
	KS("KS"),
	PERFORMANCE_1("PERFORMANCE_1"),
	PERFORMANCE_2("PERFORMANCE_2"),
	PERFORMANCE_3("PERFORMANCE_3"),
	PERFORMANCE_4("PERFORMANCE_4"),
	PERSO("PERSO"),
	PRO("PRO"),
	START("START");

	final String value;

	OvhOfferEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}