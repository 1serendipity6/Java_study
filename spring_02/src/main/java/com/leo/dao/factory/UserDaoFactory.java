package com.leo.dao.factory;

import com.leo.dao.UserDao;
import com.leo.dao.impl.UserDaoImpl;

/**
 * @author Leo
 * @data 2024/7/15 下午 02:44
 */
public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
