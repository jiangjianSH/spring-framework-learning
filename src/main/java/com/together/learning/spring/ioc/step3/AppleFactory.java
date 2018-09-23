package com.together.learning.spring.ioc.step3;

public class AppleFactory {
    public IphoneMax createIphoneMax() {
        return new IphoneMax();
    }

    public static Iphone6S createIphone6S() {
        return new Iphone6S();
    }
}
