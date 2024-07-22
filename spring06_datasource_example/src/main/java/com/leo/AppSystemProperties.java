package com.leo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.sql.DataSource;

/**
 * @author Leo
 * @data 2024/7/16 下午 02:33
 */
public class AppSystemProperties {
    public static void main(String[] args) {
//        1.加載類路徑下的配置文件（常用）
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//2.從文件系統下加載配置文件：使用絕對路徑
        ApplicationContext context = new FileSystemXmlApplicationContext("D:\\Users\\F0842965\\jdk-17.0.11\\webprojects\\spring06_datasource_example\\src\\main\\resources\\applicationContext.xml");

        DataSource dataSource = (DataSource) context.getBean("dataSource");

        System.out.println(dataSource);
    }
}
