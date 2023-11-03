package com.erp.Erpbackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erp.Erpbackend.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
