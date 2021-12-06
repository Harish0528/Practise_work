package com.bitlabs.bischeduler.entity;




public class Password {

	private String username,oldpwd,newpwd,cfmpwd;

	public String getNewpwd() {
		return newpwd;
	}

	public void setNewpwd(String newpwd) {
		this.newpwd = newpwd;
	}

	public String getCfmpwd() {
		return cfmpwd;
	}

	public void setCfmpwd(String cfmpwd) {
		this.cfmpwd = cfmpwd;
	}

	public String getOldpwd() {
		return oldpwd;
	}

	public void setOldpwd(String oldpwd) {
		this.oldpwd = oldpwd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
