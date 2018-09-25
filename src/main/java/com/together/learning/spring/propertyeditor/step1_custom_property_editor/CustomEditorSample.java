package com.together.learning.spring.propertyeditor.step1_custom_property_editor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jiangjian
 */
public class CustomEditorSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("propertyeditor/step1_custom_property_editor/spring-application.xml");
        B b = ac.getBean(B.class);
        System.out.println(b.getA());
    }
}
