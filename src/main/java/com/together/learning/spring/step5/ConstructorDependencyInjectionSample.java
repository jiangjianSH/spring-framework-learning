package com.together.learning.spring.step5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorDependencyInjectionSample {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("step5/spring-application.xml");
        Country china = applicationContext.getBean(Country.class);
        System.out.println(china);

    }
}
