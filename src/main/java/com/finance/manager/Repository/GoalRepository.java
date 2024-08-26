package com.finance.manager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finance.manager.Model.Goal;

@Repository
public interface GoalRepository extends JpaRepository<Goal, Long> {
}
