package com.together.learning.spring.ioc.step17;

import java.util.Random;

public class PrototypeBean {
    public void display() {
        System.out.println("hello world " + new Random().nextLong());
    }
}
