package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.entities.Pedido;


public class PedidoDao extends ConnectionFactory {
    public boolean adicionar(Pedido pedido) {
        String sql = "INSERT INTO pedido" +
                "(cliente, produto, quantidade, data, forma_pagamento) "
                +
                "VALUES(?, ?, ?, ?, ?);";

        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setString(1, pedido.getCliente());
            preparedStatement.setString(2, pedido.getProduto());
            preparedStatement.setInt(3, pedido.getQuantidade());
            preparedStatement.setString(4, pedido.getData());
            preparedStatement.setString(5, pedido.getFormaPagamento());

            preparedStatement.execute();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();

            return false;
        }
    }

    public Pedido buscar(Pedido pedido) {
        String sql = "SELECT * FROM pedido WHERE cliente=?";
        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setString(1, pedido.getCliente());
           

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return pedido;
            } else
                return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean alterar(Pedido pedido) {
        String sql = "UPDATE pedido " +
                "SET produto=?, quantidade=?, data=?, forma_pagamento=? "
                +
                "WHERE cliente=?;";

        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setString(1, pedido.getCliente());
            preparedStatement.setString(2, pedido.getProduto());
            preparedStatement.setInt(3, pedido.getQuantidade());
            preparedStatement.setString(4, pedido.getData());
            preparedStatement.setString(5, pedido.getFormaPagamento());
            preparedStatement.executeUpdate();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();

            return false;
        }
    }

    public boolean deletar(Pedido pedido) {
        String sql = "DELETE FROM pedido WHERE cliente=? ;";
        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setString(1, pedido.getCliente());
            preparedStatement.execute();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Pedido> listar() {
        String sql = "SELECT * FROM pedido";
        List<Pedido> pedidos = new ArrayList<Pedido>();
        try {
            Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
    

            while (resultSet.next()) {
            	Pedido p = new Pedido();
                p.setCliente(resultSet.getString("cliente"));
                p.setProduto(resultSet.getString("produto"));
                p.setQuantidade(resultSet.getInt("quantidade"));
                p.setData(resultSet.getString("data"));
                p.setFormaPagamento(resultSet.getString("forma_pagamento"));

                pedidos.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pedidos;
    }
}
