package com.example.be_java_hisp_w19_g2.dtos;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ProductWithDiscountDTO extends ProductDTO{
    private Boolean his_promo;
    private Double discount;

    public ProductWithDiscountDTO(Integer productId, String productName, String type, String brand, String color, String notes, Boolean his_promo, Double discount) {
        super(productId, productName, type, brand, color, notes);
        this.his_promo = his_promo;
        this.discount = discount;
    }
}
