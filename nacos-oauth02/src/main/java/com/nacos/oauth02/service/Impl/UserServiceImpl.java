package com.nacos.oauth02.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nacos.oauth02.entity.User;
import com.nacos.oauth02.mapper.UserMapper;
import com.nacos.oauth02.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lkz
 * @since 2020-07-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
