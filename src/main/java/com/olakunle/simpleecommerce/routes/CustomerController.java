package com.olakunle.simpleecommerce.routes;

import com.olakunle.simpleecommerce.dto.requests.CustomerRequest;
import com.olakunle.simpleecommerce.dto.responses.CustomerResponse;
import com.olakunle.simpleecommerce.services.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RequestMapping("/api/v1/customers")
@RestController
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    public ResponseEntity<List<CustomerResponse>> fetchAllCustomers() {
        return ResponseEntity.ok(customerService.fetchCustomers());
    }

    @PostMapping
    public ResponseEntity<CustomerResponse> createCustomer(@RequestBody @Valid CustomerRequest request) {
            return ResponseEntity.created(URI.create(request.getEmail())).body(customerService.addCustomer(request));
    }
}
