package net.minidev.ovh.api.nichandle;

/**
 * Describe all rules for a given field
 */
public class OvhCreationRule {
	/**
	 * Name of the field
	 *
	 * canBeNull
	 */
	public String fieldName;

	/**
	 * Examples of values for the fields
	 *
	 * canBeNull
	 */
	public String[] examples;

	/**
	 * List of allowed values for the field
	 *
	 * canBeNull
	 */
	public String[] in;

	/**
	 * Regular expression to validate the field value
	 *
	 * canBeNull
	 */
	public String regularExpression;

	/**
	 * Prefix of the field value
	 *
	 * canBeNull
	 */
	public String prefix;

	/**
	 * Default value of the field
	 *
	 * canBeNull
	 */
	public String defaultValue;

	/**
	 * Whether the field is mandatory
	 *
	 * canBeNull
	 */
	public Boolean mandatory;
}
