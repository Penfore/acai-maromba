package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Adicional;

public class AdicionalDao extends ConnectionFactory {
    public boolean adicionar(Adicional adicional) {
        String sql = "INSERT INTO adicional" +
                "(nome, preco) "
                +
                "VALUES(?, ?);";

        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setString(1, adicional.getNome());
            preparedStatement.setDouble(2, adicional.getPreco());
            preparedStatement.execute();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();

            return false;
        }
    }

    public Adicional buscar(Adicional adicional) {
        String sql = "SELECT * FROM adicional WHERE nome=? ;";
        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setString(1, adicional.getNome());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return adicional;
            } else
                return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean alterar(Adicional adicional) {
        String sql = "UPDATE adicional " +
                "SET nome=?, preco=? "
                +
                "WHERE id=?;";

        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setString(1, adicional.getNome());
            preparedStatement.setDouble(2, adicional.getPreco());
            preparedStatement.setInt(3, adicional.getId());
            preparedStatement.executeUpdate();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();

            return false;
        }
    }

    public boolean deletar(Adicional adicional) {
        String sql = "DELETE FROM adicional WHERE nome=? ;";
        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setString(1, adicional.getNome());
            preparedStatement.execute();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Adicional> listar() {
        String sql = "SELECT * FROM adicional";
        List<Adicional> adicionais = new ArrayList<Adicional>();
        try {
            Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            Adicional adicional = new Adicional();

            while (resultSet.next()) {
                adicional.setId(resultSet.getInt("id"));
                adicional.setNome(resultSet.getString("nome"));
                adicional.setPreco(resultSet.getDouble("preco"));

                adicionais.add(adicional);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return adicionais;
    }
}
