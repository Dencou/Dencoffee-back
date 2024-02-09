package com.example.dencoffeeapp.DTO;

import com.example.dencoffeeapp.entities.Product;
import lombok.Data;

@Data
public class ProductDTO {
    private String name;

    private Long price;

    private String description;

    private String size;

    private String imagen;

    private String tags;
}
