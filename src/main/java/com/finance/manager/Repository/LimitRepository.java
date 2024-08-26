package com.finance.manager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finance.manager.Model.Limit;

@Repository
public interface LimitRepository extends JpaRepository<Limit, Long> {
}