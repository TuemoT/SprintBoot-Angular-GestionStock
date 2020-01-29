package com.ipsas.gi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ipsas.gi.entities.CommandeClient;
@Repository
public interface CommandeClientRepository extends JpaRepository<CommandeClient, Long> {

}
