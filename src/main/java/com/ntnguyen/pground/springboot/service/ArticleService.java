package com.ntnguyen.pground.springboot.service;

import com.ntnguyen.pground.springboot.dto.Article;

import java.util.List;

public interface ArticleService {

    Article createArticle();

    List<Article> getAllArticles();
}
