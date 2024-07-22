package com.leo.config;

import org.springframework.context.annotation.*;

/**
 * @author Leo
 * @data 2024/7/19 上午 10:49
 */
@Configuration
@ComponentScan("com.leo")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
//添加aop切面的註解
@EnableAspectJAutoProxy
public class SpringConfig {
}
