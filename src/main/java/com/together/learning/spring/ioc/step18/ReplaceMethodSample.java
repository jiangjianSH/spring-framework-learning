package com.together.learning.spring.ioc.step18;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReplaceMethodSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step18/spring-application.xml");
        Dancer dancer = ac.getBean(Dancer.class);
        dancer.dancer();
    }
}
