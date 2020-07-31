package com.springboot.parts.partsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.parts.partsapp.dto.RegisterMsg;
import com.springboot.parts.partsapp.dto.RegisterUser;
import com.springboot.parts.partsapp.service.UserRegisterService;

@CrossOrigin
@RestController
public class UserRegisterController {
	@Autowired
	UserRegisterService userRegisterService;

	@PostMapping("/api/register")
	public ResponseEntity<RegisterMsg> registerUser(@RequestBody RegisterUser registerUser) {
		System.out.println(registerUser.getUserName()+ " -- " + registerUser.getPassword());
		RegisterMsg reg =  new RegisterMsg();
		if(userRegisterService.checkUserExistence(registerUser.getUserName())) {
			userRegisterService.registerUsertoDB(registerUser);
			reg.setMessage("Successfully Registerd");				
				return 	ResponseEntity.status(HttpStatus.OK).body(reg);
		}else {
			reg.setMessage("Reg Failed ");	
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(reg);
		}
	}
}
