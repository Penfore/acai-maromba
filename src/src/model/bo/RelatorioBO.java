package model.Services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.entities.Relatorio;
import model.dao.RelatorioDao;

public class RelatorioBO implements BaseInterBO<Relatorio> {
    
	RelatorioDao dao = new RelatorioDao();

	public boolean adicionar(Relatorio relatorio) {
		Relatorio relatorioTeste = dao.buscar(relatorio);
		try {
			if (relatorioTeste == null) {
				if (dao.adicionar(relatorio) == true)
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

	public boolean deletar(Relatorio relatorio) {
		Relatorio relatorioTeste = dao.buscar(relatorio);
		try {
			if (relatorioTeste != null) {
				if (dao.deletar(relatorio) == true)
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

	public boolean alterar(Relatorio relatorio) {
		Relatorio relatorioTeste = dao.buscar(relatorio);
		try {
			if (relatorioTeste != null) {
				if (dao.alterar(relatorio) == true)
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

	public Relatorio buscar(Relatorio relatorio) {
		Relatorio relatorioTeste = dao.buscar(relatorio);
		try {
			if (relatorioTeste != null) {
				return relatorioTeste;
			} else
				return new Relatorio(); // Classe vazia
		} catch (Exception e) {
			e.printStackTrace();
			return new Relatorio(); // Classe vazia
		}
	}

	public List<Relatorio> listar() {
		try {
			List<Relatorio> relatorios = dao.listar();
			return relatorios;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
