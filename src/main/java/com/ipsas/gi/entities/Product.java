package com.ipsas.gi.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
    private String reference;
    private double price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String id, String reference, double price) {
		super();
		this.id = id;
		this.reference = reference;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


}
