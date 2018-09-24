package com.together.learning.spring.ioc.step32_componentscan.beanname_generator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class BeanNameGeneratorSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step32_componentscan/beanname_generator/spring-application.xml");
        String[] beanNames = ac.getBeanNamesForType(A.class);
        if(beanNames != null) {
            Arrays.asList(beanNames).forEach(System.out::println);
        }
    }
}
