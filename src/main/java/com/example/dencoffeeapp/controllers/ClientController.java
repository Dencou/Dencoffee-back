package com.example.dencoffeeapp.controllers;


import com.example.dencoffeeapp.DTO.LoginDTO;
import com.example.dencoffeeapp.repositories.ClientRepository;
import com.example.dencoffeeapp.services.AuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.dencoffeeapp.entities.Client;
import com.example.dencoffeeapp.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Component
@RequestMapping("/client")
public class ClientController {

    Logger logger = LoggerFactory.getLogger(ClientController.class);

    private final ClientService clientService;
    private final AuthService authService;

    private final ClientRepository clientRepository;

    @Autowired
    public ClientController(ClientService clientService, AuthService authService, ClientRepository clientRepository) {
        this.clientService = clientService;
        this.authService = authService;
        this.clientRepository = clientRepository;
    }

    @PostMapping("/createClient")
    Client createClient(@RequestBody Client client){

        return this.clientService.createClient(client);
    }

    @PostMapping("/login")
    Client login(@RequestBody LoginDTO login){
        return clientService.login(login.getName(), login.getPassword());
    }
}
