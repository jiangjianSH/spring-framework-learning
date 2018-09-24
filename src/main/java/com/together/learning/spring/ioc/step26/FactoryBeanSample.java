package com.together.learning.spring.ioc.step26;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step26/spring-application.xml");
        Object baby = ac.getBean("baby");
        System.out.println(baby);

        /*
           这里请注意，如果我们要获取FactoryBean本身，而不是FactoryBean生成的bean,我们需要用"&"特殊的前缀来
           表示我们获取的是FactoryBen本身
         */
        PregnantWoman pregnantWoman = ac.getBean("&baby", PregnantWoman.class);
        pregnantWoman.status();
    }
}
