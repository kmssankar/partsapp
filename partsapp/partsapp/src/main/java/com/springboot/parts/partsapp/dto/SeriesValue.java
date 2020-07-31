package com.springboot.parts.partsapp.dto;

import java.util.List;

public class SeriesValue {
	
	String name;
	List<KeyValuePairs> series;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<KeyValuePairs> getSeries() {
		return series;
	}
	public void setSeries(List<KeyValuePairs> seriesList) {
		this.series = seriesList;
	}
}
