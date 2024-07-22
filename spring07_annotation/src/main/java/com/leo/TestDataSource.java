package com.leo;

import com.leo.dao.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * @author Leo
 * @data 2024/7/17 上午 10:53
 */
public class TestDataSource {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource bean = context.getBean(DataSource.class);
        System.out.println(bean);
    }
}
