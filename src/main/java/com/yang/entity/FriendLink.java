package com.yang.entity;

import lombok.Data;

import java.util.Date;

@Data
public class FriendLink {

    private Long id;
    private String blogname;
    private String blogaddress;
    private String pictureaddress;
    private Date createTime;

}
