package com.together.learning.spring.step4;

public class BDependOnA {
    private ADependOnB aDependOnB;

    public BDependOnA(ADependOnB aDependOnB) {
        this.aDependOnB = aDependOnB;
    }
}
