package com.discorveryservice.discorveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscorveryserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscorveryserviceApplication.class, args);
	}

}
