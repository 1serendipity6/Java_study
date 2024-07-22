package com.leo.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @author Leo
 * @data 2024/7/19 上午 11:16
 */

public class MybatisConfig {
    //獲取sqlSession對象
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){

        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        //設置別名
        ssfb.setTypeAliasesPackage("com.leo.domain");
       //設置數據源
        ssfb.setDataSource(dataSource);
        return ssfb;
    }

    //設置mapper自動代理，掃描dao接口
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        //設置mapper接口的掃描路徑
        msc.setBasePackage("com.leo.dao");
        return msc;
    }

}
