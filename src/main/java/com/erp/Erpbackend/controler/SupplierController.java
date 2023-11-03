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

import com.erp.Erpbackend.model.Supplier;
import com.erp.Erpbackend.service.SupplierService;
@RestController
@CrossOrigin(origins="*")
@RequestMapping("/supplier")
public class SupplierController {
	@Autowired
	private SupplierService service;
	
	@PostMapping("/add")
	public ResponseEntity<Supplier> addSupplierHandler(@RequestBody Supplier supplier){
		return new ResponseEntity<>(service.addSupplier(supplier),HttpStatus.OK);
	}
	@GetMapping("/list")
	public ResponseEntity<List<Supplier>> findAllSupplierHandler(){
		return new ResponseEntity<>(service.findAllSupplier(),HttpStatus.OK);
	}

}
