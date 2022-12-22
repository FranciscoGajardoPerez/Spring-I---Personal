package com.example.be_java_hisp_w19_g2.services;

import com.example.be_java_hisp_w19_g2.dtos.*;
import com.example.be_java_hisp_w19_g2.entities.Post;

import java.util.List;

public interface IPostService {
  public PostDTO addPost(PostDTO postDTO);
  public PostWithDiscountDTO addPostDiscountDTO(PostWithDiscountDTO postWithDiscountDTO);
  public FollowedPostsDTO getFollowedPost(Integer userId);
  public FollowedPostsDTO getFollowedPostOrderedByDate(Integer userId, String order);
  public PostSellerCountDTO getPostSeller(Integer userId);

  public ProductsDiscountResponseDto getProductWhithDiscount(Integer userId);
}
