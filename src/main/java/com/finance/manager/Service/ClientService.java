package com.finance.manager.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.manager.Model.Clients;
import com.finance.manager.Repository.ClientRepository;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Clients registerStudent(Clients client) {
        // Your registration logic here
        return clientRepository.save(client);
    }

    public Clients findByEmail(String email) {
        return clientRepository.findByEmail(email);
    }

}
