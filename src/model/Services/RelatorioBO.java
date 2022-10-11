package model.Services;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Entities.Relatorio;
import model.dao.RelatorioDao;

public class RelatorioBO implements BaseInterBO {
    
	BaseInterDAO <Relatorio> dao = new RelatorioDao();
	
	public boolean adicionar(Relatorio relatorio) {
		ResultSet rs = dao.findBySpecifiedField(relatorio, "id");
		try {
			if(rs==null || !(rs.next()) ) {
				if(dao.inserir(relatorio) == true)
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

	
		public boolean apagar (Relatorio relatorio) {
			ResultSet rs = dao.findBySpecifiedField(relatorio, "id");
			try {
				if(rs!=null && rs.next() ) {
					if(dao.deletar(relatorio) == true)
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

	
		public boolean atualizar (Relatorio relatorio) {
			
			ResultSet rs = dao.findBySpecifiedField(relatorio, "id");
			try {
				if(rs!=null && rs.next() ) {
					if(dao.alterar(relatorio) == true)
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
		
		public boolean buscar (Relatorio relatorio) {
			
			ResultSet rs = dao.findBySpecifiedField(relatorio, "id");
			try {
				if(rs!=null && rs.next() ) {
					if(dao.buscar(relatorio) == true)
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
	
}
