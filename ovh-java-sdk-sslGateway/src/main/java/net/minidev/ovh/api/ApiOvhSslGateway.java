package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.api.sslgateway.OvhDomain;
import net.minidev.ovh.api.sslgateway.OvhEligibilityStatus;
import net.minidev.ovh.api.sslgateway.OvhServer;
import net.minidev.ovh.api.sslgateway.OvhSslGateway;
import net.minidev.ovh.api.sslgateway.OvhTask;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/sslGateway
 * version:1.0
 */
public class ApiOvhSslGateway extends ApiOvhBase {
	public ApiOvhSslGateway(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /sslGateway/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your SSL Gateway
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/sslGateway/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /sslGateway/{serviceName}/serviceInfos
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your SSL Gateway
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/sslGateway/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Renew your SSL certificates
	 * 
	 * REST: POST /sslGateway/{serviceName}/renewCertificate
	 * @param serviceName [required] The internal name of your SSL Gateway
	 */
	public ArrayList<String> serviceName_renewCertificate_POST(String serviceName) throws IOException {
		String qPath = "/sslGateway/{serviceName}/renewCertificate";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Get this object properties
	 * 
	 * REST: GET /sslGateway/{serviceName}
	 * @param serviceName [required] The internal name of your SSL Gateway
	 */
	public OvhSslGateway serviceName_GET(String serviceName) throws IOException {
		String qPath = "/sslGateway/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhSslGateway.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /sslGateway/{serviceName}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your SSL Gateway
	 */
	public void serviceName_PUT(String serviceName, OvhSslGateway body) throws IOException {
		String qPath = "/sslGateway/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Confirm termination of your service
	 * 
	 * REST: POST /sslGateway/{serviceName}/confirmTermination
	 * @param reason Reason of your termination request
	 * @param commentary Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] The internal name of your SSL Gateway
	 */
	public String serviceName_confirmTermination_POST(String serviceName, OvhTerminationReasonEnum reason, String commentary, String token) throws IOException {
		String qPath = "/sslGateway/{serviceName}/confirmTermination";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "reason", reason);
		addBody(o, "commentary", commentary);
		addBody(o, "token", token);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, String.class);
	}

	/**
	 * Terminate your service
	 * 
	 * REST: POST /sslGateway/{serviceName}/terminate
	 * @param serviceName [required] The internal name of your SSL Gateway
	 */
	public String serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/sslGateway/{serviceName}/terminate";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Task for this SSL Gateway
	 * 
	 * REST: GET /sslGateway/{serviceName}/task
	 * @param serviceName [required] The internal name of your SSL Gateway
	 */
	public ArrayList<Long> serviceName_task_GET(String serviceName) throws IOException {
		String qPath = "/sslGateway/{serviceName}/task";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<Long>> t2 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 * 
	 * REST: GET /sslGateway/{serviceName}/task/{id}
	 * @param serviceName [required] The internal name of your SSL Gateway
	 * @param id [required] Id of the task
	 */
	public OvhTask serviceName_task_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/sslGateway/{serviceName}/task/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Ip subnet used by OVH to nat requests to your SSL Gateway backends.
	 * 
	 * REST: GET /sslGateway/{serviceName}/natIp
	 * @param serviceName [required] The internal name of your SSL Gateway
	 */
	public ArrayList<String> serviceName_natIp_GET(String serviceName) throws IOException {
		String qPath = "/sslGateway/{serviceName}/natIp";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Launch a contact change procedure
	 * 
	 * REST: POST /sslGateway/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The internal name of your SSL Gateway
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/sslGateway/{serviceName}/changeContact";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, t2);
	}

	/**
	 * Domains attached to your SSL Gateway
	 * 
	 * REST: GET /sslGateway/{serviceName}/domain
	 * @param serviceName [required] The internal name of your SSL Gateway
	 */
	public ArrayList<Long> serviceName_domain_GET(String serviceName) throws IOException {
		String qPath = "/sslGateway/{serviceName}/domain";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Attach a new domain to your SSL Gateway
	 * 
	 * REST: POST /sslGateway/{serviceName}/domain
	 * @param domain [required] Domain to attach
	 * @param serviceName [required] The internal name of your SSL Gateway
	 */
	public OvhDomain serviceName_domain_POST(String serviceName, String domain) throws IOException {
		String qPath = "/sslGateway/{serviceName}/domain";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "domain", domain);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhDomain.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /sslGateway/{serviceName}/domain/{id}
	 * @param serviceName [required] The internal name of your SSL Gateway
	 * @param id [required] Id of your domain
	 */
	public OvhDomain serviceName_domain_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/sslGateway/{serviceName}/domain/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDomain.class);
	}

	/**
	 * Detach a domain from your SSL Gateway
	 * 
	 * REST: DELETE /sslGateway/{serviceName}/domain/{id}
	 * @param serviceName [required] The internal name of your SSL Gateway
	 * @param id [required] Id of your domain
	 */
	public void serviceName_domain_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/sslGateway/{serviceName}/domain/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		exec("DELETE", qPath);
	}

	/**
	 * Servers attached to your SSL Gateway
	 * 
	 * REST: GET /sslGateway/{serviceName}/server
	 * @param serviceName [required] The internal name of your SSL Gateway
	 */
	public ArrayList<Long> serviceName_server_GET(String serviceName) throws IOException {
		String qPath = "/sslGateway/{serviceName}/server";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Add a new server to your SSL Gateway
	 * 
	 * REST: POST /sslGateway/{serviceName}/server
	 * @param address [required] IPv4 address of your server
	 * @param port [required] Port of your server
	 * @param serviceName [required] The internal name of your SSL Gateway
	 */
	public OvhServer serviceName_server_POST(String serviceName, String address, Long port) throws IOException {
		String qPath = "/sslGateway/{serviceName}/server";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "address", address);
		addBody(o, "port", port);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhServer.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /sslGateway/{serviceName}/server/{id}
	 * @param serviceName [required] The internal name of your SSL Gateway
	 * @param id [required] Id of your server
	 */
	public OvhServer serviceName_server_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/sslGateway/{serviceName}/server/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhServer.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /sslGateway/{serviceName}/server/{id}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your SSL Gateway
	 * @param id [required] Id of your server
	 */
	public void serviceName_server_id_PUT(String serviceName, Long id, OvhServer body) throws IOException {
		String qPath = "/sslGateway/{serviceName}/server/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		exec("PUT", qPath, body);
	}

	/**
	 * Remove a server
	 * 
	 * REST: DELETE /sslGateway/{serviceName}/server/{id}
	 * @param serviceName [required] The internal name of your SSL Gateway
	 * @param id [required] Id of your server
	 */
	public void serviceName_server_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/sslGateway/{serviceName}/server/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		exec("DELETE", qPath);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /sslGateway
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/sslGateway";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Check domain eligibility. Return list of eligible IP(s) for this domain.
	 * 
	 * REST: GET /sslGateway/eligibility
	 * @param domain [required] domain to check eligibility for SSL Gateway offer
	 */
	public OvhEligibilityStatus eligibility_GET(String domain) throws IOException {
		String qPath = "/sslGateway/eligibility";
		qPath = query(qPath, "domain", domain);
		String resp = execN("GET", qPath);
		return convertTo(resp, OvhEligibilityStatus.class);
	}
}