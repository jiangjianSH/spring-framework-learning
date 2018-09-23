package com.together.learning.spring.ioc.step22;

import org.springframework.context.SmartLifecycle;

public class LifecycleBean implements SmartLifecycle {
    private boolean isRunning = false;

    @Override
    public void start() {
        System.out.println("i am starting");
        isRunning = true;
    }

    @Override
    public void stop() {
        System.out.println("i am stop");
        isRunning = false;
    }

    @Override
    public boolean isRunning() {
        System.out.println("isRunning:" + isRunning);
        return isRunning;
    }
}
