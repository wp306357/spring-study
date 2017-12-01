package com.wp.study.spring.config.repo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Administrator on 2017/11/29.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigRepoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigRepoApplication.class, args);
    }
}
