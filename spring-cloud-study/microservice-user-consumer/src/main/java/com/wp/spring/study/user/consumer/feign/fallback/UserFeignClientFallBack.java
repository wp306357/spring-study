package com.wp.spring.study.user.consumer.feign.fallback;

import com.wp.spring.study.user.consumer.feign.client.UserFeignClient;
import com.wp.spring.study.user.consumer.vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by Administrator on 2017/11/29.
 */
@Component
public class UserFeignClientFallBack implements UserFeignClient {
    private static final Logger logger = LoggerFactory.getLogger(UserFeignClientFallBack.class);

    @Override
    public User findByIdFeign(@PathVariable("id") Long id) {
        logger.error("UserFeignClient.findByIdFeign发生异常，进入fallback方法 ，参数：id = {}", id);
        User user = new User();
        user.setId(Long.valueOf(-1));
        user.setName("未知用户");
        return user;
    }
}
