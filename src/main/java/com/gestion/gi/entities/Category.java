package com.gestion.gi.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table (name="category")
public class Category implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCategory;
	
	private String codeCategorie;
	
	private String Designation;
    private String photo;
	@OneToMany (mappedBy="category")
	private List<Article> article;
	
	public Category() {
		
	}

	public Category(Long idCategory, String codeCategorie, String designation, String photo, List<Article> article) {
		super();
		this.idCategory = idCategory;
		this.codeCategorie = codeCategorie;
		Designation = designation;
		this.photo = photo;
		this.article = article;
	}

	public Long getIdArticle() {
		return idCategory;
	}

	public void setIdArticle(Long idCategory) {
		this.idCategory = idCategory;
	}

	public Long getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}

	public String getCodeCategorie() {
		return codeCategorie;
	}

	public void setCodeCategorie(String codeCategorie) {
		this.codeCategorie = codeCategorie;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public List<Article> getArticle() {
		return article;
	}

	public void setArticle(List<Article> article) {
		this.article = article;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
}
