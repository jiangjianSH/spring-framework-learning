package com.together.learning.spring.dataaccess.step3_transaction_event_listener;

import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * @author jiangjian
 */
@Component
public class MyComponent {
    @TransactionalEventListener
    public void transactionEventHandler(CreatedEvent event) {
        System.out.println("-----receive transaction event---");
        System.out.println(event);
    }
}
