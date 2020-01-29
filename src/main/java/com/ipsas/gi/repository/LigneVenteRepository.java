package com.ipsas.gi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ipsas.gi.entities.LigneVente;
@Repository
public interface LigneVenteRepository extends JpaRepository<LigneVente, Long> {

}
