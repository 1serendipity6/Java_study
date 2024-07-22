package com.leo.dao.impl;

import com.leo.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author Leo
 * @data 2024/7/19 下午 02:38
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public String findName(int id) {
        System.out.println("id:" + id);
        return "leo";
    }
}
