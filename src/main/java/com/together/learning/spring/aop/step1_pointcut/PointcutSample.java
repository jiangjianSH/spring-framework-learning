package com.together.learning.spring.aop.step1_pointcut;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jiangjian
 */
public class PointcutSample {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        A a = ac.getBean(A.class);
        a.display();
    }
}
