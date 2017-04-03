package net.minidev.ovh.api.email.exchange;

/**
 * function enumeration for exchange task
 */
public enum OvhTaskFunctionEnum {
	activateSharepoint("activateSharepoint"),
	addAccount("addAccount"),
	addActiveSyncMailNotification("addActiveSyncMailNotification"),
	addAlias("addAlias"),
	addDistributionGroup("addDistributionGroup"),
	addDistributionGroupManager("addDistributionGroupManager"),
	addDistributionGroupMember("addDistributionGroupMember"),
	addDistributionGroupSendAs("addDistributionGroupSendAs"),
	addDistributionGroupSendOnBehalfTo("addDistributionGroupSendOnBehalfTo"),
	addDomain("addDomain"),
	addDomainDisclaimer("addDomainDisclaimer"),
	addExchangeServiceAuthorizedIp("addExchangeServiceAuthorizedIp"),
	addExportPstRequest("addExportPstRequest"),
	addExternalContact("addExternalContact"),
	addFullAccess("addFullAccess"),
	addOutlookLicense("addOutlookLicense"),
	addPublicFolder("addPublicFolder"),
	addPublicFolderPermission("addPublicFolderPermission"),
	addResourceAccount("addResourceAccount"),
	addResourceDelegate("addResourceDelegate"),
	addSendAs("addSendAs"),
	addSendOnBehalfTo("addSendOnBehalfTo"),
	addSharedAccount("addSharedAccount"),
	addSharedAccountFullAccess("addSharedAccountFullAccess"),
	addSharedAccountSendAs("addSharedAccountSendAs"),
	addSharedAccountSendOnBehalfTo("addSharedAccountSendOnBehalfTo"),
	changeHostname("changeHostname"),
	changePassword("changePassword"),
	clearDataOnDevice("clearDataOnDevice"),
	cloneTemplateExchangePrivate("cloneTemplateExchangePrivate"),
	configureExchangeCustomer("configureExchangeCustomer"),
	deleteAccount("deleteAccount"),
	deleteActiveSyncMailNotification("deleteActiveSyncMailNotification"),
	deleteAlias("deleteAlias"),
	deleteDistributionGroup("deleteDistributionGroup"),
	deleteDistributionGroupManager("deleteDistributionGroupManager"),
	deleteDistributionGroupMember("deleteDistributionGroupMember"),
	deleteDistributionGroupSendAs("deleteDistributionGroupSendAs"),
	deleteDistributionGroupSendOnBehalfTo("deleteDistributionGroupSendOnBehalfTo"),
	deleteDomain("deleteDomain"),
	deleteDomainDisclaimer("deleteDomainDisclaimer"),
	deleteExchangeService("deleteExchangeService"),
	deleteExchangeServiceAuthorizedIp("deleteExchangeServiceAuthorizedIp"),
	deleteExportPstRequest("deleteExportPstRequest"),
	deleteExternalContact("deleteExternalContact"),
	deleteFullAccess("deleteFullAccess"),
	deleteOutlookLicense("deleteOutlookLicense"),
	deletePublicFolder("deletePublicFolder"),
	deletePublicFolderPermission("deletePublicFolderPermission"),
	deleteResourceAccount("deleteResourceAccount"),
	deleteResourceDelegate("deleteResourceDelegate"),
	deleteSendAs("deleteSendAs"),
	deleteSendOnBehalfTo("deleteSendOnBehalfTo"),
	deleteSharedAccount("deleteSharedAccount"),
	deleteSharedAccountFullAccess("deleteSharedAccountFullAccess"),
	deleteSharedAccountSendAs("deleteSharedAccountSendAs"),
	deleteSharedAccountSendOnBehalfTo("deleteSharedAccountSendOnBehalfTo"),
	destroyPrivateVm("destroyPrivateVm"),
	diagnoseAccount("diagnoseAccount"),
	expandDrive("expandDrive"),
	generateOutlookUrl("generateOutlookUrl"),
	generatePstUrl("generatePstUrl"),
	installExchange("installExchange"),
	installSSL("installSSL"),
	maintenance("maintenance"),
	migrationAccount("migrationAccount"),
	migrationDisclaimer("migrationDisclaimer"),
	migrationExternalContact("migrationExternalContact"),
	migrationHistory("migrationHistory"),
	migrationMailingList("migrationMailingList"),
	migrationResourceAccount("migrationResourceAccount"),
	migrationService("migrationService"),
	reOpenHostedAccount("reOpenHostedAccount"),
	reOpenOutlookLicense("reOpenOutlookLicense"),
	reOpenPrivateAccount("reOpenPrivateAccount"),
	reOpenPrivateVm("reOpenPrivateVm"),
	setAccount("setAccount"),
	setAlias("setAlias"),
	setDistributionGroup("setDistributionGroup"),
	setDns("setDns"),
	setDomain("setDomain"),
	setDomainDisclaimer("setDomainDisclaimer"),
	setExchangeAccountProtocol("setExchangeAccountProtocol"),
	setExchangeServiceDevice("setExchangeServiceDevice"),
	setExternalContact("setExternalContact"),
	setPublicFolder("setPublicFolder"),
	setPublicFolderPermission("setPublicFolderPermission"),
	setResourceAccount("setResourceAccount"),
	setService("setService"),
	setSharedAccount("setSharedAccount"),
	suspendAccount("suspendAccount"),
	suspendExchangeService("suspendExchangeService"),
	suspendHostedAccount("suspendHostedAccount"),
	suspendOutlookLicense("suspendOutlookLicense"),
	suspendPrivateAccount("suspendPrivateAccount"),
	suspendPrivateVm("suspendPrivateVm"),
	unsuspendAccount("unsuspendAccount"),
	unsuspendExchangeService("unsuspendExchangeService"),
	unsuspendHostedAccount("unsuspendHostedAccount"),
	updateExchangeServiceDevice("updateExchangeServiceDevice"),
	upgrade2016("upgrade2016");

	final String value;

	OvhTaskFunctionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}