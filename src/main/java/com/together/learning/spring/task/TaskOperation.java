package com.together.learning.spring.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskOperation {
    @Async
    public void doSomethingAsync(){
        System.out.println(Thread.currentThread() + "  ----start sleep");
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread() + "  ----end sleep");
    }

    @Scheduled(cron = "0/5 * * * * * ")
    public void sayHelloRepeatedly() {
        System.out.println(Thread.currentThread().getName() + "  hello");
    }
}
