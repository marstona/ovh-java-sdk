package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import net.minidev.ovh.api.complextype.OvhChartSerie;
import net.minidev.ovh.api.complextype.OvhChartTimestampValue;
import net.minidev.ovh.api.hosting.privatedatabase.OvhAvailableRamSizeEnum;
import net.minidev.ovh.api.hosting.privatedatabase.OvhOrderableVersionEnum;
import net.minidev.ovh.api.hosting.web.OvhAttachedDomain;
import net.minidev.ovh.api.hosting.web.OvhBoostHistory;
import net.minidev.ovh.api.hosting.web.OvhCapabilities;
import net.minidev.ovh.api.hosting.web.OvhCdn;
import net.minidev.ovh.api.hosting.web.OvhCron;
import net.minidev.ovh.api.hosting.web.OvhDatabase;
import net.minidev.ovh.api.hosting.web.OvhDump;
import net.minidev.ovh.api.hosting.web.OvhEmail;
import net.minidev.ovh.api.hosting.web.OvhExtrasqlperso;
import net.minidev.ovh.api.hosting.web.OvhFreedom;
import net.minidev.ovh.api.hosting.web.OvhIndy;
import net.minidev.ovh.api.hosting.web.OvhModule;
import net.minidev.ovh.api.hosting.web.OvhModuleList;
import net.minidev.ovh.api.hosting.web.OvhOfferCapabilitiesEnum;
import net.minidev.ovh.api.hosting.web.OvhOfferEnum;
import net.minidev.ovh.api.hosting.web.OvhOvhConfig;
import net.minidev.ovh.api.hosting.web.OvhRequestActionEnum;
import net.minidev.ovh.api.hosting.web.OvhService;
import net.minidev.ovh.api.hosting.web.OvhSsl;
import net.minidev.ovh.api.hosting.web.OvhStatisticsPeriodEnum;
import net.minidev.ovh.api.hosting.web.OvhStatisticsTypeEnum;
import net.minidev.ovh.api.hosting.web.OvhTask;
import net.minidev.ovh.api.hosting.web.OvhUser;
import net.minidev.ovh.api.hosting.web.OvhUserLogs;
import net.minidev.ovh.api.hosting.web.attacheddomain.OvhCdnEnum;
import net.minidev.ovh.api.hosting.web.attacheddomain.OvhFirewallEnum;
import net.minidev.ovh.api.hosting.web.backup.OvhTypeEnum;
import net.minidev.ovh.api.hosting.web.cron.OvhLanguageEnum;
import net.minidev.ovh.api.hosting.web.database.OvhAvailableVersionStruct;
import net.minidev.ovh.api.hosting.web.database.OvhCreationDatabaseCapabilities;
import net.minidev.ovh.api.hosting.web.database.OvhDatabaseCapabilitiesTypeEnum;
import net.minidev.ovh.api.hosting.web.database.OvhDatabaseTypeEnum;
import net.minidev.ovh.api.hosting.web.database.OvhDumpDateEnum;
import net.minidev.ovh.api.hosting.web.database.OvhExtraSqlQuotaEnum;
import net.minidev.ovh.api.hosting.web.database.OvhModeEnum;
import net.minidev.ovh.api.hosting.web.database.OvhVersionEnum;
import net.minidev.ovh.api.hosting.web.mail.OvhActionEnum;
import net.minidev.ovh.api.hosting.web.mail.OvhBounce;
import net.minidev.ovh.api.hosting.web.mail.OvhVolumeHistory;
import net.minidev.ovh.api.hosting.web.module.OvhBranchEnum;
import net.minidev.ovh.api.hosting.web.module.OvhDependencyType;
import net.minidev.ovh.api.hosting.web.ovhconfig.OvhAvailableEngineVersionEnum;
import net.minidev.ovh.api.hosting.web.ovhconfig.OvhContainerEnum;
import net.minidev.ovh.api.hosting.web.ovhconfig.OvhEngineNameEnum;
import net.minidev.ovh.api.hosting.web.ovhconfig.OvhEnvironmentEnum;
import net.minidev.ovh.api.hosting.web.ovhconfig.OvhHttpFirewallEnum;
import net.minidev.ovh.api.hosting.web.task.OvhStatusEnum;
import net.minidev.ovh.api.hosting.web.user.OvhSshStateEnum;
import net.minidev.ovh.api.service.OvhRenewType;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/hosting/web
 * version:1.0
 */
public class ApiOvhHostingweb extends ApiOvhBase {
	public ApiOvhHostingweb(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hosting/web/{serviceName}
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhService serviceName_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /hosting/web/{serviceName}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your hosting
	 */
	public void serviceName_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/hosting/web/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hosting/web/{serviceName}/cdn/serviceInfos
	 * @param serviceName [required] The internal name of your hosting
	 */
	public net.minidev.ovh.api.services.OvhService serviceName_cdn_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/cdn/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, net.minidev.ovh.api.services.OvhService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: POST /hosting/web/{serviceName}/cdn/serviceInfosUpdate
	 * @param renew [required] Renew type
	 * @param serviceName [required] The internal name of your hosting
	 */
	public void serviceName_cdn_serviceInfosUpdate_POST(String serviceName, OvhRenewType renew) throws IOException {
		String qPath = "/hosting/web/{serviceName}/cdn/serviceInfosUpdate";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "renew", renew);
		exec("POST", qPath, o);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hosting/web/{serviceName}/cdn
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhCdn serviceName_cdn_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/cdn";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhCdn.class);
	}

