package com.leo;

import com.leo.dao.UserDao;
import com.leo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Leo
 * @data 2024/7/16 上午 08:58
 */
public class TestConstructor {
    public static void main(String[] args) {
        //獲取Ioc容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //通過容器對象獲取bean
        UserService userService = (UserService) context.getBean("userService");
        UserDao userDao = (UserDao) context.getBean("userDao");
        //調用方法
        userService.save();
//        userDao.save();

    }
}
