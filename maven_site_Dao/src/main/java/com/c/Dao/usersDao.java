package com.c.Dao;

import com.c.entity.users;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Akihito
 * 2021/5/18 16:26
 */
public interface usersDao {
    @Select("select * from users")
    @ResultMap("entity")
    public List<users> queryall();
}
