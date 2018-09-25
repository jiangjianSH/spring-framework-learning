package com.together.learning.spring.validator.step2_method_validation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jiangjian
 */
public class MethodValidationSample {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        A a = ac.getBean(A.class);
        a.echo("java");
        a.echo(null);
    }
}
