package com.springboot.parts.partsapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.springboot.parts.partsapp.dto.KeyValuePairs;
import com.springboot.parts.partsapp.dto.ReportOutput;
import com.springboot.parts.partsapp.dto.SeriesValue;
import com.springboot.parts.partsapp.util.PartsAppConstants;

@Service
public class HomeReportService {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public ReportOutput getLastFiveyearsales() {
		
		ReportOutput reportOutput = new ReportOutput();
		SeriesValue vehSalesSrVal = new SeriesValue();
		SeriesValue accySalesSrVal = new SeriesValue();
		
		List<KeyValuePairs> modelSales = jdbcTemplate.query( PartsAppConstants.LastFiveYearSalesVehicle, (rs, rowNum) -> {		
			KeyValuePairs keyvalue = new KeyValuePairs();
			keyvalue.setName(rs.getString(2));
			keyvalue.setValue(rs.getInt(1));
		    return keyvalue;
		});
		vehSalesSrVal.setName(" Vehicle");
		vehSalesSrVal.setSeries(modelSales);
		
		List<KeyValuePairs> accySales = jdbcTemplate.query( PartsAppConstants.LastFiveYearSalesAccy, (rs, rowNum) -> {		
			KeyValuePairs keyvalue = new KeyValuePairs();
			keyvalue.setName(rs.getString(2));
			keyvalue.setValue(rs.getInt(1));
		    return keyvalue;
		});
		accySalesSrVal.setName(" Accy");
		accySalesSrVal.setSeries(accySales);
		List<SeriesValue> seriesValues = new ArrayList<>();
		seriesValues.add(vehSalesSrVal);
		seriesValues.add(accySalesSrVal);
		reportOutput.setSeriesValue(seriesValues);
		return reportOutput;
	}
}
