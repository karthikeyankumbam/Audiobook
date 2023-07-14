package com.personal.customerms.repository;

import com.personal.customerms.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Optional<Customer> findByUsername(String Username);
    Optional<Customer> findByEmail(String Username);
}
