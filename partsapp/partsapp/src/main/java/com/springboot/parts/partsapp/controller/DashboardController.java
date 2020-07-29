package com.springboot.parts.partsapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import com.springboot.parts.partsapp.dto.AccysalesRep;

@Controller
@CrossOrigin
public class DashboardController {
	@GetMapping("/gethighaccysale")
	public List<AccysalesRep> gethighSaleAccy(){
		return null;
	}	
}
