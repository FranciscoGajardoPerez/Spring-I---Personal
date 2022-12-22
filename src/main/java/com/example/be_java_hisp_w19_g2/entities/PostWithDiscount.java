package com.example.be_java_hisp_w19_g2.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PostWithDiscount {
    private Integer postId;
    private Integer userId;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate date = LocalDate.now();
    private ProductWithDiscount product;
    private Integer category;
    private Double price;

    public PostWithDiscount(Integer postId, Integer userId, LocalDate date, ProductWithDiscount product, Integer category, Double price) {
        this.postId = postId;
        this.userId = userId;
        this.date = date;
        this.product = product;
        this.category = category;
        this.price = price;
    }
}
