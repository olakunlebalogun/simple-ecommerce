package com.olakunle.simpleecommerce.services;

import com.olakunle.simpleecommerce.dto.requests.ProductRequest;
import com.olakunle.simpleecommerce.dto.responses.ProductResponse;

import java.util.List;

public interface ProductService {

    List<ProductResponse> getAllProducts();
    ProductResponse getSingleProduct(String id);

    ProductResponse addProduct(ProductRequest request);
}
