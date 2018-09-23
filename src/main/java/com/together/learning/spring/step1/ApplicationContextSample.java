package com.together.learning.spring.step1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextSample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("step1/spring-beans.xml");
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService.findById(1));
    }
}
