package com.together.learning.spring.step4.resolve;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResolveCircularDependencyBySetterMethodSample {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("step4/resolve/spring-beans.xml");
        ADependOnB a = applicationContext.getBean(ADependOnB.class);
        System.out.println("a == null ? " + (a == null));
        System.out.println(a.getbDependOnA() == null);

        BDependOnA b = applicationContext.getBean(BDependOnA.class);
        System.out.println("b == null ? " + (b == null));
        System.out.println(b.getaDependOnB() == null);
    }
}
