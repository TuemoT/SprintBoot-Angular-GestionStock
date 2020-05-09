package com.gestion.gi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.gi.entities.Role;
import com.gestion.gi.entities.RoleName;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}