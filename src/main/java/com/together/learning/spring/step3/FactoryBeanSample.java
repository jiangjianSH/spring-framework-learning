package com.together.learning.spring.step3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanSample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("step3/spring-application.xml");
        Iphone6S iphone6S = context.getBean(Iphone6S.class);
        iphone6S.showVersion();

        IphoneMax iphoneMax = context.getBean(IphoneMax.class);
        iphoneMax.showVersion();
    }
}
