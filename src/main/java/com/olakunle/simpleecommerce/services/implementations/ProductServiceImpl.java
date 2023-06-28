package com.olakunle.simpleecommerce.services.implementations;

import com.olakunle.simpleecommerce.dto.requests.ProductRequest;
import com.olakunle.simpleecommerce.dto.responses.CustomerResponse;
import com.olakunle.simpleecommerce.dto.responses.ProductResponse;
import com.olakunle.simpleecommerce.exceptions.CustomerNotFoundException;
import com.olakunle.simpleecommerce.exceptions.ProductNotFoundException;
import com.olakunle.simpleecommerce.models.Customer;
import com.olakunle.simpleecommerce.models.Product;
import com.olakunle.simpleecommerce.repositories.ProductRepository;
import com.olakunle.simpleecommerce.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;
    @Override
    public List<ProductResponse> getAllProducts() {
        List<ProductResponse> productResponses = new ArrayList<>();
        List<Product> products = productRepository.findAll();
        for (Product product : products) {
            productResponses.add( modelMapper.map(product, ProductResponse.class));
        }

        return productResponses;
    }

    @Override
    public ProductResponse getSingleProduct(String id) {
        Optional<Product> product = productRepository.findById(id);
        return modelMapper.map(product.orElseThrow(() -> new ProductNotFoundException(String.format("Customer with ID %s not found", id), HttpStatus.NOT_FOUND)), ProductResponse.class);
    }

    @Override
    public ProductResponse addProduct(ProductRequest request) {
        Product product = modelMapper.map(request, Product.class);
        productRepository.save(product);

        return modelMapper.map(product, ProductResponse.class);
    }
}
