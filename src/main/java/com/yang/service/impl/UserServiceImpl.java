package com.yang.service.impl;

import com.yang.dao.UserDao;
import com.yang.entity.User;
import com.yang.service.UserService;
import com.yang.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    /**
     * 这个方法是为了查找是否有对应用户的
     * @param username 用户名
     * @param password 接受到的密码，之后要进行MD5进行加密
     * @return
     */
    @Override
    public User checkUser(String username, String password) {
        User user = userDao.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
