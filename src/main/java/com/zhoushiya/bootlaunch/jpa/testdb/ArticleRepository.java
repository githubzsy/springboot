package com.zhoushiya.bootlaunch.jpa.testdb;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface ArticleRepository extends JpaRepository<Article,Long> {
    Article findByAuthor(String author);

    Article findArticlesByCreateTimeBefore(LocalDateTime createTime);
}