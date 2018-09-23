package com.together.learning.spring.ioc.step20;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomScopeSample {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step20/spring-application.xml");
        A a = ac.getBean(A.class);

        a.getB().display();
        a.getB().display();

        Thread.sleep(10000L);
        a.getB().display();
        a.getB().display();
    }
}
