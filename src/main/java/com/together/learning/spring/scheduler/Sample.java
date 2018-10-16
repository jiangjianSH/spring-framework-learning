package com.together.learning.spring.scheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author jiangjian
 */

@Configuration
@EnableScheduling
public class Sample {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Sample.class);
    }

    @Scheduled(cron = "0/5 * * * * *")
    public void printHello() {
        System.out.println("Hello " + System.currentTimeMillis());
    }
}
