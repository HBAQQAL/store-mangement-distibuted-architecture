package com.customerservice.customerservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customerservice.customerservice.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
