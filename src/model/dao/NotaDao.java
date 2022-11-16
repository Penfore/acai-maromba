package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Nota;
import entities.Pedido;

public class NotaDao extends ConnectionFactory {
    public boolean adicionar(Nota nota) {
        String sql = "INSERT INTO nota" +
                "(pedido_fk) "
                +
                "VALUES(?);";

        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setInt(1, nota.getPedido().getId());
            preparedStatement.execute();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();

            return false;
        }
    }

    public Nota buscar(Nota nota) {
        String sql = "SELECT * FROM nota WHERE id=? ;";
        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setInt(1, nota.getId());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return nota;
            } else
                return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean alterar(Nota nota) {
        String sql = "UPDATE nota " +
                "SET pedido_fk=? "
                +
                "WHERE id=?;";

        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setInt(1, nota.getPedido().getId());
            preparedStatement.executeUpdate();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();

            return false;
        }
    }

    public boolean deletar(Nota nota) {
        String sql = "DELETE FROM nota WHERE id=? ;";
        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setInt(1, nota.getId());
            preparedStatement.execute();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Nota> listar() {
        String sql = "SELECT * FROM nota";
        List<Nota> notas = new ArrayList<Nota>();
        try {
            Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            Nota nota = new Nota();
            Pedido pedido = new Pedido();

            while (resultSet.next()) {
                nota.setId(resultSet.getInt("id"));
                pedido.setId(resultSet.getInt("pedido_fk"));
                nota.setPedido(pedido);

                notas.add(nota);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return notas;
    }
}
