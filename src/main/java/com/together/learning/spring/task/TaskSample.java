package com.together.learning.spring.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TaskSample {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TaskConfig.class);
        TaskOperation taskOperation = ac.getBean(TaskOperation.class);
        taskOperation.doSomethingAsync();
        System.out.println("----after call async method----");
        ((AnnotationConfigApplicationContext) ac).registerShutdownHook();
    }
}
