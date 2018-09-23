package com.together.learning.spring.ioc.step21;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInitializeAndDestroyCallbackSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step21/spring-application.xml");
        SimpleBean simpleBean = ac.getBean(SimpleBean.class);
        simpleBean = ac.getBean(SimpleBean.class);
        ((ClassPathXmlApplicationContext) ac).registerShutdownHook();
    }
}
