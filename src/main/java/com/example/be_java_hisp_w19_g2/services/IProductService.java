package com.example.be_java_hisp_w19_g2.services;

import com.example.be_java_hisp_w19_g2.dtos.PostDTO;
import com.example.be_java_hisp_w19_g2.dtos.PostWithDiscountDTO;
import com.example.be_java_hisp_w19_g2.dtos.ProductDTO;
import com.example.be_java_hisp_w19_g2.dtos.ProductWithDiscountDTO;

public interface IProductService {
    public ProductDTO postProduct(PostDTO postDTO);
    public ProductDTO postProductDiscount(PostWithDiscountDTO postDTO);
}
