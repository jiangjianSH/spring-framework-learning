package com.together.learning.spring.ioc.step14;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependsOnSample {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("ioc/step14/spring-application.xml");
    }
}
