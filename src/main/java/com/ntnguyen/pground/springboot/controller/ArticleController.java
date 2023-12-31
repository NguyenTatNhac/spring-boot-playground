package com.ntnguyen.pground.springboot.controller;

import com.ntnguyen.pground.springboot.dto.Article;
import com.ntnguyen.pground.springboot.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    private final ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/create")
    public Article createArticle() {
        return articleService.createArticle();
    }

    @GetMapping
    public List<Article> getAllArticles() {
        return articleService.getAllArticles();
    }
}
