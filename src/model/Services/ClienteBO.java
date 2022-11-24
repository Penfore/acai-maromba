package model.Services;

import java.util.List;

import model.entities.Cliente;
import model.dao.ClienteDao;

public class ClienteBO implements BaseInterBO<Cliente> {

	
	ClienteDao dao = new ClienteDao();

	public boolean adicionar(Cliente cliente) {
		Cliente clienteTeste = dao.buscar(cliente);
		try {
			if (clienteTeste == null) {
				if (dao.adicionar(cliente) == true)
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

	public boolean deletar(Cliente cliente) {
		Cliente clienteTeste = dao.buscar(cliente);
		try {
			if (clienteTeste != null) {
				if (dao.deletar(cliente) == true)
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

	public boolean alterar(Cliente cliente) {
		Cliente clienteTeste = dao.buscar(cliente);
		try {
			if (clienteTeste != null) {
				if (dao.alterar(cliente) == true)
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

	public Cliente buscar(Cliente cliente) {
		Cliente clienteTeste = dao.buscar(cliente);
		try {
			if (clienteTeste != null) {
				return clienteTeste;
			} else
				return new Cliente(); // Classe vazia
		} catch (Exception e) {
			e.printStackTrace();
			return new Cliente(); // Classe vazia
		}
	}

	public List<Cliente> listar() {
		try {
			List<Cliente> clientes = dao.listar();
			return clientes;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
    
	
}
