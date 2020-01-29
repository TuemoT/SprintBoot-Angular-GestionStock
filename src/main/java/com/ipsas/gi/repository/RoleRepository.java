package com.ipsas.gi.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.ipsas.gi.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	/*
	 * @Query("select c from Role c where c.role.idRole=:x") public Page<Role>
	 * listComptes(@Param("x")Long codeCte,Pageable page);
	 */

}
