package com.springboot.parts.partsapp.repositary;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.parts.partsapp.entites.Sales;

@Repository
public interface Salesrepository extends JpaRepository<Sales, Integer> {
	
	@Query ("select s  from Sales s " + 
			"where s.series = ?1 " + 
			"and s.modelyr = ?2 " + 
			"and s.model = ?3 " + 
			"and s.accycd  in ?4 ")
	public Optional <List<Sales>> findSalesvolumeForAcy(String series,String mdlyr ,String mdl ,String[] Accys);

}
