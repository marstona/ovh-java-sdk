package net.minidev.ovh.api.cloud.image;

/**
 * Image
 */
public class OvhImage {
	/**
	 * Image visibility
	 *
	 * canBeNull && readOnly
	 */
	public String visibility;

	/**
	 * Image size (in GiB)
	 *
	 * canBeNull && readOnly
	 */
	public Double size;

	/**
	 * Minimum RAM required to use image
	 *
	 * canBeNull && readOnly
	 */
	public Long minRam;

	/**
	 * Image name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Image id
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Image region
	 *
	 * canBeNull && readOnly
	 */
	public String region;

	/**
	 * Image creation date
	 *
	 * canBeNull && readOnly
	 */
	public String creationDate;

	/**
	 * Image type
	 *
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * Minimum disks required to use image
	 *
	 * canBeNull && readOnly
	 */
	public Long minDisk;

	/**
	 * User to connect with
	 *
	 * canBeNull && readOnly
	 */
	public String user;

	/**
	 * Image status
	 *
	 * canBeNull && readOnly
	 */
	public String status;
}