package com.erp.Erpbackend.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.Erpbackend.model.Customer;
import com.erp.Erpbackend.service.CustomerService;

import jakarta.validation.Valid;
@RestController
@CrossOrigin(origins="*")
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService service;
	@PostMapping("/add")
	public ResponseEntity<Customer> addOrder(@Valid @RequestBody Customer customer){
		return new ResponseEntity<>(service.addCustomer(customer),HttpStatus.OK);
	}
	@GetMapping("/list")
	public ResponseEntity<List<Customer>> findAllOrderHandler(){
		return new ResponseEntity<>(service.findAllCustomer(),HttpStatus.OK);
	}

}
