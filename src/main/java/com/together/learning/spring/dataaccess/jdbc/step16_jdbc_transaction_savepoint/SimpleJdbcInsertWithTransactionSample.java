package com.together.learning.spring.dataaccess.jdbc.step16_jdbc_transaction_savepoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author jiangjian
 */
public class SimpleJdbcInsertWithTransactionSample {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        initDatabaseEnv(ac);

        DataSource dataSource = ac.getBean(DataSource.class);
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            connection.setAutoCommit(false);

            insertUser(connection);
            insertAddress(connection);
            connection.commit();
        }catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
                System.out.println("rollback successfully");
            } catch (SQLException e1) {
                e1.printStackTrace();
                System.out.printf("rollback failure");
            }
        } finally {
            if(connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        clearDatabaseEnv(ac);
    }

    private static void insertUser(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into user(id, name, age) values(?,?,?)");
        preparedStatement.setInt(1, 1);
        preparedStatement.setString(2, "alice");
        preparedStatement.setInt(3, 20);
        preparedStatement.execute();
        preparedStatement.close();
    }

    private static  void insertAddress(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into address(id, uid, address) values(?,?,?)");
        preparedStatement.setInt(1, 1);
        preparedStatement.setInt(2, 1);
        preparedStatement.setString(3, "中国上海市静安区");//江杨南路888号
        preparedStatement.execute();
        preparedStatement.close();
    }

    public static void initDatabaseEnv(ApplicationContext ac) {
        JdbcTemplate jdbcTemplate = ac.getBean(JdbcTemplate.class);
        //初始化数据库
        jdbcTemplate.execute("create table if not exists  user(id int primary key, name varchar(40), age int)");
        jdbcTemplate.execute("create table if not exists  address(id int primary key, uid int, address varchar(10))");
    }

    public static void clearDatabaseEnv(ApplicationContext ac) {
//        JdbcTemplate jdbcTemplate = ac.getBean(JdbcTemplate.class);
//        jdbcTemplate.execute("drop table user");
    }
}
