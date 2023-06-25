package com.olakunle.simpleecommerce.models;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class Address {
    @NotBlank
    @NotEmpty
    private String houseNumber;
    @NotBlank
    @NotEmpty
    private String street;
    @NotBlank
    @NotEmpty
    private String city;
}
