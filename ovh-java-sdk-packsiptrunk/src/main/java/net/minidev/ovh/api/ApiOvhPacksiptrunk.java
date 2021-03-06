package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.pack.siptrunk.OvhPackSipTrunk;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/pack/siptrunk
 * version:1.0
 */
public class ApiOvhPacksiptrunk extends ApiOvhBase {
	public ApiOvhPacksiptrunk(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /pack/siptrunk/{packName}/changeContact
	 * @param contactAdmin [required] The contact to set as admin contact
	 * @param contactTech [required] The contact to set as tech contact
	 * @param contactBilling [required] The contact to set as billing contact
	 * @param packName [required] The internal name of your pack
	 */
	public ArrayList<Long> packName_changeContact_POST(String packName, String contactAdmin, String contactBilling, String contactTech) throws IOException {
		String qPath = "/pack/siptrunk/{packName}/changeContact";
		StringBuilder sb = path(qPath, packName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactBilling", contactBilling);
		addBody(o, "contactTech", contactTech);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<Long>> t1 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /pack/siptrunk/{packName}
	 * @param packName [required] The internal name of your pack
	 */
	public OvhPackSipTrunk packName_GET(String packName) throws IOException {
		String qPath = "/pack/siptrunk/{packName}";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPackSipTrunk.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /pack/siptrunk/{packName}/serviceInfos
	 * @param packName [required] The internal name of your pack
	 */
	public OvhService packName_serviceInfos_GET(String packName) throws IOException {
		String qPath = "/pack/siptrunk/{packName}/serviceInfos";
		StringBuilder sb = path(qPath, packName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /pack/siptrunk/{packName}/serviceInfos
	 * @param body [required] New object properties
	 * @param packName [required] The internal name of your pack
	 */
	public void packName_serviceInfos_PUT(String packName, OvhService body) throws IOException {
		String qPath = "/pack/siptrunk/{packName}/serviceInfos";
		StringBuilder sb = path(qPath, packName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * List available services
	 *
	 * REST: GET /pack/siptrunk
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/pack/siptrunk";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<String>> t2 = new TypeReference<ArrayList<String>>() {};
}
