package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import net.minidev.ovh.api.cloud.OvhAcl;
import net.minidev.ovh.api.cloud.OvhAclTypeEnum;
import net.minidev.ovh.api.cloud.OvhAlerting;
import net.minidev.ovh.api.cloud.OvhAlertingAlert;
import net.minidev.ovh.api.cloud.OvhAlertingDelayEnum;
import net.minidev.ovh.api.cloud.OvhCredit;
import net.minidev.ovh.api.cloud.OvhPrice;
import net.minidev.ovh.api.cloud.OvhProject;
import net.minidev.ovh.api.cloud.authentication.OvhToken;
import net.minidev.ovh.api.cloud.flavor.OvhFlavor;
import net.minidev.ovh.api.cloud.forecast.OvhProjectForecast;
import net.minidev.ovh.api.cloud.image.OvhImage;
import net.minidev.ovh.api.cloud.image.OvhOSTypeEnum;
import net.minidev.ovh.api.cloud.instance.OvhInstance;
import net.minidev.ovh.api.cloud.instance.OvhInstanceDetail;
import net.minidev.ovh.api.cloud.instance.OvhInstanceMetrics;
import net.minidev.ovh.api.cloud.instance.OvhInstanceVnc;
import net.minidev.ovh.api.cloud.instance.OvhMetricsPeriod;
import net.minidev.ovh.api.cloud.instance.OvhMetricsType;
import net.minidev.ovh.api.cloud.instance.OvhNetworkBulkParams;
import net.minidev.ovh.api.cloud.instance.OvhNetworkParams;
import net.minidev.ovh.api.cloud.instance.OvhRebootTypeEnum;
import net.minidev.ovh.api.cloud.instance.OvhRescueAdminPassword;
import net.minidev.ovh.api.cloud.instancegroup.OvhInstanceGroup;
import net.minidev.ovh.api.cloud.instancegroup.OvhInstanceGroupTypeEnum;
import net.minidev.ovh.api.cloud.instanceinterface.OvhInterface;
import net.minidev.ovh.api.cloud.ip.OvhCloudIp;
import net.minidev.ovh.api.cloud.ip.OvhFailoverIp;
import net.minidev.ovh.api.cloud.network.OvhNetwork;
import net.minidev.ovh.api.cloud.network.OvhSubnet;
import net.minidev.ovh.api.cloud.pca.OvhFunctionTypeEnum;
import net.minidev.ovh.api.cloud.pca.OvhTaskStateEnum;
import net.minidev.ovh.api.cloud.pca.OvhTaskTypeEnum;
import net.minidev.ovh.api.cloud.project.OvhBill;
import net.minidev.ovh.api.cloud.project.OvhNewProject;
import net.minidev.ovh.api.cloud.project.OvhProjectUsage;
import net.minidev.ovh.api.cloud.quota.OvhQuotas;
import net.minidev.ovh.api.cloud.region.OvhRegionDetail;
import net.minidev.ovh.api.cloud.sshkey.OvhSshKey;
import net.minidev.ovh.api.cloud.sshkey.OvhSshKeyDetail;
import net.minidev.ovh.api.cloud.storage.OvhContainer;
import net.minidev.ovh.api.cloud.storage.OvhContainerAccess;
import net.minidev.ovh.api.cloud.storage.OvhContainerDetail;
import net.minidev.ovh.api.cloud.storage.OvhContainerObjectTempURL;
import net.minidev.ovh.api.cloud.usage.OvhUsageCurrent;
import net.minidev.ovh.api.cloud.usage.OvhUsageForecast;
import net.minidev.ovh.api.cloud.usage.OvhUsageHistory;
import net.minidev.ovh.api.cloud.usage.OvhUsageHistoryDetail;
import net.minidev.ovh.api.cloud.user.OvhOpenrc;
import net.minidev.ovh.api.cloud.user.OvhUser;
import net.minidev.ovh.api.cloud.user.OvhUserDetail;
import net.minidev.ovh.api.cloud.volume.OvhSnapshot;
import net.minidev.ovh.api.cloud.volume.OvhVolume;
import net.minidev.ovh.api.cloud.volume.OvhVolumeTypeEnum;
import net.minidev.ovh.api.pca.OvhAccount;
import net.minidev.ovh.api.pca.OvhBilling;
import net.minidev.ovh.api.pca.OvhFile;
import net.minidev.ovh.api.pca.OvhSession;
import net.minidev.ovh.api.pca.OvhTask;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.api.vrack.OvhVrack;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/cloud
 * version:1.0
 */
public class ApiOvhCloud extends ApiOvhBase {
	public ApiOvhCloud(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /cloud/{serviceName}/pca/{pcaServiceName}/serviceInfos
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 */
	public OvhService serviceName_pca_pcaServiceName_serviceInfos_GET(String serviceName, String pcaServiceName) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{pcaServiceName}", pcaServiceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /cloud/{serviceName}/pca/{pcaServiceName}/serviceInfos
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 */
	public void serviceName_pca_pcaServiceName_serviceInfos_PUT(String serviceName, String pcaServiceName, OvhService body) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{pcaServiceName}", pcaServiceName);
		exec("PUT", qPath, body);
	}

