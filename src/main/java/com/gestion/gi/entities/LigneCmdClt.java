package com.gestion.gi.entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class LigneCmdClt implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idLigneCmdClt;
	
	
	@ManyToOne
	@JoinColumn(name="idCommandeClient")
	 @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private CommandeClient cmdClient;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	private int quantite;
	private Double prix;

	public LigneCmdClt() {
		
	}
	
	

	public Long getIdLigneCmdClt() {
		return idLigneCmdClt;
	}

	public void setIdLigneCmdClt(Long idLigneCmdClt) {
		this.idLigneCmdClt = idLigneCmdClt;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}
	
	
	
	
	
	

}
