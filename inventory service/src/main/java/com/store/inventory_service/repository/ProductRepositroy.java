package com.store.inventory_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.inventory_service.entities.Product;

public interface ProductRepositroy extends JpaRepository<Product, Long> {

}
