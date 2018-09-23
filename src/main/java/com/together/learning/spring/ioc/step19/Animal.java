package com.together.learning.spring.ioc.step19;

public class Animal {
    private Food food;

    public void eat() {
        food.consume();
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}
