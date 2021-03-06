package net.minidev.ovh.api.domain;

/**
 * Description not available
 */
public class OvhRule {
	/**
	 * canBeNull && readOnly
	 */
	public String[] allowedValues;

	/**
	 * canBeNull && readOnly
	 */
	public OvhRule[] innerConfigurations;

	/**
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * canBeNull && readOnly
	 */
	public String label;

	/**
	 * canBeNull && readOnly
	 */
	public String[] fields;

	/**
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * canBeNull && readOnly
	 */
	public Boolean required;
}
