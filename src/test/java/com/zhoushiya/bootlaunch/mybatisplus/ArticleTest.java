package com.zhoushiya.bootlaunch.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.zhoushiya.bootlaunch.generator.testdb.entity.Article;
import com.zhoushiya.bootlaunch.generator.testdb.mapper.ArticleMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleTest {

    @Resource
    ArticleMapper mapper;

    @Test
    public void select(){
        LambdaQueryWrapper<Article> lambdaQueryWrapper= Wrappers.lambdaQuery();
        lambdaQueryWrapper.lt(Article::getCreateTime, LocalDateTime.now()).select(Article::getId);
        mapper.selectMaps(lambdaQueryWrapper).forEach(System.out::println);
    }
}
