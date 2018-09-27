package com.together.learning.spring.dataaccess.step3_transaction_event_listener;

import org.springframework.context.ApplicationEvent;

/**
 * @author jiangjian
 */
public class CreatedEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public CreatedEvent(Object source) {
        super(source);
    }
}
