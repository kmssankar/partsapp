package com.springboot.parts.partsapp.entites;

import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "modelaccy")
@Cacheable
public class ModelAccy {
	@Id
	@Column(name = "model_Accy_id" )
	int id;
	@Column(name = "series_cd" ,length = 2)
	String seriescd;

	@Column(name = "model_yr",length = 4)
	String modelyr;

	@Column(name = "model_cd",length = 4)
	String modelcd;

	@Column(name = "accy_cd",length = 4)
	String accycd; 
	
	@Column(name ="accy_desc", length =45)
	String accydesc;

	@Column(name = "last_updated_ts")
	@Temporal(TemporalType.TIMESTAMP)
	Date lastUpdtts;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSeriescd() {
		return seriescd;
	}

	public void setSeriescd(String seriescd) {
		this.seriescd = seriescd;
	}

	public String getModelyr() {
		return modelyr;
	}

	public void setModelyr(String modelyr) {
		this.modelyr = modelyr;
	}

	public String getModelcd() {
		return modelcd;
	}

	public void setModelcd(String modelcd) {
		this.modelcd = modelcd;
	}

	public String getAccycd() {
		return accycd;
	}

	public void setAccycd(String accycd) {
		this.accycd = accycd;
	}

	public Date getLastUpdtts() {
		return lastUpdtts;
	}

	public void setLastUpdtts(Date lastUpdtts) {
		this.lastUpdtts = lastUpdtts;
	}

	public String getAccydesc() {
		return accydesc;
	}

	public void setAccydesc(String accydesc) {
		this.accydesc = accydesc;
	}
	
}
