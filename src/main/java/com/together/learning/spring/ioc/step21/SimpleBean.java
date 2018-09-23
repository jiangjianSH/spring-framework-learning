package com.together.learning.spring.ioc.step21;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SimpleBean implements InitializingBean, DisposableBean {
    public SimpleBean() {
        System.out.println("new simpleBean");
    }

    @PostConstruct
    public void initByPostConstructor() {
        System.out.println("@PostConstruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean interface");
    }

    public void init() {
        System.out.println("init method");
    }

    @PreDestroy
    public void destroyByPreDestroy() {
        System.out.println("@PreDestroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean interface");
    }

    public void customDestroy() {
        System.out.println("custom destroy method");
    }
}
