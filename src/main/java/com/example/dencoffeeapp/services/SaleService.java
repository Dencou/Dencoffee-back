package com.example.dencoffeeapp.services;

import com.example.dencoffeeapp.entities.Client;
import com.example.dencoffeeapp.entities.Product;
import com.example.dencoffeeapp.entities.Sale;
import org.springframework.stereotype.Service;

import java.util.List;


public interface SaleService {

    Sale createSale(Long total, List<Product> products);


    List<Sale> getSalesByUserId(Long id);

    List<Sale> getAllSales();
}
