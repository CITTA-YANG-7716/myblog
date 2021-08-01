package com.yang.dao;

import com.yang.entity.Comment;
import com.yang.entity.Message;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
@Component
public interface MessageDao {
    //查询出所有父留言
    List<Message> findByParentIdNull(@RequestParam("parentId") Long parentId);

    //查询一级回复
    List<Message> findByParentIdNotNull(@RequestParam("id") Long id);

    //查询所有二级子回复
    List<Message> findByReplayId(@RequestParam("childId") Long childId);

    //添加留言
    int saveMessage(Message message);

    //删除留言
    int deleteMessage(Long id);
}
