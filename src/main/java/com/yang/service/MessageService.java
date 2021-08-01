package com.yang.service;

import com.yang.entity.Message;

import java.util.List;

public interface MessageService {
    //列出所有留言
    List<Message> listMessage();

    //添加留言
    int saveMessage(Message message);

    //删除留言
    int deleteMessage(Long id);
}
