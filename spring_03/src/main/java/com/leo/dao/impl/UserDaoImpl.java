package com.leo.dao.impl;

import com.leo.dao.UserDao;

/**
 * @author Leo
 * @data 2024/7/16 上午 08:50
 */
public class UserDaoImpl implements UserDao {
    //構造器注入實現簡單類型
    private String name;
    private int age;

    public UserDaoImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void save() {
        System.out.println("userdao is running"+"你好，我叫"+name+"，今年"+age);
    }

}
