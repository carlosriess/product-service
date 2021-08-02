package com.tutuman.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.tutuman.productservice.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product,String> {
}
