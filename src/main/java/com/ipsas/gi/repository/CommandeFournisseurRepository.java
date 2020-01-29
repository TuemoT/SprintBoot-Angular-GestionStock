package com.ipsas.gi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ipsas.gi.entities.CommandeFournisseur;
@Repository
public interface CommandeFournisseurRepository extends JpaRepository<CommandeFournisseur, Long> {

}
