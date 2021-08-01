package com.yang.entity;

import lombok.Data;

import java.util.Date;

/**
 * 用户实体类的创建
 */
@Data
public class User {

    private Long id;
    private String nickname;
    private String username;
    private String password;
    private String email;
    private String avatar;
    private Integer type;
    private Date createTime;
    private Date updateTime;

}
