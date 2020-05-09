package com.gestion.gi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.gi.entities.Payement;

public interface PayementRepository extends JpaRepository<Payement, Long> {

}
