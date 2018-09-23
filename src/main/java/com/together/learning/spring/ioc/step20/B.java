package com.together.learning.spring.ioc.step20;

import java.util.Random;

public class B {
    private int value;

    public B() {
        value = new Random().nextInt(1000);
    }

    public void display() {
        System.out.println("value is " + value);
    }
}
