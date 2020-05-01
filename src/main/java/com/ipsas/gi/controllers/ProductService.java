package com.ipsas.gi.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ipsas.gi.entities.Product;

@Service
public class ProductService {
	
	
	
	  public List<Product> findAll(){ return Arrays.asList( new
	  Product("id1","XXABC",120.00), new Product("id2","XXZER",130.00), new
	  Product("id3","XXRFR",110.00), new Product("id4","XXTER",140.00) ); }
	 
	
}
