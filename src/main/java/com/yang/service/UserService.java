package com.yang.service;

import com.yang.entity.User;

public interface UserService {
    /**
     * 用户业务层接口
     */
    User checkUser(String username,String password);
}
