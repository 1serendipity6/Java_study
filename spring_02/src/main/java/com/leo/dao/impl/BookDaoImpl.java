package com.leo.dao.impl;

import com.leo.dao.BookDao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.naming.spi.InitialContextFactory;

/**
 * @author Leo
 * @data 2024/7/15 下午 02:10
 */
public class BookDaoImpl implements BookDao, InitializingBean, DisposableBean {
    @Override
       public void save() {
        System.out.println("book dao save ...");
    }
    //無參構造自動創建bean對象
    public  BookDaoImpl(){
        System.out.println("book dao ...");
    }

    //初始化bean對象前的操作
//    public void init(){
//        System.out.println("init...");
//    }

    //銷毀bean對象前的操作
//    public void destroy(){
//        System.out.println("destory..");
//    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init ...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destory..");
    }
}
