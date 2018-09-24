package com.together.learning.spring.ioc.step26;

import org.springframework.beans.factory.FactoryBean;

import java.util.Random;

public class PregnantWoman implements FactoryBean<Object> {
    @Override
    public Object getObject() throws Exception {
        if (new Random().nextInt() % 2 == 1) {
            return new Boy();
        } else {
            return new Girl();
        }
    }

    /**
     * note: 返回值null说明类型提前是不知道的，当前实例需要的就是这个特性，
     * 所以自己定义其他类型的FactoryBean根据实际情况返回对应的Class类型
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return null;
    }

    public void status() {
        System.out.println("I am too weak");
    }
}
