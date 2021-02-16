package org.flywaydb.core.internal.database.iris;

import org.flywaydb.core.internal.database.base.Schema;
import org.flywaydb.core.internal.database.base.Table;
import org.flywaydb.core.internal.jdbc.JdbcTemplate;

import java.sql.SQLException;

public class IrisTable extends Table<IrisDatabase,IrisSchema> {
    /**
     * @param jdbcTemplate The JDBC template for communicating with the DB.
     * @param database     The database-specific support.
     * @param schema       The schema this table lives in.
     * @param name         The name of the table.
     */
    public IrisTable(JdbcTemplate jdbcTemplate, IrisDatabase database, Schema schema, String name) {
        super(jdbcTemplate, database, (IrisSchema) schema, name);
    }

    @Override
    protected void doDrop() throws SQLException {

    }

    @Override
    protected boolean doExists() throws SQLException {
        return false;
    }

    @Override
    protected void doLock() throws SQLException {

    }
}
