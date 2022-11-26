package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

public class JDBCExemplo {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();

        String sql = "insert into contatos " +
                "(nome,email,endereco,dataNascimento)" +
                "values (?,?,?,?);";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "Fulvio Leo");
        preparedStatement.setString(2, "fulvio@email.com");
        preparedStatement.setString(3, "Rua de Teste, 666");

        java.sql.Date data = new java.sql.Date(Calendar.getInstance().getTimeInMillis());

        preparedStatement.setDate(4, data);
        preparedStatement.execute();
        preparedStatement.close();
        System.out.println("Gravado com sucesso!");
        connection.close();
    }
}
