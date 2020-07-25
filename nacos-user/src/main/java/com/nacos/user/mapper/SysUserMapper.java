package com.nacos.user.mapper;


import com.baomidou.mybatisplus.core.mapper.Mapper;
import com.nacos.user.entity.SysUser;
import org.apache.ibatis.annotations.Param;
@org.apache.ibatis.annotations.Mapper
public interface SysUserMapper extends Mapper<SysUser> {

    SysUser findByName(@Param("name") String username);
}