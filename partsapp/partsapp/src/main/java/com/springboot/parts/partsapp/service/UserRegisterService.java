package com.springboot.parts.partsapp.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.springboot.parts.partsapp.dto.RegisterUser;
import com.springboot.parts.partsapp.entites.Role;
import com.springboot.parts.partsapp.entites.User;
import com.springboot.parts.partsapp.repositary.RoleRepository;
import com.springboot.parts.partsapp.repositary.UserRepository;

@Service
public class UserRegisterService {

	@Autowired 
	UserRepository userRepository;
	@Autowired
	RoleRepository roleRepository;
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public String registerUsertoDB(RegisterUser regUser) {
		if(checkUserExistence(regUser.getUserName())){
		User user = new User();
		user.setUserName(regUser.getUserName());
		user.setUserArea(regUser.getRegion());
		user.setEmail(regUser.getEmail());
		user.setPassword(bCryptPasswordEncoder.encode(regUser.getPassword()));
		Role role = roleRepository.getRolebyName("ROLE_USER").get();
		Set<Role> roleset = new HashSet<>();
		roleset.add(role);
		user.setRoles(roleset);
		userRepository.save(user);
		return "Successfully registered";
		}else {
			return "User Id already Exists !";
		}
	}
	
	public boolean checkUserExistence (String userName) {
		User validateUser = userRepository.getUserByUserName(userName).orElse(null);
		return (validateUser==null);
	}
}
