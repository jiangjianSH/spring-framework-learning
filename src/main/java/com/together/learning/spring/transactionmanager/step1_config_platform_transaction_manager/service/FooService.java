package com.together.learning.spring.transactionmanager.step1_config_platform_transaction_manager.service;

import com.together.learning.spring.transactionmanager.step1_config_platform_transaction_manager.entity.Foo;

/**
 * @author jiangjian
 */

public interface FooService {

    Foo getFoo(String fooName);

    Foo getFoo(String fooName, String barName);

    void insertFoo(Foo foo);

    void updateFoo(Foo foo);

}