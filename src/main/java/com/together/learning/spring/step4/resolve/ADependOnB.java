package com.together.learning.spring.step4.resolve;

public class ADependOnB {
    private BDependOnA bDependOnA;

    public BDependOnA getbDependOnA() {
        return bDependOnA;
    }

    public void setbDependOnA(BDependOnA bDependOnA) {
        this.bDependOnA = bDependOnA;
    }
}
