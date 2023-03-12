package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String DB_USERNAME = System.getenv("LS_PG_USERNAME");
    private static final String DB_PASSWORD = System.getenv("LS_PG_PASSWORD");

    private DB() {

    }

    public static Connection getConnection() {
        Connection connection;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
