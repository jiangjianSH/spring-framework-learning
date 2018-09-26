package com.together.learning.spring.aop.step2_pointcut_designator;

/**
 * @author jiangjian
 */
@Lucky
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
