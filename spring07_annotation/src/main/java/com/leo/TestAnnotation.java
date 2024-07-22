package com.leo;

import com.leo.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author Leo
 * @data 2024/7/17 上午 08:03
 */

public class TestAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        context.close();
        bookDao.save();
    }
}
