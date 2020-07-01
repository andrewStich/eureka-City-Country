package com.cognixia.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CitySender {
@Bean
public CommandLineRunner sendToDos(@Value("${city.amqp.queue}") String destination, CityProducer producer) {
	return args -> {
	City city = new City();
		city.setCityName("Paris");
		producer.sendTo(destination, city);
		city.setCityName("Bordeaux");
		producer.sendTo(destination, city);
		city.setCityName("Lyon");
		producer.sendTo(destination, city);
		city.setCityName("Marseille");
		producer.sendTo(destination, city);
		};
	}
}
