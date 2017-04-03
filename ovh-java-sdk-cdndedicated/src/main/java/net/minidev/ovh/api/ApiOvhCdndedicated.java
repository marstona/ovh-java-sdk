package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.cdnanycast.OvhAnycast;
import net.minidev.ovh.api.cdnanycast.OvhBackend;
import net.minidev.ovh.api.cdnanycast.OvhCacheRule;
import net.minidev.ovh.api.cdnanycast.OvhCacheRuleCacheTypeEnum;
import net.minidev.ovh.api.cdnanycast.OvhCacheRuleFileTypeEnum;
import net.minidev.ovh.api.cdnanycast.OvhDomain;
import net.minidev.ovh.api.cdnanycast.OvhPop;
import net.minidev.ovh.api.cdnanycast.OvhSsl;
import net.minidev.ovh.api.cdnanycast.OvhStatsDataType;
import net.minidev.ovh.api.cdnanycast.OvhStatsPeriodEnum;
import net.minidev.ovh.api.cdnanycast.OvhStatsTypeEnum;
import net.minidev.ovh.api.cdnanycast.OvhStatsValueEnum;
import net.minidev.ovh.api.cdnanycast.OvhTask;
import net.minidev.ovh.api.cdnanycast.OvhTaskFunctionEnum;
import net.minidev.ovh.api.cdnanycast.OvhTaskStateEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/cdn/dedicated
 * version:1.0
 */
public class ApiOvhCdndedicated extends ApiOvhBase {
	public ApiOvhCdndedicated(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /cdn/dedicated/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your CDN offer
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /cdn/dedicated/{serviceName}/serviceInfos
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your CDN offer
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Return quota history
	 * 
	 * REST: GET /cdn/dedicated/{serviceName}/quota
	 * @param period [required]
	 * @param serviceName [required] The internal name of your CDN offer
	 */
	public ArrayList<OvhStatsDataType> serviceName_quota_GET(String serviceName, OvhStatsPeriodEnum period) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/quota";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "period", period);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhStatsDataType>> t1 = new TypeReference<ArrayList<OvhStatsDataType>>() {};

	/**
	 * Get this object properties
	 * 
	 * REST: GET /cdn/dedicated/{serviceName}
	 * @param serviceName [required] The internal name of your CDN offer
	 */
	public OvhAnycast serviceName_GET(String serviceName) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAnycast.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /cdn/dedicated/{serviceName}/domains/{domain}
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 */
	public OvhDomain serviceName_domains_domain_GET(String serviceName, String domain) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDomain.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /cdn/dedicated/{serviceName}/domains/{domain}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 */
	public void serviceName_domains_domain_PUT(String serviceName, String domain, OvhDomain body) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		exec("PUT", qPath, body);
	}

