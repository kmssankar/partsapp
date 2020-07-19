package com.springboot.parts.partsapp.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.parts.partsapp.entites.Role;
public interface  RoleRepository extends JpaRepository<Role, Integer> {

}
