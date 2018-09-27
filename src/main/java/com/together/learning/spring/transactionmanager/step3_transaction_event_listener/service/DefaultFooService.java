package com.together.learning.spring.transactionmanager.step3_transaction_event_listener.service;

import com.together.learning.spring.transactionmanager.step3_transaction_event_listener.CreatedEvent;
import com.together.learning.spring.transactionmanager.step3_transaction_event_listener.entity.Foo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

/**
 * @author jiangjian
 */
public class DefaultFooService implements FooService {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public Foo getFoo(String fooName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Foo getFoo(String fooName, String barName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void insertFoo(Foo foo) {
        System.out.println("---------------insert foo----------");
        applicationEventPublisher.publishEvent(new CreatedEvent("from DefaultFooService"));
    }

    @Override
    public void updateFoo(Foo foo) {
        throw new UnsupportedOperationException();
    }

}