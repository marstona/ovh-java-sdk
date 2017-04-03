package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import net.minidev.ovh.api.complextype.OvhUnitAndValues;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.api.spare.xdsl.OvhXdslSpare;
import net.minidev.ovh.api.telephony.OvhRma;
import net.minidev.ovh.api.xdsl.OvhAccess;
import net.minidev.ovh.api.xdsl.OvhAccessDiagnostic;
import net.minidev.ovh.api.xdsl.OvhAccessStatisticsTypeEnum;
import net.minidev.ovh.api.xdsl.OvhAsyncTask;
import net.minidev.ovh.api.xdsl.OvhConnectedDevice;
import net.minidev.ovh.api.xdsl.OvhDHCP;
import net.minidev.ovh.api.xdsl.OvhDHCPStaticAddress;
import net.minidev.ovh.api.xdsl.OvhDeconsolidationTerms;
import net.minidev.ovh.api.xdsl.OvhDslamLineProfile;
import net.minidev.ovh.api.xdsl.OvhDslamPort;
import net.minidev.ovh.api.xdsl.OvhDslamPortLog;
import net.minidev.ovh.api.xdsl.OvhExtraIpRangeMove;
import net.minidev.ovh.api.xdsl.OvhIP;
import net.minidev.ovh.api.xdsl.OvhIncident;
import net.minidev.ovh.api.xdsl.OvhLAN;
import net.minidev.ovh.api.xdsl.OvhLine;
import net.minidev.ovh.api.xdsl.OvhLineStatisticsTypeEnum;
import net.minidev.ovh.api.xdsl.OvhLns;
import net.minidev.ovh.api.xdsl.OvhModem;
import net.minidev.ovh.api.xdsl.OvhModemInfo;
import net.minidev.ovh.api.xdsl.OvhMonitoringNotification;
import net.minidev.ovh.api.xdsl.OvhPPPMigrationInfo;
import net.minidev.ovh.api.xdsl.OvhPendingAction;
import net.minidev.ovh.api.xdsl.OvhPortMapping;
import net.minidev.ovh.api.xdsl.OvhRadiusConnectionLog;
import net.minidev.ovh.api.xdsl.OvhResiliationFollowUpDetail;
import net.minidev.ovh.api.xdsl.OvhResiliationSurvey;
import net.minidev.ovh.api.xdsl.OvhResiliationTerms;
import net.minidev.ovh.api.xdsl.OvhServiceStatusEnum;
import net.minidev.ovh.api.xdsl.OvhStatisticsPeriodEnum;
import net.minidev.ovh.api.xdsl.OvhTask;
import net.minidev.ovh.api.xdsl.OvhTaskStatusEnum;
import net.minidev.ovh.api.xdsl.OvhTimestampAndValue;
import net.minidev.ovh.api.xdsl.OvhWLAN;
import net.minidev.ovh.api.xdsl.eligibility.OvhCity;
import net.minidev.ovh.api.xdsl.eligibility.OvhStreet;
import net.minidev.ovh.api.xdsl.linediagnostic.OvhAnswers;
import net.minidev.ovh.api.xdsl.linediagnostic.OvhCustomerActionsEnum;
import net.minidev.ovh.api.xdsl.linediagnostic.OvhDiagnostic;
import net.minidev.ovh.api.xdsl.linediagnostic.OvhFaultTypeEnum;
import net.minidev.ovh.api.xdsl.monitoringnotifications.OvhFrequencyEnum;
import net.minidev.ovh.api.xdsl.monitoringnotifications.OvhTypeEnum;
import net.minidev.ovh.api.xdsl.orderfollowup.OvhStep;
import net.minidev.ovh.api.xdsl.xdslmodemconfig.OvhProtocolTypeEnum;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/xdsl
 * version:1.0
 */
public class ApiOvhXdsl extends ApiOvhBase {
	public ApiOvhXdsl(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /xdsl/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /xdsl/{serviceName}/serviceInfos
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/xdsl/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /xdsl/{serviceName}
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhAccess serviceName_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAccess.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /xdsl/{serviceName}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public void serviceName_PUT(String serviceName, OvhAccess body) throws IOException {
		String qPath = "/xdsl/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * List the radius connection logs
	 * 
	 * REST: GET /xdsl/{serviceName}/radiusConnectionLogs
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<OvhRadiusConnectionLog> serviceName_radiusConnectionLogs_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/radiusConnectionLogs";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhRadiusConnectionLog>> t1 = new TypeReference<ArrayList<OvhRadiusConnectionLog>>() {};

	/**
	 * Get this object properties
	 * 
	 * REST: GET /xdsl/{serviceName}/incident
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhIncident serviceName_incident_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/incident";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhIncident.class);
	}

	/**
	 * Get various statistics about this access
	 * 
	 * REST: GET /xdsl/{serviceName}/statistics
	 * @param period [required]
	 * @param type [required]
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhUnitAndValues<OvhTimestampAndValue> serviceName_statistics_GET(String serviceName, OvhStatisticsPeriodEnum period, OvhAccessStatisticsTypeEnum type) throws IOException {
		String qPath = "/xdsl/{serviceName}/statistics";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "period", period);
		qPath = query(qPath, "type", type);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}
	private static TypeReference<OvhUnitAndValues<OvhTimestampAndValue>> t2 = new TypeReference<OvhUnitAndValues<OvhTimestampAndValue>>() {};

	/**
	 * Renew PPP password and send the PPP login informations to the e-mail of the nicAdmin
	 * 
	 * REST: POST /xdsl/{serviceName}/requestPPPLoginMail
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public void serviceName_requestPPPLoginMail_POST(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/requestPPPLoginMail";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("POST", qPath);
	}

	/**
	 * The lines of the access
	 * 
	 * REST: GET /xdsl/{serviceName}/lines
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<String> serviceName_lines_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/lines";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<String>> t3 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Get this object properties
	 * 
	 * REST: GET /xdsl/{serviceName}/lines/{number}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param number [required] The number of the line
	 */
	public OvhLine serviceName_lines_number_GET(String serviceName, String number) throws IOException {
		String qPath = "/xdsl/{serviceName}/lines/{number}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{number}", number);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhLine.class);
	}

