package com.springboot.parts.partsapp.dto;

public class RegisterUser {
	
	String email;
	String userName;
	String region;
	String password;
	String retypeUser;
	
	public String getRetypeUser() {
		return retypeUser;
	}
	public void setRetypeUser(String retypeUser) {
		this.retypeUser = retypeUser;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
