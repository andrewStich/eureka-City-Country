package com.cognixia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.model.City;
import com.cognixia.model.CityService;

@RestController
public class CityController {

	@Autowired
	CityService cs;

	@GetMapping("/City")
	public String getCities() {
		String response = "Cities in France!<br><br>";
		List<City> cities= cs.getCity();
		
		for(City c : cities) {
			response += c.getCityName() + "<br>";
		}
		return response;
	}
}
