package model.Services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Entities.Cliente;
import model.dao.ClienteDao;

public class ClienteBO implements BaseInterBO {

	
	BaseInterDAO <Cliente> dao = new ClienteDao();
	
	public boolean adicionar(Cliente cliente) {
		ResultSet rs = dao.findBySpecifiedField(cliente, "id");
		try {
			if(rs==null || !(rs.next()) ) {
				if(dao.inserir(cliente) == true)
					return true;
					else return false;
			}
			else return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	
		public boolean apagar(Cliente cliente) {
			ResultSet rs = dao.findBySpecifiedField(cliente, "id");
			try {
				if(rs!=null && rs.next() ) {
					if(dao.deletar(cliente) == true)
						return true;
						else return false;
				}
				else return false;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}	
		}

	
		public boolean atualizar(Cliente cliente) {
			
			ResultSet rs = dao.findBySpecifiedField(cliente, "id");
			try {
				if(rs!=null && rs.next() ) {
					if(dao.alterar(cliente) == true)
						return true;
						else return false;
				}
				else return false;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}	
		}
		
		public boolean buscar(Cliente cliente) {
			
			ResultSet rs = dao.findBySpecifiedField(cliente, "id");
			try {
				if(rs!=null && rs.next() ) {
					if(dao.buscar(cliente) == true)
						return true;
						else return false;
				}
				else return false;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}	
		}
	    

	
		public List<Cliente> listar(){
			List<Cliente> clientes = new ArrayList<Cliente>();
			ResultSet rs = dao.findAll();
			try {
				while(rs.next()) {
					Cliente cliente = new Cliente();
					cliente.setNome(rs.getString("nome"));
					cliente.setEndereco(rs.getString("endereco"));
					cliente.setTelefone(rs.getString("telefone"));
					
					clientes.add(cliente);
				}
				return clientes;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
    
	
}
