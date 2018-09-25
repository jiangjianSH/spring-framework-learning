package com.together.learning.spring.ioc.step28;

import org.springframework.core.Ordered;

public class B implements Ordered {
    private int order;
    private String value;

    public B(int order, String value) {
        this.order = order;
        this.value = value;
    }

    @Override
    public int getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "AFactoryBean{" +
                "order=" + order +
                ", value='" + value + '\'' +
                '}';
    }
}
