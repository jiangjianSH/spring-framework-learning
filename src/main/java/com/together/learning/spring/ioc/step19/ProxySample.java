package com.together.learning.spring.ioc.step19;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxySample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step19/spring-application.xml");
        Animal animal = ac.getBean(Animal.class);
        animal.eat();
        animal.eat();
    }
}
