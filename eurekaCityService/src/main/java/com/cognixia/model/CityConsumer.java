package com.cognixia.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.cognixia.repository.CityRepository;

@Component
	public class CityConsumer {
	private static final Logger log = LoggerFactory.getLogger(CityConsumer.class);
	
	// 
	private CityRepository cityRepos;
	
	public CityConsumer(CityRepository repository) {
		this.cityRepos = repository;
	}
	
	// will be listening on the specified queue. save the queue sent by the
	// producer and save it on to the repository
	@RabbitListener(queues = "${city.amqp.queue}")
	public void processCountry(City city) {
	
	log.info("Consumer> " + city);
	log.info("Country created> " + this.cityRepos.save(city));
	}
}
