package com.yang.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 这是一个类型实体类，用来标记博客是什么类型的
 * id:类型ID
 * name:类型名称
 * blogs:由于博客和属性是一对多的关系，所以需要一个博客集合
 */
@Data
public class Type {

    private Long id;
    private String name;
    private List<Blog> blogs = new ArrayList<>();

}
