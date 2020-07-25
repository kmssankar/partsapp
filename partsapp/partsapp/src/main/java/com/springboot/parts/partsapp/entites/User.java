package com.springboot.parts.partsapp.entites;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String userName;
	String Password;
	String userArea;
	
	@OneToMany(fetch = FetchType.EAGER)
	Set<Role> roles;
	@OneToMany(fetch = FetchType.LAZY)
	List<AccySales> accysales;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getUserArea() {
		return userArea;
	}

	public void setUserArea(String userArea) {
		this.userArea = userArea;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public List<AccySales> getAccysales() {
		return accysales;
	}

	public void setAccysales(List<AccySales> accysales) {
		this.accysales = accysales;
	}
}
