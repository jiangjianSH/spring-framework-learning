package com.together.learning.spring.ioc.step31;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PostConstructAndPreDestroyAnnotationSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step31/spring-application.xml");
        ((ClassPathXmlApplicationContext) ac).registerShutdownHook();
    }
}
