package net.minidev.ovh.api.cloud.ip;

/**
 * FailoverIp
 */
public class OvhFailoverIp {
	/**
	 * Instance where ip is routed to
	 *
	 * canBeNull && readOnly
	 */
	public String routedTo;

	/**
	 * Ip
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * Current operation progress in percent
	 *
	 * canBeNull && readOnly
	 */
	public Long progress;

	/**
	 * Ip location
	 *
	 * canBeNull && readOnly
	 */
	public String geoloc;

	/**
	 * IP sub type
	 *
	 * canBeNull && readOnly
	 */
	public OvhIpSubTypeEnum subType;

	/**
	 * IP block
	 *
	 * canBeNull && readOnly
	 */
	public String block;

	/**
	 * Ip id
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Ip continent
	 *
	 * canBeNull && readOnly
	 */
	public String continentCode;

	/**
	 * Ip status
	 *
	 * canBeNull && readOnly
	 */
	public OvhIpStatusEnum status;
}