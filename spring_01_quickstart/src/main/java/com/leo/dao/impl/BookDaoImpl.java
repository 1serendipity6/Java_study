package com.leo.dao.impl;

import com.leo.dao.BookDao;

/**
 * @author Leo
 * @data 2024/7/15 上午 10:07
 */
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
