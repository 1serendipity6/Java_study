package com.leo;

import com.leo.dao.OrderDao;
import com.leo.dao.UserDao;
import com.leo.dao.factory.OderFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Leo
 * @data 2024/7/15 下午 02:28
 */
public class TestFactory {
    public static void main(String[] args) {
        //通過靜態工廠創建對象
//        OrderDao oderDao = OderFactory.getOderDao();
//        oderDao.saveOrder();

        //實例工廠創建對象、FactoryBean創建對象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDao userDao = (UserDao) context.getBean("userDao");

        userDao.getUser();
    }
}
