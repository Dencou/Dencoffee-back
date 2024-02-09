package com.example.dencoffeeapp.Impl;

import com.example.dencoffeeapp.entities.Client;
import com.example.dencoffeeapp.entities.Product;
import com.example.dencoffeeapp.repositories.SaleRepository;
import com.example.dencoffeeapp.entities.Sale;
import com.example.dencoffeeapp.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {
    private final SaleRepository saleRepository;

    @Autowired
    public SaleServiceImpl(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    @Override
    public Sale createSale(Long total, List<Product> products) {

        Sale sale = new Sale(total, products);
        return saleRepository.save(sale);
    }

    @Override
    public List<Sale> getSalesByUserId(Long id) {
        return this.saleRepository.findAllById(Collections.singleton(id));
    }


    @Override
    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }
}
