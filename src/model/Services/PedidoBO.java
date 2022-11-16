package model.Services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Entities.Pedido;
import model.dao.PedidoDao;

public class PedidoBO implements BaseInterBO<Pedido> {

	PedidoDao dao = new PedidoDao();

	public boolean adicionar(Pedido pedido) {
		Pedido pedidoTeste = dao.buscar(pedido);
		try {
			if (pedidoTeste == null) {
				if (dao.adicionar(pedido) == true)
					return true;
				else
					return false;
			} else
				return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean deletar(Pedido pedido) {
		Pedido pedidoTeste = dao.buscar(pedido);
		try {
			if (pedidoTeste != null) {
				if (dao.deletar(pedido) == true)
					return true;
				else
					return false;
			} else
				return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean alterar(Pedido pedido) {
		Pedido pedidoTeste = dao.buscar(pedido);
		try {
			if (pedidoTeste != null) {
				if (dao.alterar(pedido) == true)
					return true;
				else
					return false;
			} else
				return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Pedido buscar(Pedido pedido) {
		Pedido pedidoTeste = dao.buscar(pedido);
		try {
			if (pedidoTeste != null) {
				return pedidoTeste;
			} else
				return new Pedido(); // Classe vazia
		} catch (Exception e) {
			e.printStackTrace();
			return new Pedido(); // Classe vazia
		}
	}

	public List<Pedido> listar() {
		try {
			List<Pedido> pedidos = dao.listar();
			return pedidos;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
