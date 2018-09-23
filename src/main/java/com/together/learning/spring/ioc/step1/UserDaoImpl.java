package com.together.learning.spring.ioc.step1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserDaoImpl implements UserDao {
    private static Map<Long, User> inMemoryStores = new ConcurrentHashMap<>();

    static {
        inMemoryStores.put(1L, new User(1, "alice"));
        inMemoryStores.put(2L, new User(2, "bob"));
        inMemoryStores.put(3L, new User(3, "cindy"));
    }

    public User findById(long id) {
        return inMemoryStores.get(id);
    }
}
