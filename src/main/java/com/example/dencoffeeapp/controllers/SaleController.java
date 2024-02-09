package com.example.dencoffeeapp.controllers;

import com.example.dencoffeeapp.DTO.SaleRequestDTO;
import com.example.dencoffeeapp.entities.Sale;
import com.example.dencoffeeapp.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Component
@RequestMapping("sale")
public class SaleController {


    private final SaleService saleService;

    @Autowired
    public SaleController(SaleService saleService) {
        this.saleService = saleService;
    }

    @GetMapping("/sales")
    public List<Sale> getAllSales(){
        return saleService.getAllSales();
    }

    @PostMapping("/createSale")
    public Sale createSale(@RequestBody SaleRequestDTO sale){
        System.out.println("!!!!!!!!!!!!!123!!!!!!!!!!!!"+sale);
        return  this.saleService.createSale(sale.getTotal(),sale.getProducts());
    }
}
