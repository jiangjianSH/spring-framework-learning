package com.together.learning.spring.ioc.step29;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class QualifierSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step29/spring-application.xml");
        Meeting meeting = ac.getBean(Meeting.class);
        People[] chineseAttendee = meeting.getChineseAttendee();
        if(chineseAttendee != null) {
            System.out.println("--------chinese attendee------");
            Arrays.asList(chineseAttendee).forEach(System.out::println);
        }

        People[] japaneseAttendee = meeting.getJapaneseAttendee();
        if(japaneseAttendee != null) {
            System.out.println("--------japanese attendee------");
            Arrays.asList(japaneseAttendee).forEach(System.out::println);
        }
    }
}
