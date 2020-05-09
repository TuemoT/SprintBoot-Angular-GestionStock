package com.gestion.gi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.gi.entities.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
