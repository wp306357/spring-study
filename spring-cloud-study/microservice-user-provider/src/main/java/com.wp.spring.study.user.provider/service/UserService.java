package com.wp.spring.study.user.provider.service;


import com.wp.spring.study.user.provider.model.User;

/**
 * Created by Administrator on 2017/11/28.
 */
public interface UserService {

    /**
     * 根据ID查询用户
     */
    User findById(Long id);
}
