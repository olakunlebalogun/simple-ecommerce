package com.olakunle.simpleecommerce.services.implementations;

import com.olakunle.simpleecommerce.dto.requests.CustomerRequest;
import com.olakunle.simpleecommerce.dto.responses.CustomerResponse;
import com.olakunle.simpleecommerce.exceptions.CustomerNotFoundException;
import com.olakunle.simpleecommerce.models.Customer;
import com.olakunle.simpleecommerce.repositories.CustomerRepository;
import com.olakunle.simpleecommerce.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Override
    public CustomerResponse getCustomer(String id) {
        Optional<Customer> customer = customerRepository.findById(id);
        return modelMapper.map(customer.orElseThrow(() -> new CustomerNotFoundException(String.format("Customer with ID %s not found", id), HttpStatus.NOT_FOUND)), CustomerResponse.class);
//        customer.orElseThrow(() -> new CustomerNotFoundException(String.format("Customer with ID %s not found", id), HttpStatus.NOT_FOUND));
//        customer.ifPresentOrElse((i) -> {
//             modelMapper.map(i, CustomerResponse.class);
//        }, {
//            throw new CustomerNotFoundException(String.format("Customer with ID %s not found", id));
//        });

    }

    @Override
    public CustomerResponse getCustomerByEmail(String email) {
        Optional<Customer> customer = customerRepository.findCustomerByEmail(email);
        return modelMapper.map(customer.orElseThrow(() -> new CustomerNotFoundException(String.format("Customer with email %s not found", email), HttpStatus.NOT_FOUND)), CustomerResponse.class);
    }

}
