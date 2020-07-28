package com.springboot.parts.partsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.parts.partsapp.dto.PartsUserDetails;
import com.springboot.parts.partsapp.service.PartsUserDetailService;

@CrossOrigin
@RestController
public class UserDetailController {
	
	@Autowired
	PartsUserDetailService partsUserDetailService;
	
	@GetMapping("/partsuserdetails/{username}")
	public PartsUserDetails getPartsUserDetail(@PathVariable String username) {
		return partsUserDetailService.fetchUserDetail(username);
	}
}
