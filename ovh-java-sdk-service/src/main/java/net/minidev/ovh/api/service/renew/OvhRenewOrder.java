package net.minidev.ovh.api.service.renew;

import java.util.Date;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Details about a renew Order
 */
public class OvhRenewOrder {
	/**
	 * Retraction date
	 *
	 * canBeNull && readOnly
	 */
	public Date retractionDate;

	/**
	 * Creation date of the renew Order
	 *
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * Public pdf URL of the generated renew Order
	 *
	 * canBeNull && readOnly
	 */
	public String pdfUrl;

	/**
	 * Password
	 *
	 * canBeNull && readOnly
	 */
	public String password;

	/**
	 * ID of the renew Order
	 *
	 * canBeNull && readOnly
	 */
	public Long orderId;

	/**
	 * Price of the product with tax
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice priceWithTax;

	/**
	 * Price of the product without tax
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice priceWithoutTax;

	/**
	 * Value of the tax
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice tax;

	/**
	 * Public URL to display generated renew Order
	 *
	 * canBeNull && readOnly
	 */
	public String url;

	/**
	 * Expiration date of the renew Order
	 *
	 * canBeNull && readOnly
	 */
	public Date expirationDate;
}
