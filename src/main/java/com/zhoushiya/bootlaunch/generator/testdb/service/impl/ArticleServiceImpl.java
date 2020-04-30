package com.zhoushiya.bootlaunch.generator.testdb.service.impl;

import com.zhoushiya.bootlaunch.generator.testdb.entity.Article;
import com.zhoushiya.bootlaunch.generator.testdb.mapper.ArticleMapper;
import com.zhoushiya.bootlaunch.generator.testdb.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhoushiya.bootlaunch.generator.testdb.vo.ArticleVO;
import com.zhoushiya.bootlaunch.utils.DozerUtils;
import org.dozer.DozerBeanMapper;
import org.dozer.DozerBeanMapperBuilder;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhoushiya
 * @since 2020-04-30
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

    //static Mapper mapper = DozerBeanMapperBuilder.buildDefault();

    @Resource
    private Mapper mapper;

    public ArticleVO saveOrUpdate(ArticleVO articleVO) {
        Article article= mapper.map(articleVO,Article.class);
        super.saveOrUpdate(article);
        return articleVO;
    }

    @Override
    public ArticleVO getVOById(long id) {
        Article article = super.getById(id);
        ArticleVO articleVO= mapper.map(article,ArticleVO.class);
        return articleVO;
    }
}
