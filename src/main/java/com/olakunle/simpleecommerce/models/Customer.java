package com.olakunle.simpleecommerce.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document
@Data
public class Customer {
    @Id
    private String id;
    private String firstName;
    private String lastName;
//    private String address;
    private List<Address> address;
    private String phoneNumber;
//    private List<String> phoneNumber;
    @Indexed(unique = true)
    private String email;
    private Address shippingAddress;
    private LocalDateTime dateCreated;
    private LocalDateTime lastUpdated;
    private String creditCardDetails;
    @DBRef(db = "product")
    private List<Product> products;
}
