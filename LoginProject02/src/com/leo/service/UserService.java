package com.leo.service;

import com.leo.pojo.User;

/**
 * @author Leo
 * @data 2024/7/9 上午 10:02
 */
public interface UserService {
    //根據用戶名和密碼查詢用戶
    public abstract User selectUserInfo(String uname,String pwd);
}
