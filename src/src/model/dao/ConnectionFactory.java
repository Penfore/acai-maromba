package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    static Connection connection = null;
    //static String url = "jdbc:mysql://localhost:3306/acai_maromba"; // /PPI
    static String url = "jdbc:mysql://localhost:3306/acai_maromba?useTimezone=true&serverTimezone=UTC&useSSL=false";
    static String user = "root";
    static String senha = "x75679ii";

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(url, user, senha);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return connection;
        } else
            return connection;
    }
}
