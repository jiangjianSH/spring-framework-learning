package com.together.learning.spring.ioc.step32_componentscan.disable_default_filter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DisableDefaultFilterSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step32_componentscan/disable_default_filter/spring-application.xml");
        A a = ac.getBean(A.class);
        System.out.println(a == null);
    }
}
