package com.capgemini.orderapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.orderapp.entity.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, Integer>{
	
/*	@Query("{'Status' : {$eq : 'processing'}}")
	public List<Order> find();
*/
}
