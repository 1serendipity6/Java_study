package com.leo;

import com.leo.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Leo
 * @data 2024/7/15 上午 10:30
 */
public class App2 {
    public static void main(String[] args) {
        //3.獲取Ioc容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //4.獲取bean，從Ioc容器中獲取bean對象
//        BookDao bookDao = (BookDao) context.getBean("bookDao");
//        bookDao.save();
        BookService bookService = (BookService) context.getBean("bookService");

            bookService.save();
    }
}
