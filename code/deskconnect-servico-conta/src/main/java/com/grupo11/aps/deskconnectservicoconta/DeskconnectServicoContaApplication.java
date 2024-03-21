package com.grupo11.aps.deskconnectservicoconta;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class DeskconnectServicoContaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeskconnectServicoContaApplication.class, args);
	}

}
