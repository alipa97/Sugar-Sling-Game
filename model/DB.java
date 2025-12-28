package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/sugar_sling";
    private static final String DB_USER = "root";      // ganti kalau pakai user lain
    private static final String DB_PASS = "";          // ganti sesuai passwordmu

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }
}
