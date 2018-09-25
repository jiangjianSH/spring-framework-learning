package com.together.learning.spring.propertyeditor.step2_property_editor_registrar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jiangjian
 */
public class PropertyEditorRegistrarSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("propertyeditor/step2_property_editor_registrar/spring-application.xml");
        B b = ac.getBean(B.class);
        System.out.println(b.getA());
    }
}
