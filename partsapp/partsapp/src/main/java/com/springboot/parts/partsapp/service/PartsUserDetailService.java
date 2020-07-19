package com.springboot.parts.partsapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.parts.partsapp.dto.PartsUserDetails;
import com.springboot.parts.partsapp.entites.User;
import com.springboot.parts.partsapp.repositary.UserRepository;

@Service
public class PartsUserDetailService {

	@Autowired 
	UserRepository userRepository;
	
	public PartsUserDetails fetchUserDetail(String username) {
		User user = userRepository.getUserByUserName(username);
		PartsUserDetails partsUserDetails = new PartsUserDetails();
		partsUserDetails.setUserName(user.getUserName());
		partsUserDetails.setUserArea(user.getUserArea());
		partsUserDetails.setAuthority(user.getUserArea());
		return partsUserDetails;
	}
}
