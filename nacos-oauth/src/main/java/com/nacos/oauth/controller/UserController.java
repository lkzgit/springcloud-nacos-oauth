package com.nacos.oauth.controller;


import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RequestMapping("/oauth")
@RestController
public class UserController {




    /**
     * 获取授权的用户信息
     * @param principal 当前用户
     * @return 授权信息
     */
    @GetMapping("/getUser")
    public Principal user(Principal principal){
        return principal;
    }


    @DeleteMapping(value = "/exit")
    public JSONObject revokeToken(String access_token) {

//        if (consumerTokenServices.revokeToken(access_token)) {
//            result.setCode(ResultCode.SUCCESS.getCode());
//            result.setMessage("注销成功");
//        } else {
//            result.setCode(ResultCode.FAILED.getCode());
//            result.setMessage("注销失败");
//        }
        return null;
    }

}
