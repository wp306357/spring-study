package com.wp.spring.study.user.consumer.vo;

import lombok.Data;

/**
 * Created by Administrator on 2017/11/29.
 */
@Data
public class User {
    private Long id;
    private String name;
    private String nickName;
    private String gender;
    private String mobile;
    private String email;
    private String addr;
}
