package com.wp.spring.study.user.provider.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/11/28.
 */
@Data
@Entity
@Table(name = "user")
@ToString
public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name;
    private String nickName;
    private String gender;
    private String mobile;
    private String email;
    private String addr;
}
