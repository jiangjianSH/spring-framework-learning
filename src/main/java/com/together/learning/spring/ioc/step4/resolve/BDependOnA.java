package com.together.learning.spring.ioc.step4.resolve;

public class BDependOnA {
    private ADependOnB aDependOnB;

    public ADependOnB getaDependOnB() {
        return aDependOnB;
    }

    public void setaDependOnB(ADependOnB aDependOnB) {
        this.aDependOnB = aDependOnB;
    }
}
