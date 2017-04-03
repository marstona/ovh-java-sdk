package net.minidev.ovh.api.order.cart;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Representation of a product pricing
 */
public class OvhGenericProductPricing {
	/**
	 * Price of the product in micro-centims
	 *
	 * canBeNull && readOnly
	 */
	public Long priceInUcents;

	/**
	 * Duration for ordering the product
	 *
	 * canBeNull && readOnly
	 */
	public String duration;

	/**
	 * Pricing model identifier
	 *
	 * canBeNull && readOnly
	 */
	public String pricingMode;

	/**
	 * Minimum repeat for renewal
	 *
	 * canBeNull && readOnly
	 */
	public Long minimumRepeat;

	/**
	 * Price of the product
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice price;

	/**
	 * Description of the pricing
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Capacities of the pricing (type of pricing)
	 *
	 * canBeNull && readOnly
	 */
	public OvhGenericProductPricingCapacitiesEnum[] capacities;

	/**
	 * Interval of renewal
	 *
	 * canBeNull && readOnly
	 */
	public Long interval;

	/**
	 * Maximum repeat for renewal
	 *
	 * canBeNull && readOnly
	 */
	public Long maximumRepeat;

	/**
	 * Minimum quantity that can be ordered
	 *
	 * canBeNull && readOnly
	 */
	public Long minimumQuantity;

	/**
	 * Pricing type
	 *
	 * canBeNull && readOnly
	 */
	public OvhGenericProductPricingTypeEnum pricingType;

	/**
	 * Maximum quantity that can be ordered
	 *
	 * canBeNull && readOnly
	 */
	public Long maximumQuantity;
}