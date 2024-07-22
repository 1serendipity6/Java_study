package com.leo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Leo
 * @data 2024/7/19 下午 02:34
 */
@Component
@Aspect
public class MyAdvice {
//    @Pointcut("execution(* com.leo.dao.BookDao.findName(..))")
//    public void pt(){}
//
//    @Before("pt()")
    @Before("execution(* com.leo.dao.BookDao.findName(..))")
    public void before(JoinPoint  jp){
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("這是前置通知");
    }
//    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));
        args[0]=66;
        Object ret = pjp.proceed(args);
        return ret;
    }
}
