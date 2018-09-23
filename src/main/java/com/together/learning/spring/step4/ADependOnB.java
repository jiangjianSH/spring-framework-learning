package com.together.learning.spring.step4;

public class ADependOnB {
    private BDependOnA bDependOnA;

    public ADependOnB(BDependOnA bDependOnA) {
        this.bDependOnA = bDependOnA;
    }
}
