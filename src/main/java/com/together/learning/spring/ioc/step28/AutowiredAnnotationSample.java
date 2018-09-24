package com.together.learning.spring.ioc.step28;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredAnnotationSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step28/spring-application.xml");
        MainBean mainBean = ac.getBean(MainBean.class);

        System.out.println(mainBean.getA());

        B[] bArray = mainBean.getbArray();
        if(bArray != null) {
            System.out.println("size : " + bArray.length);
            for(int i = 0; i < bArray.length; i++) {
                System.out.println(bArray[i]);
            }
        }

        System.out.println(mainBean.getC());

        System.out.println(mainBean.getD());
    }
}
