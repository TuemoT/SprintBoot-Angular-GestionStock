package com.gestion.gi.controllers;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.gi.entities.Product;
import com.gestion.gi.repository.ProductRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(value="/api/v1")
public class ProdutControlleur {
	 @Autowired
	 private ProductService productService;

	 public ProdutControlleur(ProductService productRepository) {
		 this.productService= productRepository;
	 }

	    @RequestMapping("/products")
	    public List<Product> findAll() {
	       return  productService.findAll();
	    }
	


	    @GetMapping(path = "/logout")
	    public String logout(HttpServletRequest request) throws ServletException {
	       request.logout();
	       return "/";
	    }
}
