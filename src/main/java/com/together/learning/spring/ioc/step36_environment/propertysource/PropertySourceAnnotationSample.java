package com.together.learning.spring.ioc.step36_environment.propertysource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertySourceAnnotationSample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(Config.class);
        ac.getEnvironment().getSystemProperties().put("switch", "prod");
        ac.refresh();
        System.out.println(ac.getEnvironment().getProperty("author.name"));
    }
}
