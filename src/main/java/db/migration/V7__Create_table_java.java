package db.migration;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;
import org.springframework.jdbc.core.JdbcTemplate;

public class V7__Create_table_java extends BaseJavaMigration {
    @Override
    public void migrate(Context context) throws Exception {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(context.getConfiguration().getDataSource());

        jdbcTemplate.execute("create table person " +
                "(id int auto_increment not null," +
                "name varchar(100) not null," +
                "address varchar(100) ," +
                "primary key(id))");
    }
}
