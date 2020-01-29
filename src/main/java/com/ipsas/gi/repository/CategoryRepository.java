package com.ipsas.gi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ipsas.gi.entities.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