	/**
	 * Terminate your cdn sub service
	 * 
	 * REST: POST /hosting/web/{serviceName}/cdn/terminate
	 * @param serviceName [required] The internal name of your hosting
	 */
	public String serviceName_cdn_terminate_POST(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/cdn/terminate";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Get statistics about this web hosting
	 * 
	 * REST: GET /hosting/web/{serviceName}/statistics
	 * @param period [required]
	 * @param type [required]
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<OvhChartSerie<OvhChartTimestampValue>> serviceName_statistics_GET(String serviceName, OvhStatisticsPeriodEnum period, OvhStatisticsTypeEnum type) throws IOException {
		String qPath = "/hosting/web/{serviceName}/statistics";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "period", period);
		qPath = query(qPath, "type", type);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhChartSerie<OvhChartTimestampValue>>> t1 = new TypeReference<ArrayList<OvhChartSerie<OvhChartTimestampValue>>>() {};

	/**
	 * Request specific operation for your email
	 * 
	 * REST: POST /hosting/web/{serviceName}/email/request
	 * @param action [required] Action you want to request
	 * @param serviceName [required] The internal name of your hosting
	 */
	public String serviceName_email_request_POST(String serviceName, OvhActionEnum action) throws IOException {
		String qPath = "/hosting/web/{serviceName}/email/request";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "action", action);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, String.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hosting/web/{serviceName}/email
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhEmail serviceName_email_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/email";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhEmail.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /hosting/web/{serviceName}/email
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your hosting
	 */
	public void serviceName_email_PUT(String serviceName, OvhEmail body) throws IOException {
		String qPath = "/hosting/web/{serviceName}/email";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Request the history volume of email sent
	 * 
	 * REST: GET /hosting/web/{serviceName}/email/volumes
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<OvhVolumeHistory> serviceName_email_volumes_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/email/volumes";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhVolumeHistory>> t2 = new TypeReference<ArrayList<OvhVolumeHistory>>() {};

	/**
	 * Request the last bounces
	 * 
	 * REST: GET /hosting/web/{serviceName}/email/bounces
	 * @param limit [required] Maximum bounces limit ( default : 20 / max : 100 )
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<OvhBounce> serviceName_email_bounces_GET(String serviceName, Long limit) throws IOException {
		String qPath = "/hosting/web/{serviceName}/email/bounces";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "limit", limit);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhBounce>> t3 = new TypeReference<ArrayList<OvhBounce>>() {};

	/**
	 * List available database version following a type
	 * 
	 * REST: GET /hosting/web/{serviceName}/databaseAvailableVersion
	 * @param type [required] Type of the database
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhAvailableVersionStruct serviceName_databaseAvailableVersion_GET(String serviceName, OvhDatabaseTypeEnum type) throws IOException {
		String qPath = "/hosting/web/{serviceName}/databaseAvailableVersion";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "type", type);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAvailableVersionStruct.class);
	}

	/**
	 * Migrate ovh.org subdomain for old 60free and demo1g offers
	 * 
	 * REST: POST /hosting/web/{serviceName}/migrateMyOvhOrg
	 * @param destinationServiceName [required] Name of the service name that will have the ovh.org subdomain migrated
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhTask serviceName_migrateMyOvhOrg_POST(String serviceName, String destinationServiceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/migrateMyOvhOrg";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "destinationServiceName", destinationServiceName);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * User allowed to connect into your hosting
	 * 
	 * REST: GET /hosting/web/{serviceName}/user
	 * @param home [required] Filter the value of home property (like)
	 * @param login [required] Filter the value of login property (like)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<String> serviceName_user_GET(String serviceName, String home, String login) throws IOException {
		String qPath = "/hosting/web/{serviceName}/user";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "home", home);
		qPath = query(qPath, "login", login);
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<String>> t4 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Create new ftp/ssh user
	 * 
	 * REST: POST /hosting/web/{serviceName}/user
	 * @param password [required] Password
	 * @param sshState [required] Ssh state for this user. Default: none
	 * @param home [required] Home directory
	 * @param login [required] Login use for your new user
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhTask serviceName_user_POST(String serviceName, String password, OvhSshStateEnum sshState, String home, String login) throws IOException {
		String qPath = "/hosting/web/{serviceName}/user";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		addBody(o, "sshState", sshState);
		addBody(o, "home", home);
		addBody(o, "login", login);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hosting/web/{serviceName}/user/{login}
	 * @param serviceName [required] The internal name of your hosting
	 * @param login [required] Login used to connect on FTP and SSH
	 */
	public OvhUser serviceName_user_login_GET(String serviceName, String login) throws IOException {
		String qPath = "/hosting/web/{serviceName}/user/{login}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhUser.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /hosting/web/{serviceName}/user/{login}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your hosting
	 * @param login [required] Login used to connect on FTP and SSH
	 */
	public void serviceName_user_login_PUT(String serviceName, String login, OvhUser body) throws IOException {
		String qPath = "/hosting/web/{serviceName}/user/{login}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		exec("PUT", qPath, body);
	}

	/**
	 * Delete ftp/ssh user
	 * 
	 * REST: DELETE /hosting/web/{serviceName}/user/{login}
	 * @param serviceName [required] The internal name of your hosting
	 * @param login [required] Login used to connect on FTP and SSH
	 */
	public OvhTask serviceName_user_login_DELETE(String serviceName, String login) throws IOException {
		String qPath = "/hosting/web/{serviceName}/user/{login}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Request a password change
	 * 
	 * REST: POST /hosting/web/{serviceName}/user/{login}/changePassword
	 * @param password [required] The user's new password
	 * @param serviceName [required] The internal name of your hosting
	 * @param login [required] Login used to connect on FTP and SSH
	 */
	public OvhTask serviceName_user_login_changePassword_POST(String serviceName, String login, String password) throws IOException {
		String qPath = "/hosting/web/{serviceName}/user/{login}/changePassword";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Restore this snapshot ALL CURRENT DATA WILL BE REPLACED BY YOUR SNAPSHOT
	 * 
	 * REST: POST /hosting/web/{serviceName}/restoreSnapshot
	 * @param backup [required] The backup you want to restore
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhTask serviceName_restoreSnapshot_POST(String serviceName, OvhTypeEnum backup) throws IOException {
		String qPath = "/hosting/web/{serviceName}/restoreSnapshot";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "backup", backup);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Request specific operation for your hosting
	 * 
	 * REST: POST /hosting/web/{serviceName}/request
	 * @param action [required] Action you want to request
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhTask serviceName_request_POST(String serviceName, OvhRequestActionEnum action) throws IOException {
		String qPath = "/hosting/web/{serviceName}/request";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "action", action);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Tasks attached to your hosting
	 * 
	 * REST: GET /hosting/web/{serviceName}/tasks
	 * @param function [required] Filter the value of function property (like)
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<Long> serviceName_tasks_GET(String serviceName, String function, OvhStatusEnum status) throws IOException {
		String qPath = "/hosting/web/{serviceName}/tasks";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "function", function);
		qPath = query(qPath, "status", status);
		String resp = exec("GET", qPath);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<Long>> t5 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hosting/web/{serviceName}/tasks/{id}
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] the id of the task
	 */
	public OvhTask serviceName_tasks_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/tasks/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Confirm termination of your service
	 * 
	 * REST: POST /hosting/web/{serviceName}/confirmTermination
	 * @param reason Reason of your termination request
	 * @param commentary Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] The internal name of your hosting
	 */
	public String serviceName_confirmTermination_POST(String serviceName, OvhTerminationReasonEnum reason, String commentary, String token) throws IOException {
		String qPath = "/hosting/web/{serviceName}/confirmTermination";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "reason", reason);
		addBody(o, "commentary", commentary);
		addBody(o, "token", token);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, String.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hosting/web/{serviceName}/freedom/{domain}
	 * @param serviceName [required] The internal name of your hosting
	 * @param domain [required] Freedom domain
	 */
	public OvhFreedom serviceName_freedom_domain_GET(String serviceName, String domain) throws IOException {
		String qPath = "/hosting/web/{serviceName}/freedom/{domain}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhFreedom.class);
	}

	/**
	 * Delete the freedom
	 * 
	 * REST: DELETE /hosting/web/{serviceName}/freedom/{domain}
	 * @param serviceName [required] The internal name of your hosting
	 * @param domain [required] Freedom domain
	 */
	public void serviceName_freedom_domain_DELETE(String serviceName, String domain) throws IOException {
		String qPath = "/hosting/web/{serviceName}/freedom/{domain}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		exec("DELETE", qPath);
	}

	/**
	 * Freedom linked to this hosting account
	 * 
	 * REST: GET /hosting/web/{serviceName}/freedom
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<String> serviceName_freedom_GET(String serviceName, net.minidev.ovh.api.hosting.web.freedom.OvhStatusEnum status) throws IOException {
		String qPath = "/hosting/web/{serviceName}/freedom";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "status", status);
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}

	/**
	 * History of your hosting boost
	 * 
	 * REST: GET /hosting/web/{serviceName}/boostHistory
	 * @param date [required] Filter the value of date property (=)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<Date> serviceName_boostHistory_GET(String serviceName, Date date) throws IOException {
		String qPath = "/hosting/web/{serviceName}/boostHistory";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "date", date);
		String resp = exec("GET", qPath);
		return convertTo(resp, t6);
	}
	private static TypeReference<ArrayList<Date>> t6 = new TypeReference<ArrayList<Date>>() {};

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hosting/web/{serviceName}/boostHistory/{date}
	 * @param serviceName [required] The internal name of your hosting
	 * @param date [required] The date when the change has been requested
	 */
	public OvhBoostHistory serviceName_boostHistory_date_GET(String serviceName, java.util.Date date) throws IOException {
		String qPath = "/hosting/web/{serviceName}/boostHistory/{date}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{date}", date.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhBoostHistory.class);
	}

	/**
	 * User of multidomain independent allowed on your hosting
	 * 
	 * REST: GET /hosting/web/{serviceName}/indy
	 * @param login [required] Filter the value of login property (like)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<String> serviceName_indy_GET(String serviceName, String login) throws IOException {
		String qPath = "/hosting/web/{serviceName}/indy";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "login", login);
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hosting/web/{serviceName}/indy/{login}
	 * @param serviceName [required] The internal name of your hosting
	 * @param login [required] Login of the multidomain independent user
	 */
	public OvhIndy serviceName_indy_login_GET(String serviceName, String login) throws IOException {
		String qPath = "/hosting/web/{serviceName}/indy/{login}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhIndy.class);
	}

	/**
	 * Sqlperso linked to your hosting
	 * 
	 * REST: GET /hosting/web/{serviceName}/extraSqlPerso
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<String> serviceName_extraSqlPerso_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/extraSqlPerso";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hosting/web/{serviceName}/extraSqlPerso/{name}/serviceInfos
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] The extraSqlPerso option name
	 */
	public net.minidev.ovh.api.services.OvhService serviceName_extraSqlPerso_name_serviceInfos_GET(String serviceName, String name) throws IOException {
		String qPath = "/hosting/web/{serviceName}/extraSqlPerso/{name}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		String resp = exec("GET", qPath);
		return convertTo(resp, net.minidev.ovh.api.services.OvhService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: POST /hosting/web/{serviceName}/extraSqlPerso/{name}/serviceInfosUpdate
	 * @param renew [required] Renew type
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] The extraSqlPerso option name
	 */
	public void serviceName_extraSqlPerso_name_serviceInfosUpdate_POST(String serviceName, String name, OvhRenewType renew) throws IOException {
		String qPath = "/hosting/web/{serviceName}/extraSqlPerso/{name}/serviceInfosUpdate";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "renew", renew);
		exec("POST", qPath, o);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hosting/web/{serviceName}/extraSqlPerso/{name}
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] The extraSqlPerso option name
	 */
	public OvhExtrasqlperso serviceName_extraSqlPerso_name_GET(String serviceName, String name) throws IOException {
		String qPath = "/hosting/web/{serviceName}/extraSqlPerso/{name}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhExtrasqlperso.class);
	}

	/**
	 * Get databases linked with this option
	 * 
	 * REST: GET /hosting/web/{serviceName}/extraSqlPerso/{name}/databases
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] The extraSqlPerso option name
	 */
	public ArrayList<String> serviceName_extraSqlPerso_name_databases_GET(String serviceName, String name) throws IOException {
		String qPath = "/hosting/web/{serviceName}/extraSqlPerso/{name}/databases";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}

	/**
	 * Terminate your extraSqlPerso sub service
	 * 
	 * REST: POST /hosting/web/{serviceName}/extraSqlPerso/{name}/terminate
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] The extraSqlPerso option name
	 */
	public String serviceName_extraSqlPerso_name_terminate_POST(String serviceName, String name) throws IOException {
		String qPath = "/hosting/web/{serviceName}/extraSqlPerso/{name}/terminate";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		String resp = exec("POST", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * List available cron language
	 * 
	 * REST: GET /hosting/web/{serviceName}/cronAvailableLanguage
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<OvhLanguageEnum> serviceName_cronAvailableLanguage_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/cronAvailableLanguage";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t7);
	}
	private static TypeReference<ArrayList<OvhLanguageEnum>> t7 = new TypeReference<ArrayList<OvhLanguageEnum>>() {};

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hosting/web/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your hosting
	 */
	public net.minidev.ovh.api.services.OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, net.minidev.ovh.api.services.OvhService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /hosting/web/{serviceName}/serviceInfos
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your hosting
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, net.minidev.ovh.api.services.OvhService body) throws IOException {
		String qPath = "/hosting/web/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * List linked privateDatabases
	 * 
	 * REST: GET /hosting/web/{serviceName}/privateDatabases
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<String> serviceName_privateDatabases_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/privateDatabases";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}

	/**
	 * List available database you can install
	 * 
	 * REST: GET /hosting/web/{serviceName}/databaseCreationCapabilities
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<OvhCreationDatabaseCapabilities> serviceName_databaseCreationCapabilities_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/databaseCreationCapabilities";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t8);
	}
	private static TypeReference<ArrayList<OvhCreationDatabaseCapabilities>> t8 = new TypeReference<ArrayList<OvhCreationDatabaseCapabilities>>() {};

	/**
	 * Allows you to boost your offer.
	 * 
	 * REST: POST /hosting/web/{serviceName}/requestBoost
	 * @param offer [required] The boost offer of your choice. Set to null to disable boost.
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhTask serviceName_requestBoost_POST(String serviceName, OvhOfferEnum offer) throws IOException {
		String qPath = "/hosting/web/{serviceName}/requestBoost";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "offer", offer);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Terminate your service
	 * 
	 * REST: POST /hosting/web/{serviceName}/terminate
	 * @param serviceName [required] The internal name of your hosting
	 */
	public String serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/terminate";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Launch a contact change procedure
	 * 
	 * REST: POST /hosting/web/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/hosting/web/{serviceName}/changeContact";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, t5);
	}

	/**
	 * Synchronize the configuration listing with content on your hosting
	 * 
	 * REST: POST /hosting/web/{serviceName}/ovhConfigRefresh
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhTask serviceName_ovhConfigRefresh_POST(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ovhConfigRefresh";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * User allowed to connect into your logs interface
	 * 
	 * REST: GET /hosting/web/{serviceName}/userLogs
	 * @param login [required] Filter the value of login property (like)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<String> serviceName_userLogs_GET(String serviceName, String login) throws IOException {
		String qPath = "/hosting/web/{serviceName}/userLogs";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "login", login);
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}

	/**
	 * Create new userLogs
	 * 
	 * REST: POST /hosting/web/{serviceName}/userLogs
	 * @param password [required] The new userLogs password
	 * @param description [required] Description field for you
	 * @param login [required] The userLogs login used to connect to logs.ovh.net
	 * @param serviceName [required] The internal name of your hosting
	 */
	public String serviceName_userLogs_POST(String serviceName, String password, String description, String login) throws IOException {
		String qPath = "/hosting/web/{serviceName}/userLogs";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		addBody(o, "description", description);
		addBody(o, "login", login);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, String.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hosting/web/{serviceName}/userLogs/{login}
	 * @param serviceName [required] The internal name of your hosting
	 * @param login [required] The userLogs login used to connect to logs.ovh.net
	 */
	public OvhUserLogs serviceName_userLogs_login_GET(String serviceName, String login) throws IOException {
		String qPath = "/hosting/web/{serviceName}/userLogs/{login}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhUserLogs.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /hosting/web/{serviceName}/userLogs/{login}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your hosting
	 * @param login [required] The userLogs login used to connect to logs.ovh.net
	 */
	public void serviceName_userLogs_login_PUT(String serviceName, String login, OvhUserLogs body) throws IOException {
		String qPath = "/hosting/web/{serviceName}/userLogs/{login}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		exec("PUT", qPath, body);
	}

	/**
	 * Delete the userLogs
	 * 
	 * REST: DELETE /hosting/web/{serviceName}/userLogs/{login}
	 * @param serviceName [required] The internal name of your hosting
	 * @param login [required] The userLogs login used to connect to logs.ovh.net
	 */
	public String serviceName_userLogs_login_DELETE(String serviceName, String login) throws IOException {
		String qPath = "/hosting/web/{serviceName}/userLogs/{login}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Request a password change
	 * 
	 * REST: POST /hosting/web/{serviceName}/userLogs/{login}/changePassword
	 * @param password [required] The new userLogs password
	 * @param serviceName [required] The internal name of your hosting
	 * @param login [required] The userLogs login used to connect to logs.ovh.net
	 */
	public String serviceName_userLogs_login_changePassword_POST(String serviceName, String login, String password) throws IOException {
		String qPath = "/hosting/web/{serviceName}/userLogs/{login}/changePassword";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{login}", login);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, String.class);
	}

	/**
	 * Use to link an external domain. ( This token has to be insert into a TXT field on your dns zone with ovhcontrol subdomain )
	 * 
	 * REST: GET /hosting/web/{serviceName}/token
	 * @param serviceName [required] The internal name of your hosting
	 */
	public String serviceName_token_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/token";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Module installed on your hosting
	 * 
	 * REST: GET /hosting/web/{serviceName}/module
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<Long> serviceName_module_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/module";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t5);
	}

	/**
	 * Install a new module
	 * 
	 * REST: POST /hosting/web/{serviceName}/module
	 * @param domain [required] On which domain the module has to be available (it can be a multidomain or a subdomain) - if not set, the module will be available on your serviceName domain
	 * @param language [required] The language to set to your module
	 * @param adminName [required] The login for the admin account (may be a standard string or your email)
	 * @param adminPassword [required] The password for the admin account (at least 8 characters)
	 * @param dependencies [required] The dependencies that we have to configure on your module. A dependency can be a standard database (like MySQL or PostgreSQL) or a key-value store (like Redis or Memcached) for example
	 * @param path [required] Where to install the module, relative to your home directory
	 * @param moduleId [required] ID of the module you want to install
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhTask serviceName_module_POST(String serviceName, String domain, net.minidev.ovh.api.hosting.web.module.OvhLanguageEnum language, String adminName, String adminPassword, OvhDependencyType[] dependencies, String path, Long moduleId) throws IOException {
		String qPath = "/hosting/web/{serviceName}/module";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "domain", domain);
		addBody(o, "language", language);
		addBody(o, "adminName", adminName);
		addBody(o, "adminPassword", adminPassword);
		addBody(o, "dependencies", dependencies);
		addBody(o, "path", path);
		addBody(o, "moduleId", moduleId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hosting/web/{serviceName}/module/{id}
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Installation ID
	 */
	public OvhModule serviceName_module_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/module/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhModule.class);
	}

	/**
	 * Delete a module installed
	 * 
	 * REST: DELETE /hosting/web/{serviceName}/module/{id}
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Installation ID
	 */
	public OvhTask serviceName_module_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/module/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Generate a new admin password for your module
	 * 
	 * REST: POST /hosting/web/{serviceName}/module/{id}/changePassword
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Installation ID
	 */
	public OvhTask serviceName_module_id_changePassword_POST(String serviceName, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/module/{id}/changePassword";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List available privateDatabase you can install
	 * 
	 * REST: GET /hosting/web/{serviceName}/privateDatabaseCreationCapabilities
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<OvhCreationDatabaseCapabilities> serviceName_privateDatabaseCreationCapabilities_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/privateDatabaseCreationCapabilities";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t8);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hosting/web/{serviceName}/ssl
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhSsl serviceName_ssl_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ssl";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhSsl.class);
	}

	/**
	 * Create the free default HostedSsl OR import your proper SSL on your hosting
	 * 
	 * REST: POST /hosting/web/{serviceName}/ssl
	 * @param chain [required] If you want import your proper SSL, give the chain linked to the associated certificate (optional)
	 * @param certificate [required] If you want import your proper SSL, give the certificate here and the associated key after (optional)
	 * @param key [required] If you want import your proper SSL, give the key here and the associated certificate before (optional)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhSsl serviceName_ssl_POST(String serviceName, String chain, String certificate, String key) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ssl";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "chain", chain);
		addBody(o, "certificate", certificate);
		addBody(o, "key", key);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhSsl.class);
	}

	/**
	 * Delete the HostedSsl on your hosting
	 * 
	 * REST: DELETE /hosting/web/{serviceName}/ssl
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhSsl serviceName_ssl_DELETE(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ssl";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhSsl.class);
	}

	/**
	 * Request the regeneration of your HostedSsl
	 * 
	 * REST: POST /hosting/web/{serviceName}/ssl/regenerate
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhSsl serviceName_ssl_regenerate_POST(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ssl/regenerate";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhSsl.class);
	}

	/**
	 * Get domains linked to this HostedSsl
	 * 
	 * REST: GET /hosting/web/{serviceName}/ssl/domains
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<String> serviceName_ssl_domains_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ssl/domains";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}

	/**
	 * Get a temporary token to access the your web hosting logs interface
	 * 
	 * REST: GET /hosting/web/{serviceName}/userLogsToken
	 * @param remoteCheck [required] Whether to limit the use of the token to the remote IPv4 of API caller
	 * @param attachedDomain [required] Specific attached domain to be included in the scope of your token
	 * @param ttl [required] [default=3600] Expiration of your token (in seconds)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public String serviceName_userLogsToken_GET(String serviceName, String attachedDomain, Boolean remoteCheck, Long ttl) throws IOException {
		String qPath = "/hosting/web/{serviceName}/userLogsToken";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "attachedDomain", attachedDomain);
		qPath = query(qPath, "remoteCheck", remoteCheck);
		qPath = query(qPath, "ttl", ttl);
		String resp = exec("GET", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Activate an included private database on your hosting offer
	 * 
	 * REST: POST /hosting/web/{serviceName}/activatePrivateDatabase
	 * @param version [required] Private database available versions
	 * @param ram [required] The private database ram size included in your offer
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhTask serviceName_activatePrivateDatabase_POST(String serviceName, OvhOrderableVersionEnum version, OvhAvailableRamSizeEnum ram) throws IOException {
		String qPath = "/hosting/web/{serviceName}/activatePrivateDatabase";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "version", version);
		addBody(o, "ram", ram);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List available database type
	 * 
	 * REST: GET /hosting/web/{serviceName}/databaseAvailableType
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<OvhDatabaseTypeEnum> serviceName_databaseAvailableType_GET(String serviceName) throws IOException {
		String qPath = "/hosting/web/{serviceName}/databaseAvailableType";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t9);
	}
	private static TypeReference<ArrayList<OvhDatabaseTypeEnum>> t9 = new TypeReference<ArrayList<OvhDatabaseTypeEnum>>() {};

	/**
	 * Databases linked to your hosting
	 * 
	 * REST: GET /hosting/web/{serviceName}/database
	 * @param mode [required] Filter the value of mode property (=)
	 * @param user [required] Filter the value of user property (like)
	 * @param name [required] Filter the value of name property (like)
	 * @param type [required] Filter the value of type property (=)
	 * @param server [required] Filter the value of server property (like)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<String> serviceName_database_GET(String serviceName, OvhModeEnum mode, String name, String server, OvhDatabaseTypeEnum type, String user) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "mode", mode);
		qPath = query(qPath, "name", name);
		qPath = query(qPath, "server", server);
		qPath = query(qPath, "type", type);
		qPath = query(qPath, "user", user);
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}

	/**
	 * Install new database
	 * 
	 * REST: POST /hosting/web/{serviceName}/database
	 * @param quota [required] Quota assign to your database. Only for extraSql
	 * @param password [required] Database password
	 * @param version [required] Version you want for your database following the type
	 * @param capabilitie [required] Type of your database
	 * @param user [required] Database user name. Must begin with your hosting login and must be in lower case
	 * @param type [required] Type you want for your database
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhTask serviceName_database_POST(String serviceName, OvhExtraSqlQuotaEnum quota, String password, OvhVersionEnum version, OvhDatabaseCapabilitiesTypeEnum capabilitie, String user, OvhDatabaseTypeEnum type) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "quota", quota);
		addBody(o, "password", password);
		addBody(o, "version", version);
		addBody(o, "capabilitie", capabilitie);
		addBody(o, "user", user);
		addBody(o, "type", type);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Request specific operation for your database
	 * 
	 * REST: POST /hosting/web/{serviceName}/database/{name}/request
	 * @param action [required] Action you want to request
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 */
	public OvhTask serviceName_database_name_request_POST(String serviceName, String name, net.minidev.ovh.api.hosting.web.database.OvhRequestActionEnum action) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}/request";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "action", action);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hosting/web/{serviceName}/database/{name}
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 */
	public OvhDatabase serviceName_database_name_GET(String serviceName, String name) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDatabase.class);
	}

	/**
	 * Delete database
	 * 
	 * REST: DELETE /hosting/web/{serviceName}/database/{name}
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 */
	public OvhTask serviceName_database_name_DELETE(String serviceName, String name) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Dump available for your databases
	 * 
	 * REST: GET /hosting/web/{serviceName}/database/{name}/dump
	 * @param creationDate [required] Filter the value of creationDate property (like)
	 * @param type [required] Filter the value of type property (=)
	 * @param deletionDate [required] Filter the value of deletionDate property (like)
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 */
	public ArrayList<Long> serviceName_database_name_dump_GET(String serviceName, String name, Date creationDate, Date deletionDate, OvhDumpDateEnum type) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}/dump";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		qPath = query(qPath, "creationDate", creationDate);
		qPath = query(qPath, "deletionDate", deletionDate);
		qPath = query(qPath, "type", type);
		String resp = exec("GET", qPath);
		return convertTo(resp, t5);
	}

	/**
	 * Request the dump from your database
	 * 
	 * REST: POST /hosting/web/{serviceName}/database/{name}/dump
	 * @param date [required] The date you want to dump
	 * @param sendEmail [required] Send an email when dump will be available? Default: true
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 */
	public OvhTask serviceName_database_name_dump_POST(String serviceName, String name, OvhDumpDateEnum date, Boolean sendEmail) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}/dump";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "date", date);
		addBody(o, "sendEmail", sendEmail);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hosting/web/{serviceName}/database/{name}/dump/{id}
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 * @param id [required] Dump id
	 */
	public OvhDump serviceName_database_name_dump_id_GET(String serviceName, String name, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}/dump/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDump.class);
	}

	/**
	 * Delete dump before expiration date
	 * 
	 * REST: DELETE /hosting/web/{serviceName}/database/{name}/dump/{id}
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 * @param id [required] Dump id
	 */
	public OvhTask serviceName_database_name_dump_id_DELETE(String serviceName, String name, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}/dump/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Request the restore from this dump
	 * 
	 * REST: POST /hosting/web/{serviceName}/database/{name}/dump/{id}/restore
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 * @param id [required] Dump id
	 */
	public OvhTask serviceName_database_name_dump_id_restore_POST(String serviceName, String name, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}/dump/{id}/restore";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get statistics about this database
	 * 
	 * REST: GET /hosting/web/{serviceName}/database/{name}/statistics
	 * @param period [required] Available periods for statistics
	 * @param type [required] Types of statistics available for the database
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 */
	public ArrayList<OvhChartSerie<OvhChartTimestampValue>> serviceName_database_name_statistics_GET(String serviceName, String name, OvhStatisticsPeriodEnum period, net.minidev.ovh.api.hosting.web.database.OvhStatisticsTypeEnum type) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}/statistics";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		qPath = query(qPath, "period", period);
		qPath = query(qPath, "type", type);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Dump available for your databases
	 * 
	 * REST: GET /hosting/web/{serviceName}/database/{name}/dumps
	 * @param creationDate [required] Filter the value of creationDate property (like)
	 * @param type [required] Filter the value of type property (=)
	 * @param deletionDate [required] Filter the value of deletionDate property (like)
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 */
	public ArrayList<Long> serviceName_database_name_dumps_GET(String serviceName, String name, Date creationDate, Date deletionDate, OvhDumpDateEnum type) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}/dumps";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		qPath = query(qPath, "creationDate", creationDate);
		qPath = query(qPath, "deletionDate", deletionDate);
		qPath = query(qPath, "type", type);
		String resp = exec("GET", qPath);
		return convertTo(resp, t5);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hosting/web/{serviceName}/database/{name}/dumps/{id}
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 * @param id [required] Dump id
	 */
	public OvhDump serviceName_database_name_dumps_id_GET(String serviceName, String name, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}/dumps/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDump.class);
	}

	/**
	 * Delete dump before expiration date
	 * 
	 * REST: DELETE /hosting/web/{serviceName}/database/{name}/dumps/{id}
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 * @param id [required] Dump id
	 */
	public OvhTask serviceName_database_name_dumps_id_DELETE(String serviceName, String name, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}/dumps/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Request the restore from this dump
	 * 
	 * REST: POST /hosting/web/{serviceName}/database/{name}/dumps/{id}/restore
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 * @param id [required] Dump id
	 */
	public OvhTask serviceName_database_name_dumps_id_restore_POST(String serviceName, String name, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}/dumps/{id}/restore";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Request a password change
	 * 
	 * REST: POST /hosting/web/{serviceName}/database/{name}/changePassword
	 * @param password [required] The new database password
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 */
	public OvhTask serviceName_database_name_changePassword_POST(String serviceName, String name, String password) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}/changePassword";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Request the restore from your database backup
	 * 
	 * REST: POST /hosting/web/{serviceName}/database/{name}/restore
	 * @param date [required] The date you want to dump
	 * @param sendEmail [required] Send an email when the restore will be done? Default: false
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 */
	public OvhTask serviceName_database_name_restore_POST(String serviceName, String name, OvhDumpDateEnum date, Boolean sendEmail) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}/restore";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "date", date);
		addBody(o, "sendEmail", sendEmail);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Import a dump from an specific file uploaded with /me/documents
	 * 
	 * REST: POST /hosting/web/{serviceName}/database/{name}/import
	 * @param documentId [required] Documents ID of the dump from /me/documents
	 * @param sendEmail [required] Send an email when the import will be done? Default: false
	 * @param flushDatabase [required] If database will be flushed before importing the dump. Default: false
	 * @param serviceName [required] The internal name of your hosting
	 * @param name [required] Database name (like mydb.mysql.db or mydb.postgres.db)
	 */
	public OvhTask serviceName_database_name_import_POST(String serviceName, String name, String documentId, Boolean sendEmail, Boolean flushDatabase) throws IOException {
		String qPath = "/hosting/web/{serviceName}/database/{name}/import";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{name}", name);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "documentId", documentId);
		addBody(o, "sendEmail", sendEmail);
		addBody(o, "flushDatabase", flushDatabase);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Crons on your hosting
	 * 
	 * REST: GET /hosting/web/{serviceName}/cron
	 * @param email [required] Filter the value of email property (like)
	 * @param language [required] Filter the value of language property (=)
	 * @param description [required] Filter the value of description property (like)
	 * @param command [required] Filter the value of command property (like)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<Long> serviceName_cron_GET(String serviceName, String command, String description, String email, OvhLanguageEnum language) throws IOException {
		String qPath = "/hosting/web/{serviceName}/cron";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "command", command);
		qPath = query(qPath, "description", description);
		qPath = query(qPath, "email", email);
		qPath = query(qPath, "language", language);
		String resp = exec("GET", qPath);
		return convertTo(resp, t5);
	}

	/**
	 * Create new cron
	 * 
	 * REST: POST /hosting/web/{serviceName}/cron
	 * @param frequency [required] Frequency ( crontab format ) define for the script ( minutes are ignored )
	 * @param email [required] Email used to receive error log ( stderr )
	 * @param language [required] Cron language
	 * @param status [required] Cron status
	 * @param description [required] Description field for you
	 * @param command [required] Command to execute
	 * @param serviceName [required] The internal name of your hosting
	 */
	public String serviceName_cron_POST(String serviceName, String frequency, String email, OvhLanguageEnum language, net.minidev.ovh.api.hosting.web.cron.OvhStatusEnum status, String description, String command) throws IOException {
		String qPath = "/hosting/web/{serviceName}/cron";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "frequency", frequency);
		addBody(o, "email", email);
		addBody(o, "language", language);
		addBody(o, "status", status);
		addBody(o, "description", description);
		addBody(o, "command", command);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, String.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hosting/web/{serviceName}/cron/{id}
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Cron's id
	 */
	public OvhCron serviceName_cron_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/cron/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhCron.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /hosting/web/{serviceName}/cron/{id}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Cron's id
	 */
	public void serviceName_cron_id_PUT(String serviceName, Long id, OvhCron body) throws IOException {
		String qPath = "/hosting/web/{serviceName}/cron/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		exec("PUT", qPath, body);
	}

	/**
	 * Delete cron
	 * 
	 * REST: DELETE /hosting/web/{serviceName}/cron/{id}
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Cron's id
	 */
	public String serviceName_cron_id_DELETE(String serviceName, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/cron/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hosting/web/{serviceName}/attachedDomain/{domain}
	 * @param serviceName [required] The internal name of your hosting
	 * @param domain [required] Domain linked (fqdn)
	 */
	public OvhAttachedDomain serviceName_attachedDomain_domain_GET(String serviceName, String domain) throws IOException {
		String qPath = "/hosting/web/{serviceName}/attachedDomain/{domain}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAttachedDomain.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /hosting/web/{serviceName}/attachedDomain/{domain}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your hosting
	 * @param domain [required] Domain linked (fqdn)
	 */
	public void serviceName_attachedDomain_domain_PUT(String serviceName, String domain, OvhAttachedDomain body) throws IOException {
		String qPath = "/hosting/web/{serviceName}/attachedDomain/{domain}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		exec("PUT", qPath, body);
	}

	/**
	 * Unlink domain from hosting
	 * 
	 * REST: DELETE /hosting/web/{serviceName}/attachedDomain/{domain}
	 * @param serviceName [required] The internal name of your hosting
	 * @param domain [required] Domain linked (fqdn)
	 */
	public OvhTask serviceName_attachedDomain_domain_DELETE(String serviceName, String domain) throws IOException {
		String qPath = "/hosting/web/{serviceName}/attachedDomain/{domain}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Purge cache for this attached domain
	 * 
	 * REST: POST /hosting/web/{serviceName}/attachedDomain/{domain}/purgeCache
	 * @param serviceName [required] The internal name of your hosting
	 * @param domain [required] Domain linked (fqdn)
	 */
	public OvhTask serviceName_attachedDomain_domain_purgeCache_POST(String serviceName, String domain) throws IOException {
		String qPath = "/hosting/web/{serviceName}/attachedDomain/{domain}/purgeCache";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Domains or subdomains attached to your hosting
	 * 
	 * REST: GET /hosting/web/{serviceName}/attachedDomain
	 * @param domain [required] Filter the value of domain property (like)
	 * @param path [required] Filter the value of path property (like)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<String> serviceName_attachedDomain_GET(String serviceName, String domain, String path) throws IOException {
		String qPath = "/hosting/web/{serviceName}/attachedDomain";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "domain", domain);
		qPath = query(qPath, "path", path);
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}

	/**
	 * Link a domain to this hosting
	 * 
	 * REST: POST /hosting/web/{serviceName}/attachedDomain
	 * @param cdn [required] Is linked to the hosting cdn
	 * @param domain [required] Domain to link
	 * @param ownLog [required] Put domain for separate the logs on logs.ovh.net
	 * @param ssl [required] Put domain in ssl certificate
	 * @param firewall [required] Firewall state for this path
	 * @param path [required] Domain's path, relative to your home directory
	 * @param serviceName [required] The internal name of your hosting
	 */
	public OvhTask serviceName_attachedDomain_POST(String serviceName, OvhCdnEnum cdn, String domain, String ownLog, Boolean ssl, OvhFirewallEnum firewall, String path) throws IOException {
		String qPath = "/hosting/web/{serviceName}/attachedDomain";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "cdn", cdn);
		addBody(o, "domain", domain);
		addBody(o, "ownLog", ownLog);
		addBody(o, "ssl", ssl);
		addBody(o, "firewall", firewall);
		addBody(o, "path", path);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Configuration used on your hosting
	 * 
	 * REST: GET /hosting/web/{serviceName}/ovhConfig
	 * @param historical [required] Filter the value of historical property (=)
	 * @param path [required] Filter the value of path property (like)
	 * @param serviceName [required] The internal name of your hosting
	 */
	public ArrayList<Long> serviceName_ovhConfig_GET(String serviceName, Boolean historical, String path) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ovhConfig";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "historical", historical);
		qPath = query(qPath, "path", path);
		String resp = exec("GET", qPath);
		return convertTo(resp, t5);
	}

	/**
	 * Apply a new configuration on this path
	 * 
	 * REST: POST /hosting/web/{serviceName}/ovhConfig/{id}/changeConfiguration
	 * @param environment [required] Environment configuration you want
	 * @param httpFirewall [required] Configuration you want for http firewall
	 * @param engineName [required] Version of engine you want
	 * @param container [required] Container to run this website
	 * @param engineVersion [required] Name of engine you want
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Configuration's id
	 */
	public OvhTask serviceName_ovhConfig_id_changeConfiguration_POST(String serviceName, Long id, OvhEnvironmentEnum environment, OvhHttpFirewallEnum httpFirewall, OvhEngineNameEnum engineName, OvhContainerEnum container, OvhAvailableEngineVersionEnum engineVersion) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ovhConfig/{id}/changeConfiguration";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "environment", environment);
		addBody(o, "httpFirewall", httpFirewall);
		addBody(o, "engineName", engineName);
		addBody(o, "container", container);
		addBody(o, "engineVersion", engineVersion);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hosting/web/{serviceName}/ovhConfig/{id}
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Configuration's id
	 */
	public OvhOvhConfig serviceName_ovhConfig_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ovhConfig/{id}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhOvhConfig.class);
	}

	/**
	 * Rollback to an old configuration
	 * 
	 * REST: POST /hosting/web/{serviceName}/ovhConfig/{id}/rollback
	 * @param rollbackId [required] The configuration's id you want to rollback
	 * @param serviceName [required] The internal name of your hosting
	 * @param id [required] Configuration's id
	 */
	public OvhTask serviceName_ovhConfig_id_rollback_POST(String serviceName, Long id, Long rollbackId) throws IOException {
		String qPath = "/hosting/web/{serviceName}/ovhConfig/{id}/rollback";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{id}", id.toString());
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "rollbackId", rollbackId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /hosting/web
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/hosting/web";
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}

	/**
	 * Find hosting service linked to a domain
	 * 
	 * REST: GET /hosting/web/attachedDomain
	 * @param domain [required] Domain used into web hosting attached Domains
	 */
	public ArrayList<String> attachedDomain_GET(String domain) throws IOException {
		String qPath = "/hosting/web/attachedDomain";
		qPath = query(qPath, "domain", domain);
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}

	/**
	 * Get offer capabilities
	 * 
	 * REST: GET /hosting/web/offerCapabilities
	 * @param offer [required] Describe offer capabilities
	 */
	public OvhCapabilities offerCapabilities_GET(OvhOfferCapabilitiesEnum offer) throws IOException {
		String qPath = "/hosting/web/offerCapabilities";
		qPath = query(qPath, "offer", offer);
		String resp = execN("GET", qPath);
		return convertTo(resp, OvhCapabilities.class);
	}

	/**
	 * Get available offer
	 * 
	 * REST: GET /hosting/web/availableOffer
	 * @param domain [required] Domain you want to add or upgrade a hosting
	 */
	public ArrayList<OvhOfferEnum> availableOffer_GET(String domain) throws IOException {
		String qPath = "/hosting/web/availableOffer";
		qPath = query(qPath, "domain", domain);
		String resp = exec("GET", qPath);
		return convertTo(resp, t10);
	}
	private static TypeReference<ArrayList<OvhOfferEnum>> t10 = new TypeReference<ArrayList<OvhOfferEnum>>() {};

	/**
	 * IDs of all modules available
	 * 
	 * REST: GET /hosting/web/moduleList
	 * @param latest [required] Filter the value of latest property (=)
	 * @param active [required] Filter the value of active property (=)
	 * @param branch [required] Filter the value of branch property (=)
	 */
	public ArrayList<Long> moduleList_GET(Boolean active, OvhBranchEnum branch, Boolean latest) throws IOException {
		String qPath = "/hosting/web/moduleList";
		qPath = query(qPath, "active", active);
		qPath = query(qPath, "branch", branch);
		qPath = query(qPath, "latest", latest);
		String resp = execN("GET", qPath);
		return convertTo(resp, t5);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /hosting/web/moduleList/{id}
	 * @param id [required] The ID of the module
	 */
	public OvhModuleList moduleList_id_GET(Long id) throws IOException {
		String qPath = "/hosting/web/moduleList/{id}";
		qPath = qPath.replace("{id}", id.toString());
		String resp = execN("GET", qPath);
		return convertTo(resp, OvhModuleList.class);
	}
}