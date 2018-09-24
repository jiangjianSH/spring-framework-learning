package com.together.learning.spring.ioc.step36_environment.standard_environment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StandardEnvironmentSample {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        ((AnnotationConfigApplicationContext) applicationContext).scan("com.together.learning.spring.ioc.step36_environment.standard_environment");
        ((AnnotationConfigApplicationContext) applicationContext).refresh();

        System.out.println(applicationContext.getEnvironment().getProperty("OS"));
    }
}
