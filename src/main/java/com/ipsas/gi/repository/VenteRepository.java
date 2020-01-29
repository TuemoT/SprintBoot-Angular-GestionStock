package com.ipsas.gi.repository;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ipsas.gi.entities.Vente;
@Repository
public interface VenteRepository extends JpaRepository<Vente, Long> {
	
	/*
	 * @Query("select c from Vente c where c.vente.code=:x") public
	 * Page<Vente>listVentes(@Param("x")Long codeCte,Pageable page);
	 */
	 
}
