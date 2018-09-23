package com.together.learning.spring.ioc.step13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompoundPropertyNameSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step13/spring-application.xml");
        System.out.println(ac.getBean(User.class));
    }
}
