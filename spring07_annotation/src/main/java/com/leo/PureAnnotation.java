package com.leo;

import com.leo.dao.BookDao;
import com.leo.dao.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Leo
 * @data 2024/7/17 上午 08:54
 */
public class PureAnnotation {
    public static void main(String[] args) {
        //加載配置類

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        context.close();
        bookDao.save();

    }
}
