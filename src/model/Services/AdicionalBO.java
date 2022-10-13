package Services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.AdicionalDao;
import entities.Adicional;

public class AdicionalBO implements BaseInterBO {

	Services.BaseInterBO<Adicional> dao = new AdicionalDao();

	public boolean adicionar(Adicional adicional) {
		ResultSet rs = dao.findBySpecifiedField(adicional, "id");
		try {
			if (rs == null || !(rs.next())) {
				if (dao.inserir(adicional) == true)
					return true;
				else
					return false;
			} else
				return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public boolean apagar(Adicional adicional) {
		ResultSet rs = dao.findBySpecifiedField(adicional, "id");
		try {
			if (rs != null && rs.next()) {
				if (dao.deletar(adicional) == true)
					return true;
				else
					return false;
			} else
				return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public boolean atualizar(Adicional adicional) {

		ResultSet rs = dao.findBySpecifiedField(adicional, "id");
		try {
			if (rs != null && rs.next()) {
				if (dao.alterar(adicional) == true)
					return true;
				else
					return false;
			} else
				return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public boolean buscar(Adicional adicional) {

		ResultSet rs = dao.findBySpecifiedField(adicional, "id");
		try {
			if (rs != null && rs.next()) {
				if (dao.buscar(adicional) == true)
					return true;
				else
					return false;
			} else
				return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public List<Adicional> listar() {
		List<Adicional> adicionais = new ArrayList<Adicional>();
		ResultSet rs = dao.findAll();
		try {
			while (rs.next()) {
				Adicional adicional = new Adicional();
				adicional.setNome(rs.getString("nome"));
				adicional.setPreco(rs.getDouble("preco"));

				adicionais.add(adicional);
			}
			return adicionais;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
