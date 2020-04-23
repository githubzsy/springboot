package com.zhoushiya.bootlaunch.controller;

import com.zhoushiya.bootlaunch.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/")
    public Article hello() {
        Article article = Article.builder().id(3L).author("周诗雅").build();

        log.info("测试一下:" + article);
        return article;
    }

    @RequestMapping("/test")
    public Article hello1() {
        Article article = Article.builder().id(3L).author("周诗雅").build();

        log.info("测试一下:" + article);
        return article;
    }

}
