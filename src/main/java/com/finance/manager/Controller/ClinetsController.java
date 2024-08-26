package com.finance.manager.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finance.manager.Model.Clients;
import com.finance.manager.Service.ClientService;

@RestController
@RequestMapping("/api/clients")
public class ClinetsController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/add")
    public ResponseEntity<Clients> registerStudent(@RequestBody Clients clients) {
        Clients registeredStudent = clientService.registerStudent(clients);
        return ResponseEntity.ok(registeredStudent);
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginStudent(@RequestBody Map<String, String> loginData) {
        String email = loginData.get("email");
        String password = loginData.get("password");

        Clients clients = clientService.findByEmail(email);
        if (clients != null && clients.getPassword().equals(password)) {
            // You can customize the response as needed, e.g., return teacher details
            Map<String, Object> responseBody = new HashMap<>();
            // Add any other data you want to send to the client
            responseBody.put("name", clients.getName());
            responseBody.put("email", clients.getEmail());

            return ResponseEntity.ok().body(responseBody);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
        }
    }
}
