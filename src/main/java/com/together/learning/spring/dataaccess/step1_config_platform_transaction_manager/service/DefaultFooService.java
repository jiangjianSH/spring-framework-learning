package com.together.learning.spring.dataaccess.step1_config_platform_transaction_manager.service;

import com.together.learning.spring.dataaccess.step1_config_platform_transaction_manager.entity.Foo;

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
        throw new UnsupportedOperationException();
    }

    @Override
    public void updateFoo(Foo foo) {
        throw new UnsupportedOperationException();
    }

}