package com.grupo11.aps.deskconnectservicoconta.model;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableRabbit
@Component
@RequiredArgsConstructor
public class Producer {
	
	@Autowired
	private final RabbitTemplate rabbitTemplate;
	
	@Autowired
    private Queue queue;
	
	public void sendMessage(Long id) {
		try {
			rabbitTemplate.convertAndSend(queue.getName(), id);
			log.info("Message was sent successfully.");
		}catch(Exception err) {
			log.info("Error while trying to send a message: ", err.getMessage());
		}
	}
}