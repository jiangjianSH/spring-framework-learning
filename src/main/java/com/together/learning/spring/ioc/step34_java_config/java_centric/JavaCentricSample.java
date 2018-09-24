package com.together.learning.spring.ioc.step34_java_config.java_centric;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaCentricSample {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
        A a = ac.getBean(A.class);
        System.out.println(a == null);
        if (a.getB() != null) {
            System.out.println(a.getB());
        }
    }
}
