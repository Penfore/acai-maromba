package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.entities.Funcionario;

public class FuncionarioDao extends ConnectionFactory {
	
	public boolean adicionar(Funcionario funcionario) {
        String sql = "INSERT INTO produto" +
                "(id, nome, telefone) "
                +
                "VALUES(?, ?, ?, ?, ?);";

        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setString(1, funcionario.getId());
            preparedStatement.setString(2, funcionario.getNome());
            preparedStatement.setString(3, funcionario.getTelefone());
            preparedStatement.execute();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();

            return false;
        }
    }

	public Funcionario buscar(Funcionario funcionario) {
        String sql = "SELECT * FROM cliente WHERE nome=? ;";
        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setString(1, funcionario.getNome());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return funcionario;
            } else
                return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean alterar(Funcionario funcionario) {
        String sql = "UPDATE cliente " +
                "SET id=?, nome=?, telefone=? ";

        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setString(1, funcionario.getId());
            preparedStatement.setString(2, funcionario.getNome());
            preparedStatement.setString(3, funcionario.getTelefone());
            preparedStatement.executeUpdate();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();

            return false;
        }
    }

    public boolean deletar(Funcionario funcionario) {
        String sql = "DELETE FROM cliente WHERE nome=? ;";
        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setString(1, funcionario.getNome());
            preparedStatement.execute();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Funcionario> listar() {
        String sql = "SELECT * FROM funcionario";
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        try {
            Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            Funcionario funcionario = new Funcionario();

            while (resultSet.next()) {
                funcionario.setId(resultSet.getString("id"));
                funcionario.setNome(resultSet.getString("nome"));
                funcionario.setTelefone(resultSet.getString("telefone"));

                funcionarios.add(funcionario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return funcionarios;
    }

}
