package com.together.learning.spring.ioc.step11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CNamespaceSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step11/spring-application.xml");
        System.out.println(ac.getBean("user", User.class));
        System.out.println(ac.getBean("userByIndex", User.class));

    }
}
