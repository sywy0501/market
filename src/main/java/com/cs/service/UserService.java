package com.cs.service;

import com.cs.entity.User;

import java.util.List;

/**
 * @author cs
 * @version V1.0
 * @Title: market
 * @Package com.cs.service
 * @Description: TODO
 * @date 2017/10/26 上午 11:28
 */
public interface UserService {
    List<User> selectUsers();
    List<User> selectByUserInfo(User user);
    int insertSelectiveUser(User user);
}
