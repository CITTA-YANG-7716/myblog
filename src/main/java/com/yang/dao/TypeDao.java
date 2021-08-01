package com.yang.dao;

import com.yang.entity.Type;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 这是一个标签分类的DAO接口
 */
@Component
public interface TypeDao {
//    保存新增分类
    int saveType(Type type);

//    根据ID查询分类
    Type getType(Long id);

//    查询所有的分类
    List<Type> getAllType();

//    通过名字来查询分类
    Type getTypeByName(String name);

//    更新分类的名称等
    int updateType(Type type);

//    删除分类
    void deleteType(Long id);

    //查询所有分类
    List<Type> getAllTypeAndBlog();
}
