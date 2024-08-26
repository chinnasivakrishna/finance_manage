package com.finance.manager.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.manager.Model.Goal;
import com.finance.manager.Model.Limit;
import com.finance.manager.Repository.GoalRepository;

@Service
public class GoalService {
    private final GoalRepository goalRepository;

    @Autowired
    public GoalService(GoalRepository goalRepository) {
        this.goalRepository = goalRepository;
    }

    public Goal addGoal(Goal goal) {
        // Add validation or additional logic here if needed
        return goalRepository.save(goal);
    }

    public List<Goal> getAllTransactions() {
        return goalRepository.findAll();
    }
}