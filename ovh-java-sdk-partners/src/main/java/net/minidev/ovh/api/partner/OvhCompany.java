package net.minidev.ovh.api.partner;

/**
 * Partner company
 */
public class OvhCompany {
	/**
	 * Company's country
	 *
	 * canBeNull && readOnly
	 */
	public String country;

	/**
	 * Company's domain of competence
	 *
	 * canBeNull && readOnly
	 */
	public OvhExpertisesChoices expertises;

	/**
	 * Company's zipCode
	 *
	 * canBeNull && readOnly
	 */
	public String zipCode;

	/**
	 * OVH's product the company's solutions relies on
	 *
	 * canBeNull && readOnly
	 */
	public OvhOVHProductsUsed OVHProductsUsed;

	/**
	 * Company's city
	 *
	 * canBeNull && readOnly
	 */
	public String city;

	/**
	 * Company's summary
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Company's linkedin profile url
	 *
	 * canBeNull && readOnly
	 */
	public String linkedin;

	/**
	 * Estimation of the number of employees
	 *
	 * canBeNull && readOnly
	 */
	public String employeesNumber;

	/**
	 * Certifications obtained from other enterprises
	 *
	 * canBeNull && readOnly
	 */
	public OvhExternalCertifications externalCertifications;

	/**
	 * Kind of client the company target
	 *
	 * canBeNull && readOnly
	 */
	public OvhClientKinds clientKinds;

	/**
	 * Company's twitter profile url
	 *
	 * canBeNull && readOnly
	 */
	public String twitter;

	/**
	 * Estimation of the revenue of the company
	 *
	 * canBeNull && readOnly
	 */
	public String revenue;

	/**
	 * Estimation of the number of accompanied customers in using OVH's solutions
	 *
	 * canBeNull && readOnly
	 */
	public String OVHCustomersAdvised;

	/**
	 * Company's logo
	 *
	 * canBeNull && readOnly
	 */
	public String logo;

	/**
	 * Company's email
	 *
	 * canBeNull && readOnly
	 */
	public String email;

	/**
	 * The commercial name of the company
	 *
	 * canBeNull && readOnly
	 */
	public String commercialName;

	/**
	 * In which country the company products of solutions are available
	 *
	 * canBeNull && readOnly
	 */
	public OvhProductCountries productCountries;

	/**
	 * Company's website
	 *
	 * canBeNull && readOnly
	 */
	public String website;

	/**
	 * Company's street address
	 *
	 * canBeNull && readOnly
	 */
	public String address;

	/**
	 * Company's facebook profile url
	 *
	 * canBeNull && readOnly
	 */
	public String facebook;

	/**
	 * OVH certification acquired
	 *
	 * canBeNull && readOnly
	 */
	public OvhOVHCertifications OVHCertifications;

	/**
	 * Estimation of the number of resources knowing OVH product the company has
	 *
	 * canBeNull && readOnly
	 */
	public String OVHKnowledgeResources;

	/**
	 * Company's phone number
	 *
	 * canBeNull && readOnly
	 */
	public String phone;

	/**
	 * Estimation of the number of expert resources for OVH solutions the company has
	 *
	 * canBeNull && readOnly
	 */
	public String OVHTechnicalExpertResources;

	/**
	 * Company's registration number
	 *
	 * canBeNull && readOnly
	 */
	public String registrationNumber;

	/**
	 * Company's sector of activity
	 *
	 * canBeNull && readOnly
	 */
	public OvhActivitySectors activitySectors;

	/**
	 * Estimation of the number of resources that have technical skills on OVH solutions the company has
	 *
	 * canBeNull && readOnly
	 */
	public String OVHTechnicalAdvancedResources;

	/**
	 * Name of the company
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * How did you heard about the OVH's partnership program
	 *
	 * canBeNull && readOnly
	 */
	public OvhPartnerKnowledges partnerKnowledges;

	/**
	 * Registration status
	 *
	 * canBeNull && readOnly
	 */
	public OvhCompanyStatusEnum status;
}
