package com.leo;

import com.leo.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean實例化對象演示
 *bean生命週期演示
 */
public class App 
{
    public static void main( String[] args )
    {
//        //獲取Ioc容器
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//           //從容器中獲取bean
//        BookDao bookDao = (BookDao) context.getBean("bookDao");
//
//        bookDao.save();

        //獲取Ioc容器
        //銷毀bean對象需要 ClassPathXmlApplicationContext進行
        // Ioc容器的關閉，
        //否則銷毀方法不會運行
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //從容器中獲取bean
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        bookDao.save();

        //添加關閉鉤子，可在任意位置實現關閉Ioc容器
        context.registerShutdownHook();
        //暴力關閉,只能放在所有操作的最後
//        context.close();

    }
}
