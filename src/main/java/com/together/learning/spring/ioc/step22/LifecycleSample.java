package com.together.learning.spring.ioc.step22;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleSample {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step22/spring-application.xml");
        LifecycleBean lifecycleBean = ac.getBean(LifecycleBean.class);
        ((ClassPathXmlApplicationContext) ac).registerShutdownHook();

//        Thread.sleep(10000L);
    }
}
