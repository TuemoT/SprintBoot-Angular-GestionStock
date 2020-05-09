package com.gestion.gi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.gi.entities.CommandeFournisseur;
@Repository
public interface CommandeFournisseurRepository extends JpaRepository<CommandeFournisseur, Long> {

}
