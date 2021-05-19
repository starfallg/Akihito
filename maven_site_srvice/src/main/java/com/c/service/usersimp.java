package com.c.service;

import com.c.Dao.usersDao;
import com.c.entity.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Akihito
 * 2021/5/18 16:28
 */

@Service
public class usersimp implements usersservice{
 @Autowired
    private usersDao dao;
    @Override
    public List<users> queryall() {
        List<users> users = dao.queryall();
        return users;
    }
}
