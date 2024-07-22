package com.leo.service.impl;

import com.leo.dao.UserDao;
import com.leo.dao.UserDaoImpl;
import com.leo.pojo.User;
import com.leo.service.UserService;

/**
 * @author Leo
 * @data 2024/7/9 上午 10:05
 */
public class UserServiceImpl implements UserService {
    //利用多態，接口等於實現類，提升可擴展性，後續如果有哪個實現類號，就可及時修改
    UserDao userDao=new UserDaoImpl();
    @Override
    public User selectUserInfo(String uname, String pwd) {
        return userDao.selectOneUser(uname, pwd);
    }
}
