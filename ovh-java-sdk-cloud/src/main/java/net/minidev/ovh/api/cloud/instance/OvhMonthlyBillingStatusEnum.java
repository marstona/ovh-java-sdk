package net.minidev.ovh.api.cloud.instance;

/**
 * MonthlyBillingStatusEnum
 */
public enum OvhMonthlyBillingStatusEnum {
	activationPending("activationPending"),
	ok("ok");

	final String value;

	OvhMonthlyBillingStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
