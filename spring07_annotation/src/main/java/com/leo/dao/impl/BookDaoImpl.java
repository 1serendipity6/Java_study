package com.leo.dao.impl;

import com.leo.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.beans.ConstructorProperties;

/**
 * @author Leo
 * @data 2024/7/16 下午 04:59
 */
@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
    //註解實現bean初始化
    @PostConstruct
    public void init(){
        System.out.println("init..");
    }
    //註解實現bean銷毀
    @PreDestroy
    public void destory(){
        System.out.println("destory..");
    }

}
