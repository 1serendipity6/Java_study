package com.leo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Leo
 * @data 2024/7/18 下午 03:53
 */
//@Component
//@Aspect
//入門案例演示
//public class MyAdvice {
//
//
//    //4.定義切入點
////    @Pointcut("execution(void com.leo.dao.BookDao.update())")
//    //通配符簡化表達
////    @Pointcut("execution(void com.leo.dao.impl.BookDaoImpl.update())")
////    @Pointcut("execution(* com.leo.dao.BookDao.update())")
////    @Pointcut("execution(void com.*.dao.BookDao.update())")
////    @Pointcut("execution(void com..BookDao.update())")
//    @Pointcut("execution(* com..BookDao.update())")
//    public void pt(){}
//
//    //5.綁定切入點與通知关系
//    @Before("pt()")
//    //制作共性通知类
//    public void method() {
//        System.out.println(System.currentTimeMillis());
//    }
//}
