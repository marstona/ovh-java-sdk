package net.minidev.ovh.api.dbaas.logs;

/**
 * Possible values for UrlTypeEnum
 */
public enum OvhUrlTypeEnum {
	GRAYLOG_WEBUI("GRAYLOG_WEBUI"),
	GRAYLOG_API("GRAYLOG_API"),
	ELASTICSEARCH_API("ELASTICSEARCH_API"),
	KIBANA_WEBUI("KIBANA_WEBUI"),
	CONSOLE("CONSOLE"),
	WEB_SOCKET("WEB_SOCKET"),
	SERVICE_DOMAIN("SERVICE_DOMAIN"),
	TCP_TLS_GELF("TCP_TLS_GELF"),
	TCP_GELF("TCP_GELF"),
	UDP_GELF("UDP_GELF"),
	TCP_TLS_RFC5424("TCP_TLS_RFC5424"),
	TCP_RFC5424("TCP_RFC5424"),
	UDP_RFC5424("UDP_RFC5424"),
	TCP_TLS_LTSV_LINE("TCP_TLS_LTSV_LINE"),
	TCP_TLS_LTSV_NUL("TCP_TLS_LTSV_NUL"),
	TCP_LTSV_LINE("TCP_LTSV_LINE"),
	TCP_LTSV_NUL("TCP_LTSV_NUL"),
	TCP_TLS_CAP_N_PROTO("TCP_TLS_CAP_N_PROTO"),
	TCP_CAP_N_PROTO("TCP_CAP_N_PROTO"),
	UDP_LTSV_NUL("UDP_LTSV_NUL"),
	UDP_LTSV_LINE("UDP_LTSV_LINE"),
	UDP_CAP_N_PROTO("UDP_CAP_N_PROTO"),
	HTTP_GELF("HTTP_GELF"),
	HTTP_TLS_GELF("HTTP_TLS_GELF"),
	TCP_BEATS("TCP_BEATS"),
	TCP_TLS_BEATS("TCP_TLS_BEATS");

	final String value;

	OvhUrlTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
