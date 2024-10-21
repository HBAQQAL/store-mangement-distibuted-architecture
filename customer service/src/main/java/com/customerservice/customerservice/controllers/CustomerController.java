package com.customerservice.customerservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customerservice.customerservice.entities.Customer;
import com.customerservice.customerservice.repositories.CustomerRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CustomerController {

  private CustomerRepository customerRepository;

  public CustomerController(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  @GetMapping("/cutomers")
  public List<Customer> customers() {
    return customerRepository.findAll();
  }

}
