package com.together.learning.spring.ioc.step34_java_config.xml_centric;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Autowired
    private B b;

    @Bean
    public A a() {
        A a = new A(b);
        return a;
    }

}
