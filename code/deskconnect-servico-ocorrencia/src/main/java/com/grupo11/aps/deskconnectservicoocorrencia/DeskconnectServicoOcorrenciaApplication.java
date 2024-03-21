package com.grupo11.aps.deskconnectservicoocorrencia;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class DeskconnectServicoOcorrenciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeskconnectServicoOcorrenciaApplication.class, args);
	}

}
