package com.olakunle.simpleecommerce.repositories;

import com.olakunle.simpleecommerce.models.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface CustomerRepository extends MongoRepository <Customer, String>{
    Optional<Customer> findCustomerByEmail(String email);
    Optional<Customer> findByEmail(String email);

}
