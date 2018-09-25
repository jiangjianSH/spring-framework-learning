package com.together.learning.spring.resources.step2_resources_dependencies;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author jiangjian
 */
public class ResourcesDependenciesSample {
    public static void main(String[] args) throws IOException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("resources/step2_resources_dependencies/spring-application.xml");
        A a = ac.getBean(A.class);
        a.output();
    }
}
