package com.olakunle.simpleecommerce.services.implementations;

import com.olakunle.simpleecommerce.dto.requests.CustomerRequest;
import com.olakunle.simpleecommerce.dto.responses.CustomerResponse;
import com.olakunle.simpleecommerce.models.Customer;
import com.olakunle.simpleecommerce.repositories.CustomerRepository;
import com.olakunle.simpleecommerce.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final ModelMapper modelMapper;

    public List<CustomerResponse> fetchCustomers () {
        List<CustomerResponse> customerResponseList = new ArrayList<>();
        List<Customer> customers = customerRepository.findAll();
        for (Customer customer : customers) {
            customerResponseList.add( modelMapper.map(customer, CustomerResponse.class));
        }

        return customerResponseList;
    }

    @Override
    public CustomerResponse addCustomer(CustomerRequest request) {
        Customer customer = modelMapper.map(request, Customer.class);
        customerRepository.save(customer);

        return modelMapper.map(customer, CustomerResponse.class);
    }

}
