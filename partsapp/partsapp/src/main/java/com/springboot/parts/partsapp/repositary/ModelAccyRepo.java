package com.springboot.parts.partsapp.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.parts.partsapp.entites.ModelAccy;

public interface ModelAccyRepo extends JpaRepository<ModelAccy, Integer>{
	
	
	@Query("Select ma from ModelAccy ma where ma.seriescd = ?1 ")
	List<ModelAccy> findmodelyrbySeries(String series);
	
	@Query("Select ma from ModelAccy ma where ma.seriescd = ?1  and ma.modelyr = ?2")
	List<ModelAccy> findmodelbySeriesMdlyr(String series,String modelyr);
	
	@Query("Select ma from ModelAccy ma where ma.seriescd = ?1  and ma.modelyr = ?2 and ma.modelcd =?3")
	List<ModelAccy> findaccytbySeriesMdlyrmodel(String series,String modelyr , String model);
}
