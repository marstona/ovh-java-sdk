package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.api.stack.mis.OvhProduct;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/stack/mis
 * version:1.0
 */
public class ApiOvhStackmis extends ApiOvhBase {
	public ApiOvhStackmis(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /stack/mis/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your MIS service
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/stack/mis/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /stack/mis/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your MIS service
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/stack/mis/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /stack/mis/{serviceName}
	 * @param serviceName [required] The internal name of your MIS service
	 */
	public OvhProduct serviceName_GET(String serviceName) throws IOException {
		String qPath = "/stack/mis/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhProduct.class);
	}

	/**
	 * List available services
	 *
	 * REST: GET /stack/mis
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/stack/mis";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};
}
