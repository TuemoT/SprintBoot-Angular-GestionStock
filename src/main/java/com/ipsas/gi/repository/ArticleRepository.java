package com.ipsas.gi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ipsas.gi.entities.Article;
@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

}
