package com.leo;

import com.leo.dao.config.SpringConfig;
import com.leo.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Leo
 * @data 2024/7/17 上午 09:42
 */
public class TestDependencyInspect {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = (BookService) context.getBean(BookService.class);
        bookService.booservice();
    }
}
