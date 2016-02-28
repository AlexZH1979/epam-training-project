package com.epam.zhmyd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String USER = "root";
    private static final String PASSWORD = "root";


    private static Connection connection;

    public static void execute(String sql) {
        Connection connection = getConnection();
        if (connection != null) {
            try (Statement statement = connection.createStatement()) {
                statement.execute(sql);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static Connection getConnection() {
        if (connection == null) {
            try {
                connection = createConnection();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return connection;
    }

    private static synchronized Connection createConnection() throws SQLException {
        Properties properties = new Properties();
        properties.put("user", USER);
        properties.put("password", PASSWORD);
        Driver driver = new com.mysql.jdbc.Driver();
        return driver.connect(URL, properties);
    }

    public static void create() {
        execute("CREATE SCHEMA `simple`;");
        execute("use `simple`;");
        execute(SQLStatements.TABLE_USER);
    }
}
