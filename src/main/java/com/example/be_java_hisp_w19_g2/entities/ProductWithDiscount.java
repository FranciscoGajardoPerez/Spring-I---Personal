package com.example.be_java_hisp_w19_g2.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductWithDiscount{
    private Integer productId;
    private String productName;
    private String type;
    private String brand;
    private String color;
    private String notes;

    private Boolean his_promo;
    private Double discount;

    public ProductWithDiscount(String productName, String type, String brand, String color, String notes, Boolean his_promo, Double discount) {
        this.productName = productName;
        this.type = type;
        this.brand = brand;
        this.color = color;
        this.notes = notes;
        this.his_promo = his_promo;
        this.discount = discount;
    }
}
