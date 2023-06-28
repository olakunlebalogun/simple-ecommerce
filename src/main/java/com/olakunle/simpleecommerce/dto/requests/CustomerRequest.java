package com.olakunle.simpleecommerce.dto.requests;

import com.olakunle.simpleecommerce.models.Address;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class CustomerRequest {
    @NotEmpty
    @NotBlank
    private String firstName;
    @NotEmpty
    @NotBlank
    private String lastName;
//    @NotEmpty
//    @NotBlank
//    private String address;
        private List<Address> address;
    @NotEmpty
    @NotBlank
    private String phoneNumber;
    //    private List<String> phoneNumber;
    @Email
    private String email;
    private Address shippingAddress;
    @NotEmpty
    @NotBlank
    private String creditCardDetails;
}
