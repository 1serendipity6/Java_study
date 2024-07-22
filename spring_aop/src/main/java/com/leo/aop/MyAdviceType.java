package com.leo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author Leo
 * @data 2024/7/19 上午 09:28
 */
@Component
@Aspect
public class MyAdviceType {
    //定義切入點
    @Pointcut("execution(void com.leo.dao.BookDao.update())")
    private void pt(){}

    @Pointcut("execution(int com.leo.dao.BookDao.save())")
    private void pt1(){}
    //前置通知
//@Before("pt()")
//    public void before(){
//    System.out.println("這是前置通知");
//}

    //後置通知
//@After("pt()")
//    public void after(){
//    System.out.println("這是後置通知");
//}

    //環繞通知
@Around("pt()")

    public void around(ProceedingJoinPoint pjp) throws Throwable {
    System.out.println("這是環繞通知1");
    //原始操作調用
    pjp.proceed();
    System.out.println("這是環繞通知2");
}

@Around("pt1()")
public  Object around1(ProceedingJoinPoint pjp) throws Throwable {
    System.out.println("這是環繞通知3");
    //原始操作調用
    int proceed = (int) pjp.proceed();
    System.out.println("這是環繞通知4");
    return proceed;
}

    //返回後通知
//  @AfterReturning("pt()")
//    public void afterReturning(){
//      System.out.println("這是返回後通知");
//  }

    //拋出異常後通知
//    @AfterThrowing



}
