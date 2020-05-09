package com.gestion.gi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.gi.entities.Article;
import com.gestion.gi.entities.Category;
import com.gestion.gi.repository.ArticleRepository;
import com.gestion.gi.repository.CategoryRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(value="/api/v1")
public class CategoryControlleur {
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ArticleRepository articleRepository;

	@GetMapping("/IdCategory/{type}")
    public Category showOne(@PathVariable("type") Integer codeCategorie,
                                @RequestParam(value = "page", defaultValue = "1") Integer page,
                                @RequestParam(value = "size", defaultValue = "3") Integer size) {

        Article a = categoryRepository.findByIdCategory(codeCategorie);
        PageRequest request = PageRequest.of(page - 1, size);
        Page<Article> productInCategory = (Page<Article>) articleRepository.findAll();
        Category tmp = new Category();
        
        return tmp;
    }
	
	
}
