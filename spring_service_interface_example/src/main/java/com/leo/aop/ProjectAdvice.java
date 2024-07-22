package com.leo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Leo
 * @data 2024/7/19 上午 11:40
 */
@Component
@Aspect
public class ProjectAdvice {
    //匹配業務層的所有方法
    @Pointcut("execution(* com.leo.service.*Service.*(..))")
    public void servicePt(){}


    @Around("ProjectAdvice.servicePt()")
    public void runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        //獲取一次執行的標籤信息即封裝了一次執行過程
        Signature signature = pjp.getSignature();
        //打印執行的方法類型
        System.out.println(signature.getDeclaringType());
        //打印執行的方法名
        System.out.println(signature.getName());
        long start=System.currentTimeMillis();
        for (int i = 0; i <10000 ; i++) {
            pjp.proceed();
        }
        long end=System.currentTimeMillis();
        System.out.println("10000次執行"+signature.getDeclaringTypeName()+"的"+signature.getName()+"方法"+"的時間為："+(end-start)+"ms");

    }
}
