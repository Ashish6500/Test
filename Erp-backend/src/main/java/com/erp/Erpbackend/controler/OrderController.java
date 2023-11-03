package com.erp.Erpbackend.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.erp.Erpbackend.model.OrderContract;
import com.erp.Erpbackend.service.OrderService;

@RestController
@CrossOrigin(origins="*")
public class OrderController {
	@Autowired
	private OrderService service;
	
	@PostMapping("/add")
	public ResponseEntity<OrderContract> addOrder(@RequestBody OrderContract order){
		return new ResponseEntity<>(service.addOrder(order),HttpStatus.OK);
	}
	@GetMapping("/orders")
	public ResponseEntity<List<OrderContract>> findAllOrderHandler(){
		return new ResponseEntity<>(service.findAllOrder(),HttpStatus.OK);
	}

}
