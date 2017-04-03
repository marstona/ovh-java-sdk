package net.minidev.ovh.api.cloud.billingview;

/**
 * HourlyStorage
 */
public class OvhHourlyStorage {
	/**
	 * Total price
	 *
	 * canBeNull && readOnly
	 */
	public Double totalPrice;

	/**
	 * Storage incoming bandwidth details
	 *
	 * canBeNull && readOnly
	 */
	public OvhBandwidthStorage incomingBandwidth;

	/**
	 * Information about stored data
	 *
	 * canBeNull && readOnly
	 */
	public OvhStoredStorage stored;

	/**
	 * Storage outgoing bandwidth details
	 *
	 * canBeNull && readOnly
	 */
	public OvhBandwidthStorage outgoingBandwidth;

	/**
	 * Region
	 *
	 * canBeNull && readOnly
	 */
	public String region;

	/**
	 * Storage type
	 *
	 * canBeNull && readOnly
	 */
	public OvhStorageTypeEnum type;
}