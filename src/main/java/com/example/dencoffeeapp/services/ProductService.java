package com.example.dencoffeeapp.services;

import com.example.dencoffeeapp.entities.Product;
import com.example.dencoffeeapp.entities.Sale;
import com.example.dencoffeeapp.repositories.ProductRepository;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);

    List<Product> getAllProducts();
    Product getProductById(Long id);

}
