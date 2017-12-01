package com.wp.spring.study.user.consumer.controller;

import com.wp.spring.study.user.consumer.feign.client.UserFeignClient;
import com.wp.spring.study.user.consumer.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/11/29.
 */
@RestController
@RequestMapping("/consumer")
public class UserController {

    @Autowired
    private UserFeignClient userFeignClient;

    @RequestMapping("/feign/{id}")
    public User findById(@PathVariable("id") Long id){
        return userFeignClient.findByIdFeign(id);
    }
}
