package com.together.learning.spring.ioc.step17;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MethodInjectionSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step17/spring-application.xml");
        SingletonBean singletonBean = ac.getBean(SingletonBean.class);
        singletonBean.getPrototypeBean().display();
        singletonBean.getPrototypeBean().display();
    }
}
