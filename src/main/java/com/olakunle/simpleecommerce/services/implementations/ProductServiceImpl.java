package com.olakunle.simpleecommerce.services.implementations;

import com.olakunle.simpleecommerce.dto.requests.ProductRequest;
import com.olakunle.simpleecommerce.dto.responses.ProductResponse;
import com.olakunle.simpleecommerce.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public List<ProductResponse> getAllProducts() {
        return null;
    }

    @Override
    public ProductResponse getSingleProduct(String id) {
        return null;
    }

    @Override
    public ProductResponse addProduct(ProductRequest request) {
        return null;
    }
}
