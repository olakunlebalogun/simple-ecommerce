package com.olakunle.simpleecommerce.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    private String productName;
    private String productDescription;
    private Double unitPrice;
    private Double weight;
    private String sku;
}