	/**
	 * Remove a domain from the CDN
	 * 
	 * REST: DELETE /cdn/dedicated/{serviceName}/domains/{domain}
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 */
	public OvhTask serviceName_domains_domain_DELETE(String serviceName, String domain) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Backend associated to the domain
	 * 
	 * REST: GET /cdn/dedicated/{serviceName}/domains/{domain}/backends
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 */
	public ArrayList<String> serviceName_domains_domain_backends_GET(String serviceName, String domain) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/backends";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<String>> t2 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Add a backend IP
	 * 
	 * REST: POST /cdn/dedicated/{serviceName}/domains/{domain}/backends
	 * @param ip [required] IP to add to backends list
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 */
	public OvhBackend serviceName_domains_domain_backends_POST(String serviceName, String domain, String ip) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/backends";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ip", ip);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhBackend.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /cdn/dedicated/{serviceName}/domains/{domain}/backends/{ip}
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 * @param ip [required]
	 */
	public OvhBackend serviceName_domains_domain_backends_ip_GET(String serviceName, String domain, String ip) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/backends/{ip}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{ip}", ip);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhBackend.class);
	}

	/**
	 * Remove a backend IP
	 * 
	 * REST: DELETE /cdn/dedicated/{serviceName}/domains/{domain}/backends/{ip}
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 * @param ip [required]
	 */
	public String serviceName_domains_domain_backends_ip_DELETE(String serviceName, String domain, String ip) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/backends/{ip}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{ip}", ip);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Task associated to the domain
	 * 
	 * REST: GET /cdn/dedicated/{serviceName}/domains/{domain}/tasks
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 */
	public ArrayList<Long> serviceName_domains_domain_tasks_GET(String serviceName, String domain) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/tasks";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<Long>> t3 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 * 
	 * REST: GET /cdn/dedicated/{serviceName}/domains/{domain}/tasks/{taskId}
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 * @param taskId [required]
	 */
	public OvhTask serviceName_domains_domain_tasks_taskId_GET(String serviceName, String domain, Long taskId) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/tasks/{taskId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{taskId}", taskId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Flush all cache
	 * 
	 * REST: POST /cdn/dedicated/{serviceName}/domains/{domain}/flush
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 */
	public OvhTask serviceName_domains_domain_flush_POST(String serviceName, String domain) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/flush";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Return stats about a domain
	 * 
	 * REST: GET /cdn/dedicated/{serviceName}/domains/{domain}/statistics
	 * @param period [required]
	 * @param value [required]
	 * @param type [required]
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 */
	public ArrayList<OvhStatsDataType> serviceName_domains_domain_statistics_GET(String serviceName, String domain, OvhStatsPeriodEnum period, OvhStatsTypeEnum type, OvhStatsValueEnum value) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/statistics";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		qPath = query(qPath, "period", period);
		qPath = query(qPath, "type", type);
		qPath = query(qPath, "value", value);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Cache rules associated to the domain
	 * 
	 * REST: GET /cdn/dedicated/{serviceName}/domains/{domain}/cacheRules
	 * @param fileMatch [required] Filter the value of fileMatch property (like)
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 */
	public ArrayList<Long> serviceName_domains_domain_cacheRules_GET(String serviceName, String domain, String fileMatch) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/cacheRules";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		qPath = query(qPath, "fileMatch", fileMatch);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Add a cache rule to a domain
	 * 
	 * REST: POST /cdn/dedicated/{serviceName}/domains/{domain}/cacheRules
	 * @param cacheType [required] Type of cache rule to add to the domain
	 * @param ttl [required] ttl for cache rule to add to the domain
	 * @param fileMatch [required] File match for cache rule to add to the domain
	 * @param fileType [required] File type for cache rule to add to the domain
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 */
	public OvhCacheRule serviceName_domains_domain_cacheRules_POST(String serviceName, String domain, OvhCacheRuleCacheTypeEnum cacheType, Long ttl, String fileMatch, OvhCacheRuleFileTypeEnum fileType) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/cacheRules";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "cacheType", cacheType);
		addBody(o, "ttl", ttl);
		addBody(o, "fileMatch", fileMatch);
		addBody(o, "fileType", fileType);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhCacheRule.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /cdn/dedicated/{serviceName}/domains/{domain}/cacheRules/{cacheRuleId}
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 * @param cacheRuleId [required] Id for this cache rule
	 */
	public OvhCacheRule serviceName_domains_domain_cacheRules_cacheRuleId_GET(String serviceName, String domain, Long cacheRuleId) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/cacheRules/{cacheRuleId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{cacheRuleId}", cacheRuleId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhCacheRule.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /cdn/dedicated/{serviceName}/domains/{domain}/cacheRules/{cacheRuleId}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 * @param cacheRuleId [required] Id for this cache rule
	 */
	public void serviceName_domains_domain_cacheRules_cacheRuleId_PUT(String serviceName, String domain, Long cacheRuleId, OvhCacheRule body) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/cacheRules/{cacheRuleId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{cacheRuleId}", cacheRuleId.toString());
		exec("PUT", qPath, body);
	}

	/**
	 * Remove cache rule
	 * 
	 * REST: DELETE /cdn/dedicated/{serviceName}/domains/{domain}/cacheRules/{cacheRuleId}
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 * @param cacheRuleId [required] Id for this cache rule
	 */
	public OvhTask serviceName_domains_domain_cacheRules_cacheRuleId_DELETE(String serviceName, String domain, Long cacheRuleId) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/cacheRules/{cacheRuleId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{cacheRuleId}", cacheRuleId.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Task associated to the cache rule
	 * 
	 * REST: GET /cdn/dedicated/{serviceName}/domains/{domain}/cacheRules/{cacheRuleId}/tasks
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 * @param cacheRuleId [required] Id for this cache rule
	 */
	public ArrayList<Long> serviceName_domains_domain_cacheRules_cacheRuleId_tasks_GET(String serviceName, String domain, Long cacheRuleId) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/cacheRules/{cacheRuleId}/tasks";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{cacheRuleId}", cacheRuleId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /cdn/dedicated/{serviceName}/domains/{domain}/cacheRules/{cacheRuleId}/tasks/{taskId}
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 * @param cacheRuleId [required] Id for this cache rule
	 * @param taskId [required]
	 */
	public OvhTask serviceName_domains_domain_cacheRules_cacheRuleId_tasks_taskId_GET(String serviceName, String domain, Long cacheRuleId, Long taskId) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/cacheRules/{cacheRuleId}/tasks/{taskId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{cacheRuleId}", cacheRuleId.toString());
		qPath = qPath.replace("{taskId}", taskId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Flush the cache
	 * 
	 * REST: POST /cdn/dedicated/{serviceName}/domains/{domain}/cacheRules/{cacheRuleId}/flush
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param domain [required] Domain of this object
	 * @param cacheRuleId [required] Id for this cache rule
	 */
	public OvhTask serviceName_domains_domain_cacheRules_cacheRuleId_flush_POST(String serviceName, String domain, Long cacheRuleId) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains/{domain}/cacheRules/{cacheRuleId}/flush";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{domain}", domain);
		qPath = qPath.replace("{cacheRuleId}", cacheRuleId.toString());
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Domains associated to this anycast
	 * 
	 * REST: GET /cdn/dedicated/{serviceName}/domains
	 * @param serviceName [required] The internal name of your CDN offer
	 */
	public ArrayList<String> serviceName_domains_GET(String serviceName) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Add a domain on CDN
	 * 
	 * REST: POST /cdn/dedicated/{serviceName}/domains
	 * @param domain [required] domain name to add on CDN
	 * @param serviceName [required] The internal name of your CDN offer
	 */
	public OvhDomain serviceName_domains_POST(String serviceName, String domain) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/domains";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "domain", domain);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhDomain.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /cdn/dedicated/{serviceName}/ssl
	 * @param serviceName [required] The internal name of your CDN offer
	 */
	public OvhSsl serviceName_ssl_GET(String serviceName) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/ssl";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhSsl.class);
	}

	/**
	 * Add a SSL on CDN or Generate a Lets Encrypt certificate
	 * 
	 * REST: POST /cdn/dedicated/{serviceName}/ssl
	 * @param chain [required] certificate chain (empty for lets encrypt generation)
	 * @param certificate [required] certificate (empty for lets encrypt generation)
	 * @param name [required] ssl name to add on CDN
	 * @param key [required] certificate key (empty for lets encrypt generation)
	 * @param serviceName [required] The internal name of your CDN offer
	 */
	public OvhSsl serviceName_ssl_POST(String serviceName, String chain, String certificate, String name, String key) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/ssl";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "chain", chain);
		addBody(o, "certificate", certificate);
		addBody(o, "name", name);
		addBody(o, "key", key);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhSsl.class);
	}

	/**
	 * Remove SSL of the CDN
	 * 
	 * REST: DELETE /cdn/dedicated/{serviceName}/ssl
	 * @param serviceName [required] The internal name of your CDN offer
	 */
	public OvhTask serviceName_ssl_DELETE(String serviceName) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/ssl";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Task associated to the ssl
	 * 
	 * REST: GET /cdn/dedicated/{serviceName}/ssl/tasks
	 * @param function [required] Filter the value of function property (=)
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] The internal name of your CDN offer
	 */
	public ArrayList<Long> serviceName_ssl_tasks_GET(String serviceName, OvhTaskFunctionEnum function, OvhTaskStateEnum status) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/ssl/tasks";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "function", function);
		qPath = query(qPath, "status", status);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /cdn/dedicated/{serviceName}/ssl/tasks/{taskId}
	 * @param serviceName [required] The internal name of your CDN offer
	 * @param taskId [required]
	 */
	public OvhTask serviceName_ssl_tasks_taskId_GET(String serviceName, Long taskId) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/ssl/tasks/{taskId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{taskId}", taskId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Update an existing SSL with a custom certificate
	 * 
	 * REST: POST /cdn/dedicated/{serviceName}/ssl/update
	 * @param chain [required] certificate chain
	 * @param certificate [required] certificate
	 * @param key [required] certificate key
	 * @param serviceName [required] The internal name of your CDN offer
	 */
	public OvhTask serviceName_ssl_update_POST(String serviceName, String chain, String certificate, String key) throws IOException {
		String qPath = "/cdn/dedicated/{serviceName}/ssl/update";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "chain", chain);
		addBody(o, "certificate", certificate);
		addBody(o, "key", key);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /cdn/dedicated
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/cdn/dedicated";
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * List of CDN Pops
	 * 
	 * REST: GET /cdn/dedicated/pops
	 */
	public ArrayList<String> pops_GET() throws IOException {
		String qPath = "/cdn/dedicated/pops";
		String resp = execN("GET", qPath);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /cdn/dedicated/pops/{name}
	 * @param name [required] Name of the pop
	 */
	public OvhPop pops_name_GET(String name) throws IOException {
		String qPath = "/cdn/dedicated/pops/{name}";
		qPath = qPath.replace("{name}", name);
		String resp = execN("GET", qPath);
		return convertTo(resp, OvhPop.class);
	}
}