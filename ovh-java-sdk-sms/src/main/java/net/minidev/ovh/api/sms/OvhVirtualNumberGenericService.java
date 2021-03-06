package net.minidev.ovh.api.sms;

/**
 * Virtual numbers
 */
public class OvhVirtualNumberGenericService {
	/**
	 * The virtual number
	 *
	 * canBeNull && readOnly
	 */
	public String number;

	/**
	 * The ISO formated country code of the number
	 *
	 * canBeNull && readOnly
	 */
	public OvhVirtualNumberIsoCountryCodeEnum countryCode;
}
