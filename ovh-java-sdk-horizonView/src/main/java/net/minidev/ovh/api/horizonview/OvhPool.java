package net.minidev.ovh.api.horizonview;

/**
 * All informations about access point
 */
public class OvhPool {
	/**
	 * External url of your access point
	 *
	 * canBeNull && readOnly
	 */
	public String externalUrl;

	/**
	 * DHCP netmask in this port group
	 *
	 * canBeNull && readOnly
	 */
	public String dhcpNetmask;

	/**
	 * Port group id
	 *
	 * canBeNull && readOnly
	 */
	public String portGroupId;

	/**
	 * Pool id
	 *
	 * canBeNull && readOnly
	 */
	public Long accessPointId;

	/**
	 * Network state
	 *
	 * canBeNull && readOnly
	 */
	public OvhStateEnum state;

	/**
	 * DHCP network in this port group
	 *
	 * canBeNull && readOnly
	 */
	public String dhcpNetwork;
}