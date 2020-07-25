package com.nacos.oauth02.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nacos.oauth02.entity.User;
import com.nacos.oauth02.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lkz
 * @since 2020-07-25
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    public UserMapper userMapper;


    @GetMapping("getByName")
    public User getByName(){
        return userMapper.selectOne(new QueryWrapper<User>().lambda().eq(User::getUserName,"zhanjian"));
    }

    /**
     * 获取授权的用户信息
     * @param principal 当前用户
     * @return 授权信息
     */
    @GetMapping("current/get")
    public Principal user(Principal principal){
        return principal;
    }
}

