package com.cognixia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cognixia.model.City;


@RepositoryRestResource // set your interface as a repository
public interface CityRepository extends JpaRepository<City, Integer>{

	@Query("select c from City c where c.cityName=?1")
	City getCityByName(String name);
	
}

