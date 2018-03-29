package net.minidev.ovh.api.dedicated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Operating system name
 */
public enum OvhOsAvailabilitiesEnum {
	@JsonProperty("archlinux-installer_64")
	archlinux_installer_64("archlinux-installer_64"),
	centos5_64("centos5_64"),
	@JsonProperty("centos6-cpanel-latest_64")
	centos6_cpanel_latest_64("centos6-cpanel-latest_64"),
	@JsonProperty("centos6-ovh_64")
	centos6_ovh_64("centos6-ovh_64"),
	@JsonProperty("centos6-plesk12_64")
	centos6_plesk12_64("centos6-plesk12_64"),
	centos6_64("centos6_64"),
	@JsonProperty("centos7-cpanel-latest_64")
	centos7_cpanel_latest_64("centos7-cpanel-latest_64"),
	@JsonProperty("centos7-directadmin_64")
	centos7_directadmin_64("centos7-directadmin_64"),
	@JsonProperty("centos7-fpga-accelize_64")
	centos7_fpga_accelize_64("centos7-fpga-accelize_64"),
	@JsonProperty("centos7-fpga-intel-opencl_64")
	centos7_fpga_intel_opencl_64("centos7-fpga-intel-opencl_64"),
	@JsonProperty("centos7-plesk125_64")
	centos7_plesk125_64("centos7-plesk125_64"),
	@JsonProperty("centos7-plesk12_64")
	centos7_plesk12_64("centos7-plesk12_64"),
	@JsonProperty("centos7-plesk17_64")
	centos7_plesk17_64("centos7-plesk17_64"),
	centos7_64("centos7_64"),
	cloudlinux6_64("cloudlinux6_64"),
	cloudlinux7_64("cloudlinux7_64"),
	@JsonProperty("coreos-alpha_64")
	coreos_alpha_64("coreos-alpha_64"),
	coreos_64("coreos_64"),
	@JsonProperty("debian7-ispconfig3_64")
	debian7_ispconfig3_64("debian7-ispconfig3_64"),
	@JsonProperty("debian7-minecraft_64")
	debian7_minecraft_64("debian7-minecraft_64"),
	@JsonProperty("debian7-plesk12_64")
	debian7_plesk12_64("debian7-plesk12_64"),
	debian7_64("debian7_64"),
	@JsonProperty("debian8-ispconfig3_64")
	debian8_ispconfig3_64("debian8-ispconfig3_64"),
	@JsonProperty("debian8-plesk125_64")
	debian8_plesk125_64("debian8-plesk125_64"),
	debian8_64("debian8_64"),
	debian8_armhf_32("debian8_armhf_32"),
	@JsonProperty("debian9-ispconfig3_64")
	debian9_ispconfig3_64("debian9-ispconfig3_64"),
	debian9_64("debian9_64"),
	debian9_armhf_32("debian9_armhf_32"),
	@JsonProperty("dgx1-os-3_64")
	dgx1_os_3_64("dgx1-os-3_64"),
	esxi51_64("esxi51_64"),
	esxi55_64("esxi55_64"),
	esxi5_64("esxi5_64"),
	esxi60_64("esxi60_64"),
	esxi65_64("esxi65_64"),
	fedora26_64("fedora26_64"),
	fedora27_64("fedora27_64"),
	@JsonProperty("freebsd10-zfs_64")
	freebsd10_zfs_64("freebsd10-zfs_64"),
	freebsd10_64("freebsd10_64"),
	@JsonProperty("freebsd11-zfs_64")
	freebsd11_zfs_64("freebsd11-zfs_64"),
	gentoo11_64("gentoo11_64"),
	openmediavault3_armhf_32("openmediavault3_armhf_32"),
	openmediavault_armhf_32("openmediavault_armhf_32"),
	opensuse42_64("opensuse42_64"),
	@JsonProperty("proxmox4-zfs_64")
	proxmox4_zfs_64("proxmox4-zfs_64"),
	proxmox4_64("proxmox4_64"),
	@JsonProperty("proxmox5-zfs_64")
	proxmox5_zfs_64("proxmox5-zfs_64"),
	proxmox5_64("proxmox5_64"),
	slackware14_64("slackware14_64"),
	smartos_64("smartos_64"),
	@JsonProperty("solusvm-master-vz_64")
	solusvm_master_vz_64("solusvm-master-vz_64"),
	@JsonProperty("solusvm-slave-vz_64")
	solusvm_slave_vz_64("solusvm-slave-vz_64"),
	@JsonProperty("ubuntu1404-plesk125_64")
	ubuntu1404_plesk125_64("ubuntu1404-plesk125_64"),
	@JsonProperty("ubuntu1404-server_64")
	ubuntu1404_server_64("ubuntu1404-server_64"),
	@JsonProperty("ubuntu1510-server_arm64_64")
	ubuntu1510_server_arm64_64("ubuntu1510-server_arm64_64"),
	@JsonProperty("ubuntu1510-server_ppc64el_64")
	ubuntu1510_server_ppc64el_64("ubuntu1510-server_ppc64el_64"),
	@JsonProperty("ubuntu1604-desktop_64")
	ubuntu1604_desktop_64("ubuntu1604-desktop_64"),
	@JsonProperty("ubuntu1604-server_64")
	ubuntu1604_server_64("ubuntu1604-server_64"),
	@JsonProperty("ubuntu1604-server_armhf_32")
	ubuntu1604_server_armhf_32("ubuntu1604-server_armhf_32"),
	@JsonProperty("ubuntu1604-server_ppc64el_64")
	ubuntu1604_server_ppc64el_64("ubuntu1604-server_ppc64el_64"),
	@JsonProperty("ubuntu1710-server_64")
	ubuntu1710_server_64("ubuntu1710-server_64"),
	@JsonProperty("win2008r2-dc-virtuozzo46_64")
	win2008r2_dc_virtuozzo46_64("win2008r2-dc-virtuozzo46_64"),
	@JsonProperty("win2008r2-dc_64")
	win2008r2_dc_64("win2008r2-dc_64"),
	@JsonProperty("win2008r2-ent-plesk10_64")
	win2008r2_ent_plesk10_64("win2008r2-ent-plesk10_64"),
	@JsonProperty("win2008r2-ent-plesk11_64")
	win2008r2_ent_plesk11_64("win2008r2-ent-plesk11_64"),
	@JsonProperty("win2008r2-ent-plesk12_64")
	win2008r2_ent_plesk12_64("win2008r2-ent-plesk12_64"),
	@JsonProperty("win2008r2-ent-sp2010found_64")
	win2008r2_ent_sp2010found_64("win2008r2-ent-sp2010found_64"),
	@JsonProperty("win2008r2-ent-virtuozzo46_64")
	win2008r2_ent_virtuozzo46_64("win2008r2-ent-virtuozzo46_64"),
	@JsonProperty("win2008r2-ent_64")
	win2008r2_ent_64("win2008r2-ent_64"),
	@JsonProperty("win2008r2-std-plesk11_64")
	win2008r2_std_plesk11_64("win2008r2-std-plesk11_64"),
	@JsonProperty("win2008r2-std-plesk12_64")
	win2008r2_std_plesk12_64("win2008r2-std-plesk12_64"),
	@JsonProperty("win2008r2-std-sp2010found_64")
	win2008r2_std_sp2010found_64("win2008r2-std-sp2010found_64"),
	@JsonProperty("win2008r2-std_64")
	win2008r2_std_64("win2008r2-std_64"),
	@JsonProperty("win2008r2-web-plesk11_64")
	win2008r2_web_plesk11_64("win2008r2-web-plesk11_64"),
	@JsonProperty("win2008r2-web-plesk12_64")
	win2008r2_web_plesk12_64("win2008r2-web-plesk12_64"),
	@JsonProperty("win2008r2-web-sp2010found_64")
	win2008r2_web_sp2010found_64("win2008r2-web-sp2010found_64"),
	@JsonProperty("win2008r2-web_64")
	win2008r2_web_64("win2008r2-web_64"),
	@JsonProperty("win2008r2core-dc_64")
	win2008r2core_dc_64("win2008r2core-dc_64"),
	@JsonProperty("win2008r2core-ent_64")
	win2008r2core_ent_64("win2008r2core-ent_64"),
	@JsonProperty("win2008r2core-hyperv_64")
	win2008r2core_hyperv_64("win2008r2core-hyperv_64"),
	@JsonProperty("win2008r2core-std_64")
	win2008r2core_std_64("win2008r2core-std_64"),
	@JsonProperty("win2008r2core-web_64")
	win2008r2core_web_64("win2008r2core-web_64"),
	@JsonProperty("win2012-dc_64")
	win2012_dc_64("win2012-dc_64"),
	@JsonProperty("win2012-hyperv3_64")
	win2012_hyperv3_64("win2012-hyperv3_64"),
	@JsonProperty("win2012-std-plesk11_64")
	win2012_std_plesk11_64("win2012-std-plesk11_64"),
	@JsonProperty("win2012-std-plesk12_64")
	win2012_std_plesk12_64("win2012-std-plesk12_64"),
	@JsonProperty("win2012-std_64")
	win2012_std_64("win2012-std_64"),
	@JsonProperty("win2012r2-dc_64")
	win2012r2_dc_64("win2012r2-dc_64"),
	@JsonProperty("win2012r2-hyperv3_64")
	win2012r2_hyperv3_64("win2012r2-hyperv3_64"),
	@JsonProperty("win2012r2-std-plesk12_64")
	win2012r2_std_plesk12_64("win2012r2-std-plesk12_64"),
	@JsonProperty("win2012r2-std_64")
	win2012r2_std_64("win2012r2-std_64"),
	@JsonProperty("win2016-dc_64")
	win2016_dc_64("win2016-dc_64"),
	@JsonProperty("win2016-std_64")
	win2016_std_64("win2016-std_64"),
	@JsonProperty("win81-pro-sysprep_64")
	win81_pro_sysprep_64("win81-pro-sysprep_64"),
	xenserver6_64("xenserver6_64");

	final String value;

	OvhOsAvailabilitiesEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}