package com.cognixia.model;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognixia.repository.CityRepository;

@Service
public class CityService {
@Autowired
CityRepository cs;

	public City createCity(City city) {
		return cs.save(city);
	}
	public List<City> getCity() {
		return cs.findAll();
	}

	public City getCityByName(String name) {
		return cs.getCityByName(name);
	}
}