package imorochi;

import imorochi.impl.MySQLAdapter;
import imorochi.impl.PostgreSQLAdapter;

public class DBConnectionFactory {

    private static final String DB_FACTORY_PROPERTY_URL = "META-INF/DBConnectionFactory.properties";
    private static final String DEFAULT_DB_CLASS = "defaultDBClass";

    public static IDBAdapter getDBadapter(DBType dbType) {
        switch (dbType) {
            case MySQL:
                return new MySQLAdapter();
            case PostgreSQL:
                return new PostgreSQLAdapter();
            default:
                throw new IllegalArgumentException("Not supported");
        }
    }

    public static IDBAdapter getDefaultDBAdapter() {
        // TODO: Default Connection
        return null;
    }
}
