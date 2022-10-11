package model.Services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Entities.Produto;
import model.dao.ProdutoDao;

public class ProdutoBO implements BaseInterBO {

	
	BaseInterDAO <Produto> dao = new ProdutoDao();
	
	public boolean adicionar(Produto produto) {
		ResultSet rs = dao.findBySpecifiedField(produto, "id");
		try {
			if(rs==null || !(rs.next()) ) {
				if(dao.inserir(produto) == true)
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
	
		public boolean apagar (Produto produto) {
			ResultSet rs = dao.findBySpecifiedField(produto, "id");
			try {
				if(rs!=null && rs.next() ) {
					if(dao.deletar(produto) == true)
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

	
		public boolean atualizar (Produto produto) {
			
			ResultSet rs = dao.findBySpecifiedField(produto, "id");
			try {
				if(rs!=null && rs.next() ) {
					if(dao.alterar(produto) == true)
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

	
		public boolean buscar (Produto produto) {
			
			ResultSet rs = dao.findBySpecifiedField(produto, "id");
			try {
				if(rs!=null && rs.next() ) {
					if(dao.buscar(produto) == true)
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
	    

	
		public List<Produto> listar(){
			List<Produto> produtos = new ArrayList<Produto>();
			ResultSet rs = dao.findAll();
			try {
				while(rs.next()) {
					Produto produto = new Produto();
					produto.setNome(rs.getString("nome"));
					produto.setPreco(rs.getString("preco"));
					produto.setAdicionais(rs.getString("adicional"));
					
					produtos.add(produto);
				}
				return produtos;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
    
}
