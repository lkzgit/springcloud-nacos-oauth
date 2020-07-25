package com.nacos.user.controller;

import com.alibaba.fastjson.JSONObject;
import com.nacos.common.vo.Result;
import com.nacos.user.entity.SysUser;
import com.nacos.user.entity.UserDTO;
import com.nacos.user.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usr")
@Api(value = "用户服务",tags = "用户服务")
public class UserContrller {

    @GetMapping("test")
    public String  get(){
        return "测试";
    }

    @GetMapping("test1")
    public String  getTest(){
        return "访问资源";
    }

    @Autowired
    private UserService userService;

    @GetMapping("findByUsername/{username}")
    public Result findByUsername(@PathVariable("username") String username){
        SysUser user = userService.findByUsername(username);

        if (user == null){
            return Result.failure(100,"用户不存在");
        }
        return Result.ok().setData(user);
    }

    @GetMapping(value = "/r1")
    @PreAuthorize("hasAuthority('p1')")//拥有p1权限方可访问此url
    public String r1(){
        //获取用户身份信息
        UserDTO userDTO = (UserDTO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return userDTO.getFullname()+"访问资源1";
    }
}
