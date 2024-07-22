package com.leo.dao.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.leo.service.BookService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

/**
 * @author Leo
 * @data 2024/7/17 上午 11:01
 */
@Configuration

public class JdbcConfig {
    @Value("com.mysql.jdbc.Driver")
    private String drive;
    @Value("jdbc:mysql://10.196.7.241/db2")
    private String url;
    @Value("root")
    private String username;
    @Value("123456")
    private String password;


    //1.定義一個方法獲得要管理的對象
    //2.在方法上添加@bean註解，綁定對象的id
    @Bean
    public DataSource dataSource(BookService bookService){
        System.out.println(bookService);
        //注意不要寫接口名接收連接池對象
        DruidDataSource db = new DruidDataSource();
        db.setDriverClassName(drive);
        db.setUrl(url);
        db.setUsername(username);
        db.setPassword(password);
        return db;
    }
}