	/**
	 * Get various statistics about the line
	 * 
	 * REST: GET /xdsl/{serviceName}/lines/{number}/statistics
	 * @param period [required]
	 * @param type [required]
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param number [required] The number of the line
	 */
	public OvhUnitAndValues<OvhTimestampAndValue> serviceName_lines_number_statistics_GET(String serviceName, String number, OvhStatisticsPeriodEnum period, OvhLineStatisticsTypeEnum type) throws IOException {
		String qPath = "/xdsl/{serviceName}/lines/{number}/statistics";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{number}", number);
		qPath = query(qPath, "period", period);
		qPath = query(qPath, "type", type);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Update and get advanced diagnostic of the line
	 * 
	 * REST: POST /xdsl/{serviceName}/lines/{number}/diagnostic/run
	 * @param actionsDone [required] Customer possible actions
	 * @param faultType [required] [default=noSync] Line diagnostic type. Depends of problem
	 * @param answers [required] Customer answers for line diagnostic
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param number [required] The number of the line
	 */
	public OvhDiagnostic serviceName_lines_number_diagnostic_run_POST(String serviceName, String number, OvhCustomerActionsEnum[] actionsDone, OvhFaultTypeEnum faultType, OvhAnswers answers) throws IOException {
		String qPath = "/xdsl/{serviceName}/lines/{number}/diagnostic/run";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{number}", number);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "actionsDone", actionsDone);
		addBody(o, "faultType", faultType);
		addBody(o, "answers", answers);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhDiagnostic.class);
	}

