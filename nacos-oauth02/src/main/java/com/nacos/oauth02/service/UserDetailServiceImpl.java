package com.nacos.oauth02.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nacos.oauth02.entity.User;
import com.nacos.oauth02.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        //获取本地用户
        User user = userMapper.selectOne(new QueryWrapper<User>().lambda().eq(User::getUserName,userName));
        if(user != null){
            //返回oauth2的用户
            return new org.springframework.security.core.userdetails.User(
                   user.getUserName(),user.getPassWord(),
                    AuthorityUtils.createAuthorityList(user.getRole())) ;
        }else{
            throw  new UsernameNotFoundException("用户["+userName+"]不存在");
        }
    }
}

