package com.cognixia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.model.Country;
import com.cognixia.model.CountryService;


@RestController
public class CountryController {

	@Autowired
	CountryService cs;

	@GetMapping("/Country")
	public List<Country> getCountries() {
		return cs.getCountry();
	}
}
