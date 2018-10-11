package com.capgemini.orderapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.orderapp.entity.LineItem;
import com.capgemini.orderapp.entity.Order;
import com.capgemini.orderapp.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/addorder/{customerId}")
	public ResponseEntity<LineItem> addLineItem(@RequestBody LineItem lineItem, @PathVariable int customerId) {
		orderService.addLineItem(lineItem, customerId);
		return new ResponseEntity<>(HttpStatus.OK);
		}
	
	
	
	@PostMapping("/submitorder")
	public ResponseEntity<Order> submitOrder(@RequestBody Order order) {
		return new ResponseEntity<Order>(orderService.submitOrder(order), HttpStatus.OK);
	
	}
	@GetMapping("/deleteorder/{orderId}")
	public ResponseEntity<Order> deleteOrder(@PathVariable int orderId){
		 ResponseEntity<Order> responseEntity=new ResponseEntity<Order>(orderService.deleteOrder(orderId),HttpStatus.OK);
		return responseEntity;
		 
		}
	
	
	@GetMapping("/cancelorder/{orderId}")
	public ResponseEntity<Order> cancelOrder(@PathVariable int orderId){
		ResponseEntity<Order> responseEntity=new ResponseEntity<Order>(orderService.cancelOrder(orderId),HttpStatus.OK);
		return responseEntity;
		
	}
	@PutMapping("/updateorder/{orderId}")
	public ResponseEntity<Order> updateOrder(@RequestBody Order order){
		ResponseEntity<Order> responseEntity=new ResponseEntity<Order>(orderService.updateOrder(order),HttpStatus.OK);
		return responseEntity;
		
	}
	//public Order getOrder(int OrderId);
	@GetMapping("/getorder/{orderId}")
	public ResponseEntity<Order> getOrder(@PathVariable int orderId){
		
		ResponseEntity<Order> responseEntity=new ResponseEntity<Order>(orderService.getOrder(orderId),HttpStatus.OK);
		return responseEntity;
		
	}
	
	@GetMapping("/findallorders")
	public ResponseEntity<List<Order>> findAllOrders(){
		return new ResponseEntity<List<Order>>(orderService.findAllOrders(),HttpStatus.OK);
	
	}
	
	
	
	
	
	
}
