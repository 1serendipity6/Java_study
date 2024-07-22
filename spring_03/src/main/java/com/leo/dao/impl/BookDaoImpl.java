package com.leo.dao.impl;

import com.leo.dao.BookDao;

/**
 * @author Leo
 * @data 2024/7/15 下午 04:16
 * setter注入的實現
 */
public class BookDaoImpl implements BookDao {
    private String name;
    private int age;


    public void setName(String name) {
        this.name=name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void addBook() {
        System.out.println("add book is running , name = "+name+",age = "+age);
    }


}
