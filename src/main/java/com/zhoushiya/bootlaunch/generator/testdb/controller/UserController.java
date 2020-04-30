package com.zhoushiya.bootlaunch.generator.testdb.controller;


import com.zhoushiya.bootlaunch.generator.testdb.entity.User;
import com.zhoushiya.bootlaunch.generator.testdb.service.IUserService;
import com.zhoushiya.bootlaunch.generator.testdb.vo.ArticleVO;
import com.zhoushiya.bootlaunch.generator.testdb.vo.UserVO;
import com.zhoushiya.bootlaunch.model.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhoushiya
 * @since 2020-04-30
 */
@RestController
@RequestMapping("/rest")
public class UserController {
    @Resource
    IUserService userService;

    @PostMapping("/user")
    public AjaxResponse saveUser(@RequestBody UserVO vo){
        userService.save(vo);
        return AjaxResponse.success(vo);
    }

    @GetMapping("/user/{id}")
    public AjaxResponse getUser(@PathVariable String id) {
        UserVO vo = userService.getVOById(id);
        return AjaxResponse.success(vo);
    }

    @DeleteMapping("/user/{id}")
    public AjaxResponse deleteUser(@PathVariable String id) {
        boolean r=userService.removeById(id);
        return AjaxResponse.success(r);
    }
}
