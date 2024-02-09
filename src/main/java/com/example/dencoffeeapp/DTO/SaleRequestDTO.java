package com.example.dencoffeeapp.DTO;

import com.example.dencoffeeapp.entities.Product;
import com.example.dencoffeeapp.entities.Sale;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SaleRequestDTO {

    private Long total;
    private List<Product> products = new ArrayList<>();

}
