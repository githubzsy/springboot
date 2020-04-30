package com.zhoushiya.bootlaunch.generator.testdb.service;

import com.zhoushiya.bootlaunch.generator.testdb.entity.Article;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhoushiya.bootlaunch.generator.testdb.vo.ArticleVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhoushiya
 * @since 2020-04-30
 */
public interface IArticleService extends IService<Article> {
    /**
     * 更新或者插入数据
     * @param articleVO
     * @return
     */
    ArticleVO saveOrUpdate(ArticleVO articleVO);

    ArticleVO getVOById(long id);
}
