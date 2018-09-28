package com.together.learning.spring.dataaccess.jdbc.step13_sqlupdate;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

import javax.sql.DataSource;
import java.sql.Types;

/**
 * @author jiangjian
 */
public class UserSqlUpdate extends SqlUpdate {
    public UserSqlUpdate(DataSource ds) {
        super(ds, "update user set name=? where id=?");
        declareParameter(new SqlParameter("name", Types.VARCHAR));
        declareParameter(new SqlParameter("id", Types.BIGINT));
        compile();
    }
}
