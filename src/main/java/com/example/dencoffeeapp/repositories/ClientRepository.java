package com.example.dencoffeeapp.repositories;

import com.example.dencoffeeapp.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findByName(String clientName);
}
