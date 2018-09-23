package com.together.learning.spring.ioc.step15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyInitializedSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step15/spring-application.xml");
        System.out.println("------------before get bean from ioc container --------");
        Lazy lazy = ac.getBean(Lazy.class);
    }
}
