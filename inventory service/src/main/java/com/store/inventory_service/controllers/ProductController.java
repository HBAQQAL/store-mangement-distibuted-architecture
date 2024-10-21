package com.store.inventory_service.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.store.inventory_service.entities.Product;
import com.store.inventory_service.repository.ProductRepositroy;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ProductController {
  private ProductRepositroy productRepositroy;

  public ProductController(ProductRepositroy productRepositroy) {
    this.productRepositroy = productRepositroy;
  }

  @GetMapping("/products")
  public List<Product> products() {
    return productRepositroy.findAll();
  }

}
