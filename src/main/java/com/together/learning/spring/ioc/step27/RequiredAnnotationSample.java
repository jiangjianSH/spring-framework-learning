package com.together.learning.spring.ioc.step27;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiredAnnotationSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step27/spring-application.xml");
        A a = ac.getBean(A.class);
        System.out.println(a.getB() == null);
    }
}
