package com.together.learning.spring.ioc.step23;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MultiAwareBean implements InitializingBean, DisposableBean, ApplicationContextAware, BeanNameAware {

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
    @Override
    public void setBeanName(String name) {
        System.out.println("BeanNameAware callback");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContextAware callback");
    }
}
