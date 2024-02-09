package com.example.dencoffeeapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sale")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long total;

    @OneToMany(targetEntity = Product.class)
    @JoinColumn(name = "cp_fk", referencedColumnName = "id")
    private List<Product> products = new ArrayList<>();



    public Sale(Long total, List<Product> products) {
        this.total = total;
        this.products = products;
    }
}
