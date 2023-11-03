package com.erp.Erpbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.Erpbackend.exception.OrderException;
import com.erp.Erpbackend.model.OrderContract;
import com.erp.Erpbackend.repo.OrderRepo;

@Service
public class OrderService {
	@Autowired
	private OrderRepo repo;
	
	public OrderContract addOrder(OrderContract order) {
		order.setTotalAmount(order.getUnitPrice()*order.getOrderQuantity());
		return repo.save(order);
	}
	
	public List<OrderContract> findAllOrder() throws OrderException{
		List<OrderContract> list=repo.findAll();
		if(list.isEmpty()) {
			throw new OrderException("List is Empty");
		}
	return list;
	}

}
