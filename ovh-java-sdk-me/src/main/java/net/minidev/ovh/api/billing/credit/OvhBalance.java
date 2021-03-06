package net.minidev.ovh.api.billing.credit;

import java.util.Date;
import net.minidev.ovh.api.billing.credit.balance.OvhBookedMovement;
import net.minidev.ovh.api.billing.credit.balance.OvhExpiringMovement;
import net.minidev.ovh.api.billing.credit.balance.OvhType;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Credit balance
 */
public class OvhBalance {
	/**
	 * Balance amount
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice amount;

	/**
	 * Movement expiring soon
	 *
	 * canBeNull && readOnly
	 */
	public OvhExpiringMovement[] expiring;

	/**
	 * Movement already booked on orders
	 *
	 * canBeNull && readOnly
	 */
	public OvhBookedMovement[] booked;

	/**
	 * Movement expiring soon
	 *
	 * canBeNull && readOnly
	 */
	public OvhExpiringMovement[] expiringSummary;

	/**
	 * Balance name
	 *
	 * canBeNull && readOnly
	 */
	public String balanceName;

	/**
	 * Balance last update
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * Balance type
	 *
	 * canBeNull && readOnly
	 */
	public OvhType type;

	/**
	 * Balance creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;
}
