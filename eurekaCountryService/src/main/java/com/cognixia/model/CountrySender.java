package com.cognixia.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CountrySender {
@Bean
public CommandLineRunner sendToDos(@Value("${country.amqp.queue}") String destination, CountryProducer producer) {
	return args -> {
	Country country = new Country();
		country.setCountryName("France");
		producer.sendTo(destination, country);
		country.setCountryName("Italy");
		producer.sendTo(destination, country);
		country.setCountryName("Canada");
		producer.sendTo(destination, country);
		country.setCountryName("USA");
		producer.sendTo(destination, country);
		};
	}
}
