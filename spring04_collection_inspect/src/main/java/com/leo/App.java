package com.leo;

import com.leo.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 數組、集合注入演示
 *
 */
@Component
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//三種獲取bean的方式
        //   方式1 BookDao bookDao = (BookDao) context.getBean("bookDao");
//   方式2     BookDao bookDao = context.getBean("bookDao", BookDao.class);
      //方式3
        BookDao bookDao = context.getBean(BookDao.class);
        bookDao.save();

    }
}
