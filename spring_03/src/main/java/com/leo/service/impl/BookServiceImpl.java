package com.leo.service.impl;

import com.leo.dao.BookDao;
import com.leo.service.BookService;

/**
 * @author Leo
 * @data 2024/7/16 上午 11:34
 */
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void addBook() {
        System.out.println("bookService is running...");
    }
}
