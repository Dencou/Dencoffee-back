package com.example.dencoffeeapp.services;


import com.example.dencoffeeapp.DTO.LoginDTO;
import com.example.dencoffeeapp.entities.Client;
import org.springframework.stereotype.Service;

@Service
public interface ClientService {

    Client createClient(Client client);

    Client login(String name, String password);

    Client getClientById(String clientName);





}
