package com.together.learning.spring.step7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IdRefElementSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("step7/spring-application.xml");
        ClientBean clientBean = ac.getBean(ClientBean.class);
        System.out.println(clientBean.getTargetBeanName());
        System.out.println(ac.getBean(clientBean.getTargetBeanName()));
    }
}
