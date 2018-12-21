package net.minidev.ovh.api.dedicatedcloud;

import net.minidev.ovh.api.dedicatedcloud.right.OvhNetworkRoleEnum;
import net.minidev.ovh.api.dedicatedcloud.right.OvhRightEnum;
import net.minidev.ovh.api.dedicatedcloud.right.OvhVmNetworkRoleEnum;

/**
 * Private Cloud User right
 */
public class OvhRight {
	/**
	 * Determine how this user can interact with the Private Cloud V(x)Lans
	 *
	 * canBeNull && readOnly
	 */
	public OvhNetworkRoleEnum networkRole;

	/**
	 * Determine how this user can interact with the Private Cloud VM Network
	 *
	 * canBeNull && readOnly
	 */
	public OvhVmNetworkRoleEnum vmNetworkRole;

	/**
	 * canBeNull && readOnly
	 */
	public Long rightId;

	/**
	 * canBeNull && readOnly
	 */
	public Long datacenterId;

	/**
	 * Determine if the user can add ressources in your Private Cloud
	 *
	 * canBeNull && readOnly
	 */
	public Boolean canAddRessource;

	/**
	 * Determine what kind of access the User will have in this Datacenter of your Private Cloud
	 *
	 * canBeNull && readOnly
	 */
	public OvhRightEnum right;
}
