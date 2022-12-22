package com.example.be_java_hisp_w19_g2.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PostWithDiscountDTO {
    Integer userId;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate date = LocalDate.now();

    ProductWithDiscountDTO product;
    Integer category;
    Double price;

    public PostWithDiscountDTO(String productName, String type, String brand, String color, String notes, Boolean his_promo, Double price) {
    }
}