	/**
	 * Cancel line diagnostic if possible
	 * 
	 * REST: POST /xdsl/{serviceName}/lines/{number}/diagnostic/cancel
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param number [required] The number of the line
	 */
	public void serviceName_lines_number_diagnostic_cancel_POST(String serviceName, String number) throws IOException {
		String qPath = "/xdsl/{serviceName}/lines/{number}/diagnostic/cancel";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{number}", number);
		exec("POST", qPath);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /xdsl/{serviceName}/lines/{number}/dslamPort
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param number [required] The number of the line
	 */
	public OvhDslamPort serviceName_lines_number_dslamPort_GET(String serviceName, String number) throws IOException {
		String qPath = "/xdsl/{serviceName}/lines/{number}/dslamPort";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{number}", number);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDslamPort.class);
	}

	/**
	 * List all availables profiles for this port
	 * 
	 * REST: GET /xdsl/{serviceName}/lines/{number}/dslamPort/availableProfiles
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param number [required] The number of the line
	 */
	public ArrayList<OvhDslamLineProfile> serviceName_lines_number_dslamPort_availableProfiles_GET(String serviceName, String number) throws IOException {
		String qPath = "/xdsl/{serviceName}/lines/{number}/dslamPort/availableProfiles";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{number}", number);
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhDslamLineProfile>> t4 = new TypeReference<ArrayList<OvhDslamLineProfile>>() {};

	/**
	 * Reset the port on the DSLAM
	 * 
	 * REST: POST /xdsl/{serviceName}/lines/{number}/dslamPort/reset
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param number [required] The number of the line
	 */
	public OvhTask serviceName_lines_number_dslamPort_reset_POST(String serviceName, String number) throws IOException {
		String qPath = "/xdsl/{serviceName}/lines/{number}/dslamPort/reset";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{number}", number);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Change the profile of the port
	 * 
	 * REST: POST /xdsl/{serviceName}/lines/{number}/dslamPort/changeProfile
	 * @param dslamProfileId [required] The id of the xdsl.DslamLineProfile
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param number [required] The number of the line
	 */
	public OvhTask serviceName_lines_number_dslamPort_changeProfile_POST(String serviceName, String number, Long dslamProfileId) throws IOException {
		String qPath = "/xdsl/{serviceName}/lines/{number}/dslamPort/changeProfile";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{number}", number);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "dslamProfileId", dslamProfileId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get the logs emitted by the DSLAM for this port
	 * 
	 * REST: GET /xdsl/{serviceName}/lines/{number}/dslamPort/logs
	 * @param limit [required] [default=50]
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param number [required] The number of the line
	 */
	public ArrayList<OvhDslamPortLog> serviceName_lines_number_dslamPort_logs_GET(String serviceName, String number, Long limit) throws IOException {
		String qPath = "/xdsl/{serviceName}/lines/{number}/dslamPort/logs";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{number}", number);
		qPath = query(qPath, "limit", limit);
		String resp = exec("GET", qPath);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<OvhDslamPortLog>> t5 = new TypeReference<ArrayList<OvhDslamPortLog>>() {};

	/**
	 * Switch this access to total deconsolidation
	 * 
	 * REST: POST /xdsl/{serviceName}/requestTotalDeconsolidation
	 * @param rio [required] A token to prove the ownership of the line number, needed to port the number
	 * @param noPortability [required] Do not port the number
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhTask serviceName_requestTotalDeconsolidation_POST(String serviceName, String rio, Boolean noPortability) throws IOException {
		String qPath = "/xdsl/{serviceName}/requestTotalDeconsolidation";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "rio", rio);
		addBody(o, "noPortability", noPortability);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /xdsl/{serviceName}/modem
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhModem serviceName_modem_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhModem.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /xdsl/{serviceName}/modem
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public void serviceName_modem_PUT(String serviceName, OvhModem body) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Change the status of the Upnp on modem
	 * 
	 * REST: POST /xdsl/{serviceName}/modem/upnp
	 * @param upnp [required] the new status of the upnp service
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhTask serviceName_modem_upnp_POST(String serviceName, OvhServiceStatusEnum upnp) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/upnp";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "upnp", upnp);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get the status of the Upnp on modem
	 * 
	 * REST: GET /xdsl/{serviceName}/modem/upnp
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhServiceStatusEnum serviceName_modem_upnp_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/upnp";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhServiceStatusEnum.class);
	}

	/**
	 * Change the status of the ftp service on modem
	 * 
	 * REST: POST /xdsl/{serviceName}/modem/ftp
	 * @param ftp [required] the new status of the ftp service
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhTask serviceName_modem_ftp_POST(String serviceName, OvhServiceStatusEnum ftp) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/ftp";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ftp", ftp);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get the status of ftp service on modem
	 * 
	 * REST: GET /xdsl/{serviceName}/modem/ftp
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhServiceStatusEnum serviceName_modem_ftp_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/ftp";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhServiceStatusEnum.class);
	}

	/**
	 * Change the status of the sip alg service on modem
	 * 
	 * REST: POST /xdsl/{serviceName}/modem/sipAlg
	 * @param sipAlg [required] the new status of the sip alg service
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhTask serviceName_modem_sipAlg_POST(String serviceName, OvhServiceStatusEnum sipAlg) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/sipAlg";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "sipAlg", sipAlg);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get the status of sip alg service on modem
	 * 
	 * REST: GET /xdsl/{serviceName}/modem/sipAlg
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhServiceStatusEnum serviceName_modem_sipAlg_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/sipAlg";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhServiceStatusEnum.class);
	}

	/**
	 * Change the status of contentSharing on modem
	 * 
	 * REST: POST /xdsl/{serviceName}/modem/contentSharing
	 * @param contentSharing [required] the new status of the contentSharing service
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhTask serviceName_modem_contentSharing_POST(String serviceName, OvhServiceStatusEnum contentSharing) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/contentSharing";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contentSharing", contentSharing);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get the status of contentSharing on modem
	 * 
	 * REST: GET /xdsl/{serviceName}/modem/contentSharing
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhServiceStatusEnum serviceName_modem_contentSharing_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/contentSharing";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhServiceStatusEnum.class);
	}

	/**
	 * Reset the modem to its default configuration
	 * 
	 * REST: POST /xdsl/{serviceName}/modem/reset
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhTask serviceName_modem_reset_POST(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/reset";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Refresh the list of connected devices on the modem
	 * 
	 * REST: POST /xdsl/{serviceName}/modem/refreshConnectedDevices
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhTask serviceName_modem_refreshConnectedDevices_POST(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/refreshConnectedDevices";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Remove all the current port mapping rules and set the same config as the access given in parameters
	 * 
	 * REST: POST /xdsl/{serviceName}/modem/duplicatePortMappingConfig
	 * @param accessName [required] The access name with the config you want to duplicate
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public void serviceName_modem_duplicatePortMappingConfig_POST(String serviceName, String accessName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/duplicatePortMappingConfig";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "accessName", accessName);
		exec("POST", qPath, o);
	}

	/**
	 * List of LANs on this modem
	 * 
	 * REST: GET /xdsl/{serviceName}/modem/lan
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<String> serviceName_modem_lan_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/lan";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /xdsl/{serviceName}/modem/lan/{lanName}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param lanName [required] Name of the LAN
	 */
	public OvhLAN serviceName_modem_lan_lanName_GET(String serviceName, String lanName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/lan/{lanName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{lanName}", lanName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhLAN.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /xdsl/{serviceName}/modem/lan/{lanName}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param lanName [required] Name of the LAN
	 */
	public void serviceName_modem_lan_lanName_PUT(String serviceName, String lanName, OvhLAN body) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/lan/{lanName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{lanName}", lanName);
		exec("PUT", qPath, body);
	}

	/**
	 * List of DHCP on this modem
	 * 
	 * REST: GET /xdsl/{serviceName}/modem/lan/{lanName}/dhcp
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param lanName [required] Name of the LAN
	 */
	public ArrayList<String> serviceName_modem_lan_lanName_dhcp_GET(String serviceName, String lanName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/lan/{lanName}/dhcp";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{lanName}", lanName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param lanName [required] Name of the LAN
	 * @param dhcpName [required] Name of the DHCP
	 */
	public OvhDHCP serviceName_modem_lan_lanName_dhcp_dhcpName_GET(String serviceName, String lanName, String dhcpName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{lanName}", lanName);
		qPath = qPath.replace("{dhcpName}", dhcpName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDHCP.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param lanName [required] Name of the LAN
	 * @param dhcpName [required] Name of the DHCP
	 */
	public void serviceName_modem_lan_lanName_dhcp_dhcpName_PUT(String serviceName, String lanName, String dhcpName, OvhDHCP body) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{lanName}", lanName);
		qPath = qPath.replace("{dhcpName}", dhcpName);
		exec("PUT", qPath, body);
	}

	/**
	 * List of DHCP Static Address of this modem
	 * 
	 * REST: GET /xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}/DHCPStaticAddresses
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param lanName [required] Name of the LAN
	 * @param dhcpName [required] Name of the DHCP
	 */
	public ArrayList<String> serviceName_modem_lan_lanName_dhcp_dhcpName_DHCPStaticAddresses_GET(String serviceName, String lanName, String dhcpName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}/DHCPStaticAddresses";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{lanName}", lanName);
		qPath = qPath.replace("{dhcpName}", dhcpName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Add a DHCP static lease
	 * 
	 * REST: POST /xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}/DHCPStaticAddresses
	 * @param MACAddress [required] The MAC address of the device
	 * @param IPAddress [required] The IP address of the device
	 * @param name [required] Name of the DHCP static lease
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param lanName [required] Name of the LAN
	 * @param dhcpName [required] Name of the DHCP
	 */
	public OvhDHCPStaticAddress serviceName_modem_lan_lanName_dhcp_dhcpName_DHCPStaticAddresses_POST(String serviceName, String lanName, String dhcpName, String MACAddress, String IPAddress, String name) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}/DHCPStaticAddresses";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{lanName}", lanName);
		qPath = qPath.replace("{dhcpName}", dhcpName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "MACAddress", MACAddress);
		addBody(o, "IPAddress", IPAddress);
		addBody(o, "name", name);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhDHCPStaticAddress.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}/DHCPStaticAddresses/{MACAddress}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param lanName [required] Name of the LAN
	 * @param dhcpName [required] Name of the DHCP
	 * @param MACAddress [required] The MAC address of the device
	 */
	public OvhDHCPStaticAddress serviceName_modem_lan_lanName_dhcp_dhcpName_DHCPStaticAddresses_MACAddress_GET(String serviceName, String lanName, String dhcpName, String MACAddress) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}/DHCPStaticAddresses/{MACAddress}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{lanName}", lanName);
		qPath = qPath.replace("{dhcpName}", dhcpName);
		qPath = qPath.replace("{MACAddress}", MACAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDHCPStaticAddress.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}/DHCPStaticAddresses/{MACAddress}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param lanName [required] Name of the LAN
	 * @param dhcpName [required] Name of the DHCP
	 * @param MACAddress [required] The MAC address of the device
	 */
	public void serviceName_modem_lan_lanName_dhcp_dhcpName_DHCPStaticAddresses_MACAddress_PUT(String serviceName, String lanName, String dhcpName, String MACAddress, OvhDHCPStaticAddress body) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}/DHCPStaticAddresses/{MACAddress}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{lanName}", lanName);
		qPath = qPath.replace("{dhcpName}", dhcpName);
		qPath = qPath.replace("{MACAddress}", MACAddress);
		exec("PUT", qPath, body);
	}

	/**
	 * Delete this port mapping
	 * 
	 * REST: DELETE /xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}/DHCPStaticAddresses/{MACAddress}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param lanName [required] Name of the LAN
	 * @param dhcpName [required] Name of the DHCP
	 * @param MACAddress [required] The MAC address of the device
	 */
	public OvhTask serviceName_modem_lan_lanName_dhcp_dhcpName_DHCPStaticAddresses_MACAddress_DELETE(String serviceName, String lanName, String dhcpName, String MACAddress) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/lan/{lanName}/dhcp/{dhcpName}/DHCPStaticAddresses/{MACAddress}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{lanName}", lanName);
		qPath = qPath.replace("{dhcpName}", dhcpName);
		qPath = qPath.replace("{MACAddress}", MACAddress);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Reboot the modem
	 * 
	 * REST: POST /xdsl/{serviceName}/modem/reboot
	 * @param todoDate [required] Date when the reboot will start
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhTask serviceName_modem_reboot_POST(String serviceName, Date todoDate) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/reboot";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "todoDate", todoDate);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * get general Modem information
	 * 
	 * REST: POST /xdsl/{serviceName}/modem/retrieveInfo
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhAsyncTask<OvhModemInfo> serviceName_modem_retrieveInfo_POST(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/retrieveInfo";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, t6);
	}
	private static TypeReference<OvhAsyncTask<OvhModemInfo>> t6 = new TypeReference<OvhAsyncTask<OvhModemInfo>>() {};

	/**
	 * List of PortMappings on this modem
	 * 
	 * REST: GET /xdsl/{serviceName}/modem/portMappings
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<String> serviceName_modem_portMappings_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/portMappings";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Add a port mapping
	 * 
	 * REST: POST /xdsl/{serviceName}/modem/portMappings
	 * @param protocol [required] Protocol of the port mapping (TCP / UDP)
	 * @param name [required] Name of the port mapping entry
	 * @param description [required] Description of the Port Mapping
	 * @param externalPortStart [required] External Port that the modem will listen on
	 * @param externalPortEnd [required] The last port of the interval on the External Client that will get the connections
	 * @param internalClient [required] The IP address of the destination of the packets
	 * @param internalPort [required] The port on the Internal Client that will get the connections
	 * @param allowedRemoteIp [required] An ip which will access to the defined rule. Default : no restriction applied
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhPortMapping serviceName_modem_portMappings_POST(String serviceName, OvhProtocolTypeEnum protocol, String name, String description, Long externalPortStart, Long externalPortEnd, String internalClient, Long internalPort, String allowedRemoteIp) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/portMappings";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "protocol", protocol);
		addBody(o, "name", name);
		addBody(o, "description", description);
		addBody(o, "externalPortStart", externalPortStart);
		addBody(o, "externalPortEnd", externalPortEnd);
		addBody(o, "internalClient", internalClient);
		addBody(o, "internalPort", internalPort);
		addBody(o, "allowedRemoteIp", allowedRemoteIp);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhPortMapping.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /xdsl/{serviceName}/modem/portMappings/{name}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param name [required] Name of the port mapping entry
	 */
	public OvhPortMapping serviceName_modem_portMappings_name_GET(String serviceName, String name) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/portMappings/{name}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPortMapping.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /xdsl/{serviceName}/modem/portMappings/{name}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param name [required] Name of the port mapping entry
	 */
	public void serviceName_modem_portMappings_name_PUT(String serviceName, String name, OvhPortMapping body) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/portMappings/{name}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		exec("PUT", qPath, body);
	}

	/**
	 * Delete this port mapping
	 * 
	 * REST: DELETE /xdsl/{serviceName}/modem/portMappings/{name}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param name [required] Name of the port mapping entry
	 */
	public OvhTask serviceName_modem_portMappings_name_DELETE(String serviceName, String name) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/portMappings/{name}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List of devices connected on this modem
	 * 
	 * REST: GET /xdsl/{serviceName}/modem/connectedDevices
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<String> serviceName_modem_connectedDevices_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/connectedDevices";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /xdsl/{serviceName}/modem/connectedDevices/{macAddress}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param macAddress [required] MAC address of the device
	 */
	public OvhConnectedDevice serviceName_modem_connectedDevices_macAddress_GET(String serviceName, String macAddress) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/connectedDevices/{macAddress}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{macAddress}", macAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhConnectedDevice.class);
	}

