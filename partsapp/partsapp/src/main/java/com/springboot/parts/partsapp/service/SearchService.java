package com.springboot.parts.partsapp.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.parts.partsapp.dto.AccyCodeDesc;
import com.springboot.parts.partsapp.entites.ModelAccy;
import com.springboot.parts.partsapp.repositary.ModelAccyRepo;

@Service
public class SearchService {

	@Autowired
	ModelAccyRepo modelAccyRepo;

	public List<String> getAllSeries() {
		List<ModelAccy> modelAccyList = modelAccyRepo.findAll();
		Map<String, String> uniqueList = new HashMap<String, String>();
		List<String> seriesList = modelAccyList.stream().map(n -> n.getSeriescd()).filter(n -> {
			if (uniqueList.containsKey(n)) {
				return false;
			} else {
				uniqueList.put(n, n);
				return true;
			}
		}).collect(Collectors.toList());
		return seriesList;
	}
	
	public List<String> fetchAllModelYrPerSeries(String series){
		List<ModelAccy> modelAccyList = modelAccyRepo.findmodelyrbySeries(series);
		List<String> modelyrList = modelAccyList.stream().map(n-> n.getModelyr()).distinct().collect(Collectors.toList());
		return modelyrList;
	}
	
	public List<String> fetchallModelsbySeriesModelYr(String series , String modelyr){
		List<ModelAccy> modelAccyList = modelAccyRepo.findmodelbySeriesMdlyr(series,modelyr);
		List<String> modelList = modelAccyList.stream().map(n-> n.getModelcd()).distinct().collect(Collectors.toList());
		return modelList;
	}
	
	public List<AccyCodeDesc> fetchallAccybySeriesModelYrModel(String series , String modelyr ,String model){
		List<ModelAccy> modelAccyList = modelAccyRepo.findaccytbySeriesMdlyrmodel(series, modelyr, model);
		List<AccyCodeDesc> accyList = modelAccyList.stream().map(n-> parseAccy(n)).distinct().collect(Collectors.toList());
		return accyList;
	}
	
	public static AccyCodeDesc parseAccy(ModelAccy modelAccy) {
		AccyCodeDesc accyCodeDesc= new AccyCodeDesc();
		accyCodeDesc.setAccycd(modelAccy.getAccycd());
		accyCodeDesc.setAccydesc(modelAccy.getAccydesc());
		return accyCodeDesc;
				
	}
}
