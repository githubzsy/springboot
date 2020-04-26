package com.zhoushiya.bootlaunch.jpa;

import com.zhoushiya.bootlaunch.jpa.testdb.Article;
import com.zhoushiya.bootlaunch.jpa.testdb.ArticleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JPAKeyWordTest {

    @Resource
    private ArticleRepository articleRepository;
    
    @Test
    public void userTest() {
        Article article = articleRepository.findByAuthor("zimug");
        System.out.println(article);
    }

    @Test
    public void findByCreateTimeBeforeTest(){
        Article article = articleRepository.findArticlesByCreateTimeBefore(LocalDateTime.now());
        System.out.println(article);
    }

}
