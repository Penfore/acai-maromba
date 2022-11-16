package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.entities.Cliente;
import model.entities.Endereco;

public class ClienteDao extends ConnectionFactory {

    public boolean adicionar(Cliente cliente) {
        String sql = "INSERT INTO cliente" +
                "(nome, telefone, endereco_pais, endereco_estado, endereco_cidade, endereco_logradouro, endereco_numero) "
                +
                "VALUES(?, ?, ?, ?, ?, ?, ?);";

        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getTelefone());
            preparedStatement.setString(3, cliente.getEndereco().getPais());
            preparedStatement.setString(4, cliente.getEndereco().getEstado());
            preparedStatement.setString(5, cliente.getEndereco().getCidade());
            preparedStatement.setString(6, cliente.getEndereco().getLogradouro());
            preparedStatement.setString(7, cliente.getEndereco().getNumero());
            preparedStatement.execute();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();

            return false;
        }
    }

    public Cliente buscar(Cliente cliente) {
        String sql = "SELECT * FROM cliente WHERE nome=? ;";
        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setString(1, cliente.getNome());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return cliente;
            } else
                return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean alterar(Cliente cliente) {
        String sql = "UPDATE cliente " +
                "SET nome=?, telefone=?, endereco_pais=?, endereco_estado=?, endereco_cidade=?, endereco_logradouro=?, endereco_numero=? "
                +
                "WHERE id=?;";

        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getTelefone());
            preparedStatement.setString(3, cliente.getEndereco().getPais());
            preparedStatement.setString(4, cliente.getEndereco().getEstado());
            preparedStatement.setString(5, cliente.getEndereco().getCidade());
            preparedStatement.setString(6, cliente.getEndereco().getLogradouro());
            preparedStatement.setString(7, cliente.getEndereco().getNumero());
            preparedStatement.setInt(8, cliente.getId());
            preparedStatement.executeUpdate();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();

            return false;
        }
    }

    public boolean deletar(Cliente cliente) {
        String sql = "DELETE FROM cliente WHERE nome=? ;";
        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.execute();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Cliente> listar() {
        String sql = "SELECT * FROM cliente";
        List<Cliente> clientes = new ArrayList<Cliente>();
        try {
            Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            Cliente cliente = new Cliente();
            Endereco endereco = new Endereco();

            while (resultSet.next()) {
                cliente.setId(resultSet.getInt("id"));
                cliente.setNome(resultSet.getString("nome"));
                cliente.setTelefone(resultSet.getString("telefone"));
                endereco.setPais("endereco_pais");
                endereco.setEstado(resultSet.getString("endereco_estado"));
                endereco.setCidade(resultSet.getString("endereco_cidade"));
                endereco.setLogradouro(resultSet.getString("endereco_logradouro"));
                endereco.setNumero(resultSet.getString("endereco_numero"));
                cliente.setEndereco(endereco);

                clientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }
}
