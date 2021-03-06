package net.minidev.ovh.api.telephony;

import java.util.Date;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Call delivery record
 */
public class OvhVoiceConsumption {
	/**
	 * Information about hangup cause
	 *
	 * canBeNull && readOnly
	 */
	public String hangupNature;

	/**
	 * canBeNull && readOnly
	 */
	public OvhVoiceConsumptionPlanTypeEnum planType;

	/**
	 * canBeNull && readOnly
	 */
	public String called;

	/**
	 * Country suffix destination
	 *
	 * canBeNull && readOnly
	 */
	public String countrySuffix;

	/**
	 * canBeNull && readOnly
	 */
	public Date creationDatetime;

	/**
	 * canBeNull && readOnly
	 */
	public Long duration;

	/**
	 * canBeNull && readOnly
	 */
	public OvhVoiceConsumptionWayTypeEnum wayType;

	/**
	 * canBeNull && readOnly
	 */
	public Long consumptionId;

	/**
	 * canBeNull && readOnly
	 */
	public String dialed;

	/**
	 * canBeNull && readOnly
	 */
	public String calling;

	/**
	 * canBeNull && readOnly
	 */
	public OvhPrice priceWithoutTax;

	/**
	 * canBeNull && readOnly
	 */
	public OvhVoiceConsumptionDestinationTypeEnum destinationType;

	/**
	 * Description of the destination
	 *
	 * canBeNull && readOnly
	 */
	public String designation;
}
