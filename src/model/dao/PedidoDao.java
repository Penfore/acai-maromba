package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Cliente;
import entities.Pedido;
import entities.Produto;

public class PedidoDao extends ConnectionFactory {
    public boolean adicionar(Pedido pedido) {
        String sql = "INSERT INTO pedido" +
                "(data_pedido, cliente_fk, quantidade, produto_fk, forma_pagamento) "
                +
                "VALUES(?, ?, ?, ?, ?);";

        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            // TODO: Verificar como converter LocalDate para Date
            // preparedStatement.setDate(1, pedido.getDataPedido());
            preparedStatement.setInt(2, pedido.getCliente().getId());
            preparedStatement.setInt(3, pedido.getQuantidade());
            preparedStatement.setInt(4, pedido.getProduto().getId());
            preparedStatement.setString(5, pedido.getFormaPagamento().getDescricao());

            preparedStatement.execute();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();

            return false;
        }
    }

    public Pedido buscar(Pedido pedido) {
        String sql = "SELECT * FROM pedido WHERE cliente_fk=?, data_pedido=? ;";
        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setInt(1, pedido.getCliente().getId());
            // TODO: Verificar como converter LocalDate para Date
            // preparedStatement.setDate(2, pedido.getDataPedido());

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
                "SET data_pedido=?, cliente_fk=?, quantidade=?, produto_fk=?, forma_pagamento=? "
                +
                "WHERE id=?;";

        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            // TODO: Verificar como converter LocalDate para Date
            // preparedStatement.setDate(1, pedido.getDataPedido());
            preparedStatement.setInt(2, pedido.getCliente().getId());
            preparedStatement.setInt(3, pedido.getQuantidade());
            preparedStatement.setInt(4, pedido.getProduto().getId());
            preparedStatement.setString(5, pedido.getFormaPagamento().getDescricao());

            preparedStatement.setInt(6, pedido.getId());
            preparedStatement.executeUpdate();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();

            return false;
        }
    }

    public boolean deletar(Pedido pedido) {
        String sql = "DELETE FROM pedido WHERE id=? ;";
        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setInt(1, pedido.getId());
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
            Pedido pedido = new Pedido();
            Cliente cliente = new Cliente();
            Produto produto = new Produto();

            while (resultSet.next()) {
                pedido.setId(resultSet.getInt("id"));
                // TODO: Verificar como converter LocalDate para Date
                // pedido.setDataPedido(resultSet.getDate("data_pedido"));
                cliente.setId(resultSet.getInt("cliente_fk"));
                pedido.setCliente(cliente);
                pedido.setQuantidade(resultSet.getInt("quantidade"));
                produto.setId(resultSet.getInt("produto_fk"));
                pedido.setProduto(produto);
                // TODO: Verificar como converter String para enum FormaPagamento
                // pedido.setFormaPagamento(resultSet.getString("forma_pagamento"));

                pedidos.add(pedido);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pedidos;
    }
}
