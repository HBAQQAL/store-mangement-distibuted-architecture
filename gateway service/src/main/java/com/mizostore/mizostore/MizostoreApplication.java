package com.mizostore.mizostore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MizostoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MizostoreApplication.class, args);
	}

}
