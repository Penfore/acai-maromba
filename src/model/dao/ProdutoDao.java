package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.entities.Adicional;
import model.entities.Produto;

public class ProdutoDao extends ConnectionFactory {
    public boolean adicionar(Produto produto) {
        String sql = "INSERT INTO produto" +
                "(nome, preco, adicional1_fk, adicional2_fk, adicional3_fk) "
                +
                "VALUES(?, ?, ?, ?, ?);";

        try {
            List<Adicional> adicionais = produto.getAdicionais();
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setDouble(2, produto.getPreco());
            preparedStatement.setInt(3, adicionais.get(0).getId());
            preparedStatement.setInt(4, adicionais.get(1).getId());
            preparedStatement.setInt(5, adicionais.get(2).getId());

            preparedStatement.execute();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();

            return false;
        }
    }

    public Produto buscar(Produto produto) {
        String sql = "SELECT * FROM produto WHERE nome=? ;";
        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setString(1, produto.getNome());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return produto;
            } else
                return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean alterar(Produto produto) {
        String sql = "UPDATE produto " +
                "SET nome=?, preco=?, adicional1_fk=?, adicional2_fk=?, adicional3_fk=? "
                +
                "WHERE id=?;";

        try {
            List<Adicional> adicionais = produto.getAdicionais();
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setDouble(2, produto.getPreco());
            preparedStatement.setInt(3, adicionais.get(0).getId());
            preparedStatement.setInt(4, adicionais.get(1).getId());
            preparedStatement.setInt(5, adicionais.get(2).getId());
            preparedStatement.setInt(6, produto.getId());

            preparedStatement.executeUpdate();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();

            return false;
        }
    }

    public boolean deletar(Produto produto) {
        String sql = "DELETE FROM produto WHERE id=? ;";
        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setInt(1, produto.getId());
            preparedStatement.execute();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Produto> listar() {
        String sql = "SELECT * FROM produto";
        List<Produto> produtos = new ArrayList<Produto>();
        try {
            Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            Produto produto = new Produto();
            List<Adicional> adicionais = new ArrayList<Adicional>();

            while (resultSet.next()) {
                produto.setId(resultSet.getInt("id"));
                produto.setNome(resultSet.getString("nome"));
                produto.setPreco(resultSet.getDouble("preco"));
                adicionais.get(0).setId(resultSet.getInt("adicional_fk1"));
                adicionais.get(1).setId(resultSet.getInt("adicional_fk2"));
                adicionais.get(2).setId(resultSet.getInt("adicional_fk3"));
                produto.setAdicionais(adicionais);

                produtos.add(produto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }
}
