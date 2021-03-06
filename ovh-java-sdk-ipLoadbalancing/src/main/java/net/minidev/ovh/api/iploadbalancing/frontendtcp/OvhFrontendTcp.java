package net.minidev.ovh.api.iploadbalancing.frontendtcp;

/**
 * Frontend TCP
 */
public class OvhFrontendTcp {
	/**
	 * Default ssl served to your customer
	 *
	 * canBeNull && readOnly
	 */
	public Long defaultSslId;

	/**
	 * Zone of you frontend
	 *
	 * canBeNull && readOnly
	 */
	public String zone;

	/**
	 * Listening port(s) on the server
	 *
	 * canBeNull && readOnly
	 */
	public String port;

	/**
	 * Human readable name for your frontend, this field is for you
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

	/**
	 * Restrict IP Load Balancing access to these ip block. No restriction if null
	 *
	 * canBeNull && readOnly
	 */
	public String[] allowedSource;

	/**
	 * Disable frontend. Default: 'false'
	 *
	 * canBeNull && readOnly
	 */
	public Boolean disabled;

	/**
	 * Id of your frontend
	 *
	 * canBeNull && readOnly
	 */
	public Long frontendId;

	/**
	 * Only attach frontend on these ip. No restriction if null
	 *
	 * canBeNull && readOnly
	 */
	public String[] dedicatedIpfo;

	/**
	 * SSL deciphering. Default: 'false'
	 *
	 * canBeNull && readOnly
	 */
	public Boolean ssl;

	/**
	 * Default TCP Farm of your frontend
	 *
	 * canBeNull && readOnly
	 */
	public Long defaultFarmId;
}
