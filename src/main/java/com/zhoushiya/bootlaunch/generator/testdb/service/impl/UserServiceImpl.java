package com.zhoushiya.bootlaunch.generator.testdb.service.impl;

import com.zhoushiya.bootlaunch.generator.testdb.entity.Article;
import com.zhoushiya.bootlaunch.generator.testdb.entity.User;
import com.zhoushiya.bootlaunch.generator.testdb.mapper.UserMapper;
import com.zhoushiya.bootlaunch.generator.testdb.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhoushiya.bootlaunch.generator.testdb.vo.ArticleVO;
import com.zhoushiya.bootlaunch.generator.testdb.vo.UserVO;
import org.dozer.Mapper;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Resource
    private Mapper mapper;

    public UserVO save(UserVO vo) {
        User user= mapper.map(vo,User.class);
        super.save(user);
        return vo;
    }

    public UserVO getVOById(String id) {
        User user = super.getById(id);
        UserVO vo= mapper.map(user,UserVO.class);
        return vo;
    }
}
