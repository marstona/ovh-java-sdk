package net.minidev.ovh.api.nichandle.contactchange;

import java.util.Date;
import net.minidev.ovh.api.nichandle.changecontact.OvhContactTypeEnum;
import net.minidev.ovh.api.nichandle.changecontact.OvhTaskStateEnum;

/**
 * Task running a contact change on a service
 */
public class OvhTask {
	/**
	 * Account who asked the contact change
	 *
	 * canBeNull && readOnly
	 */
	public String askingAccount;

	/**
	 * Account to change contact to
	 *
	 * canBeNull && readOnly
	 */
	public String toAccount;

	/**
	 * Date at which the contact change has been finished
	 *
	 * canBeNull && readOnly
	 */
	public Date dateDone;

	/**
	 * Account to change contact from
	 *
	 * canBeNull && readOnly
	 */
	public String fromAccount;

	/**
	 * Current state of the request
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskStateEnum state;

	/**
	 * Contacts to be changed
	 *
	 * canBeNull && readOnly
	 */
	public OvhContactTypeEnum[] contactTypes;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Date at which the request has been made
	 *
	 * canBeNull && readOnly
	 */
	public Date dateRequest;

	/**
	 * The service on which the task runs
	 *
	 * canBeNull && readOnly
	 */
	public String serviceDomain;
}
