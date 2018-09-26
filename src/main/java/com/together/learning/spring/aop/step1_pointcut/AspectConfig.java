package com.together.learning.spring.aop.step1_pointcut;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
/**
 * @author jiangjian
 */

@Component
@Aspect
public class AspectConfig {
    @Pointcut("within(com.together.learning.spring.aop.step1_pointcut.A)")
    public void methodOnTypes() {}

    @Around(value = "methodOnTypes()")
    public void methodOn(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("before intercept");
        proceedingJoinPoint.proceed();
        System.out.println("after intercept");
    }
}
