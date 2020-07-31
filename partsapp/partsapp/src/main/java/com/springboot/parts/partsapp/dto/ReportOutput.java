package com.springboot.parts.partsapp.dto;

import java.util.List;

public class ReportOutput {
	List<SeriesValue> series;

	public List<SeriesValue> getSeriesValue() {
		return series;
	}

	public void setSeriesValue(List<SeriesValue> seriesValue) {
		this.series = seriesValue;
	}
}
