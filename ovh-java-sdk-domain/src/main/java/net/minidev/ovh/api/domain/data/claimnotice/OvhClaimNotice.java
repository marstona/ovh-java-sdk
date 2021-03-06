package net.minidev.ovh.api.domain.data.claimnotice;

/**
 * Definition of claim notices applying to a domain name
 */
public class OvhClaimNotice {
	/**
	 * Ending date of claim notice
	 *
	 * canBeNull && readOnly
	 */
	public String endingDate;

	/**
	 * Array of claim notice for the domain
	 *
	 * canBeNull && readOnly
	 */
	public OvhClaimNoticeDecision[] claims;

	/**
	 * Claim notice ID
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Label referring to claim notice
	 *
	 * canBeNull && readOnly
	 */
	public String label;

	/**
	 * Type of claim notice
	 *
	 * canBeNull && readOnly
	 */
	public OvhClaimNoticeTypeEnum type;

	/**
	 * Beginning date of claim notice
	 *
	 * canBeNull && readOnly
	 */
	public String startingDate;
}
