package com.together.learning.spring.ioc.step20;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TimelyScope implements Scope {
    private Map<String, Object> dataStorage = new HashMap();
    private Map<String, Long> expiredInfo = new HashMap<>();

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        if(dataStorage.containsKey(name)) {
            if(expiredInfo.get(name) <= System.currentTimeMillis()) {
                dataStorage.remove(name);
                expiredInfo.remove(name);
            } else {
                return dataStorage.get(name);
            }
        }

        Object value = objectFactory.getObject();
        dataStorage.put(name, value);
        expiredInfo.put(name, System.currentTimeMillis() + new Random().nextInt(10000));
        return value;
    }

    @Override
    public Object remove(String name) {
        Object value = dataStorage.get(name);
        dataStorage.remove(name);
        expiredInfo.remove(name);
        return value;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {
        callback.run();
    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return "timelyScope";
    }
}
