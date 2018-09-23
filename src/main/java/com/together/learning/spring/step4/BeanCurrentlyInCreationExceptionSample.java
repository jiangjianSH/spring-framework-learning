package com.together.learning.spring.step4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanCurrentlyInCreationExceptionSample {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("step4/spring-beans.xml");
    }
}
