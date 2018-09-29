package com.together.learning.spring.dataaccess.jdbc.step17_spring_jdbc_with_transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author jiangjian
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private DataSource dataSource;

    @Override
    public void createUser(User user) {
        String createUserSql = "insert into user (name,age) values (?,?)";
        String createAddressSql = "insert into address (id,address) values (?,?)";

//注意这些代码是会绕过外部transaction的配置的,请自行理会
//        try {
//            System.out.println("----------------start ----");
//            Connection connection = dataSource.getConnection();
//            connection.setAutoCommit(false);
//            Statement st = connection.createStatement();
//            st.execute("insert into user(name, age) values('alice', 30)");
//            connection.commit();
//            System.out.println("----------------end ----");
//        }catch (SQLException e) {
//            e.printStackTrace();
//        }

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement preparedStatement = connection.prepareStatement(createUserSql, new String[]{"id"});
            preparedStatement.setString(1, user.getName());
            preparedStatement.setInt(2, user.getAge());
            return preparedStatement;
        }, keyHolder);
        System.out.println("Inserted into User Table Successfully");

        jdbcTemplate.update(createAddressSql, new Object[] {keyHolder.getKey().longValue(),
                user.getAddress().getAddress()});
        System.out.println("Inserted into Address Table Successfully");


    }
}
