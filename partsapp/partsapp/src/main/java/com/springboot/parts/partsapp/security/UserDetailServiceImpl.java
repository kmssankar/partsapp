package com.springboot.parts.partsapp.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springboot.parts.partsapp.entites.User;
import com.springboot.parts.partsapp.repositary.UserRepository;

@Service
public class UserDetailServiceImpl implements UserDetailsService  {

	@Autowired
	UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 User user = userRepository.getUserByUserName(username);
		 System.out.println("User : " + user.getId() + " " + user.getUserName());
		 if (user == null) {
	            throw new UsernameNotFoundException("Could not find user");
	        }
		 return new AppUserDetails(user);
    }
}
