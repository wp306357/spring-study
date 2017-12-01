package com.wp.study.spring.cofig.repo.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/11/29.
 */
@RestController
@RefreshScope       //如果不配置，则配置无法刷新
public class ConfigClientController {

    @Value("${info.profile}")
    private String profile;

    @GetMapping("/config/info")
    public String configInfo(){
        return this.profile;
    }
}
