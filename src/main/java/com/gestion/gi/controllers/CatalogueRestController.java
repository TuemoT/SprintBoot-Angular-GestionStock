/**
 * 
 */
package com.gestion.gi.controllers;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.gestion.gi.entities.Article;
import com.gestion.gi.repository.ArticleRepository;

/**
 * @author elmot
 *
 */
@CrossOrigin("*")
@RestController
public class CatalogueRestController {

	private ArticleRepository articleRepository;
	 
	 public CatalogueRestController(ArticleRepository articleRepository) {
	      this.articleRepository=articleRepository;
	    }
	 @GetMapping(path="/photoProduct/{idArticle}",produces = MediaType.IMAGE_PNG_VALUE)
	    public byte[] getPhoto(@PathVariable("id") Long id) throws Exception{
	         Article a=articleRepository.findById(id).get();
	        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/ecom/products/"+a.getPhotos()));
	    }
	    @PostMapping(path = "/uploadPhotos/{id}")
	    public void uploadPhoto(MultipartFile file, @PathVariable Long id) throws Exception{
	       Article a=articleRepository.findById(id).get();
	       a.setPhotos(file.getOriginalFilename());
	       Files.write(Paths.get(System.getProperty("user.home")+"/ecom/products/"+a.getPhotos()),file.getBytes());
	       articleRepository.save(a);
	    }
	 
	 
	
	

}
