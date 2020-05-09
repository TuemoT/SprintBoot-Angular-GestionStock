package com.gestion.gi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.gi.entities.LigneVente;
@Repository
public interface LigneVenteRepository extends JpaRepository<LigneVente, Long> {

}
