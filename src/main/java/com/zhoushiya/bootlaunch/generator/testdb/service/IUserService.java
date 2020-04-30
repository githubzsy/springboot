package com.zhoushiya.bootlaunch.generator.testdb.service;

import com.zhoushiya.bootlaunch.generator.testdb.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhoushiya.bootlaunch.generator.testdb.vo.UserVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhoushiya
 * @since 2020-04-30
 */
public interface IUserService extends IService<User> {
    UserVO save(UserVO vo);

    UserVO getVOById(String id);
}
