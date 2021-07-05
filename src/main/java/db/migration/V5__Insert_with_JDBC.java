package db.migration;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

public class V5__Insert_with_JDBC extends BaseJavaMigration {

    @Override
    @Transactional
    public void migrate(Context context) throws Exception {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(context.getConfiguration().getDataSource());
        jdbcTemplate.update("insert into test_user (id, username,first_name,last_name) " +
                "values (5,'taf','tango','charlie')");

    }
}
