package com.wp.spring.study.common.db.dao;

import com.wp.spring.study.common.db.base.ReadMapper;
import com.wp.spring.study.common.db.base.WriteMapper;
import com.wp.spring.study.common.db.model.User;

/**
 * Created by Administrator on 2017/11/28.
 */
public interface UserMapper extends ReadMapper<User>, WriteMapper<User> {
}
