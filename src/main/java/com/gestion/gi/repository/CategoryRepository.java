package com.gestion.gi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.gi.entities.Article;
import com.gestion.gi.entities.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

	Article findByIdCategory(Integer codeCategorie);

}
