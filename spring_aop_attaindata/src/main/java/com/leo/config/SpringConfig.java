package com.leo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Leo
 * @data 2024/7/19 下午 02:34
 */
@Configuration
@ComponentScan("com.leo")
@EnableAspectJAutoProxy
public class SpringConfig {
}
