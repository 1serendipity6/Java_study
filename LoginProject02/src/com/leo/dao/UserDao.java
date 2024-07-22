package com.leo.dao;

import com.leo.pojo.User;

/**
 * @author Leo
 * @data 2024/7/9 上午 10:09
 */
public interface UserDao {
    //根據用戶名和密碼查詢用戶信息
    public abstract User selectOneUser(String uname,String pwd);
}
