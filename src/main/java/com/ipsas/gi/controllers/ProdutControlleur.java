package com.ipsas.gi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipsas.gi.entities.Product;
import com.ipsas.gi.repository.ProductRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(value="/api/v1")
public class ProdutControlleur {
	 @Autowired
	 private ProductRepository productService;

	 

	    @RequestMapping("/products")
	    public List<Product> getProducts() {
	       return ((ProdutControlleur) productService).getProducts();
	    }
}
