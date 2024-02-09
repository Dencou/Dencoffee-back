package com.example.dencoffeeapp.repositories;

import com.example.dencoffeeapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service
public interface ProductRepository extends JpaRepository<Product, Long> { }
