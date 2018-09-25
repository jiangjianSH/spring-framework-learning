package com.together.learning.spring.spel.step19_bean_reference;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component(value = "aFactoryBean")
public class AFactoryBean implements FactoryBean<A> {
    @Override
    public A getObject() throws Exception {
        return new A();
    }

    @Override
    public Class<?> getObjectType() {
        return A.class;
    }

    @Override
    public String toString() {
        return "from factory";
    }
}