	/**
	 * Change the status of the Bloc IP on modem
	 * 
	 * REST: POST /xdsl/{serviceName}/modem/blocIp
	 * @param status [required] the new status of the bloc ip service
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhTask serviceName_modem_blocIp_POST(String serviceName, OvhServiceStatusEnum status) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/blocIp";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "status", status);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get the status of the Bloc IP on modem
	 * 
	 * REST: GET /xdsl/{serviceName}/modem/blocIp
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhServiceStatusEnum serviceName_modem_blocIp_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/blocIp";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhServiceStatusEnum.class);
	}

	/**
	 * List of WLANs on this modem
	 * 
	 * REST: GET /xdsl/{serviceName}/modem/wifi
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<String> serviceName_modem_wifi_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/wifi";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /xdsl/{serviceName}/modem/wifi/{wifiName}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param wifiName [required] Name of the Wifi
	 */
	public OvhWLAN serviceName_modem_wifi_wifiName_GET(String serviceName, String wifiName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/wifi/{wifiName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{wifiName}", wifiName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhWLAN.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /xdsl/{serviceName}/modem/wifi/{wifiName}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param wifiName [required] Name of the Wifi
	 */
	public void serviceName_modem_wifi_wifiName_PUT(String serviceName, String wifiName, OvhWLAN body) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/wifi/{wifiName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{wifiName}", wifiName);
		exec("PUT", qPath, body);
	}

	/**
	 * Change the status of callWaiting on modem
	 * 
	 * REST: POST /xdsl/{serviceName}/modem/callWaiting
	 * @param callWaiting [required] the new status of the callWaiting service
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhTask serviceName_modem_callWaiting_POST(String serviceName, OvhServiceStatusEnum callWaiting) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/callWaiting";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "callWaiting", callWaiting);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get the status of callWaiting on modem
	 * 
	 * REST: GET /xdsl/{serviceName}/modem/callWaiting
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhServiceStatusEnum serviceName_modem_callWaiting_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/callWaiting";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhServiceStatusEnum.class);
	}

	/**
	 * Remove all the current port mapping rules
	 * 
	 * REST: POST /xdsl/{serviceName}/modem/resetPortMappingConfig
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public void serviceName_modem_resetPortMappingConfig_POST(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/modem/resetPortMappingConfig";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("POST", qPath);
	}

	/**
	 * Launch a contact change procedure
	 * 
	 * REST: POST /xdsl/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/xdsl/{serviceName}/changeContact";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, t7);
	}
	private static TypeReference<ArrayList<Long>> t7 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * List available LNS for this access
	 * 
	 * REST: GET /xdsl/{serviceName}/availableLns
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<OvhLns> serviceName_availableLns_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/availableLns";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t8);
	}
	private static TypeReference<ArrayList<OvhLns>> t8 = new TypeReference<ArrayList<OvhLns>>() {};

	/**
	 * List of IPs addresses for this access
	 * 
	 * REST: GET /xdsl/{serviceName}/ips
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<String> serviceName_ips_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/ips";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Order an extra /29 range of IPv4 addresses
	 * 
	 * REST: POST /xdsl/{serviceName}/ips
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhTask serviceName_ips_POST(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/ips";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /xdsl/{serviceName}/ips/{ip}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param ip [required] The IP address
	 */
	public OvhIP serviceName_ips_ip_GET(String serviceName, String ip) throws IOException {
		String qPath = "/xdsl/{serviceName}/ips/{ip}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{ip}", ip);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhIP.class);
	}

