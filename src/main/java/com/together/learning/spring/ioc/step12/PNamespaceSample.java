package com.together.learning.spring.ioc.step12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PNamespaceSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step12/spring-application.xml");
        System.out.println(ac.getBean(User.class));
    }
}
