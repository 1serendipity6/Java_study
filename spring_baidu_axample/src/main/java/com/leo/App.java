package com.leo;

import com.leo.config.SpringConfig;
import com.leo.service.ResourceService;
import com.leo.service.impl.ResourceServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourceService resourceService = context.getBean(ResourceService.class);
        boolean flag = resourceService.openURL("http://pan.baidu.com/haha", "root ");
        System.out.println(flag);


    }
}
