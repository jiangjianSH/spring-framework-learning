package com.together.learning.spring.dataaccess.jdbc.step17_spring_jdbc_with_transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author jiangjian
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public void saveUser(User user) {
        userDao.createUser(user);
    }
}
