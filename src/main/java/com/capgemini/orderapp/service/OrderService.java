package com.capgemini.orderapp.service;

import java.util.List;
import java.util.Set;

import org.springframework.http.HttpStatus;

import com.capgemini.orderapp.entity.LineItem;
import com.capgemini.orderapp.entity.Order;

public interface OrderService {
	
	public List<Order> findAllOrders();
	
   //public Set<Order> getOrders(int customerId);
	
	public Order getOrder(int OrderId);
	
	public Order submitOrder(Order order);
	
	public Order updateOrder(Order order);
	
	public Order deleteOrder(int OrderId);
	
	public Order cancelOrder(int OrderId);
	
    public void addLineItem(LineItem lineItem,int customerId);
	
	//public void removeLineItem(LineItem lineItem,int customerId);
	
	//public Set<LineItem> getLineItems(int customerId);


}
