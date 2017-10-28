package com.cs.dao;

import com.cs.entity.User;

import java.util.List;

/**
 * @author cs
 * @version V1.0
 * @Title: market
 * @Package com.cs.dao
 * @Description: TODO
 * @date 2017/10/26 上午 11:24
 */
public interface UserDao {
    List<User> list();
    int insertSelective(User user);
    List<User> selectByUserInfo(User user);
}
