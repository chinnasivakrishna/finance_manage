package com.finance.manager.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finance.manager.Model.Goal;
import com.finance.manager.Model.Limit;
import com.finance.manager.Service.GoalService;

@RestController
@RequestMapping("/api/limits")
public class GoalController {
    private final GoalService goalService;

    @Autowired
    public GoalController(GoalService goalService) {
        this.goalService = goalService;
    }

    @PostMapping("/goal")
    public ResponseEntity<Goal> addGoal(@RequestBody Goal goal) {
        Goal addedGoal = goalService.addGoal(goal);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedGoal);
    }

    @GetMapping("/drag")
    public ResponseEntity<List<Goal>> fetchAllTransactions() {
        List<Goal> goal = goalService.getAllTransactions();
        return ResponseEntity.ok(goal);
    }

}
