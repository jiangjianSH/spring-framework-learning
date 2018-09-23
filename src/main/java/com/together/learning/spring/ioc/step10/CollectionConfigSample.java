package com.together.learning.spring.ioc.step10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionConfigSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step10/spring-application.xml");
        CollectionStorage storage = ac.getBean(CollectionStorage.class);

        storage.getProperties().forEach((key, value) -> System.out.println(key + "=" + value));

        storage.getLists().forEach(System.out::println);

        storage.getMap().forEach((key, value) -> System.out.println(key + "-->" + value));

        storage.getSet().forEach(System.out::println);
    }
}