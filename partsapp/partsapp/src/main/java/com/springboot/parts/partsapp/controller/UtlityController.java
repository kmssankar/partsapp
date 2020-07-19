package com.springboot.parts.partsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtlityController {
	
	@Autowired
	BCryptPasswordEncoder bycBCryptPasswordEncoder;

	@GetMapping("/util/getencodedpass/{pass}")
	public String getEncodedPassword(@PathVariable String pass) {
		return bycBCryptPasswordEncoder.encode(pass);
	}
}
