package model.Services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Entities.Pedido;
import model.dao.BaseInterDAO;
import model.dao.PedidoDao;

public class PedidoBO implements BaseInterBO {

	BaseInterDAO <Pedido> dao = new PedidoDao();
	
	public boolean adicionar(Pedido pedido) {
		ResultSet rs = dao.findBySpecifiedField(pedido, "id");
		try {
			if(rs==null || !(rs.next()) ) {
				if(dao.inserir(pedido) == true)
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

	
		public boolean apagar (Pedido pedido) {
			ResultSet rs = dao.findBySpecifiedField(pedido, "id");
			try {
				if(rs!=null && rs.next() ) {
					if(dao.deletar(pedido) == true)
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

	
		public boolean atualizar (Pedido pedido) {
			
			ResultSet rs = dao.findBySpecifiedField(pedido, "id");
			try {
				if(rs!=null && rs.next() ) {
					if(dao.alterar(pedido) == true)
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
		
		public boolean buscar (Pedido pedido) {
			
			ResultSet rs = dao.findBySpecifiedField(pedido, "id");
			try {
				if(rs!=null && rs.next() ) {
					if(dao.buscar(pedido) == true)
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
	    

	
		public List<Pedido> listar(){
			List<Pedido> pedidos = new ArrayList<Pedido>();
			ResultSet rs = dao.findAll();
			try {
				while(rs.next()) {
					Pedido pedido = new Pedido();
					pedido.setDataPedido(rs.getString("data"));
					pedido.setCliente(rs.getString("cliente"));
					pedido.setFormaPagamento(rs.getString("pagamento"));
					pedido.setProduto(rs.getNString("produto"));
					pedido.setQuantidade(rs.getInt("quantidade"));
					
					pedidos.add(pedido);
				}
				return pedidos;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
	
}
