package com.zhoushiya.bootlaunch.controller;

import com.zhoushiya.bootlaunch.model.ArticleVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/")
    public ArticleVO hello() {
        ArticleVO article = ArticleVO.builder().id(3L).author("周诗雅").build();

        log.info("测试一下:" + article);
        return article;
    }

    @RequestMapping("/test")
    public ArticleVO hello1() {
        ArticleVO article = ArticleVO.builder().id(3L).author("周诗雅").build();

        log.info("测试一下:" + article);
        return article;
    }

}
