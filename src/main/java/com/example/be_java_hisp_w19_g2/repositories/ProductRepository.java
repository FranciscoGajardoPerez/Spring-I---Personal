package com.example.be_java_hisp_w19_g2.repositories;

import com.example.be_java_hisp_w19_g2.entities.Product;
import com.example.be_java_hisp_w19_g2.entities.ProductWithDiscount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    @Autowired
    UserRepository userRepository;

    public List<Product> products = new ArrayList<>();
    public List<ProductWithDiscount> productWithDiscounts = new ArrayList<>();

    public List<Product> productsList() {
        products.add(new Product("Skate", "Sport",    "Electro", "Apple",     "Grey"));
        products.add(new Product("Skate", "Sport",    "Electro", "Apple",     "Grey"));
        products.add(new Product("Skate", "Sport",    "Electro", "Apple",     "Grey"));
        products.add(new Product("Skate", "Sport",    "Electro", "Apple",     "Grey"));


        return products;
    }
    public List<ProductWithDiscount> productsListWithDiscount() {
        productWithDiscounts.add(new ProductWithDiscount("Skate", "Sport",    "Electro", "Apple",     "Grey",false,12.0));
        productWithDiscounts.add(new ProductWithDiscount("Skate", "Sport",    "Electro", "Apple",     "Grey",false,12.0));
        productWithDiscounts.add(new ProductWithDiscount("Skate", "Sport",    "Electro", "Apple",     "Grey",false,12.0));



        return productWithDiscounts;
    }

    public Product addProduct(Product product) {
        productsList();
        products.add(product);
        return product;
    }

    public ProductWithDiscount addProductWithDiscount(ProductWithDiscount product) {
        productsListWithDiscount();
        productWithDiscounts.add(product);
        return product;
    }
}
