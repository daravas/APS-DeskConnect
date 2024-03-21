package com.grupo11.aps.deskconnectservicoocorrencia;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableRabbit
@SpringBootApplication
public class DeskconnectServicoOcorrenciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeskconnectServicoOcorrenciaApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
