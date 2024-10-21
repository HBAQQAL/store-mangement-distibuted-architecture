
package com.customerservice.customerservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.customerservice.customerservice.entities.Customer;
import com.customerservice.customerservice.repositories.CustomerRepository;

@SpringBootApplication
public class CustomerserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerserviceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerRepository customerRepository) {
		return args -> {
			customerRepository.save(new Customer(null, "hamza", "hamzabaqqal@gmail.com"));
			customerRepository.save(new Customer(null, "amine", "aminemadoni@gmail.com"));
			customerRepository.save(new Customer(null, "houda", "houda@test.com"));
		};
	}

}
