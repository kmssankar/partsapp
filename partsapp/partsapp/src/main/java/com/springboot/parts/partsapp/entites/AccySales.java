package com.springboot.parts.partsapp.entites;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity	
@Table(name="accysales")	
public class AccySales {
	@Id
	int id;
	@Column(name="accy_code",length=2)
	String accyCode;
	@Column(name="sale_year",length=4)
	String saleYear;
	@Column(name="sale_month",length=2)
	String salemonth;
	BigInteger saleVolume;
	@Column(name="Accy_Type",length=5)
	String accyType;
	@Column(name="Sale_Area",length=5)
	String saleArea;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccyCode() {
		return accyCode;
	}
	public void setAccyCode(String accyCode) {
		this.accyCode = accyCode;
	}
	public String getSaleYear() {
		return saleYear;
	}
	public void setSaleYear(String saleYear) {
		this.saleYear = saleYear;
	}
	public String getSalemonth() {
		return salemonth;
	}
	public void setSalemonth(String salemonth) {
		this.salemonth = salemonth;
	}
	public BigInteger getSaleVolume() {
		return saleVolume;
	}
	public void setSaleVolume(BigInteger saleVolume) {
		this.saleVolume = saleVolume;
	}
	public String getAccyType() {
		return accyType;
	}
	public void setAccyType(String accyType) {
		this.accyType = accyType;
	}
	public String getSaleArea() {
		return saleArea;
	}
	public void setSaleArea(String saleArea) {
		this.saleArea = saleArea;
	}
}
