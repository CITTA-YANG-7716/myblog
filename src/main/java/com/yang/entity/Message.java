package com.yang.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 这是一个留言实体类
 * 大部分属性都和回复属性重合了，只是缺少了博客ID，毕竟这东西不依赖博客了
 */
@Data
public class Message {
    private Long id;
    private String nickname;
    private String email;
    private String content;
    private String avatar;
    private Date createTime;
    private Long parentMessageId;
    private boolean adminMessage;
    private Message messages;

    private List<Message> replyMessages = new ArrayList<>();
    private Message parentMessage;
    private String parentNickname;
}
