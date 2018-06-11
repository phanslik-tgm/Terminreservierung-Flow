package com.sew.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sew.backend.data.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
