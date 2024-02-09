package com.example.dencoffeeapp.Impl;

import com.example.dencoffeeapp.entities.Client;
import com.example.dencoffeeapp.repositories.ClientRepository;
import com.example.dencoffeeapp.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    @Override
    public Client createClient(Client client) {
        return this.clientRepository.save(client);
    }

    @Override
    public Client login(String username, String password) {
        Client client = clientRepository.findByName(username);
        System.out.println(client);

        if (client != null && client.getPassword().equals(password)) {
            return client; // Return the authenticated client
        } else {
            return new Client();
        }
    }

    @Override
    public Client getClientById(String clientName) {
        return this.clientRepository.findByName(clientName);
    }
}
