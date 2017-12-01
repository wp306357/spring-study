package com.wp.spring.study.user.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Administrator on 2017/11/28.
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.wp.spring.study.user.provider.dao")
public class UserProvderApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserProvderApplication.class, args);
    }
}
