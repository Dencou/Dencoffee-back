package com.example.dencoffeeapp.controllers;

import com.example.dencoffeeapp.DTO.ProductDTO;
import com.example.dencoffeeapp.entities.Product;
import com.example.dencoffeeapp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @PostMapping("/createProduct")
    Product createProduct(@RequestBody Product product){
        return this.productService.createProduct(product);
    }


}
