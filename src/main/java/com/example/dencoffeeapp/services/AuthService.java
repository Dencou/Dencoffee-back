package com.example.dencoffeeapp.services;


import com.example.dencoffeeapp.repositories.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final ClientRepository clientRepository;

}
