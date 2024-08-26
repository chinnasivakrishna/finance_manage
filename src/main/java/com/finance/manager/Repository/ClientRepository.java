package com.finance.manager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.manager.Model.Clients;

public interface ClientRepository extends JpaRepository<Clients, Long> {
    Clients findByEmail(String email);

}
