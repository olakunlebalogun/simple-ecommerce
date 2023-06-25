package com.olakunle.simpleecommerce.services;

import com.olakunle.simpleecommerce.dto.requests.CustomerRequest;
import com.olakunle.simpleecommerce.dto.responses.CustomerResponse;

import java.util.List;

public interface CustomerService {
    List<CustomerResponse> fetchCustomers ();
    CustomerResponse addCustomer(CustomerRequest request);
}
