package com.ntnguyen.pground.springboot.repository;

import com.ntnguyen.pground.springboot.entity.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<ArticleEntity, Long> {
}
