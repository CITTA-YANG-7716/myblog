package com.yang.service.impl;

import com.yang.dao.FriendLinkDao;
import com.yang.entity.FriendLink;
import com.yang.service.FriendLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FriendLinkServiceImpl implements FriendLinkService {
    @Autowired
    private FriendLinkDao friendLinkDao;

    @Override
    public List<FriendLink> listFriendLink() {
        return friendLinkDao.listFriendLink();
    }

    @Override
    public int saveFriendLink(FriendLink friendLink) {
        return friendLinkDao.saveFriendLink(friendLink);
    }

    @Override
    public FriendLink getFriendLinkByBlogaddress(String blogaddress) {
        return friendLinkDao.getFriendLinkByBlogaddress(blogaddress);
    }

    @Override
    public FriendLink getFriendLink(Long id) {
        return friendLinkDao.getFriendLink(id);
    }

    @Override
    public int updateFriendLink(FriendLink friendLink) {
        return friendLinkDao.updateFriendLink(friendLink);
    }

    @Override
    public void deleteFriendLink(Long id) {
        friendLinkDao.deleteFriendLink(id);
    }
}
