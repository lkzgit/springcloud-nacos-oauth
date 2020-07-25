package com.nacos.consumer.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "nacos-user")
public interface UserFeign {

    @RequestMapping(value = "user/usr/test",method = RequestMethod.GET)
    String gettest();
}
