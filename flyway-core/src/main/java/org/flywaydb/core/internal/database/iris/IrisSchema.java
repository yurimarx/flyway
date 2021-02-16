package org.flywaydb.core.internal.database.iris;

import org.flywaydb.core.internal.database.base.Schema;
import org.flywaydb.core.internal.database.base.Table;
import org.flywaydb.core.internal.jdbc.JdbcTemplate;

import java.sql.SQLException;

public class IrisSchema extends Schema<IrisDatabase,IrisTable> {

    /**
     * @param jdbcTemplate The Jdbc Template for communicating with the DB.
     * @param database     The database-specific support.
     * @param name         The name of the schema.
     */
    public IrisSchema(JdbcTemplate jdbcTemplate, IrisDatabase database, String name) {
        super(jdbcTemplate, (IrisDatabase) database, name);
    }

    @Override
    protected boolean doExists() throws SQLException {
        return false;
    }

    @Override
    protected boolean doEmpty() throws SQLException {
        return false;
    }

    @Override
    protected void doCreate() throws SQLException {

    }

    @Override
    protected void doDrop() throws SQLException {

    }

    @Override
    protected void doClean() throws SQLException {

    }

    @Override
    protected IrisTable[] doAllTables() throws SQLException {
        return (IrisTable[]) new Table[0];
    }

    @Override
    public Table getTable(String tableName) {
        return null;
    }
}
