package com.leo;

import static org.junit.Assert.assertTrue;

import com.leo.config.SpringConfig;
import com.leo.domain.Brand;
import com.leo.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * .
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= SpringConfig.class)
public class AppTest 
{
    /**
     * 測試
     */
    @Autowired
    private BrandService brandService;
    @Test
    public void testSelectById()
    {
        Brand brand = brandService.selectById("m1001");
//        System.out.println(brand);
    }
}
