package com.together.learning.spring.ioc.step15;

public class EarlyDependsOnLazy {
    private LazyReferenceByEarly lazy;

    public EarlyDependsOnLazy() {
        System.out.println("early dependsOn lazy");
    }

    public LazyReferenceByEarly getLazy() {
        return lazy;
    }

    public void setLazy(LazyReferenceByEarly lazy) {
        this.lazy = lazy;
    }
}
