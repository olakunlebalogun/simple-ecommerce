package com.olakunle.simpleecommerce.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Product {

    @Id
    private String id;
    private String productName;
    private String productDescription;
    private Double unitPrice;
    private Double weight;
    private String sku;
}
