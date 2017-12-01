package com.wp.spring.study.user.consumer.feign.client;

import com.wp.spring.study.user.consumer.feign.fallback.UserFeignClientFallBack;
import com.wp.spring.study.user.consumer.vo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/11/29.
 */
@FeignClient(name = "microservice-user-provider", fallback = UserFeignClientFallBack.class)
public interface UserFeignClient {

    @RequestMapping("/user/{id}")
    User findByIdFeign(@PathVariable("id") Long id);
}
