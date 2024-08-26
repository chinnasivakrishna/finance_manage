package com.finance.manager.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.manager.Model.Limit;
import com.finance.manager.Model.Transaction;
import com.finance.manager.Repository.LimitRepository;

@Service
public class LimitService {
    private final LimitRepository limitRepository;

    @Autowired
    public LimitService(LimitRepository limitRepository) {
        this.limitRepository = limitRepository;
    }

    public Limit addLimit(Limit limit) {
        // Add validation or additional logic here if needed
        return limitRepository.save(limit);
    }

    public List<Limit> getAllTransactions() {
        return limitRepository.findAll();
    }
}