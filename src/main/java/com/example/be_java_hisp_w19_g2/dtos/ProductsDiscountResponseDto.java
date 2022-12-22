package com.example.be_java_hisp_w19_g2.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductsDiscountResponseDto {
    private Integer userId;
    private String userName;
    private List<PostWithDiscountDTO> post;
}
