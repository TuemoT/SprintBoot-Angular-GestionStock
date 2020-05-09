package com.gestion.gi.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gestion.gi.entities.Utilisateur;
@Repository
public interface UtilisateurRepository  extends JpaRepository<Utilisateur, Long>{
	/*
	 * @Query("select c from Utilisateur c where c.utilisateur.idUtilisateur=:x")
	 * public Page<Utilisateur> listComptes(@Param("x")Long codeCte,Pageable page);
	 */

}
