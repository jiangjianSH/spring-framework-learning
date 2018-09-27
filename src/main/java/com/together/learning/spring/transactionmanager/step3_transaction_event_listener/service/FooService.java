package com.together.learning.spring.transactionmanager.step3_transaction_event_listener.service;

import com.together.learning.spring.transactionmanager.step3_transaction_event_listener.entity.Foo;

/**
 * @author jiangjian
 */

public interface FooService {

    Foo getFoo(String fooName);

    Foo getFoo(String fooName, String barName);

    void insertFoo(Foo foo);

    void updateFoo(Foo foo);

}