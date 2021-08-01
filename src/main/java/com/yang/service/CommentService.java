package com.yang.service;

import com.yang.entity.Comment;

import java.util.List;

public interface CommentService {

    //根据博客ID查询评论信息
    List<Comment> listCommentByBlog(Long blogId);

    //添加保存评论
    int saveComment(Comment comment);

    //删除评论
    void deleteComment(Comment comment,Long id);

}
