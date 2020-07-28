package com.springboot.parts.partsapp.entites;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity    
@Table(name="sales")
public class Sales {
    @Id
    @Column(name = "salesid" )
    int salesid;
    @Column(name = "year" ,length = 4)
    String year;
    @Column(name = "saletype",length = 1)
    String saletype;  
    @Column(name = "modelyr",length = 4)
    String modelyr;

    @Column(name = "accycd",length = 4)
    String accycd; 
    BigInteger salevolume;
    
    @Column(name = "dipsale",length = 1)
    String dipsale;   
    @Column(name = "model",length = 4)
    String model;    
    @Column(name = "series",length = 2)
    String series;    
    @Column(name = "region",length = 4)
    String region;
    
    
	public int getSalesid() {
		return salesid;
	}
	public void setSalesid(int salesid) {
		this.salesid = salesid;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getSaletype() {
		return saletype;
	}
	public void setSaletype(String saletype) {
		this.saletype = saletype;
	}
	public String getModelyr() {
		return modelyr;
	}
	public void setModelyr(String modelyr) {
		this.modelyr = modelyr;
	}
	public String getAccycd() {
		return accycd;
	}
	public void setAccycd(String accycd) {
		this.accycd = accycd;
	}
	public BigInteger getSalevolume() {
		return salevolume;
	}
	public void setSalevolume(BigInteger salevolume) {
		this.salevolume = salevolume;
	}
	public String getDipsale() {
		return dipsale;
	}
	public void setDipsale(String dipsale) {
		this.dipsale = dipsale;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
}
