package com.wp.spring.study.user.provider.controller;

import com.wp.spring.study.user.provider.model.User;
import com.wp.spring.study.user.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/11/28.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable(name = "id") Long id){
        return userService.findById(id);
    }

    @GetMapping("/dc")
    public String showInfo(){
        return this.discoveryClient.description();
    }
}
