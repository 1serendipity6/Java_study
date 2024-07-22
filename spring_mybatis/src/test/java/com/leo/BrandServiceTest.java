package com.leo;

import com.leo.config.SpringConfig;
import com.leo.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Leo
 * @data 2024/7/18 下午 01:43
 */
//专用测试运行器
@RunWith(SpringJUnit4ClassRunner.class)
//告知上下文配置
@ContextConfiguration(classes = SpringConfig.class)
public class BrandServiceTest {
    @Autowired
    private BrandService brandService;

    @Test
    public void testSelectById(){
        System.out.println(brandService.selectById("m1001"));
    }
}
