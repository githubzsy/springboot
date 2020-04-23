package com.zhoushiya.bootlaunch.service;

import com.zhoushiya.bootlaunch.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class ArticleRestService {


    /**
     * 保存文章
     * @param article
     * @return
     */
    public String saveArticle(Article article) {
        log.info("saveArticle:{}",article);
        return "测试";
    }
}
