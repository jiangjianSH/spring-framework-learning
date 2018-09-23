package com.together.learning.spring.ioc.step6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesTypeValueInjectionSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step6/spring-application.xml");
        ProductProperties productProperties = ac.getBean(ProductProperties.class);
        productProperties.getProperties().forEach((key, value) -> System.out.println(key + "=" + value));
    }
}
