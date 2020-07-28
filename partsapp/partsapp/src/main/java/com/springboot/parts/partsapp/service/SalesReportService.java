package com.springboot.parts.partsapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.parts.partsapp.dto.AccysalesRep;
import com.springboot.parts.partsapp.entites.Sales;
import com.springboot.parts.partsapp.repositary.Salesrepository;

@Service
public class SalesReportService {
	@Autowired
	Salesrepository salesrepository;
	
	public List<AccysalesRep> getSalesReportforAccy(String series, String mdlyr , String mdl , String[] accys){
		List<AccysalesRep> accySalesRep = new ArrayList<AccysalesRep>();
		List<Sales> salesResult = salesrepository.findSalesvolumeForAcy(series, mdlyr, mdl, accys).orElse(null);
		for(Sales sales : salesResult) {
			AccysalesRep accySales =new AccysalesRep();
			accySales.setName(sales.getAccycd());
			accySales.setValue(  sales.getSalevolume()  );
			accySalesRep.add(accySales);
		}
		return accySalesRep;
	}
}
