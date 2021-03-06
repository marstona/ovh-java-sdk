package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import net.minidev.ovh.api.dedicated.installationtemplate.OvhHardwareRaid;
import net.minidev.ovh.api.dedicated.installationtemplate.OvhTemplatePartitioningSchemes;
import net.minidev.ovh.api.dedicated.installationtemplate.OvhTemplatePartitions;
import net.minidev.ovh.api.dedicated.installationtemplate.OvhTemplates;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/dedicated/installationTemplate
 * version:1.0
 */
public class ApiOvhDedicatedinstallationTemplate extends ApiOvhBase {
	public ApiOvhDedicatedinstallationTemplate(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/installationTemplate/{templateName}
	 * @param templateName [required] This template name
	 */
	public OvhTemplates templateName_GET(String templateName) throws IOException {
		String qPath = "/dedicated/installationTemplate/{templateName}";
		StringBuilder sb = path(qPath, templateName);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTemplates.class);
	}

	/**
	 * Partitions defined in this partitioning scheme
	 *
	 * REST: GET /dedicated/installationTemplate/{templateName}/partitionScheme/{schemeName}/partition
	 * @param templateName [required] This template name
	 * @param schemeName [required] name of this partitioning scheme
	 */
	public ArrayList<String> templateName_partitionScheme_schemeName_partition_GET(String templateName, String schemeName) throws IOException {
		String qPath = "/dedicated/installationTemplate/{templateName}/partitionScheme/{schemeName}/partition";
		StringBuilder sb = path(qPath, templateName, schemeName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/installationTemplate/{templateName}/partitionScheme/{schemeName}/partition/{mountpoint}
	 * @param templateName [required] This template name
	 * @param schemeName [required] name of this partitioning scheme
	 * @param mountpoint [required] partition mount point
	 */
	public OvhTemplatePartitions templateName_partitionScheme_schemeName_partition_mountpoint_GET(String templateName, String schemeName, String mountpoint) throws IOException {
		String qPath = "/dedicated/installationTemplate/{templateName}/partitionScheme/{schemeName}/partition/{mountpoint}";
		StringBuilder sb = path(qPath, templateName, schemeName, mountpoint);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTemplatePartitions.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/installationTemplate/{templateName}/partitionScheme/{schemeName}
	 * @param templateName [required] This template name
	 * @param schemeName [required] name of this partitioning scheme
	 */
	public OvhTemplatePartitioningSchemes templateName_partitionScheme_schemeName_GET(String templateName, String schemeName) throws IOException {
		String qPath = "/dedicated/installationTemplate/{templateName}/partitionScheme/{schemeName}";
		StringBuilder sb = path(qPath, templateName, schemeName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTemplatePartitioningSchemes.class);
	}

	/**
	 * Hardware RAIDs defined in this partitioning scheme
	 *
	 * REST: GET /dedicated/installationTemplate/{templateName}/partitionScheme/{schemeName}/hardwareRaid
	 * @param templateName [required] This template name
	 * @param schemeName [required] name of this partitioning scheme
	 */
	public ArrayList<String> templateName_partitionScheme_schemeName_hardwareRaid_GET(String templateName, String schemeName) throws IOException {
		String qPath = "/dedicated/installationTemplate/{templateName}/partitionScheme/{schemeName}/hardwareRaid";
		StringBuilder sb = path(qPath, templateName, schemeName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/installationTemplate/{templateName}/partitionScheme/{schemeName}/hardwareRaid/{name}
	 * @param templateName [required] This template name
	 * @param schemeName [required] name of this partitioning scheme
	 * @param name [required] Hardware RAID name
	 */
	public OvhHardwareRaid templateName_partitionScheme_schemeName_hardwareRaid_name_GET(String templateName, String schemeName, String name) throws IOException {
		String qPath = "/dedicated/installationTemplate/{templateName}/partitionScheme/{schemeName}/hardwareRaid/{name}";
		StringBuilder sb = path(qPath, templateName, schemeName, name);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhHardwareRaid.class);
	}

	/**
	 * Partitioning schemes available on this template
	 *
	 * REST: GET /dedicated/installationTemplate/{templateName}/partitionScheme
	 * @param templateName [required] This template name
	 */
	public ArrayList<String> templateName_partitionScheme_GET(String templateName) throws IOException {
		String qPath = "/dedicated/installationTemplate/{templateName}/partitionScheme";
		StringBuilder sb = path(qPath, templateName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * OVH operating system installation templates
	 *
	 * REST: GET /dedicated/installationTemplate
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/dedicated/installationTemplate";
		StringBuilder sb = path(qPath);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
}
