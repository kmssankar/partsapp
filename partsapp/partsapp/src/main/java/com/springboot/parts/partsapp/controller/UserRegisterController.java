package com.springboot.parts.partsapp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.parts.partsapp.dto.RegisterUser;
import com.springboot.parts.partsapp.service.UserRegisterService;

@RestController
public class UserRegisterController {
	
	UserRegisterService userRegisterService;

	@PostMapping("/api/register")
	public String registerUser(RegisterUser registerUser) {
		userRegisterService.registerUsertoDB(registerUser);
		return "Successfully Registered ";
	}
}
