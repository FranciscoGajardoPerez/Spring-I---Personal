package com.example.be_java_hisp_w19_g2.controllers;

import com.example.be_java_hisp_w19_g2.dtos.PostDTO;
import com.example.be_java_hisp_w19_g2.dtos.PostWithDiscountDTO;
import com.example.be_java_hisp_w19_g2.entities.Post;
import com.example.be_java_hisp_w19_g2.entities.PostWithDiscount;
import com.example.be_java_hisp_w19_g2.services.IProductService;
import com.example.be_java_hisp_w19_g2.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class    ProductController {
    @Autowired
    IProductService productService;
    @Autowired
    PostService postService;

    @GetMapping("/followed/{userId}/list")
    public ResponseEntity getFollowedPost(
            @PathVariable Integer userId,
            @RequestParam(required = false, defaultValue = "") String order) {
        if(order.equals("")){
            return new ResponseEntity<>(postService.getFollowedPost(userId), HttpStatus.OK);
        }
        return new ResponseEntity<>(postService.getFollowedPostOrderedByDate(userId, order), HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<?> postProduct(@RequestBody PostDTO postDTO){
        productService.postProduct(postDTO);
        postService.addPost(postDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/promo-post")
    public ResponseEntity<?> postPromoProduct(@RequestBody PostWithDiscountDTO postDTO){
        productService.postProductDiscount(postDTO);
        postService.addPostDiscountDTO(postDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/promo-post/count")
    public ResponseEntity<?> getProductsPromo(@RequestParam Integer userId){
       return new ResponseEntity(postService.getPostSeller(userId),HttpStatus.OK);
    }
}
