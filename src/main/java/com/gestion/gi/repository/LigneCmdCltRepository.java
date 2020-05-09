package com.gestion.gi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.gi.entities.LigneCmdClt;
@Repository
public interface LigneCmdCltRepository extends JpaRepository<LigneCmdClt, Long> {

}
