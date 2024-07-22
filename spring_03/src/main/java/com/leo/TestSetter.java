package com.leo;

import com.leo.dao.BookDao;
import com.leo.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Leo
 * @data 2024/7/15 下午 04:21
 */
public class TestSetter {
    public static void main(String[] args) {
        //setter注入演示
        //獲取Ioc容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //從Ioc容器中獲取bean實例
//        setter注入演示
//        BookDao bookDao = (BookDao) context.getBean("bookDao");
//        bookDao.addBook();

        //自動裝配--按類型
        BookService bookService = (BookService) context.getBean("bookService");

        bookService.addBook();

    }
}
