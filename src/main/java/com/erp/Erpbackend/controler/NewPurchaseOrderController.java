package com.erp.Erpbackend.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.Erpbackend.model.NewPurchaseOrder;
import com.erp.Erpbackend.service.NewPurchaseOrderService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/newpurchase")
public class NewPurchaseOrderController {
	@Autowired
	private NewPurchaseOrderService service;
	
	@PostMapping("/add")
	public ResponseEntity<NewPurchaseOrder>  addOrderHandler(@RequestBody NewPurchaseOrder order){
		return new ResponseEntity<>(service.addOrder(order),HttpStatus.OK);
	}
	
	
	@GetMapping("/list")
	public ResponseEntity<List<NewPurchaseOrder>> findAllOrderHandler(){
		return new ResponseEntity<>(service.findAllNewPurchaseOrder(),HttpStatus.OK);
	}
	
	@GetMapping("/invoice/{id}")
	public ResponseEntity<NewPurchaseOrder>  getOrderHandler(@PathVariable Integer id){
		return new ResponseEntity<>(service.getAllOrderById(id),HttpStatus.OK);
	}
	

}
