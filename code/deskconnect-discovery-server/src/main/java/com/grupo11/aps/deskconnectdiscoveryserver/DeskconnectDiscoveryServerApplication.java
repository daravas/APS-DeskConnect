package com.grupo11.aps.deskconnectdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DeskconnectDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeskconnectDiscoveryServerApplication.class, args);
	}

}
