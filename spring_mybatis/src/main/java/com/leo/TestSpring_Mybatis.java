package com.leo;

import com.leo.config.SpringConfig;
import com.leo.domain.Brand;
import com.leo.service.BrandService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Leo
 * @data 2024/7/17 下午 03:01
 */
public class TestSpring_Mybatis {
    public static void main(String[] args) {
       ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BrandService brandService = context.getBean(BrandService.class);
        Brand select = brandService.selectById("m1001");
        System.out.println(select);
    }
}
