package com.together.learning.spring.ioc.step30;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourceAnnotationSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step30/spring-application.xml");
        A a = ac.getBean(A.class);
        System.out.println(a.getB() == null);

        B b = ac.getBean(B.class);
        System.out.println(a.getB() == b);
    }
}
