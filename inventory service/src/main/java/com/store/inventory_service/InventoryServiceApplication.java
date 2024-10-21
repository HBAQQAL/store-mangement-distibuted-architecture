package com.store.inventory_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.store.inventory_service.entities.Product;
import com.store.inventory_service.repository.ProductRepositroy;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ProductRepositroy productRepositroy) {
		return args -> {
			productRepositroy.save(new Product(null, "pc", 11.32, 42));
			productRepositroy.save(new Product(null, "phone", 232.42, 23));
		};
	}

}
