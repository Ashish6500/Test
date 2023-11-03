package com.erp.Erpbackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erp.Erpbackend.model.NewPurchaseOrder;

public interface NewpurchaseOrderRepo extends JpaRepository<NewPurchaseOrder, Integer> {

}
