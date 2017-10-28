package com.cs.service.serviceImpl;

import com.cs.dao.UserDao;
import com.cs.entity.User;
import com.cs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cs
 * @version V1.0
 * @Title: market
 * @Package com.cs.service.serviceImpl
 * @Description: TODO
 * @date 2017/10/26 上午 11:29
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
    @Override
    public List<User> selectUsers() {
        return userDao.list();
    }

    @Override
    public List<User> selectByUserInfo(User user) {
        return userDao.selectByUserInfo(user);
    }

    @Override
    public int insertSelectiveUser(User user) {
        return userDao.insertSelective(user);
    }
}
