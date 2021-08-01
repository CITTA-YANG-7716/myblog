package com.yang.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 这是一个博客实体类
 * 数据库中设计的属性：主键（id）、
 * 博客标题（title）、
 * 博客内容（content）、
 * 首图地址（firstPicture）、
 * 标记是否原创（flag）、
 * 浏览次数（views）、
 * 评论次数（commentCount）、
 * 是否开启赞赏（appreciation）、
 * 是否开启版权（shareStatement）、
 * 是否开启评论（commentabled）、
 * 是否发布（published）、
 * 是否推荐（recommend）、
 * 创建时间（createTime）、
 * 更新时间（updateTime）、
 * 博客描述（description）
 *
 *
 * 分类（type）、
 * 用户（user）、
 * 评论集合（comments）
 * 分类id（typeId）、
 * 用户id（userId），
 * 用来实现Mybatis的多表查询和相关功能。
 */
@Data
public class Blog {

    private Long id;
    private String title;
    private String content;
    private String firstPicture;
    private String flag;
    private Integer views;
    private Integer commentCount;
    private boolean appreciation;
    private boolean shareStatement;
    private boolean commentabled;
    private boolean recommend;
    private boolean published;
    private Date createTime;
    private Date updateTime;
    private String description;

    private Type type;
    private User user;
    private Long typeId;
    private Long userId;
    private List<Comment> Comments = new ArrayList<>();

}
