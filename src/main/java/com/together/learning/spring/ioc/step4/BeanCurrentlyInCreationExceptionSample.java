package com.together.learning.spring.ioc.step4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanCurrentlyInCreationExceptionSample {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("ioc/step4/spring-beans.xml");
    }
}
