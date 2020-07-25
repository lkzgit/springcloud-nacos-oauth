package com.nacos.user.mapper;



import com.baomidou.mybatisplus.core.mapper.Mapper;
import com.nacos.user.entity.SysRole;
import org.apache.ibatis.annotations.Select;


import java.util.List;
@org.apache.ibatis.annotations.Mapper
public interface SysRoleMapper extends Mapper<SysRole> {
    @Select(value = "select role.* from sys_role role,sys_user_role ur where role.id=ur.role_id and ur.user_id=#{userId}")
    List<SysRole> getRoleByUserId(Integer userId);
}