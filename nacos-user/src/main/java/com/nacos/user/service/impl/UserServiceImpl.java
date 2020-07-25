package com.nacos.user.service.impl;


import com.nacos.user.entity.SysUser;
import com.nacos.user.mapper.SysUserMapper;
import com.nacos.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Mr.Yangxiufeng
 * Date: 2018-05-10
 * Time: 19:57
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserMapper userMapper;

    @Override
    public SysUser findByUsername(String username) {

        return userMapper.findByName(username);
    }
}
