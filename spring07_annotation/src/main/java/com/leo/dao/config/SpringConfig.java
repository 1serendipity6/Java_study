package com.leo.dao.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @author Leo
 * @data 2024/7/17 上午 08:55
 */
//註解實現配置類

@ComponentScan("com.leo")
@Import({JdbcConfig.class})
//<bean>配置文件註解
@Configuration
//解析properties配置文件註解
@PropertySource("jdbc.properties")
public class SpringConfig {

}
