package com.cognixia.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

	@Component // marks the class to be picked up by the Spring container
	public class CityProducer {
	private static final Logger log = LoggerFactory.getLogger(CityProducer.class);
	private RabbitTemplate template; // creates a RabbitTemplate object
	
	
	public CityProducer(RabbitTemplate template) {
		this.template = template;
	}
	
	public void sendTo(String queue, City city) {
	// routing key is the name of the queue in this case
	this.template.convertAndSend(queue, city); // converts java object to JSON format and sends as a message to the queue
	log.info("Producer> Message Sent");
	}
}
