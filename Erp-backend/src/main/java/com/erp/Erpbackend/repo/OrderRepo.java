package com.erp.Erpbackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erp.Erpbackend.model.OrderContract;

public interface OrderRepo extends JpaRepository<OrderContract, Integer> {

}
