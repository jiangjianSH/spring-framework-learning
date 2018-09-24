package com.together.learning.spring.ioc.step33_jsr330;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 为了使用jsr330的注解类，请在pom.xml的dependencies中配置对javax.inject的依赖，
 * 比如：
    <dependency>
         <groupId>javax.inject</groupId>
         <artifactId>javax.inject</artifactId>
         <version>1</version>
    </dependency>
    */
public class Jsr330SupportSample {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc/step33_jsr330/spring-application.xml");
        A a = applicationContext.getBean(A.class);
        System.out.println(a == null);
        if(a != null) {
            System.out.println(a.getB() == null);
        }
    }
}
