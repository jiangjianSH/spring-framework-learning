package com.together.learning.spring.ioc.step31;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class A {
    public A() {
        System.out.println("constructor");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("preDestroy");
    }
}
