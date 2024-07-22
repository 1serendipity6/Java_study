package com.leo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * @author Leo
 * @data 2024/7/17 下午 02:44
 * MybatisConfig配置類代替配置mybatis-config。xml文件
 */
//SqlSessionFactoryBean 專門用於造SqlSessionFactory對象

public class MybatisConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
        //這個類函數對應mybatis的核心配置文件
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        //設置別名
        ssfb.setTypeAliasesPackage("com.leo.domain");
        //引用類型依賴注入
       ssfb.setDataSource(dataSource);
        return ssfb;
    }
    @Bean
    //mapper代理開發，對應mybatis配置文件中自動代理開發配置
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        //代理類的位置
        msc.setBasePackage("com.leo.dao");
        return msc;
    }


}

