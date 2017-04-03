package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import net.minidev.ovh.api.hpcspot.OvhAccount;
import net.minidev.ovh.api.hpcspot.OvhConsumption;
import net.minidev.ovh.api.hpcspot.OvhConsumptionTypeEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/hpcspot
 * version:1.0
 */
public class ApiOvhHpcspot extends ApiOvhBase {
	public ApiOvhHpcspot(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hpcspot/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your HPC Spot account
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/hpcspot/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /hpcspot/{serviceName}/serviceInfos
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your HPC Spot account
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/hpcspot/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hpcspot/{serviceName}
	 * @param serviceName [required] The internal name of your HPC Spot account
	 */
	public OvhAccount serviceName_GET(String serviceName) throws IOException {
		String qPath = "/hpcspot/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAccount.class);
	}

	/**
	 * Details of the consumption of your account
	 * 
	 * REST: GET /hpcspot/{serviceName}/consumption
	 * @param hpcspotItemId [required] Filter the value of hpcspotItemId property (=)
	 * @param hpcspotItemEndDate_to [required] Filter the value of hpcspotItemEndDate property (<=)
	 * @param orderId [required] Filter the value of orderId property (=)
	 * @param type [required] Filter the value of type property (=)
	 * @param hpcspotItemEndDate_from [required] Filter the value of hpcspotItemEndDate property (>=)
	 * @param serviceName [required] The internal name of your HPC Spot account
	 */
	public ArrayList<Long> serviceName_consumption_GET(String serviceName, Date hpcspotItemEndDate_from, Date hpcspotItemEndDate_to, Long hpcspotItemId, Long orderId, OvhConsumptionTypeEnum type) throws IOException {
		String qPath = "/hpcspot/{serviceName}/consumption";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "hpcspotItemEndDate.from", hpcspotItemEndDate_from);
		qPath = query(qPath, "hpcspotItemEndDate.to", hpcspotItemEndDate_to);
		qPath = query(qPath, "hpcspotItemId", hpcspotItemId);
		qPath = query(qPath, "orderId", orderId);
		qPath = query(qPath, "type", type);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<Long>> t1 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hpcspot/{serviceName}/consumption/{id}
	 * @param serviceName [required] The internal name of your HPC Spot account
	 * @param id [required] ID of the detail
	 */
	public OvhConsumption serviceName_consumption_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/hpcspot/{serviceName}/consumption/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhConsumption.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /hpcspot
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/hpcspot";
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<String>> t2 = new TypeReference<ArrayList<String>>() {};
}