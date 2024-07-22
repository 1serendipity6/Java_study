package com.leo.service.impl;

import com.leo.dao.BookDao;
import com.leo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author Leo
 * @data 2024/7/17 上午 09:37
 */
@Service
public class BookServiceImpl implements BookService {
    //註解實現簡單類型注入
    @Value("${name}")
    private String name;

    //註解實現對象類型依賴注入
    @Autowired
    private BookDao bookDao;



    @Override
    public void booservice() {
        System.out.println("bookservice is running..，我叫"+name);
        bookDao.save();
    }
}
