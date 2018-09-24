package com.together.learning.spring.ioc.step35_profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfileSample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.getEnvironment().addActiveProfile("test");
        ac.scan("com.together.learning.spring.ioc.step35_profile");
        ac.refresh();

        B b = ac.getBean(B.class);
        System.out.println(b == null);

        A a = ac.getBean(A.class);
    }
}
