package com.zhoushiya.bootlaunch.service;

import com.zhoushiya.bootlaunch.model.Article;

import java.util.List;

public interface ArticleRestService {

    public Article saveArticle(Article article);

    public void deleteArticle(Long id);

    public void updateArticle(Article article);

    public Article getArticle(Long id);

    public List<Article> getAll();
}