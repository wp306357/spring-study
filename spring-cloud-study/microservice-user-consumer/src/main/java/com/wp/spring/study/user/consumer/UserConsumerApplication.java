package com.wp.spring.study.user.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by Administrator on 2017/11/28.
 */
@SpringBootApplication
@EnableFeignClients             //feign负载配置
@EnableDiscoveryClient          //eureka服务中心扫描配置
//@EnableCircuitBreaker           //hystrix熔断器配置
public class UserConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserConsumerApplication.class, args);
    }
}
