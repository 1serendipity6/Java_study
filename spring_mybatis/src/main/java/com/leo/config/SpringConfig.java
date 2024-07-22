package com.leo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Leo
 * @data 2024/7/17 下午 02:03
 */
@Configuration
@ComponentScan("com.leo")
//解析properties配置文件註解
@PropertySource("classpath:jdbc.properties")
//若不在JdbcConfig配置類文件加註解Configuration就加Import
@Import({JdbcConfig.class,MybatisConfig.class})


public class SpringConfig {
}
