package com.erp.Erpbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.Erpbackend.exception.SupplierException;
import com.erp.Erpbackend.model.Supplier;
import com.erp.Erpbackend.repo.SupplierRepo;

@Service
public class SupplierService {
	@Autowired
	private SupplierRepo repo;
	
	public Supplier addSupplier(Supplier supplier) {
		return repo.save(supplier);
	}
	
	public List<Supplier> findAllSupplier() throws SupplierException{
		List<Supplier> list=repo.findAll();
		if(list.isEmpty()) {
			throw new SupplierException("No Supplier Added");
		}
		return list;
		
	}

}
