package com.leo.dao.impl;

import com.leo.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author Leo
 * @data 2024/7/18 下午 03:40
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public int save() {
        System.out.println(System.currentTimeMillis());
        System.out.println("book dao save...");
        return 100;
    }

    @Override
    public void update() {

        System.out.println("book dao update...");
    }
}
