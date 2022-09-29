package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() {
        try {
            // Substitua por seu usuário e senha do MySql. Ex. "root", "123"
            return DriverManager.getConnection("jdbc:mysql://localhost/PPI", /*usuario*/, /*senha*/);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
