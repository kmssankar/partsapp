package com.springboot.parts.partsapp.repositary;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.parts.partsapp.entites.User;

public interface UserRepository  extends JpaRepository<User, Integer>{

	@Query("Select u from User u where u.userName = ?1")
	public Optional<User> getUserByUserName(String username);
	
}
