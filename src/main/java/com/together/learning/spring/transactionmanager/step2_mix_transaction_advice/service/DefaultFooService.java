package com.together.learning.spring.transactionmanager.step2_mix_transaction_advice.service;

import com.together.learning.spring.transactionmanager.step2_mix_transaction_advice.entity.Foo;

/**
 * @author jiangjian
 */
public class DefaultFooService implements FooService {

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
        //no op
    }

    @Override
    public void updateFoo(Foo foo) {
        throw new UnsupportedOperationException();
    }

}