	/**
	 * View account current total sessions usage (bytes)
	 * 
	 * REST: GET /cloud/{serviceName}/pca/{pcaServiceName}/usage
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 */
	public Long serviceName_pca_pcaServiceName_usage_GET(String serviceName, String pcaServiceName) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/usage";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{pcaServiceName}", pcaServiceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, Long.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /cloud/{serviceName}/pca/{pcaServiceName}
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 */
	public OvhAccount serviceName_pca_pcaServiceName_GET(String serviceName, String pcaServiceName) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{pcaServiceName}", pcaServiceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAccount.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /cloud/{serviceName}/pca/{pcaServiceName}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 */
	public void serviceName_pca_pcaServiceName_PUT(String serviceName, String pcaServiceName, OvhAccount body) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{pcaServiceName}", pcaServiceName);
		exec("PUT", qPath, body);
	}

	/**
	 * cloud archives tasks for account
	 * 
	 * REST: GET /cloud/{serviceName}/pca/{pcaServiceName}/tasks
	 * @param todoDate_to [required] Filter the value of todoDate property (<=)
	 * @param function [required] Filter the value of function property (=)
	 * @param status [required] Filter the value of status property (=)
	 * @param todoDate_from [required] Filter the value of todoDate property (>=)
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 */
	public ArrayList<String> serviceName_pca_pcaServiceName_tasks_GET(String serviceName, String pcaServiceName, OvhFunctionTypeEnum function, OvhTaskStateEnum status, Date todoDate_from, Date todoDate_to) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/tasks";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{pcaServiceName}", pcaServiceName);
		qPath = query(qPath, "function", function);
		qPath = query(qPath, "status", status);
		qPath = query(qPath, "todoDate.from", todoDate_from);
		qPath = query(qPath, "todoDate.to", todoDate_to);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Create a cloud archives task
	 * 
	 * REST: POST /cloud/{serviceName}/pca/{pcaServiceName}/tasks
	 * @param sessionId [required] cloud archives session identifier
	 * @param taskFunction [required] cloud archives task type
	 * @param fileIds [required] cloud archives file identifiers
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 */
	public OvhTask serviceName_pca_pcaServiceName_tasks_POST(String serviceName, String pcaServiceName, String sessionId, OvhTaskTypeEnum taskFunction, String[] fileIds) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/tasks";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{pcaServiceName}", pcaServiceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "sessionId", sessionId);
		addBody(o, "taskFunction", taskFunction);
		addBody(o, "fileIds", fileIds);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /cloud/{serviceName}/pca/{pcaServiceName}/tasks/{taskId}
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 * @param taskId [required] Task ID
	 */
	public OvhTask serviceName_pca_pcaServiceName_tasks_taskId_GET(String serviceName, String pcaServiceName, String taskId) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/tasks/{taskId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{pcaServiceName}", pcaServiceName);
		qPath = qPath.replace("{taskId}", taskId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * cloud archives sessions for account
	 * 
	 * REST: GET /cloud/{serviceName}/pca/{pcaServiceName}/sessions
	 * @param name [required] Filter the value of name property (like)
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 */
	public ArrayList<String> serviceName_pca_pcaServiceName_sessions_GET(String serviceName, String pcaServiceName, String name) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/sessions";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{pcaServiceName}", pcaServiceName);
		qPath = query(qPath, "name", name);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /cloud/{serviceName}/pca/{pcaServiceName}/sessions/{sessionId}
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 * @param sessionId [required] Session ID
	 */
	public OvhSession serviceName_pca_pcaServiceName_sessions_sessionId_GET(String serviceName, String pcaServiceName, String sessionId) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/sessions/{sessionId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{pcaServiceName}", pcaServiceName);
		qPath = qPath.replace("{sessionId}", sessionId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhSession.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /cloud/{serviceName}/pca/{pcaServiceName}/sessions/{sessionId}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 * @param sessionId [required] Session ID
	 */
	public void serviceName_pca_pcaServiceName_sessions_sessionId_PUT(String serviceName, String pcaServiceName, String sessionId, OvhSession body) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/sessions/{sessionId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{pcaServiceName}", pcaServiceName);
		qPath = qPath.replace("{sessionId}", sessionId);
		exec("PUT", qPath, body);
	}

	/**
	 * Create a delete task for all files in session
	 * 
	 * REST: DELETE /cloud/{serviceName}/pca/{pcaServiceName}/sessions/{sessionId}
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 * @param sessionId [required] Session ID
	 */
	public OvhTask serviceName_pca_pcaServiceName_sessions_sessionId_DELETE(String serviceName, String pcaServiceName, String sessionId) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/sessions/{sessionId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{pcaServiceName}", pcaServiceName);
		qPath = qPath.replace("{sessionId}", sessionId);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * cloud archives files in session
	 * 
	 * REST: GET /cloud/{serviceName}/pca/{pcaServiceName}/sessions/{sessionId}/files
	 * @param name [required] Filter the value of name property (like)
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 * @param sessionId [required] Session ID
	 */
	public ArrayList<String> serviceName_pca_pcaServiceName_sessions_sessionId_files_GET(String serviceName, String pcaServiceName, String sessionId, String name) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/sessions/{sessionId}/files";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{pcaServiceName}", pcaServiceName);
		qPath = qPath.replace("{sessionId}", sessionId);
		qPath = query(qPath, "name", name);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /cloud/{serviceName}/pca/{pcaServiceName}/sessions/{sessionId}/files/{fileId}
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 * @param sessionId [required] Session ID
	 * @param fileId [required] File id
	 */
	public OvhFile serviceName_pca_pcaServiceName_sessions_sessionId_files_fileId_GET(String serviceName, String pcaServiceName, String sessionId, String fileId) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/sessions/{sessionId}/files/{fileId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{pcaServiceName}", pcaServiceName);
		qPath = qPath.replace("{sessionId}", sessionId);
		qPath = qPath.replace("{fileId}", fileId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhFile.class);
	}

	/**
	 * Create a restore task for session
	 * 
	 * REST: POST /cloud/{serviceName}/pca/{pcaServiceName}/sessions/{sessionId}/restore
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 * @param sessionId [required] Session ID
	 */
	public OvhTask serviceName_pca_pcaServiceName_sessions_sessionId_restore_POST(String serviceName, String pcaServiceName, String sessionId) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/sessions/{sessionId}/restore";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{pcaServiceName}", pcaServiceName);
		qPath = qPath.replace("{sessionId}", sessionId);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /cloud/{serviceName}/pca/{pcaServiceName}/billing/{billingId}
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 * @param billingId [required] Billing id
	 */
	public OvhBilling serviceName_pca_pcaServiceName_billing_billingId_GET(String serviceName, String pcaServiceName, Long billingId) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/billing/{billingId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{pcaServiceName}", pcaServiceName);
		qPath = qPath.replace("{billingId}", billingId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhBilling.class);
	}

	/**
	 * cloud Archives billing items
	 * 
	 * REST: GET /cloud/{serviceName}/pca/{pcaServiceName}/billing
	 * @param date_to [required] Filter the value of date property (<=)
	 * @param date_from [required] Filter the value of date property (>=)
	 * @param billed [required] Filter the value of billed property (=)
	 * @param serviceName [required] The internal name of your public cloud passport
	 * @param pcaServiceName [required] The internal name of your PCA offer
	 */
	public ArrayList<Long> serviceName_pca_pcaServiceName_billing_GET(String serviceName, String pcaServiceName, Boolean billed, Date date_from, Date date_to) throws IOException {
		String qPath = "/cloud/{serviceName}/pca/{pcaServiceName}/billing";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{pcaServiceName}", pcaServiceName);
		qPath = query(qPath, "billed", billed);
		qPath = query(qPath, "date.from", date_from);
		qPath = query(qPath, "date.to", date_to);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<Long>> t2 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * List available services
	 * 
	 * REST: GET /cloud/{serviceName}/pca
	 * @param serviceName [required] The internal name of your public cloud passport
	 */
	public ArrayList<String> serviceName_pca_GET(String serviceName) throws IOException {
		String qPath = "/cloud/{serviceName}/pca";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /cloud
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/cloud";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Start a new cloud project
	 * 
	 * REST: POST /cloud/createProject
	 * @param catalogVersion [required] Select the catalog you need. Set null for the latest catalog.
	 * @param voucher [required] Voucher code
	 * @param description [required] Project description
	 */
	public OvhNewProject createProject_POST(Long catalogVersion, String voucher, String description) throws IOException {
		String qPath = "/cloud/createProject";
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "catalogVersion", catalogVersion);
		addBody(o, "voucher", voucher);
		addBody(o, "description", description);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhNewProject.class);
	}

	/**
	 * Get project quotas
	 * 
	 * REST: GET /cloud/project/{serviceName}/quota
	 * @param serviceName [required] Project id
	 */
	public ArrayList<OvhQuotas> project_serviceName_quota_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/quota";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhQuotas>> t3 = new TypeReference<ArrayList<OvhQuotas>>() {};

	/**
	 * Get this object properties
	 * 
	 * REST: GET /cloud/project/{serviceName}/serviceInfos
	 * @param serviceName [required] The project id
	 */
	public OvhService project_serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /cloud/project/{serviceName}/serviceInfos
	 * @param null [required] New object properties
	 * @param serviceName [required] The project id
	 */
	public void project_serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/cloud/project/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /cloud/project/{serviceName}
	 * @param serviceName [required] The project id
	 */
	public OvhProject project_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhProject.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /cloud/project/{serviceName}
	 * @param null [required] New object properties
	 * @param serviceName [required] The project id
	 */
	public void project_serviceName_PUT(String serviceName, OvhProject body) throws IOException {
		String qPath = "/cloud/project/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Get public networks
	 * 
	 * REST: GET /cloud/project/{serviceName}/network/public
	 * @param serviceName [required] Service name
	 */
	public ArrayList<OvhNetwork> project_serviceName_network_public_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/network/public";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhNetwork>> t4 = new TypeReference<ArrayList<OvhNetwork>>() {};

	/**
	 * Get private networks
	 * 
	 * REST: GET /cloud/project/{serviceName}/network/private
	 * @param serviceName [required] Service name
	 */
	public ArrayList<OvhNetwork> project_serviceName_network_private_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/network/private";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}

	/**
	 * Create a new network
	 * 
	 * REST: POST /cloud/project/{serviceName}/network/private
	 * @param name [required] Network name
	 * @param regions [required] Region where to activate private network. No parameters means all region
	 * @param serviceName [required] Project name
	 * @param vlanId [required] Vland id, between 0 and 4000. 0 value means no vlan.
	 */
	public OvhNetwork project_serviceName_network_private_POST(String serviceName, String name, String[] regions, Long vlanId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/network/private";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		addBody(o, "regions", regions);
		addBody(o, "vlanId", vlanId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhNetwork.class);
	}

	/**
	 * Delete private network
	 * 
	 * REST: DELETE /cloud/project/{serviceName}/network/private/{networkId}
	 * @param networkId [required] Network id
	 * @param serviceName [required] Project name
	 */
	public void project_serviceName_network_private_networkId_DELETE(String serviceName, String networkId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/network/private/{networkId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{networkId}", networkId);
		exec("DELETE", qPath);
	}

	/**
	 * Get private network
	 * 
	 * REST: GET /cloud/project/{serviceName}/network/private/{networkId}
	 * @param networkId [required] Network id
	 * @param serviceName [required] Service name
	 */
	public OvhNetwork project_serviceName_network_private_networkId_GET(String serviceName, String networkId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/network/private/{networkId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{networkId}", networkId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhNetwork.class);
	}

	/**
	 * Rename private network
	 * 
	 * REST: PUT /cloud/project/{serviceName}/network/private/{networkId}
	 * @param name [required] name
	 * @param networkId [required] Network id
	 * @param serviceName [required] Service name
	 */
	public void project_serviceName_network_private_networkId_PUT(String serviceName, String networkId, String name) throws IOException {
		String qPath = "/cloud/project/{serviceName}/network/private/{networkId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{networkId}", networkId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		exec("PUT", qPath, o);
	}

	/**
	 * Activate private network in a new region
	 * 
	 * REST: POST /cloud/project/{serviceName}/network/private/{networkId}/region
	 * @param networkId [required] Network id
	 * @param region [required] Region to active on your network
	 * @param serviceName [required] Service name
	 */
	public OvhNetwork project_serviceName_network_private_networkId_region_POST(String serviceName, String networkId, String region) throws IOException {
		String qPath = "/cloud/project/{serviceName}/network/private/{networkId}/region";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{networkId}", networkId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "region", region);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhNetwork.class);
	}

	/**
	 * Get network subnets
	 * 
	 * REST: GET /cloud/project/{serviceName}/network/private/{networkId}/subnet
	 * @param networkId [required] Network id
	 * @param serviceName [required] Service name
	 */
	public ArrayList<OvhSubnet> project_serviceName_network_private_networkId_subnet_GET(String serviceName, String networkId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/network/private/{networkId}/subnet";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{networkId}", networkId);
		String resp = exec("GET", qPath);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<OvhSubnet>> t5 = new TypeReference<ArrayList<OvhSubnet>>() {};

	/**
	 * Create a new network subnet
	 * 
	 * REST: POST /cloud/project/{serviceName}/network/private/{networkId}/subnet
	 * @param dhcp [required] Enable DHCP
	 * @param end [required] Last IP for this region (eg: 192.168.1.24)
	 * @param network [required] Global network with cidr (eg: 192.168.1.0/24)
	 * @param networkId [required] Network id
	 * @param noGateway [required] Set to true if you don't want to set a default gateway IP
	 * @param region [required] Region where this subnet will be created
	 * @param serviceName [required] Project name
	 * @param start [required] First IP for this region (eg: 192.168.1.12)
	 */
	public OvhSubnet project_serviceName_network_private_networkId_subnet_POST(String serviceName, String networkId, Boolean dhcp, String end, String network, Boolean noGateway, String region, String start) throws IOException {
		String qPath = "/cloud/project/{serviceName}/network/private/{networkId}/subnet";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{networkId}", networkId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "dhcp", dhcp);
		addBody(o, "end", end);
		addBody(o, "network", network);
		addBody(o, "noGateway", noGateway);
		addBody(o, "region", region);
		addBody(o, "start", start);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhSubnet.class);
	}

	/**
	 * Delete a network subnet
	 * 
	 * REST: DELETE /cloud/project/{serviceName}/network/private/{networkId}/subnet/{subnetId}
	 * @param networkId [required] Network id
	 * @param serviceName [required] Project id
	 * @param subnetId [required] Subnet id
	 */
	public void project_serviceName_network_private_networkId_subnet_subnetId_DELETE(String serviceName, String networkId, String subnetId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/network/private/{networkId}/subnet/{subnetId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{networkId}", networkId);
		qPath = qPath.replace("{subnetId}", subnetId);
		exec("DELETE", qPath);
	}

	/**
	 * Get ips
	 * 
	 * REST: GET /cloud/project/{serviceName}/ip
	 * @param serviceName [required] Project id
	 */
	public ArrayList<OvhCloudIp> project_serviceName_ip_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/ip";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t6);
	}
	private static TypeReference<ArrayList<OvhCloudIp>> t6 = new TypeReference<ArrayList<OvhCloudIp>>() {};

	/**
	 * Get failover ips
	 * 
	 * REST: GET /cloud/project/{serviceName}/ip/failover
	 * @param serviceName [required] Project id
	 */
	public ArrayList<OvhFailoverIp> project_serviceName_ip_failover_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/ip/failover";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t7);
	}
	private static TypeReference<ArrayList<OvhFailoverIp>> t7 = new TypeReference<ArrayList<OvhFailoverIp>>() {};

	/**
	 * Get failover ip
	 * 
	 * REST: GET /cloud/project/{serviceName}/ip/failover/{id}
	 * @param id [required] Ip id
	 * @param serviceName [required] Project id
	 */
	public OvhFailoverIp project_serviceName_ip_failover_id_GET(String serviceName, String id) throws IOException {
		String qPath = "/cloud/project/{serviceName}/ip/failover/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhFailoverIp.class);
	}

	/**
	 * Attach failover ip to an instance
	 * 
	 * REST: POST /cloud/project/{serviceName}/ip/failover/{id}/attach
	 * @param id [required] Ip id
	 * @param instanceId [required] Attach failover ip to instance
	 * @param serviceName [required] Project id
	 */
	public OvhFailoverIp project_serviceName_ip_failover_id_attach_POST(String serviceName, String id, String instanceId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/ip/failover/{id}/attach";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "instanceId", instanceId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhFailoverIp.class);
	}

	/**
	 * Terminate your service
	 * 
	 * REST: POST /cloud/project/{serviceName}/terminate
	 * @param serviceName [required] The project id
	 */
	public String project_serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/terminate";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Launch a contact change procedure
	 * 
	 * REST: POST /cloud/project/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The project id
	 */
	public ArrayList<Long> project_serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/cloud/project/{serviceName}/changeContact";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, t2);
	}

	/**
	 * Get your consumption forecast
	 * 
	 * REST: GET /cloud/project/{serviceName}/forecast
	 * @param serviceName [required] Service name
	 * @param toDate [required] Forecast until date
	 */
	public OvhProjectForecast project_serviceName_forecast_GET(String serviceName, Date toDate) throws IOException {
		String qPath = "/cloud/project/{serviceName}/forecast";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "toDate", toDate);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhProjectForecast.class);
	}

	/**
	 * Get all users
	 * 
	 * REST: GET /cloud/project/{serviceName}/user
	 * @param serviceName [required] Service name
	 */
	public ArrayList<OvhUser> project_serviceName_user_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/user";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t8);
	}
	private static TypeReference<ArrayList<OvhUser>> t8 = new TypeReference<ArrayList<OvhUser>>() {};

	/**
	 * Create user
	 * 
	 * REST: POST /cloud/project/{serviceName}/user
	 * @param description [required] User description
	 * @param serviceName [required] Service name
	 */
	public OvhUserDetail project_serviceName_user_POST(String serviceName, String description) throws IOException {
		String qPath = "/cloud/project/{serviceName}/user";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhUserDetail.class);
	}

	/**
	 * Regenerate user password
	 * 
	 * REST: POST /cloud/project/{serviceName}/user/{userId}/regeneratePassword
	 * @param serviceName [required] Service name
	 * @param userId [required] User id
	 */
	public OvhUserDetail project_serviceName_user_userId_regeneratePassword_POST(String serviceName, Long userId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/user/{userId}/regeneratePassword";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userId}", userId.toString());
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhUserDetail.class);
	}

	/**
	 * Delete user
	 * 
	 * REST: DELETE /cloud/project/{serviceName}/user/{userId}
	 * @param serviceName [required] Service name
	 * @param userId [required] User id
	 */
	public void project_serviceName_user_userId_DELETE(String serviceName, Long userId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/user/{userId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userId}", userId.toString());
		exec("DELETE", qPath);
	}

	/**
	 * Get user details
	 * 
	 * REST: GET /cloud/project/{serviceName}/user/{userId}
	 * @param serviceName [required] Service name
	 * @param userId [required] User id
	 */
	public OvhUser project_serviceName_user_userId_GET(String serviceName, Long userId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/user/{userId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userId}", userId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhUser.class);
	}

	/**
	 * Get RC file of OpenStack
	 * 
	 * REST: GET /cloud/project/{serviceName}/user/{userId}/openrc
	 * @param region [required] Region
	 * @param serviceName [required] Service name
	 * @param userId [required] User id
	 */
	public OvhOpenrc project_serviceName_user_userId_openrc_GET(String serviceName, Long userId, String region) throws IOException {
		String qPath = "/cloud/project/{serviceName}/user/{userId}/openrc";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userId}", userId.toString());
		qPath = query(qPath, "region", region);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOpenrc.class);
	}

	/**
	 * Get token for user
	 * 
	 * REST: POST /cloud/project/{serviceName}/user/{userId}/token
	 * @param password [required] User password
	 * @param serviceName [required] Service name
	 * @param userId [required] User id
	 */
	public OvhToken project_serviceName_user_userId_token_POST(String serviceName, Long userId, String password) throws IOException {
		String qPath = "/cloud/project/{serviceName}/user/{userId}/token";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userId}", userId.toString());
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhToken.class);
	}

	/**
	 * Get your project consumption
	 * 
	 * REST: GET /cloud/project/{serviceName}/consumption
	 * @param to [required] Get usage to
	 * @param from [required] Get usage from
	 * @param serviceName [required] The project id
	 */
	public OvhProjectUsage project_serviceName_consumption_GET(String serviceName, Date from, Date to) throws IOException {
		String qPath = "/cloud/project/{serviceName}/consumption";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "from", from);
		qPath = query(qPath, "to", to);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhProjectUsage.class);
	}

	/**
	 * Delete a snapshot
	 * 
	 * REST: DELETE /cloud/project/{serviceName}/snapshot/{snapshotId}
	 * @param serviceName [required] Project id
	 * @param snapshotId [required] Snapshot id
	 */
	public OvhImage project_serviceName_snapshot_snapshotId_DELETE(String serviceName, String snapshotId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/snapshot/{snapshotId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{snapshotId}", snapshotId);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhImage.class);
	}

	/**
	 * Get snapshot details
	 * 
	 * REST: GET /cloud/project/{serviceName}/snapshot/{snapshotId}
	 * @param serviceName [required] Project id
	 * @param snapshotId [required] Snapshot id
	 */
	public OvhImage project_serviceName_snapshot_snapshotId_GET(String serviceName, String snapshotId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/snapshot/{snapshotId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{snapshotId}", snapshotId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhImage.class);
	}

	/**
	 * Get snapshots
	 * 
	 * REST: GET /cloud/project/{serviceName}/snapshot
	 * @param flavorType [required] Get compatible snapshots with flavor type
	 * @param region [required] Region
	 * @param serviceName [required] Service name
	 */
	public ArrayList<OvhImage> project_serviceName_snapshot_GET(String serviceName, String flavorType, String region) throws IOException {
		String qPath = "/cloud/project/{serviceName}/snapshot";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "flavorType", flavorType);
		qPath = query(qPath, "region", region);
		String resp = exec("GET", qPath);
		return convertTo(resp, t9);
	}
	private static TypeReference<ArrayList<OvhImage>> t9 = new TypeReference<ArrayList<OvhImage>>() {};

	/**
	 * Manage alerts on your consumption
	 * 
	 * REST: GET /cloud/project/{serviceName}/alerting
	 * @param serviceName [required] The project id
	 */
	public ArrayList<String> project_serviceName_alerting_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/alerting";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Add new alert
	 * 
	 * REST: POST /cloud/project/{serviceName}/alerting
	 * @param email [required] Email to contact
	 * @param monthlyThreshold [required] Monthly threshold for this alerting in currency
	 * @param delay [required] Delay between alerts in seconds
	 * @param serviceName [required] The project id
	 */
	public OvhAlerting project_serviceName_alerting_POST(String serviceName, String email, Long monthlyThreshold, OvhAlertingDelayEnum delay) throws IOException {
		String qPath = "/cloud/project/{serviceName}/alerting";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "email", email);
		addBody(o, "monthlyThreshold", monthlyThreshold);
		addBody(o, "delay", delay);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhAlerting.class);
	}

	/**
	 * See alerts
	 * 
	 * REST: GET /cloud/project/{serviceName}/alerting/{id}/alert
	 * @param serviceName [required] The project id
	 * @param id [required] Alerting unique UUID
	 */
	public ArrayList<Long> project_serviceName_alerting_id_alert_GET(String serviceName, String id) throws IOException {
		String qPath = "/cloud/project/{serviceName}/alerting/{id}/alert";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /cloud/project/{serviceName}/alerting/{id}/alert/{alertId}
	 * @param serviceName [required] The project id
	 * @param id [required] Alerting unique UUID
	 * @param alertId [required] Alert id
	 */
	public OvhAlertingAlert project_serviceName_alerting_id_alert_alertId_GET(String serviceName, String id, Long alertId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/alerting/{id}/alert/{alertId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id);
		qPath = qPath.replace("{alertId}", alertId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAlertingAlert.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /cloud/project/{serviceName}/alerting/{id}
	 * @param serviceName [required] The project id
	 * @param id [required] Alerting unique UUID
	 */
	public OvhAlerting project_serviceName_alerting_id_GET(String serviceName, String id) throws IOException {
		String qPath = "/cloud/project/{serviceName}/alerting/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAlerting.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /cloud/project/{serviceName}/alerting/{id}
	 * @param null [required] New object properties
	 * @param serviceName [required] The project id
	 * @param id [required] Alerting unique UUID
	 */
	public void project_serviceName_alerting_id_PUT(String serviceName, String id, OvhAlerting body) throws IOException {
		String qPath = "/cloud/project/{serviceName}/alerting/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id);
		exec("PUT", qPath, body);
	}

	/**
	 * Delete alerting
	 * 
	 * REST: DELETE /cloud/project/{serviceName}/alerting/{id}
	 * @param serviceName [required] The project id
	 * @param id [required] Alerting unique UUID
	 */
	public void project_serviceName_alerting_id_DELETE(String serviceName, String id) throws IOException {
		String qPath = "/cloud/project/{serviceName}/alerting/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id);
		exec("DELETE", qPath);
	}

	/**
	 * Get flavors
	 * 
	 * REST: GET /cloud/project/{serviceName}/flavor
	 * @param region [required] Flavor region
	 * @param serviceName [required] Service name
	 */
	public ArrayList<OvhFlavor> project_serviceName_flavor_GET(String serviceName, String region) throws IOException {
		String qPath = "/cloud/project/{serviceName}/flavor";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "region", region);
		String resp = exec("GET", qPath);
		return convertTo(resp, t10);
	}
	private static TypeReference<ArrayList<OvhFlavor>> t10 = new TypeReference<ArrayList<OvhFlavor>>() {};

	/**
	 * Get flavor
	 * 
	 * REST: GET /cloud/project/{serviceName}/flavor/{flavorId}
	 * @param flavorId [required] Flavor id
	 * @param serviceName [required] Service name
	 */
	public OvhFlavor project_serviceName_flavor_flavorId_GET(String serviceName, String flavorId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/flavor/{flavorId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{flavorId}", flavorId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhFlavor.class);
	}

	/**
	 * Get usage forecast
	 * 
	 * REST: GET /cloud/project/{serviceName}/usage/forecast
	 * @param serviceName [required] Service name
	 */
	public OvhUsageForecast project_serviceName_usage_forecast_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/usage/forecast";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhUsageForecast.class);
	}

	/**
	 * Usage information on your project
	 * 
	 * REST: GET /cloud/project/{serviceName}/usage/history
	 * @param from [required] Filter results having date superior to from
	 * @param serviceName [required] Service name
	 * @param to [required] Filter results having date inferior to
	 */
	public ArrayList<OvhUsageHistory> project_serviceName_usage_history_GET(String serviceName, Date from, Date to) throws IOException {
		String qPath = "/cloud/project/{serviceName}/usage/history";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "from", from);
		qPath = query(qPath, "to", to);
		String resp = exec("GET", qPath);
		return convertTo(resp, t11);
	}
	private static TypeReference<ArrayList<OvhUsageHistory>> t11 = new TypeReference<ArrayList<OvhUsageHistory>>() {};

	/**
	 * Usage information details
	 * 
	 * REST: GET /cloud/project/{serviceName}/usage/history/{usageId}
	 * @param serviceName [required] Service name
	 * @param usageId [required] Usage id
	 */
	public OvhUsageHistoryDetail project_serviceName_usage_history_usageId_GET(String serviceName, String usageId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/usage/history/{usageId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{usageId}", usageId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhUsageHistoryDetail.class);
	}

	/**
	 * Get current usage
	 * 
	 * REST: GET /cloud/project/{serviceName}/usage/current
	 * @param serviceName [required] Service name
	 */
	public OvhUsageCurrent project_serviceName_usage_current_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/usage/current";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhUsageCurrent.class);
	}

	/**
	 * Get volumes
	 * 
	 * REST: GET /cloud/project/{serviceName}/volume
	 * @param region [required] Volume region
	 * @param serviceName [required] Project id
	 */
	public ArrayList<OvhVolume> project_serviceName_volume_GET(String serviceName, String region) throws IOException {
		String qPath = "/cloud/project/{serviceName}/volume";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "region", region);
		String resp = exec("GET", qPath);
		return convertTo(resp, t12);
	}
	private static TypeReference<ArrayList<OvhVolume>> t12 = new TypeReference<ArrayList<OvhVolume>>() {};

	/**
	 * Create a volume
	 * 
	 * REST: POST /cloud/project/{serviceName}/volume
	 * @param description [required] Volume description
	 * @param imageId [required] Id of image to create a bootable volume
	 * @param name [required] Volume name
	 * @param region [required] Volume region
	 * @param serviceName [required] Project id
	 * @param size [required] Volume size (in GiB)
	 * @param snapshotId [required] Source snapshot id
	 * @param type [required] Volume type
	 */
	public OvhVolume project_serviceName_volume_POST(String serviceName, String description, String imageId, String name, String region, Long size, String snapshotId, OvhVolumeTypeEnum type) throws IOException {
		String qPath = "/cloud/project/{serviceName}/volume";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "imageId", imageId);
		addBody(o, "name", name);
		addBody(o, "region", region);
		addBody(o, "size", size);
		addBody(o, "snapshotId", snapshotId);
		addBody(o, "type", type);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhVolume.class);
	}

	/**
	 * Delete a volume
	 * 
	 * REST: DELETE /cloud/project/{serviceName}/volume/{volumeId}
	 * @param serviceName [required] Project id
	 * @param volumeId [required] Volume id
	 */
	public void project_serviceName_volume_volumeId_DELETE(String serviceName, String volumeId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/volume/{volumeId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{volumeId}", volumeId);
		exec("DELETE", qPath);
	}

	/**
	 * Get volume details
	 * 
	 * REST: GET /cloud/project/{serviceName}/volume/{volumeId}
	 * @param serviceName [required] Project id
	 * @param volumeId [required] Volume id
	 */
	public OvhVolume project_serviceName_volume_volumeId_GET(String serviceName, String volumeId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/volume/{volumeId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{volumeId}", volumeId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhVolume.class);
	}

	/**
	 * Update a volume
	 * 
	 * REST: PUT /cloud/project/{serviceName}/volume/{volumeId}
	 * @param description [required] Volume description
	 * @param name [required] Volume name
	 * @param serviceName [required] Project id
	 * @param volumeId [required] Volume id
	 */
	public OvhVolume project_serviceName_volume_volumeId_PUT(String serviceName, String volumeId, String description, String name) throws IOException {
		String qPath = "/cloud/project/{serviceName}/volume/{volumeId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{volumeId}", volumeId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "name", name);
		String resp = exec("PUT", qPath, o);
		return convertTo(resp, OvhVolume.class);
	}

	/**
	 * Detach a volume from an instance
	 * 
	 * REST: POST /cloud/project/{serviceName}/volume/{volumeId}/detach
	 * @param instanceId [required] Instance id
	 * @param serviceName [required] Service name
	 * @param volumeId [required] Volume id
	 */
	public OvhVolume project_serviceName_volume_volumeId_detach_POST(String serviceName, String volumeId, String instanceId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/volume/{volumeId}/detach";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{volumeId}", volumeId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "instanceId", instanceId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhVolume.class);
	}

	/**
	 * Extend a volume
	 * 
	 * REST: POST /cloud/project/{serviceName}/volume/{volumeId}/upsize
	 * @param serviceName [required] Service name
	 * @param size [required] New volume size (in GiB) (must be greater than current one)
	 * @param volumeId [required] Volume id
	 */
	public OvhVolume project_serviceName_volume_volumeId_upsize_POST(String serviceName, String volumeId, Long size) throws IOException {
		String qPath = "/cloud/project/{serviceName}/volume/{volumeId}/upsize";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{volumeId}", volumeId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "size", size);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhVolume.class);
	}

	/**
	 * Snapshot a volume
	 * 
	 * REST: POST /cloud/project/{serviceName}/volume/{volumeId}/snapshot
	 * @param description [required] Snapshot description
	 * @param name [required] Snapshot name
	 * @param serviceName [required] Service name
	 * @param volumeId [required] Volume id
	 */
	public OvhSnapshot project_serviceName_volume_volumeId_snapshot_POST(String serviceName, String volumeId, String description, String name) throws IOException {
		String qPath = "/cloud/project/{serviceName}/volume/{volumeId}/snapshot";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{volumeId}", volumeId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "name", name);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhSnapshot.class);
	}

	/**
	 * Attach a volume on an instance
	 * 
	 * REST: POST /cloud/project/{serviceName}/volume/{volumeId}/attach
	 * @param instanceId [required] Instance id
	 * @param serviceName [required] Service name
	 * @param volumeId [required] Volume id
	 */
	public OvhVolume project_serviceName_volume_volumeId_attach_POST(String serviceName, String volumeId, String instanceId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/volume/{volumeId}/attach";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{volumeId}", volumeId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "instanceId", instanceId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhVolume.class);
	}

	/**
	 * Delete a volume snapshot
	 * 
	 * REST: DELETE /cloud/project/{serviceName}/volume/snapshot/{snapshotId}
	 * @param serviceName [required] Project id
	 * @param snapshotId [required] Snapshot id
	 */
	public void project_serviceName_volume_snapshot_snapshotId_DELETE(String serviceName, String snapshotId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/volume/snapshot/{snapshotId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{snapshotId}", snapshotId);
		exec("DELETE", qPath);
	}

	/**
	 * Get volume snapshot details
	 * 
	 * REST: GET /cloud/project/{serviceName}/volume/snapshot/{snapshotId}
	 * @param serviceName [required] Project id
	 * @param snapshotId [required]
	 */
	public OvhSnapshot project_serviceName_volume_snapshot_snapshotId_GET(String serviceName, String snapshotId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/volume/snapshot/{snapshotId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{snapshotId}", snapshotId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhSnapshot.class);
	}

	/**
	 * Get volume snapshots
	 * 
	 * REST: GET /cloud/project/{serviceName}/volume/snapshot
	 * @param region [required] Snapshots region
	 * @param serviceName [required] Project id
	 */
	public ArrayList<OvhSnapshot> project_serviceName_volume_snapshot_GET(String serviceName, String region) throws IOException {
		String qPath = "/cloud/project/{serviceName}/volume/snapshot";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "region", region);
		String resp = exec("GET", qPath);
		return convertTo(resp, t13);
	}
	private static TypeReference<ArrayList<OvhSnapshot>> t13 = new TypeReference<ArrayList<OvhSnapshot>>() {};

	/**
	 * Get ACL on your cloud project
	 * 
	 * REST: GET /cloud/project/{serviceName}/acl
	 * @param type [required] Filter the value of type property (=)
	 * @param serviceName [required] The project id
	 */
	public ArrayList<String> project_serviceName_acl_GET(String serviceName, OvhAclTypeEnum type) throws IOException {
		String qPath = "/cloud/project/{serviceName}/acl";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "type", type);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Create new ACL
	 * 
	 * REST: POST /cloud/project/{serviceName}/acl
	 * @param accountId [required] Deleguates rights to
	 * @param type [required] Acl type
	 * @param serviceName [required] The project id
	 */
	public OvhAcl project_serviceName_acl_POST(String serviceName, String accountId, OvhAclTypeEnum type) throws IOException {
		String qPath = "/cloud/project/{serviceName}/acl";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "accountId", accountId);
		addBody(o, "type", type);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhAcl.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /cloud/project/{serviceName}/acl/{accountId}
	 * @param serviceName [required] The project id
	 * @param accountId [required] OVH customer unique identifier
	 */
	public OvhAcl project_serviceName_acl_accountId_GET(String serviceName, String accountId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/acl/{accountId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{accountId}", accountId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAcl.class);
	}

	/**
	 * Delete ACL
	 * 
	 * REST: DELETE /cloud/project/{serviceName}/acl/{accountId}
	 * @param serviceName [required] The project id
	 * @param accountId [required] OVH customer unique identifier
	 */
	public void project_serviceName_acl_accountId_DELETE(String serviceName, String accountId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/acl/{accountId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{accountId}", accountId);
		exec("DELETE", qPath);
	}

	/**
	 * Get your credit
	 * 
	 * REST: GET /cloud/project/{serviceName}/credit
	 * @param serviceName [required] The project id
	 */
	public ArrayList<Long> project_serviceName_credit_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/credit";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Add credit to your project
	 * 
	 * REST: POST /cloud/project/{serviceName}/credit
	 * @param code [required] Voucher code
	 * @param serviceName [required] The project id
	 */
	public void project_serviceName_credit_POST(String serviceName, String code) throws IOException {
		String qPath = "/cloud/project/{serviceName}/credit";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "code", code);
		exec("POST", qPath, o);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /cloud/project/{serviceName}/credit/{id}
	 * @param serviceName [required] The project id
	 * @param id [required] Credit id
	 */
	public OvhCredit project_serviceName_credit_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/cloud/project/{serviceName}/credit/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhCredit.class);
	}

	/**
	 * Get regions
	 * 
	 * REST: GET /cloud/project/{serviceName}/region
	 * @param serviceName [required] Service name
	 */
	public ArrayList<String> project_serviceName_region_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/region";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get region
	 * 
	 * REST: GET /cloud/project/{serviceName}/region/{regionName}
	 * @param regionName [required] Region name
	 * @param serviceName [required] Service name
	 */
	public OvhRegionDetail project_serviceName_region_regionName_GET(String serviceName, String regionName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/region/{regionName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{regionName}", regionName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhRegionDetail.class);
	}

	/**
	 * Confirm termination of your service
	 * 
	 * REST: POST /cloud/project/{serviceName}/confirmTermination
	 * @param reason Reason of your termination request
	 * @param commentary Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] The project id
	 */
	public String project_serviceName_confirmTermination_POST(String serviceName, OvhTerminationReasonEnum reason, String commentary, String token) throws IOException {
		String qPath = "/cloud/project/{serviceName}/confirmTermination";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "reason", reason);
		addBody(o, "commentary", commentary);
		addBody(o, "token", token);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, String.class);
	}

	/**
	 * Get instances
	 * 
	 * REST: GET /cloud/project/{serviceName}/instance
	 * @param region [required] Instance region
	 * @param serviceName [required] Project id
	 */
	public ArrayList<OvhInstance> project_serviceName_instance_GET(String serviceName, String region) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "region", region);
		String resp = exec("GET", qPath);
		return convertTo(resp, t14);
	}
	private static TypeReference<ArrayList<OvhInstance>> t14 = new TypeReference<ArrayList<OvhInstance>>() {};

	/**
	 * Create a new instance
	 * 
	 * REST: POST /cloud/project/{serviceName}/instance
	 * @param flavorId [required] Instance flavor id
	 * @param groupId [required] Start instance in group
	 * @param imageId [required] Instance image id
	 * @param monthlyBilling [required] Active monthly billing
	 * @param name [required] Instance name
	 * @param networks [required] Create network interfaces
	 * @param region [required] Instance region
	 * @param serviceName [required] Project name
	 * @param sshKeyId [required] SSH keypair id
	 * @param userData [required] Configuration information or scripts to use upon launch
	 * @param volumeId [required] Specify a volume id to boot on it
	 */
	public OvhInstanceDetail project_serviceName_instance_POST(String serviceName, String flavorId, String groupId, String imageId, Boolean monthlyBilling, String name, OvhNetworkParams[] networks, String region, String sshKeyId, String userData, String volumeId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "flavorId", flavorId);
		addBody(o, "groupId", groupId);
		addBody(o, "imageId", imageId);
		addBody(o, "monthlyBilling", monthlyBilling);
		addBody(o, "name", name);
		addBody(o, "networks", networks);
		addBody(o, "region", region);
		addBody(o, "sshKeyId", sshKeyId);
		addBody(o, "userData", userData);
		addBody(o, "volumeId", volumeId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhInstanceDetail.class);
	}

	/**
	 * Get the detail of a group
	 * 
	 * REST: GET /cloud/project/{serviceName}/instance/group
	 * @param region [required] Instance region
	 * @param serviceName [required] Project id
	 */
	public ArrayList<OvhInstanceGroup> project_serviceName_instance_group_GET(String serviceName, String region) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/group";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "region", region);
		String resp = exec("GET", qPath);
		return convertTo(resp, t15);
	}
	private static TypeReference<ArrayList<OvhInstanceGroup>> t15 = new TypeReference<ArrayList<OvhInstanceGroup>>() {};

	/**
	 * Create a group
	 * 
	 * REST: POST /cloud/project/{serviceName}/instance/group
	 * @param name [required] instance group name
	 * @param region [required] Instance region
	 * @param serviceName [required] Project name
	 * @param type [required] Instance group type
	 */
	public OvhInstanceGroup project_serviceName_instance_group_POST(String serviceName, String name, String region, OvhInstanceGroupTypeEnum type) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/group";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		addBody(o, "region", region);
		addBody(o, "type", type);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhInstanceGroup.class);
	}

	/**
	 * Delete a group
	 * 
	 * REST: DELETE /cloud/project/{serviceName}/instance/group/{groupId}
	 * @param groupId [required] Group id
	 * @param serviceName [required] Project name
	 */
	public void project_serviceName_instance_group_groupId_DELETE(String serviceName, String groupId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/group/{groupId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{groupId}", groupId);
		exec("DELETE", qPath);
	}

	/**
	 * Get all groups
	 * 
	 * REST: GET /cloud/project/{serviceName}/instance/group/{groupId}
	 * @param groupId [required] Instance group id
	 * @param region [required] Instance region
	 * @param serviceName [required] Project id
	 */
	public OvhInstanceGroup project_serviceName_instance_group_groupId_GET(String serviceName, String groupId, String region) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/group/{groupId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{groupId}", groupId);
		qPath = query(qPath, "region", region);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhInstanceGroup.class);
	}

	/**
	 * Resume a suspended instance
	 * 
	 * REST: POST /cloud/project/{serviceName}/instance/{instanceId}/resume
	 * @param instanceId [required] Instance id
	 * @param serviceName [required] Service name
	 */
	public void project_serviceName_instance_instanceId_resume_POST(String serviceName, String instanceId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}/resume";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{instanceId}", instanceId);
		exec("POST", qPath);
	}

	/**
	 * Delete an instance
	 * 
	 * REST: DELETE /cloud/project/{serviceName}/instance/{instanceId}
	 * @param instanceId [required] Instance id
	 * @param serviceName [required] Project name
	 */
	public void project_serviceName_instance_instanceId_DELETE(String serviceName, String instanceId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{instanceId}", instanceId);
		exec("DELETE", qPath);
	}

	/**
	 * Get instance
	 * 
	 * REST: GET /cloud/project/{serviceName}/instance/{instanceId}
	 * @param instanceId [required] Instance id
	 * @param serviceName [required] Project id
	 */
	public OvhInstanceDetail project_serviceName_instance_instanceId_GET(String serviceName, String instanceId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{instanceId}", instanceId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhInstanceDetail.class);
	}

	/**
	 * Alter an instance
	 * 
	 * REST: PUT /cloud/project/{serviceName}/instance/{instanceId}
	 * @param instanceId [required] Instance id
	 * @param instanceName [required] Instance new name
	 * @param serviceName [required] Service name
	 */
	public void project_serviceName_instance_instanceId_PUT(String serviceName, String instanceId, String instanceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{instanceId}", instanceId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "instanceName", instanceName);
		exec("PUT", qPath, o);
	}

	/**
	 * Reinstall an instance
	 * 
	 * REST: POST /cloud/project/{serviceName}/instance/{instanceId}/reinstall
	 * @param imageId [required] Image to reinstall
	 * @param instanceId [required] Instance id
	 * @param serviceName [required] Service name
	 */
	public OvhInstanceDetail project_serviceName_instance_instanceId_reinstall_POST(String serviceName, String instanceId, String imageId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}/reinstall";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{instanceId}", instanceId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "imageId", imageId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhInstanceDetail.class);
	}

	/**
	 * Reboot an instance
	 * 
	 * REST: POST /cloud/project/{serviceName}/instance/{instanceId}/reboot
	 * @param instanceId [required] Instance id
	 * @param serviceName [required] Service name
	 * @param type [required] Reboot type (default soft)
	 */
	public void project_serviceName_instance_instanceId_reboot_POST(String serviceName, String instanceId, OvhRebootTypeEnum type) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}/reboot";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{instanceId}", instanceId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "type", type);
		exec("POST", qPath, o);
	}

	/**
	 * Get VNC access to your instance
	 * 
	 * REST: POST /cloud/project/{serviceName}/instance/{instanceId}/vnc
	 * @param instanceId [required] Instance id
	 * @param serviceName [required] Project id
	 */
	public OvhInstanceVnc project_serviceName_instance_instanceId_vnc_POST(String serviceName, String instanceId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}/vnc";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{instanceId}", instanceId);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhInstanceVnc.class);
	}

	/**
	 * Enable or disable rescue mode
	 * 
	 * REST: POST /cloud/project/{serviceName}/instance/{instanceId}/rescueMode
	 * @param imageId [required] Image to boot on
	 * @param instanceId [required] Instance id
	 * @param rescue [required] Enable rescue mode
	 * @param serviceName [required] Service name
	 */
	public OvhRescueAdminPassword project_serviceName_instance_instanceId_rescueMode_POST(String serviceName, String instanceId, String imageId, Boolean rescue) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}/rescueMode";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{instanceId}", instanceId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "imageId", imageId);
		addBody(o, "rescue", rescue);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhRescueAdminPassword.class);
	}

	/**
	 * Migrate your instance to another flavor
	 * 
	 * REST: POST /cloud/project/{serviceName}/instance/{instanceId}/resize
	 * @param flavorId [required] Flavor id
	 * @param instanceId [required] Instance id
	 * @param serviceName [required] Service name
	 */
	public OvhInstanceDetail project_serviceName_instance_instanceId_resize_POST(String serviceName, String instanceId, String flavorId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}/resize";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{instanceId}", instanceId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "flavorId", flavorId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhInstanceDetail.class);
	}

	/**
	 * Return many statistics about the virtual machine for a given period
	 * 
	 * REST: GET /cloud/project/{serviceName}/instance/{instanceId}/monitoring
	 * @param instanceId [required] Instance id
	 * @param period [required] The period the statistics are fetched for
	 * @param serviceName [required] Project id
	 * @param type [required] The type of statistic to be fetched
	 */
	public OvhInstanceMetrics project_serviceName_instance_instanceId_monitoring_GET(String serviceName, String instanceId, OvhMetricsPeriod period, OvhMetricsType type) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}/monitoring";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{instanceId}", instanceId);
		qPath = query(qPath, "period", period);
		qPath = query(qPath, "type", type);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhInstanceMetrics.class);
	}

	/**
	 * Get interfaces
	 * 
	 * REST: GET /cloud/project/{serviceName}/instance/{instanceId}/interface
	 * @param instanceId [required] Instance id
	 * @param serviceName [required] Service name
	 */
	public ArrayList<OvhInterface> project_serviceName_instance_instanceId_interface_GET(String serviceName, String instanceId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}/interface";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{instanceId}", instanceId);
		String resp = exec("GET", qPath);
		return convertTo(resp, t16);
	}
	private static TypeReference<ArrayList<OvhInterface>> t16 = new TypeReference<ArrayList<OvhInterface>>() {};

	/**
	 * Create interface on an instance and attached it to a network
	 * 
	 * REST: POST /cloud/project/{serviceName}/instance/{instanceId}/interface
	 * @param instanceId [required] Instance id
	 * @param ip [required] Static ip (Can only be defined for private networks)
	 * @param networkId [required] Network id
	 * @param serviceName [required] Service name
	 */
	public OvhInterface project_serviceName_instance_instanceId_interface_POST(String serviceName, String instanceId, String ip, String networkId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}/interface";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{instanceId}", instanceId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ip", ip);
		addBody(o, "networkId", networkId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhInterface.class);
	}

	/**
	 * Delete an interface
	 * 
	 * REST: DELETE /cloud/project/{serviceName}/instance/{instanceId}/interface/{interfaceId}
	 * @param instanceId [required] Instance id
	 * @param interfaceId [required] Interface id
	 * @param serviceName [required] Service name
	 */
	public void project_serviceName_instance_instanceId_interface_interfaceId_DELETE(String serviceName, String instanceId, String interfaceId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}/interface/{interfaceId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{instanceId}", instanceId);
		qPath = qPath.replace("{interfaceId}", interfaceId);
		exec("DELETE", qPath);
	}

	/**
	 * Get interface
	 * 
	 * REST: GET /cloud/project/{serviceName}/instance/{instanceId}/interface/{interfaceId}
	 * @param instanceId [required] Instance id
	 * @param interfaceId [required] Interface id
	 * @param serviceName [required] Service name
	 */
	public OvhInterface project_serviceName_instance_instanceId_interface_interfaceId_GET(String serviceName, String instanceId, String interfaceId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}/interface/{interfaceId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{instanceId}", instanceId);
		qPath = qPath.replace("{interfaceId}", interfaceId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhInterface.class);
	}

	/**
	 * Snapshot an instance
	 * 
	 * REST: POST /cloud/project/{serviceName}/instance/{instanceId}/snapshot
	 * @param instanceId [required] Instance id
	 * @param serviceName [required] Service name
	 * @param snapshotName [required] Snapshot name
	 */
	public void project_serviceName_instance_instanceId_snapshot_POST(String serviceName, String instanceId, String snapshotName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}/snapshot";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{instanceId}", instanceId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "snapshotName", snapshotName);
		exec("POST", qPath, o);
	}

	/**
	 * Active monthly billing on instance
	 * 
	 * REST: POST /cloud/project/{serviceName}/instance/{instanceId}/activeMonthlyBilling
	 * @param instanceId [required] Instance id
	 * @param serviceName [required] Service name
	 */
	public OvhInstanceDetail project_serviceName_instance_instanceId_activeMonthlyBilling_POST(String serviceName, String instanceId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/{instanceId}/activeMonthlyBilling";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{instanceId}", instanceId);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhInstanceDetail.class);
	}

	/**
	 * Create multiple instances
	 * 
	 * REST: POST /cloud/project/{serviceName}/instance/bulk
	 * @param flavorId [required] Instance flavor id
	 * @param groupId [required] Start instance in group
	 * @param imageId [required] Instance image id
	 * @param monthlyBilling [required] Active monthly billing
	 * @param name [required] Instance name
	 * @param networks [required] Create network interfaces
	 * @param number [required] Number of instances you want to create
	 * @param region [required] Instance region
	 * @param serviceName [required] Project name
	 * @param sshKeyId [required] SSH keypair id
	 * @param userData [required] Configuration information or scripts to use upon launch
	 * @param volumeId [required] Specify a volume id to boot on it
	 */
	public ArrayList<OvhInstance> project_serviceName_instance_bulk_POST(String serviceName, String flavorId, String groupId, String imageId, Boolean monthlyBilling, String name, OvhNetworkBulkParams[] networks, Long number, String region, String sshKeyId, String userData, String volumeId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/instance/bulk";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "flavorId", flavorId);
		addBody(o, "groupId", groupId);
		addBody(o, "imageId", imageId);
		addBody(o, "monthlyBilling", monthlyBilling);
		addBody(o, "name", name);
		addBody(o, "networks", networks);
		addBody(o, "number", number);
		addBody(o, "region", region);
		addBody(o, "sshKeyId", sshKeyId);
		addBody(o, "userData", userData);
		addBody(o, "volumeId", volumeId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, t14);
	}

	/**
	 * Get images
	 * 
	 * REST: GET /cloud/project/{serviceName}/image
	 * @param flavorType [required] Get compatible images with flavor type
	 * @param osType [required] Image OS
	 * @param region [required] Image region
	 * @param serviceName [required] Project id
	 */
	public ArrayList<OvhImage> project_serviceName_image_GET(String serviceName, String flavorType, OvhOSTypeEnum osType, String region) throws IOException {
		String qPath = "/cloud/project/{serviceName}/image";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "flavorType", flavorType);
		qPath = query(qPath, "osType", osType);
		qPath = query(qPath, "region", region);
		String resp = exec("GET", qPath);
		return convertTo(resp, t9);
	}

	/**
	 * Get image
	 * 
	 * REST: GET /cloud/project/{serviceName}/image/{imageId}
	 * @param imageId [required] Image id
	 * @param serviceName [required] Project id
	 */
	public OvhImage project_serviceName_image_imageId_GET(String serviceName, String imageId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/image/{imageId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{imageId}", imageId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhImage.class);
	}

	/**
	 * Request more quota on your /cloud project
	 * 
	 * REST: POST /cloud/project/{serviceName}/unleash
	 * @param serviceName [required] The project id
	 */
	public void project_serviceName_unleash_POST(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/unleash";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("POST", qPath);
	}

	/**
	 * Get vrack where this project is associated
	 * 
	 * REST: GET /cloud/project/{serviceName}/vrack
	 * @param serviceName [required] The project id
	 */
	public OvhVrack project_serviceName_vrack_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/vrack";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhVrack.class);
	}

	/**
	 * Get SSH keys
	 * 
	 * REST: GET /cloud/project/{serviceName}/sshkey
	 * @param region [required] Region
	 * @param serviceName [required] Project name
	 */
	public ArrayList<OvhSshKey> project_serviceName_sshkey_GET(String serviceName, String region) throws IOException {
		String qPath = "/cloud/project/{serviceName}/sshkey";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "region", region);
		String resp = exec("GET", qPath);
		return convertTo(resp, t17);
	}
	private static TypeReference<ArrayList<OvhSshKey>> t17 = new TypeReference<ArrayList<OvhSshKey>>() {};

	/**
	 * Create SSH key
	 * 
	 * REST: POST /cloud/project/{serviceName}/sshkey
	 * @param name [required] SSH key name
	 * @param publicKey [required] SSH public key
	 * @param region [required] Region to create SSH key
	 * @param serviceName [required] Project name
	 */
	public OvhSshKeyDetail project_serviceName_sshkey_POST(String serviceName, String name, String publicKey, String region) throws IOException {
		String qPath = "/cloud/project/{serviceName}/sshkey";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		addBody(o, "publicKey", publicKey);
		addBody(o, "region", region);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhSshKeyDetail.class);
	}

	/**
	 * Delete SSH key
	 * 
	 * REST: DELETE /cloud/project/{serviceName}/sshkey/{keyId}
	 * @param keyId [required] SSH key id
	 * @param serviceName [required] Project name
	 */
	public void project_serviceName_sshkey_keyId_DELETE(String serviceName, String keyId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/sshkey/{keyId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{keyId}", keyId);
		exec("DELETE", qPath);
	}

	/**
	 * Get SSH key
	 * 
	 * REST: GET /cloud/project/{serviceName}/sshkey/{keyId}
	 * @param keyId [required] SSH key id
	 * @param serviceName [required] Project name
	 */
	public OvhSshKeyDetail project_serviceName_sshkey_keyId_GET(String serviceName, String keyId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/sshkey/{keyId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{keyId}", keyId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhSshKeyDetail.class);
	}

	/**
	 * Cancel project creation
	 * 
	 * REST: POST /cloud/project/{serviceName}/cancel
	 * @param serviceName [required] The project id
	 */
	public void project_serviceName_cancel_POST(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/cancel";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("POST", qPath);
	}

	/**
	 * Get storage containers
	 * 
	 * REST: GET /cloud/project/{serviceName}/storage
	 * @param serviceName [required] Service name
	 */
	public ArrayList<OvhContainer> project_serviceName_storage_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/storage";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t18);
	}
	private static TypeReference<ArrayList<OvhContainer>> t18 = new TypeReference<ArrayList<OvhContainer>>() {};

	/**
	 * Create container
	 * 
	 * REST: POST /cloud/project/{serviceName}/storage
	 * @param archive [required] Archive container flag
	 * @param containerName [required] Container name
	 * @param region [required] Region
	 * @param serviceName [required] Service name
	 */
	public OvhContainer project_serviceName_storage_POST(String serviceName, Boolean archive, String containerName, String region) throws IOException {
		String qPath = "/cloud/project/{serviceName}/storage";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "archive", archive);
		addBody(o, "containerName", containerName);
		addBody(o, "region", region);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhContainer.class);
	}

	/**
	 * Delete container
	 * 
	 * REST: DELETE /cloud/project/{serviceName}/storage/{containerId}
	 * @param containerId [required] Container id
	 * @param serviceName [required] Service name
	 */
	public void project_serviceName_storage_containerId_DELETE(String serviceName, String containerId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/storage/{containerId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{containerId}", containerId);
		exec("DELETE", qPath);
	}

	/**
	 * Get storage container
	 * 
	 * REST: GET /cloud/project/{serviceName}/storage/{containerId}
	 * @param containerId [required] Container id
	 * @param serviceName [required] Service name
	 */
	public OvhContainerDetail project_serviceName_storage_containerId_GET(String serviceName, String containerId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/storage/{containerId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{containerId}", containerId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhContainerDetail.class);
	}

	/**
	 * Delete CORS support on your container
	 * 
	 * REST: DELETE /cloud/project/{serviceName}/storage/{containerId}/cors
	 * @param containerId [required] Container id
	 * @param origin [required] Delete this origin
	 * @param serviceName [required] Service name
	 */
	public void project_serviceName_storage_containerId_cors_DELETE(String serviceName, String containerId, String origin) throws IOException {
		String qPath = "/cloud/project/{serviceName}/storage/{containerId}/cors";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{containerId}", containerId);
		qPath = query(qPath, "origin", origin);
		exec("DELETE", qPath);
	}

	/**
	 * Add CORS support on your container
	 * 
	 * REST: POST /cloud/project/{serviceName}/storage/{containerId}/cors
	 * @param containerId [required] Container id
	 * @param origin [required] Allow this origin
	 * @param serviceName [required] Service name
	 */
	public void project_serviceName_storage_containerId_cors_POST(String serviceName, String containerId, String origin) throws IOException {
		String qPath = "/cloud/project/{serviceName}/storage/{containerId}/cors";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{containerId}", containerId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "origin", origin);
		exec("POST", qPath, o);
	}

	/**
	 * Deploy your container files as a static web site
	 * 
	 * REST: POST /cloud/project/{serviceName}/storage/{containerId}/static
	 * @param containerId [required] Container id
	 * @param serviceName [required] Service name
	 */
	public void project_serviceName_storage_containerId_static_POST(String serviceName, String containerId) throws IOException {
		String qPath = "/cloud/project/{serviceName}/storage/{containerId}/static";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{containerId}", containerId);
		exec("POST", qPath);
	}

	/**
	 * Get a public temporary URL to access to one of your object
	 * 
	 * REST: POST /cloud/project/{serviceName}/storage/{containerId}/publicUrl
	 * @param containerId [required] Container ID
	 * @param expirationDate [required] Temporary URL expiration
	 * @param objectName [required] Object name
	 * @param serviceName [required] Service name
	 */
	public OvhContainerObjectTempURL project_serviceName_storage_containerId_publicUrl_POST(String serviceName, String containerId, Date expirationDate, String objectName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/storage/{containerId}/publicUrl";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{containerId}", containerId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "expirationDate", expirationDate);
		addBody(o, "objectName", objectName);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhContainerObjectTempURL.class);
	}

	/**
	 * Access to storage API
	 * 
	 * REST: GET /cloud/project/{serviceName}/storage/access
	 * @param serviceName [required] Service name
	 */
	public OvhContainerAccess project_serviceName_storage_access_GET(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/storage/access";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhContainerAccess.class);
	}

	/**
	 * Access to storage API
	 * 
	 * REST: POST /cloud/project/{serviceName}/storage/access
	 * @param serviceName [required] Service name
	 */
	public OvhContainerAccess project_serviceName_storage_access_POST(String serviceName) throws IOException {
		String qPath = "/cloud/project/{serviceName}/storage/access";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhContainerAccess.class);
	}

	/**
	 * Get your project bills
	 * 
	 * REST: GET /cloud/project/{serviceName}/bill
	 * @param to [required] Get bills to
	 * @param from [required] Get bills from
	 * @param serviceName [required] The project id
	 */
	public ArrayList<OvhBill> project_serviceName_bill_GET(String serviceName, Date from, Date to) throws IOException {
		String qPath = "/cloud/project/{serviceName}/bill";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "from", from);
		qPath = query(qPath, "to", to);
		String resp = exec("GET", qPath);
		return convertTo(resp, t19);
	}
	private static TypeReference<ArrayList<OvhBill>> t19 = new TypeReference<ArrayList<OvhBill>>() {};

	/**
	 * List available services
	 * 
	 * REST: GET /cloud/project
	 */
	public ArrayList<String> project_GET() throws IOException {
		String qPath = "/cloud/project";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get services prices
	 * 
	 * REST: GET /cloud/price
	 * @param flavorId [required] OVH cloud flavor id
	 * @param region [required] Region
	 */
	public OvhPrice price_GET(String flavorId, String region) throws IOException {
		String qPath = "/cloud/price";
		qPath = query(qPath, "flavorId", flavorId);
		qPath = query(qPath, "region", region);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPrice.class);
	}
}