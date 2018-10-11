package com.capgemini.orderapp.service.impl;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.orderapp.entity.LineItem;
import com.capgemini.orderapp.entity.Order;
import com.capgemini.orderapp.repository.OrderRepository;
import com.capgemini.orderapp.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	private HashMap<Integer, Set<LineItem>> map = new HashMap<>();
	
	
	
	@Override
	public Order getOrder(int OrderId) {
		Optional<Order> optionalOrder=orderRepository.findById(OrderId);
		if(optionalOrder.isPresent()) {
			Order order=optionalOrder.get();
			orderRepository.save(order);
			return order;
		}
		return null;
	}

	@Override
	public Order submitOrder(Order order) {
		order.setOrderDate(LocalDate.now());
		return orderRepository.save(order);
	}

	@Override
	public Order updateOrder(Order order) {
		
		return orderRepository.save(order);
		
	}

	@Override
	public Order deleteOrder(int OrderId) {
		Optional<Order> optionalOrder=orderRepository.findById(OrderId);
		if(optionalOrder.isPresent()) {
			Order order= optionalOrder.get();
			/*order.setStatus("DELETED");*/
			order.setStatus("DELETED");			
			orderRepository.save(order);
            return order;
			
		}
		return null;
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public Order cancelOrder(int OrderId) {
		Optional<Order> optionalOrder=orderRepository.findById(OrderId);
		if(optionalOrder.isPresent()) {
			Order order=optionalOrder.get();
			order.setStatus("CANCELLED");
			orderRepository.save(order);
			return order;
			
		}
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addLineItem(LineItem lineItem, int customerId) {
		
		Set<LineItem>  set=map.get(customerId);
		if (set == null) {
			set = new HashSet<>();
			set.add(lineItem);
			map.put(customerId, set);
		} else {
			set.add(lineItem);
			map.put(customerId, set);
		}
		
		
	}


	@Override
	public List<Order> findAllOrders() {
		return orderRepository.findAll();
	}

	

	

	
	
}