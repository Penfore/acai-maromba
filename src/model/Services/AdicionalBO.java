package model.Services;

import java.util.List;

import model.dao.AdicionalDao;
import model.Entities.Adicional;

public class AdicionalBO implements BaseInterBO<Adicional> {
	AdicionalDao dao = new AdicionalDao();

	public boolean adicionar(Adicional adicional) {
		Adicional adicionalTeste = dao.buscar(adicional);
		try {
			if (adicionalTeste == null) {
				if (dao.adicionar(adicional) == true)
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

	public boolean deletar(Adicional adicional) {
		Adicional adicionalTeste = dao.buscar(adicional);
		try {
			if (adicionalTeste != null) {
				if (dao.deletar(adicional) == true)
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

	public boolean alterar(Adicional adicional) {
		Adicional adicionalTeste = dao.buscar(adicional);
		try {
			if (adicionalTeste != null) {
				if (dao.alterar(adicional) == true)
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

	public Adicional buscar(Adicional adicional) {
		Adicional adicionalTeste = dao.buscar(adicional);
		try {
			if (adicionalTeste != null) {
				return adicionalTeste;
			} else
				return new Adicional(); // Classe vazia
		} catch (Exception e) {
			e.printStackTrace();
			return new Adicional(); // Classe vazia
		}
	}

	public List<Adicional> listar() {
		try {
			List<Adicional> adicionais = dao.listar();
			return adicionais;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
