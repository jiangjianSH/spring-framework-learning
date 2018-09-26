package com.together.learning.spring.ioc.step37_message;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

/**
 * @author jiangjian
 */
public class MessageSourceSample {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        A a = ac.getBean(A.class);
        a.output(null);
        a.output(Locale.CHINESE);
        a.output(Locale.ENGLISH);

        a.output("author.age", Locale.CHINESE);
    }
}
