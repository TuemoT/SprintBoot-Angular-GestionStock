package com.ipsas.gi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ipsas.gi.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	

}
