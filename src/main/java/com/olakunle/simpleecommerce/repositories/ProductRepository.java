package com.olakunle.simpleecommerce.repositories;

import com.olakunle.simpleecommerce.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
