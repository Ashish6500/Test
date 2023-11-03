package com.erp.Erpbackend.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.Erpbackend.exception.NewPurchaseOrderException;
import com.erp.Erpbackend.model.NewPurchaseOrder;
import com.erp.Erpbackend.repo.NewpurchaseOrderRepo;

@Service
public class NewPurchaseOrderService {
	
	@Autowired
	private NewpurchaseOrderRepo repo;
	
	public NewPurchaseOrder addOrder(NewPurchaseOrder order) {
		order.setTotal(order.getPrice()*order.getQuantity());
		order.setDate(LocalDate.now());
		return repo.save(order);
	}
	

	public List<NewPurchaseOrder> findAllNewPurchaseOrder()throws NewPurchaseOrderException  {
		List<NewPurchaseOrder> list=repo.findAll();
		if(list.isEmpty()) {
			throw new NewPurchaseOrderException("No order is in database Add the order first");
		}
		return list;
	}
	
	public NewPurchaseOrder getAllOrderById(Integer id)throws NewPurchaseOrderException  {
		return repo.findById(id).orElseThrow(()->new NewPurchaseOrderException("Order is not available with this Id: "+id));
	}

}
