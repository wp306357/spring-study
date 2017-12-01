package com.wp.spring.study.user.provider;

import com.wp.spring.study.user.provider.model.User;
import com.wp.spring.study.user.provider.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by Administrator on 2017/11/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = UserProvderApplication.class)
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void findById() throws Exception {
        User user = userService.findById(Long.valueOf(1));
        System.out.println(user);
    }

}