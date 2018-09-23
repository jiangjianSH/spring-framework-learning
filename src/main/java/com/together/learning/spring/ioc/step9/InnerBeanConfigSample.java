package com.together.learning.spring.ioc.step9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerBeanConfigSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step9/spring-application.xml");
        Outer outer = ac.getBean(Outer.class);
        System.out.println(outer);
    }
}
