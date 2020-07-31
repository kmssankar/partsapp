package com.springboot.parts.partsapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.parts.partsapp.dto.AccysalesRep;
import com.springboot.parts.partsapp.dto.ReportOutput;
import com.springboot.parts.partsapp.service.HomeReportService;


@CrossOrigin
@RestController
public class DashboardController {
	@Autowired
	HomeReportService homeReportService;
	
	@GetMapping("/gethighaccysale")
	public List<AccysalesRep> gethighSaleAccy(){
		return null;
	}	
	
	@GetMapping("/getfiveYearSales")
	public ReportOutput getFiveYearSales(){

		return homeReportService.getLastFiveyearsales();
	}	
}
