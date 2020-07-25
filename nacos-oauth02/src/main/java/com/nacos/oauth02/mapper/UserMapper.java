package com.nacos.oauth02.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nacos.oauth02.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lkz
 * @since 2020-07-25
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
