package net.minidev.ovh.api.dedicated.server;

import java.util.Date;

/**
 * Backup Ftp ACL for this server and Backup Ftp
 */
public class OvhBackupFtpAcl {
	/**
	 * Wether to allow the FTP protocol for this ACL
	 *
	 * canBeNull && readOnly
	 */
	public Boolean ftp;

	/**
	 * The IP Block specific to this ACL
	 *
	 * canBeNull && readOnly
	 */
	public String ipBlock;

	/**
	 * Date of the last object modification
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * Whether the rule has been applied on the Backup Ftp
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isApplied;

	/**
	 * Wether to allow the NFS protocol for this ACL
	 *
	 * canBeNull && readOnly
	 */
	public Boolean nfs;

	/**
	 * Wether to allow the CIFS (SMB) protocol for this ACL
	 *
	 * canBeNull && readOnly
	 */
	public Boolean cifs;
}
