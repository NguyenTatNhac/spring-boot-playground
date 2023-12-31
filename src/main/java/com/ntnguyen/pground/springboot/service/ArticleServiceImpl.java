package com.ntnguyen.pground.springboot.service;

import com.ntnguyen.pground.springboot.dto.Article;
import com.ntnguyen.pground.springboot.entity.ArticleEntity;
import com.ntnguyen.pground.springboot.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public Article createArticle() {
        String randomTitle = UUID.randomUUID().toString();
        ArticleEntity article = new ArticleEntity(null, randomTitle, new Date());
        articleRepository.save(article);
        return new Article(article.getId(), article.getTitle());
    }

    @Override
    public List<Article> getAllArticles() {
        return articleRepository.findAll().stream()
                .map(entity -> new Article(entity.getId(), entity.getTitle()))
                .toList();
    }
}
