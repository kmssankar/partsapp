package com.springboot.parts.partsapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.parts.partsapp.dto.AccyCodeDesc;
import com.springboot.parts.partsapp.service.SearchService;

//@CrossOrigin("Http://localhost:4200")
@CrossOrigin
@RestController
public class SearchController {
    @Autowired
    SearchService searchservice;
    
	@GetMapping("/series")
	public List<String> getSearchSeries(){
		return searchservice.getAllSeries();
	}
	@GetMapping("/modelyr/{series}")
	public List<String> getModelyrPerSeries(@PathVariable String series){
		return searchservice.fetchAllModelYrPerSeries(series);
	}
	
	@GetMapping("/modelcds/{series}/{modelYr}")
	public List<String> getModelcdPerSeriesModelYr(@PathVariable String series,@PathVariable String modelYr){
		return searchservice.fetchallModelsbySeriesModelYr(series, modelYr);
	}
	
	@GetMapping("/accycodes/{series}/{modelYr}/{model}")
	public List<AccyCodeDesc> getaccycdsPerSeriesModelYrModelcd(@PathVariable String series,@PathVariable String modelYr,@PathVariable String model){
		return searchservice.fetchallAccybySeriesModelYrModel(series, modelYr,model);
	}
}
