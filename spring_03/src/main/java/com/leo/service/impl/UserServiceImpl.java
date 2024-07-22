package com.leo.service.impl;

import com.leo.dao.UserDao;
import com.leo.dao.impl.UserDaoImpl;
import com.leo.service.UserService;

/**
 * @author Leo
 * @data 2024/7/16 上午 09:29
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    //構造器注入實現對象類型
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("userService is running..");
    }
}
