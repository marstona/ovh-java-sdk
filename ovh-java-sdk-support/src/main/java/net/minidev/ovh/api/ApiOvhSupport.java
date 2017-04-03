package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import net.minidev.ovh.api.support.OvhMessage;
import net.minidev.ovh.api.support.OvhNewMessageInfo;
import net.minidev.ovh.api.support.OvhTicket;
import net.minidev.ovh.api.support.OvhTicketCategoryEnum;
import net.minidev.ovh.api.support.OvhTicketProductEnum;
import net.minidev.ovh.api.support.OvhTicketStatusEnum;
import net.minidev.ovh.api.support.OvhTicketSubCategoryEnum;
import net.minidev.ovh.api.support.OvhTicketTypeEnum;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/support
 * version:1.0
 */
public class ApiOvhSupport extends ApiOvhBase {
	public ApiOvhSupport(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Create a new ticket
	 * 
	 * REST: POST /support/tickets/create
	 * @param subcategory [required] Ticket message subcategory
	 * @param body [required] Ticket message body
	 * @param subject [required] Ticket message subject
	 * @param serviceName [required] Ticket message service name
	 * @param category [required] Ticket message category
	 * @param product [required] Ticket message product
	 * @param type [required] Ticket type (criticalIntervention requires VIP support level)
	 */
	public OvhNewMessageInfo tickets_create_POST(OvhTicketSubCategoryEnum subcategory, String body, String subject, String serviceName, OvhTicketCategoryEnum category, OvhTicketProductEnum product, OvhTicketTypeEnum type) throws IOException {
		String qPath = "/support/tickets/create";
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "subcategory", subcategory);
		addBody(o, "body", body);
		addBody(o, "subject", subject);
		addBody(o, "serviceName", serviceName);
		addBody(o, "category", category);
		addBody(o, "product", product);
		addBody(o, "type", type);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhNewMessageInfo.class);
	}

	/**
	 * Get ticket
	 * 
	 * REST: GET /support/tickets/{ticketId}
	 * @param ticketId [required] internal identifier ticket
	 */
	public OvhTicket tickets_ticketId_GET(Long ticketId) throws IOException {
		String qPath = "/support/tickets/{ticketId}";
		qPath = qPath.replace("{ticketId}", ticketId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTicket.class);
	}

	/**
	 * Reply to ticket
	 * 
	 * REST: POST /support/tickets/{ticketId}/reply
	 * @param ticketId [required] internal ticket identifier
	 * @param body [required] text body of ticket response
	 */
	public void tickets_ticketId_reply_POST(Long ticketId, String body) throws IOException {
		String qPath = "/support/tickets/{ticketId}/reply";
		qPath = qPath.replace("{ticketId}", ticketId.toString());
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "body", body);
		exec("POST", qPath, o);
	}

	/**
	 * Get ticket messages
	 * 
	 * REST: GET /support/tickets/{ticketId}/messages
	 * @param ticketId [required] internal ticket identifier
	 */
	public ArrayList<OvhMessage> tickets_ticketId_messages_GET(Long ticketId) throws IOException {
		String qPath = "/support/tickets/{ticketId}/messages";
		qPath = qPath.replace("{ticketId}", ticketId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhMessage>> t1 = new TypeReference<ArrayList<OvhMessage>>() {};

	/**
	 * Reopen a ticket
	 * 
	 * REST: POST /support/tickets/{ticketId}/reopen
	 * @param ticketId [required] internal ticket identifier
	 * @param body [required] ticket reopen reason
	 */
	public void tickets_ticketId_reopen_POST(Long ticketId, String body) throws IOException {
		String qPath = "/support/tickets/{ticketId}/reopen";
		qPath = qPath.replace("{ticketId}", ticketId.toString());
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "body", body);
		exec("POST", qPath, o);
	}

	/**
	 * Close ticket
	 * 
	 * REST: POST /support/tickets/{ticketId}/close
	 * @param ticketId [required] internal ticket identifier
	 */
	public void tickets_ticketId_close_POST(Long ticketId) throws IOException {
		String qPath = "/support/tickets/{ticketId}/close";
		qPath = qPath.replace("{ticketId}", ticketId.toString());
		exec("POST", qPath);
	}

	/**
	 * Checks whether ticket can be scored
	 * 
	 * REST: GET /support/tickets/{ticketId}/canBeScored
	 * @param ticketId [required] internal ticket identifier
	 */
	public Boolean tickets_ticketId_canBeScored_GET(Long ticketId) throws IOException {
		String qPath = "/support/tickets/{ticketId}/canBeScored";
		qPath = qPath.replace("{ticketId}", ticketId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, Boolean.class);
	}

	/**
	 * Set ticket score
	 * 
	 * REST: POST /support/tickets/{ticketId}/score
	 * @param ticketId [required] internal ticket identifier
	 * @param scoreComment [required] ticket comment about the score
	 * @param score [required] ticket score
	 */
	public void tickets_ticketId_score_POST(Long ticketId, String scoreComment, String score) throws IOException {
		String qPath = "/support/tickets/{ticketId}/score";
		qPath = qPath.replace("{ticketId}", ticketId.toString());
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "scoreComment", scoreComment);
		addBody(o, "score", score);
		exec("POST", qPath, o);
	}

	/**
	 * List support tickets identifiers for this service
	 * 
	 * REST: GET /support/tickets
	 * @param minCreationDate [required] Minimum creation date
	 * @param subject [required] Search by ticket subject
	 * @param status [required] Status of ticket
	 * @param serviceName [required] Ticket message service name
	 * @param maxCreationDate [required] Maximum creation date
	 * @param category [required] Search by ticket category
	 * @param product [required] Search by ticket product
	 */
	public ArrayList<Long> tickets_GET(OvhTicketCategoryEnum category, Date maxCreationDate, Date minCreationDate, OvhTicketProductEnum product, String serviceName, OvhTicketStatusEnum status, String subject) throws IOException {
		String qPath = "/support/tickets";
		qPath = query(qPath, "category", category);
		qPath = query(qPath, "maxCreationDate", maxCreationDate);
		qPath = query(qPath, "minCreationDate", minCreationDate);
		qPath = query(qPath, "product", product);
		qPath = query(qPath, "serviceName", serviceName);
		qPath = query(qPath, "status", status);
		qPath = query(qPath, "subject", subject);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<Long>> t2 = new TypeReference<ArrayList<Long>>() {};
}