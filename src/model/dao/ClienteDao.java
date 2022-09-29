package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entities.Cliente;
import entities.Endereco;

public class ClienteDao extends ConnectionFactory {

    public boolean inserir(Cliente cliente) {
        String sql = "INSERT INTO tb_cliente nome, endereco, telefone VALUES(?, ?, ?);";

        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setString(1, cliente.getNome());
            // TODO: Ver como adicionar os dados da classe Endereco. Provavelmente precisa
            // de mais sets
            preparedStatement.setString(2, cliente.getEndereco().toString());
            preparedStatement.setString(3, cliente.getTelefone());
            preparedStatement.execute();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();

            return false;
        }
    }

    public Cliente buscar(Cliente cliente) {
        String sql = "SELECT * FROM tb_cliente WHERE nome=? ;";
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
        String sql = "UPDATE tb_cliente SET nome=?, endereco=?, telefone=? WHERE nome=? ;";

        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setString(1, cliente.getNome());
            // TODO: Ver como adicionar os dados da classe Endereco. Provavelmente precisa
            // de mais sets
            preparedStatement.setString(2, cliente.getEndereco().toString());
            preparedStatement.setString(3, cliente.getTelefone());
            preparedStatement.setString(4, cliente.getNome());
            preparedStatement.executeUpdate();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();

            return false;
        }
    }

    public boolean deletar(Cliente cliente) {
        String sql = "DELETE FROM tb_cliente WHERE nome=? ;";
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

    public static void main(String args[]) {
        ClienteDao dao = new ClienteDao();

        Cliente cliente = new Cliente();
        cliente.setNome("Fulvio Leo");
        Endereco clienteEndereco = new Endereco("Brasil", "RN", "Mossoró", "Rua da doidera", "666");
        cliente.setEndereco(clienteEndereco);
        cliente.setTelefone("(84) 9 8765-4321");

        System.out.println(dao.inserir(cliente));
        System.out.println(dao.buscar(cliente));
    }
}
