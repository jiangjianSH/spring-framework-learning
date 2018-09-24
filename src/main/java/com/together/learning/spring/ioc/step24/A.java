package com.together.learning.spring.ioc.step24;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class A implements InitializingBean, DisposableBean {
    private String value;

    public A() {
        System.out.println("A create");
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        System.out.println("setting properties");
        this.value = value;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after properties set");
    }
}
