package com.leo.service.impl;

import com.leo.dao.BookDao;
import com.leo.dao.impl.BookDaoImpl;
import com.leo.service.BookService;

/**
 * @author Leo
 * @data 2024/7/15 上午 10:15
 */
public class BookServiceImpl implements BookService {
    //5.刪除new創建的BookDaoImpl對象，
//private BookDao bookDao=new BookDaoImpl();
    private BookDao bookDao;
    @Override
    public void save() {
        System.out.println("service save running...");
        bookDao.save();
    }

    //6.使用set方法注入創建bookDaoImpl對象
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

}
