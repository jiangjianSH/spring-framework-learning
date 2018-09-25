package com.together.learning.spring.resources.step1_resource_loader_aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @author jiangjian
 */
public class ResourceLoaderAwareSample {
    public static void main(String[] args) throws IOException {
        ApplicationContext ac = new AnnotationConfigApplicationContext();
        ((AnnotationConfigApplicationContext) ac).register(A.class);
        ((AnnotationConfigApplicationContext) ac).refresh();

        A a = ac.getBean(A.class);
        a.output();
    }
}
