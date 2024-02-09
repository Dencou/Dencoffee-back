package com.example.dencoffeeapp.repositories;

import com.example.dencoffeeapp.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
@Service
public interface SaleRepository extends JpaRepository<Sale, Long> {

}
