package com.together.learning.spring.ioc.step34_java_config.xml_centric;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlCentricSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step34_java_config/xml_centric/spring-application.xml");
        A a = ac.getBean(A.class);
        System.out.println(a == null);
        if (a.getB() != null) {
            System.out.println(a.getB());
        }
    }
}
