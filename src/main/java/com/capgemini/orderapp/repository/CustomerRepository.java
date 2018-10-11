package com.capgemini.orderapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.orderapp.entity.Customer;

public interface CustomerRepository extends MongoRepository<Customer, Integer>{

}