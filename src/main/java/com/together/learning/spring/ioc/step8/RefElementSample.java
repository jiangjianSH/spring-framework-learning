package com.together.learning.spring.ioc.step8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefElementSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step8/spring-application.xml");
        ClientBean clientBean = ac.getBean(ClientBean.class);
        System.out.println(clientBean.getTargetBean());
    }
}
