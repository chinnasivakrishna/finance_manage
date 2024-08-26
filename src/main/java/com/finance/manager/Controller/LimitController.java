package com.finance.manager.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finance.manager.Model.Limit;
import com.finance.manager.Model.Transaction;
import com.finance.manager.Service.LimitService;

@RestController
@RequestMapping("/api/limits")
public class LimitController {
    private final LimitService limitService;

    @Autowired
    public LimitController(LimitService limitService) {
        this.limitService = limitService;
    }

    @PostMapping("/add")
    public ResponseEntity<Limit> addLimit(@RequestBody Limit limit) {
        Limit addedLimit = limitService.addLimit(limit);
        return new ResponseEntity<>(addedLimit, HttpStatus.CREATED);
    }

    @GetMapping("/fetch")
    public ResponseEntity<List<Limit>> fetchAllTransactions() {
        List<Limit> limit = limitService.getAllTransactions();
        return ResponseEntity.ok(limit);
    }
}