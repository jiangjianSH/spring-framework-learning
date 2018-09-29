package com.together.learning.spring.dataaccess.jdbc.step16_jdbc_transaction_savepoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

/**
 * 这里面我们在插入user和address后，再插入一个log,如果插入Log的时候报错，我们并不希望
 * 整个事务回滚，因为log失败并不会带来数据上不一致性问题，所以在某些场景下，可以忍受这种
 * 出错情况，使有效的业务数据能够继续保存在数据库中
 *
 * @author jiangjian
 */
public class SimpleJdbcInsertWithSavepointSample {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        initDatabaseEnv(ac);

        DataSource dataSource = ac.getBean(DataSource.class);
        Connection connection = null;
        Savepoint savepoint = null;
        try {
            connection = dataSource.getConnection();
            connection.setAutoCommit(false);

            insertUser(connection);
            insertAddress(connection);
            savepoint = connection.setSavepoint("UserSavepoint");

            insertLog(connection);

            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                if (savepoint == null) { //这种情况下表面use和address并没有完全的插入，所以为了数据一致性，整体选择回滚是合适的
                    connection.rollback();
                    System.out.println("rollback successfully");
                } else {
                    connection.rollback(savepoint);
                    connection.commit();
                    System.out.println("savepoint rollback successfully");
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }

        } finally {
            if (connection != null) {
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

    private static void insertAddress(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into address(id, uid, address) values(?,?,?)");
        preparedStatement.setInt(1, 1);
        preparedStatement.setInt(2, 1);
        preparedStatement.setString(3, "中国上海市静安区");
        preparedStatement.execute();
        preparedStatement.close();
    }

    private static void insertLog(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into log(message) values(?)");
        preparedStatement.setString(1, "哔哔哔哔哔哔哔哔哔哔哔哔");
        preparedStatement.execute();
        preparedStatement.close();
    }

    public static void initDatabaseEnv(ApplicationContext ac) {
        JdbcTemplate jdbcTemplate = ac.getBean(JdbcTemplate.class);
        //初始化数据库
        jdbcTemplate.execute("create table if not exists  user(id int primary key, name varchar(40), age int)");
        jdbcTemplate.execute("create table if not exists  address(id int primary key, uid int, address varchar(10))");
        jdbcTemplate.execute("create table if not exists  log(id int auto_increment primary key, message varchar(10))");

    }

    public static void clearDatabaseEnv(ApplicationContext ac) {
//        JdbcTemplate jdbcTemplate = ac.getBean(JdbcTemplate.class);
//        jdbcTemplate.execute("drop table user");
    }
}

