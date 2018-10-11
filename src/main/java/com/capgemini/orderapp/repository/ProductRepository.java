package com.capgemini.orderapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.orderapp.entity.Product;

public interface ProductRepository extends MongoRepository<Product, Integer> {

}
 