package com.olakunle.simpleecommerce.dto.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
    @NotBlank
    @NotEmpty
    private String productName;
    @NotBlank
    @NotEmpty
    private String productDescription;
    @Positive
    @NotEmpty
    private Double unitPrice;
    @Positive
    @NotEmpty
    private Double weight;
    @NotBlank
    @NotEmpty
    private String sku;
}