	/**
	 * Stop renewing this extra IPv4 option
	 * 
	 * REST: DELETE /xdsl/{serviceName}/ips/{ip}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param ip [required] The IP address
	 */
	public void serviceName_ips_ip_DELETE(String serviceName, String ip) throws IOException {
		String qPath = "/xdsl/{serviceName}/ips/{ip}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{ip}", ip);
		exec("DELETE", qPath);
	}

	/**
	 * Get information about the ongoing resiliation
	 * 
	 * REST: GET /xdsl/{serviceName}/resiliationFollowup
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhResiliationFollowUpDetail serviceName_resiliationFollowup_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/resiliationFollowup";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhResiliationFollowUpDetail.class);
	}

	/**
	 * Check if the access can migrate in PPP for the migration IPoE to PPP
	 * 
	 * REST: GET /xdsl/{serviceName}/canMigrateToPPP
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhPPPMigrationInfo serviceName_canMigrateToPPP_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/canMigrateToPPP";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPPPMigrationInfo.class);
	}

	/**
	 * Change the status of the IPv6 for this access
	 * 
	 * REST: POST /xdsl/{serviceName}/ipv6
	 * @param enabled [required] Should the IPv6 be enabled ?
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhTask serviceName_ipv6_POST(String serviceName, Boolean enabled) throws IOException {
		String qPath = "/xdsl/{serviceName}/ipv6";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "enabled", enabled);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Migrate the access from IPoE protocol to PPP
	 * 
	 * REST: POST /xdsl/{serviceName}/migrateToPPP
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public void serviceName_migrateToPPP_POST(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/migrateToPPP";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("POST", qPath);
	}

	/**
	 * Tasks scheduled for this access
	 * 
	 * REST: GET /xdsl/{serviceName}/tasks
	 * @param function [required] Filter the value of function property (=)
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<Long> serviceName_tasks_GET(String serviceName, String function, OvhTaskStatusEnum status) throws IOException {
		String qPath = "/xdsl/{serviceName}/tasks";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "function", function);
		qPath = query(qPath, "status", status);
		String resp = exec("GET", qPath);
		return convertTo(resp, t7);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /xdsl/{serviceName}/tasks/{id}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param id [required] Id of the object
	 */
	public OvhTask serviceName_tasks_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/xdsl/{serviceName}/tasks/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Delete the task in problem from the results
	 * 
	 * REST: POST /xdsl/{serviceName}/tasks/{id}/archive
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param id [required] Id of the object
	 */
	public void serviceName_tasks_id_archive_POST(String serviceName, Long id) throws IOException {
		String qPath = "/xdsl/{serviceName}/tasks/{id}/archive";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		exec("POST", qPath);
	}

	/**
	 * Give the price to requestTotalDeconsolidation on the access
	 * 
	 * REST: GET /xdsl/{serviceName}/totalDeconsolidationTerms
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhDeconsolidationTerms serviceName_totalDeconsolidationTerms_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/totalDeconsolidationTerms";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDeconsolidationTerms.class);
	}

	/**
	 * Get information about the ongoing resiliation
	 * 
	 * REST: GET /xdsl/{serviceName}/canCancelResiliation
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public Boolean serviceName_canCancelResiliation_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/canCancelResiliation";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, Boolean.class);
	}

	/**
	 * Change the LNS of the access
	 * 
	 * REST: POST /xdsl/{serviceName}/changeLns
	 * @param lnsName [required] The name from xdsl.Lns
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhTask serviceName_changeLns_POST(String serviceName, String lnsName) throws IOException {
		String qPath = "/xdsl/{serviceName}/changeLns";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "lnsName", lnsName);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Informations about the extra IP range during address move
	 * 
	 * REST: GET /xdsl/{serviceName}/addressMove/extraIpRange
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhExtraIpRangeMove serviceName_addressMove_extraIpRange_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/addressMove/extraIpRange";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExtraIpRangeMove.class);
	}

	/**
	 * Initiate the extra IP range migration
	 * 
	 * REST: POST /xdsl/{serviceName}/addressMove/extraIpRangeMove
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhTask serviceName_addressMove_extraIpRangeMove_POST(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/addressMove/extraIpRangeMove";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get the status of the order
	 * 
	 * REST: GET /xdsl/{serviceName}/orderFollowup
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<OvhStep> serviceName_orderFollowup_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/orderFollowup";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t9);
	}
	private static TypeReference<ArrayList<OvhStep>> t9 = new TypeReference<ArrayList<OvhStep>>() {};

	/**
	 * Get this object properties
	 * 
	 * REST: GET /xdsl/{serviceName}/pendingAction
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhPendingAction serviceName_pendingAction_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/pendingAction";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPendingAction.class);
	}

	/**
	 * Cancel the ongoing resiliation
	 * 
	 * REST: POST /xdsl/{serviceName}/cancelResiliation
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public void serviceName_cancelResiliation_POST(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/cancelResiliation";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("POST", qPath);
	}

	/**
	 * List the notifications for this access
	 * 
	 * REST: GET /xdsl/{serviceName}/monitoringNotifications
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<Long> serviceName_monitoringNotifications_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/monitoringNotifications";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t7);
	}

	/**
	 * Add a notification
	 * 
	 * REST: POST /xdsl/{serviceName}/monitoringNotifications
	 * @param smsAccount [required] The SMS account which will be debited for each sent SMS, if the type is sms
	 * @param email [required] The e-mail address, if type is mail
	 * @param frequency [required]
	 * @param downThreshold [required] [default=120] The number of seconds the access has to be down to trigger the alert
	 * @param allowIncident [required] [default=true] Whether or not to allow notifications concerning generic incidents
	 * @param type [required]
	 * @param phone [required] The phone number, if type is sms
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhMonitoringNotification serviceName_monitoringNotifications_POST(String serviceName, String smsAccount, String email, OvhFrequencyEnum frequency, Long downThreshold, Boolean allowIncident, OvhTypeEnum type, String phone) throws IOException {
		String qPath = "/xdsl/{serviceName}/monitoringNotifications";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "smsAccount", smsAccount);
		addBody(o, "email", email);
		addBody(o, "frequency", frequency);
		addBody(o, "downThreshold", downThreshold);
		addBody(o, "allowIncident", allowIncident);
		addBody(o, "type", type);
		addBody(o, "phone", phone);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhMonitoringNotification.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /xdsl/{serviceName}/monitoringNotifications/{id}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param id [required] Id of the object
	 */
	public OvhMonitoringNotification serviceName_monitoringNotifications_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/xdsl/{serviceName}/monitoringNotifications/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhMonitoringNotification.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /xdsl/{serviceName}/monitoringNotifications/{id}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param id [required] Id of the object
	 */
	public void serviceName_monitoringNotifications_id_PUT(String serviceName, Long id, OvhMonitoringNotification body) throws IOException {
		String qPath = "/xdsl/{serviceName}/monitoringNotifications/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		exec("PUT", qPath, body);
	}

	/**
	 * Delete this notification
	 * 
	 * REST: DELETE /xdsl/{serviceName}/monitoringNotifications/{id}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param id [required] Id of the object
	 */
	public void serviceName_monitoringNotifications_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/xdsl/{serviceName}/monitoringNotifications/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		exec("DELETE", qPath);
	}

	/**
	 * Resiliate the access
	 * 
	 * REST: POST /xdsl/{serviceName}/resiliate
	 * @param resiliationSurvey [required] Comment about resiliation reasons
	 * @param resiliationDate [required] The desired resiliation date
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhResiliationFollowUpDetail serviceName_resiliate_POST(String serviceName, OvhResiliationSurvey resiliationSurvey, Date resiliationDate) throws IOException {
		String qPath = "/xdsl/{serviceName}/resiliate";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "resiliationSurvey", resiliationSurvey);
		addBody(o, "resiliationDate", resiliationDate);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhResiliationFollowUpDetail.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /xdsl/{serviceName}/diagnostic
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhAccessDiagnostic serviceName_diagnostic_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/diagnostic";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAccessDiagnostic.class);
	}

	/**
	 * Run diagnostic on the access
	 * 
	 * REST: POST /xdsl/{serviceName}/diagnostic
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhTask serviceName_diagnostic_POST(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/diagnostic";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Return Merchandise Authorisation associated
	 * 
	 * REST: GET /xdsl/{serviceName}/rma
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public ArrayList<String> serviceName_rma_GET(String serviceName) throws IOException {
		String qPath = "/xdsl/{serviceName}/rma";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /xdsl/{serviceName}/rma/{id}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param id [required] Return merchandise authorisation identifier
	 */
	public OvhRma serviceName_rma_id_GET(String serviceName, String id) throws IOException {
		String qPath = "/xdsl/{serviceName}/rma/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhRma.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /xdsl/{serviceName}/rma/{id}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param id [required] Return merchandise authorisation identifier
	 */
	public void serviceName_rma_id_PUT(String serviceName, String id, OvhRma body) throws IOException {
		String qPath = "/xdsl/{serviceName}/rma/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id);
		exec("PUT", qPath, body);
	}

	/**
	 * Cancel the rma
	 * 
	 * REST: DELETE /xdsl/{serviceName}/rma/{id}
	 * @param serviceName [required] The internal name of your XDSL offer
	 * @param id [required] Return merchandise authorisation identifier
	 */
	public void serviceName_rma_id_DELETE(String serviceName, String id) throws IOException {
		String qPath = "/xdsl/{serviceName}/rma/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id);
		exec("DELETE", qPath);
	}

	/**
	 * Get resiliation terms
	 * 
	 * REST: GET /xdsl/{serviceName}/resiliationTerms
	 * @param resiliationDate [required] The desired resiliation date
	 * @param serviceName [required] The internal name of your XDSL offer
	 */
	public OvhResiliationTerms serviceName_resiliationTerms_GET(String serviceName, Date resiliationDate) throws IOException {
		String qPath = "/xdsl/{serviceName}/resiliationTerms";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "resiliationDate", resiliationDate);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhResiliationTerms.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /xdsl
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/xdsl";
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Get the streets from a city inseeCode and partial street name
	 * 
	 * REST: GET /xdsl/eligibility/streets
	 * @param partialName [required] The partial name to match against the name of the street
	 * @param inseeCode [required] The inseeCode of the city
	 */
	public ArrayList<OvhStreet> eligibility_streets_GET(String inseeCode, String partialName) throws IOException {
		String qPath = "/xdsl/eligibility/streets";
		qPath = query(qPath, "inseeCode", inseeCode);
		qPath = query(qPath, "partialName", partialName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t10);
	}
	private static TypeReference<ArrayList<OvhStreet>> t10 = new TypeReference<ArrayList<OvhStreet>>() {};

	/**
	 * Get the cities from a zipCode
	 * 
	 * REST: GET /xdsl/eligibility/cities
	 * @param zipCode [required] The zipCode of the city
	 */
	public ArrayList<OvhCity> eligibility_cities_GET(String zipCode) throws IOException {
		String qPath = "/xdsl/eligibility/cities";
		qPath = query(qPath, "zipCode", zipCode);
		String resp = exec("GET", qPath);
		return convertTo(resp, t11);
	}
	private static TypeReference<ArrayList<OvhCity>> t11 = new TypeReference<ArrayList<OvhCity>>() {};

	/**
	 * List of incidents
	 * 
	 * REST: GET /xdsl/incidents
	 * @param creationDate [required] Filter the value of creationDate property (>)
	 * @param endDate [required] Filter the value of endDate property (<)
	 */
	public ArrayList<Long> incidents_GET(Date creationDate, Date endDate) throws IOException {
		String qPath = "/xdsl/incidents";
		qPath = query(qPath, "creationDate", creationDate);
		qPath = query(qPath, "endDate", endDate);
		String resp = execN("GET", qPath);
		return convertTo(resp, t7);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /xdsl/incidents/{id}
	 * @param id [required] ID of the incident
	 */
	public OvhIncident incidents_id_GET(Long id) throws IOException {
		String qPath = "/xdsl/incidents/{id}";
		qPath = qPath.replace("{id}", id.toString());
		String resp = execN("GET", qPath);
		return convertTo(resp, OvhIncident.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /xdsl/spare
	 */
	public ArrayList<String> spare_GET() throws IOException {
		String qPath = "/xdsl/spare";
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /xdsl/spare/{spare}/serviceInfos
	 * @param spare [required] The internal name of your spare
	 */
	public OvhService spare_spare_serviceInfos_GET(String spare) throws IOException {
		String qPath = "/xdsl/spare/{spare}/serviceInfos";
		qPath = qPath.replace("{spare}", spare);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /xdsl/spare/{spare}/serviceInfos
	 * @param null [required] New object properties
	 * @param spare [required] The internal name of your spare
	 */
	public void spare_spare_serviceInfos_PUT(String spare, OvhService body) throws IOException {
		String qPath = "/xdsl/spare/{spare}/serviceInfos";
		qPath = qPath.replace("{spare}", spare);
		exec("PUT", qPath, body);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /xdsl/spare/{spare}
	 * @param spare [required] The internal name of your spare
	 */
	public OvhXdslSpare spare_spare_GET(String spare) throws IOException {
		String qPath = "/xdsl/spare/{spare}";
		qPath = qPath.replace("{spare}", spare);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhXdslSpare.class);
	}

	/**
	 * Delete the spare as if it was not belonging to OVH anymore
	 * 
	 * REST: DELETE /xdsl/spare/{spare}
	 * @param spare [required] The internal name of your spare
	 */
	public void spare_spare_DELETE(String spare) throws IOException {
		String qPath = "/xdsl/spare/{spare}";
		qPath = qPath.replace("{spare}", spare);
		exec("DELETE", qPath);
	}

	/**
	 * Replace the modem by its spare
	 * 
	 * REST: POST /xdsl/spare/{spare}/replace
	 * @param domain [required] The modem to replace by the spare
	 * @param spare [required] The internal name of your spare
	 */
	public void spare_spare_replace_POST(String spare, String domain) throws IOException {
		String qPath = "/xdsl/spare/{spare}/replace";
		qPath = qPath.replace("{spare}", spare);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "domain", domain);
		exec("POST", qPath, o);
	}

	/**
	 * Return the list of brand compatible to be replaced
	 * 
	 * REST: GET /xdsl/spare/{spare}/compatibleReplacement
	 * @param spare [required] The internal name of your spare
	 */
	public ArrayList<String> spare_spare_compatibleReplacement_GET(String spare) throws IOException {
		String qPath = "/xdsl/spare/{spare}/compatibleReplacement";
		qPath = qPath.replace("{spare}", spare);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Return the broken equipment in instantRefund
	 * 
	 * REST: POST /xdsl/spare/{spare}/returnMerchandise
	 * @param spare [required] The internal name of your spare
	 */
	public void spare_spare_returnMerchandise_POST(String spare) throws IOException {
		String qPath = "/xdsl/spare/{spare}/returnMerchandise";
		qPath = qPath.replace("{spare}", spare);
		exec("POST", qPath);
	}

	/**
	 * Get all available spare brands
	 * 
	 * REST: GET /xdsl/spare/brands
	 */
	public ArrayList<String> spare_brands_GET() throws IOException {
		String qPath = "/xdsl/spare/brands";
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}
}