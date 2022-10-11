package model.Services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Entities.Nota;
import model.dao.BaseInterDAO;
import model.dao.NotaDao;

public class NotaBO implements BaseInterBO {

	BaseInterDAO <Nota> dao = new NotaDao();
	
	public boolean adicionar(Nota nota) {
		ResultSet rs = dao.findBySpecifiedField(nota, "id");
		try {
			if(rs==null || !(rs.next()) ) {
				if(dao.inserir(nota) == true)
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

	
		public boolean apagar (Nota nota) {
			ResultSet rs = dao.findBySpecifiedField(nota, "id");
			try {
				if(rs!=null && rs.next() ) {
					if(dao.deletar(nota) == true)
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

	
		public boolean atualizar (Nota nota) {
			
			ResultSet rs = dao.findBySpecifiedField(nota, "id");
			try {
				if(rs!=null && rs.next() ) {
					if(dao.alterar(nota) == true)
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

	
		public boolean buscar (Nota nota) {
			
			ResultSet rs = dao.findBySpecifiedField(nota, "id");
			try {
				if(rs!=null && rs.next() ) {
					if(dao.buscar(nota) == true)
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
		
		public List<Nota> listar(){
			List<Nota> notas = new ArrayList<Nota>();
			ResultSet rs = dao.findAll();
			try {
				while(rs.next()) {
					Nota nota = new Nota();
					nota.setPedido(rs.getString("pedido"));
					
					notas.add(nota);
				}
				return notas;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
   
    }
