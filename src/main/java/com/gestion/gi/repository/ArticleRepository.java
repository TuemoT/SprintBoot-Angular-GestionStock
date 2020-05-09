package com.gestion.gi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.gi.entities.Article;
@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

}
