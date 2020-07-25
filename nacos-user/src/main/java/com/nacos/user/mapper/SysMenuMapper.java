package com.nacos.user.mapper;


import com.baomidou.mybatisplus.core.mapper.Mapper;
import com.nacos.user.entity.SysMenu;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@org.apache.ibatis.annotations.Mapper
public interface SysMenuMapper extends Mapper<SysMenu> {
    @Select(value = "select menu.* from sys_menu menu,sys_privilege p where menu.id=p.menu_id and p.role_id=#{roleId}")
    List<SysMenu> getPermissionsByRoleId(Integer roleId);
}