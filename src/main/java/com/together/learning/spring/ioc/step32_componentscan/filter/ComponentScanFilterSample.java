package com.together.learning.spring.ioc.step32_componentscan.filter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 如何禁用@Service, @Component, @Repository, @Controller?
 * 	You can also disable the default filters by setting useDefaultFilters=false
 * 	on the annotation or by providing use-default-filters="false" as an attribute
 * 	of the <component-scan/> element. This, in effect, disables automatic detection
 * 	of classes annotated with @Component, @Repository, @Service, @Controller, or @Configuration.
 */
public class ComponentScanFilterSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step32_componentscan/filter/spring-application.xml");
        B b = ac.getBean(B.class);
        System.out.println(b == null);

        A a = ac.getBean(A.class);
    }
}
