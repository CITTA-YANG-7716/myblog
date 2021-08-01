package com.yang.dao;

import com.yang.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component//这个注解只是为了声明这个是一个bean防止报错的
public interface UserDao {
    /**
     * 这个方法主要用来登陆的查询用户名和密码
     * @param username 用户名
     * @param password 用户密码
     * @return
     */
    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
