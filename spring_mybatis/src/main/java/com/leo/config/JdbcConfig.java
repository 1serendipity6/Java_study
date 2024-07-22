package com.leo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author Leo
 * @data 2024/7/17 下午 02:15
 */

public class JdbcConfig {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public DataSource dataSource(){
     DruidDataSource ds=new DruidDataSource();
     ds.setDriverClassName(driver);
     ds.setUrl(url);
     ds.setUsername(username);
     ds.setPassword(password);
     return ds;
    }


}
