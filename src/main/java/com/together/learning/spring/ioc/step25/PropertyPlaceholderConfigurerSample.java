package com.together.learning.spring.ioc.step25;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyPlaceholderConfigurerSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step25/spring-application.xml");
        A normal = ac.getBean("normal", A.class);
        System.out.println(normal);

        A aBean = ac.getBean("aBean", A.class);
        System.out.println(aBean);
    }
}
