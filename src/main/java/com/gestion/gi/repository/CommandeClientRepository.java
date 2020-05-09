package com.gestion.gi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.gi.entities.CommandeClient;
@Repository
public interface CommandeClientRepository extends JpaRepository<CommandeClient, Long> {

}
