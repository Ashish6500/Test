package com.erp.Erpbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.Erpbackend.exception.CustomerException;
import com.erp.Erpbackend.exception.SupplierException;
import com.erp.Erpbackend.model.Customer;
import com.erp.Erpbackend.repo.CustomerRepo;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepo repo;
	
	public Customer addCustomer(Customer customer) {
		return repo.save(customer);
	}
	
	public List<Customer> findAllCustomer() throws CustomerException{
		List<Customer> list=repo.findAll();
		if(list.isEmpty()) {
			throw new SupplierException("No Customer Added");
		}
		return list;
		
	}

}
