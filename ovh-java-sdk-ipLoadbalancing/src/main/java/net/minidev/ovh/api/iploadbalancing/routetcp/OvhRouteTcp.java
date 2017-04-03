package net.minidev.ovh.api.iploadbalancing.routetcp;

import net.minidev.ovh.api.iploadbalancing.OvhRouteRule;
import net.minidev.ovh.api.iploadbalancing.OvhRouteStatusEnum;
import net.minidev.ovh.api.iploadbalancing.OvhRouteTcpAction;

/**
 * TCP Route
 */
public class OvhRouteTcp {
	/**
	 * Id of your route
	 *
	 * canBeNull && readOnly
	 */
	public Long routeId;

	/**
	 * Human readable name for your route, this field is for you
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Route priority ([1..256]). 1 if null. Highest priority routes are evaluated first. Only the first matching route will trigger an action
	 *
	 * canBeNull && readOnly
	 */
	public Long weight;

	/**
	 * Action triggered when all rules match
	 *
	 * canBeNull && readOnly
	 */
	public OvhRouteTcpAction action;

	/**
	 * List of rules to match to trigger action
	 *
	 * canBeNull && readOnly
	 */
	public OvhRouteRule[] rules;

	/**
	 * Route traffic for this frontend
	 *
	 * canBeNull && readOnly
	 */
	public Long frontendId;

	/**
	 * Route status. Routes in "ok" state are ready to operate
	 *
	 * canBeNull && readOnly
	 */
	public OvhRouteStatusEnum status;
}