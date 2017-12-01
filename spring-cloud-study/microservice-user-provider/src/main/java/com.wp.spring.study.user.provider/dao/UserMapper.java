package com.wp.spring.study.user.provider.dao;


import com.wp.spring.study.user.provider.base.ReadMapper;
import com.wp.spring.study.user.provider.base.WriteMapper;
import com.wp.spring.study.user.provider.model.User;

/**
 * Created by Administrator on 2017/11/28.
 */
public interface UserMapper extends ReadMapper<User>, WriteMapper<User> {
}
