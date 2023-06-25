package com.olakunle.simpleecommerce.dto.responses;

import com.olakunle.simpleecommerce.models.Address;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class CustomerResponse {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    //    private List<String> phoneNumber;
    private String email;
    private Address shippingAddress;
    private LocalDateTime dateCreated;
    private LocalDateTime lastUpdated;
}
