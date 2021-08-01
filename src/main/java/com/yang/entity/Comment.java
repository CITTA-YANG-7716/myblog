package com.yang.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 这是一个评论实体类
 * 主键（id）、
 * 昵称（nickname）、
 * 邮箱（email）、
 * 头像（avatar）、
 * 评论内容（content）、
 * 创建时间（createTime）、
 * 博客id（blogId）、
 * 父评论id（parentCommentId）、
 * 是否为管理员评论（adminComment）
 *
 * 之后是回复评论的相关属性
 * 回复评论集合（replyComments）用来存储回复信息、
 * 父评论昵称（parentNickname）用来设置父级评论的id
 * 父评论（parentComment）用来显示父级评论姓名
 */
@Data
public class Comment {

    private Long id;
    private String nickname;
    private String email;
    private String content;
    private String avatar;//这个单词竟然是土耳其语的化身
    private Date createTime;
    private Long blogId;
    private Long parentCommentId;
    private boolean adminComment;

    private List<Comment> replyComments = new ArrayList<>();
    private Comment parentComment;
    private String parentNickname;

}
