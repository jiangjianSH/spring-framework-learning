package com.together.learning.spring.ioc.step19;

import java.util.Random;

public class Food {
    private int price;

    public Food() {
        price = new Random().nextInt(40);
    }

    public void consume() {
        System.out.println("eating costs " + price);
    }
}
