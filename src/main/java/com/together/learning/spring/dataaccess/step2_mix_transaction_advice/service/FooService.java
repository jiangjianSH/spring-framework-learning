package com.together.learning.spring.dataaccess.step2_mix_transaction_advice.service;

import com.together.learning.spring.dataaccess.step2_mix_transaction_advice.entity.Foo;

/**
 * @author jiangjian
 */

public interface FooService {

    Foo getFoo(String fooName);

    Foo getFoo(String fooName, String barName);

    void insertFoo(Foo foo);

    void updateFoo(Foo foo);

}