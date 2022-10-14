package model.Services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Entities.Nota;
import model.dao.NotaDao;

public class NotaBO implements BaseInterBO<Nota> {

	NotaDao dao = new NotaDao();

	public boolean adicionar(Nota nota) {
		Nota notaTeste = dao.buscar(nota);
		try {
			if (notaTeste == null) {
				if (dao.adicionar(nota) == true)
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

	public boolean deletar(Nota nota) {
		Nota notaTeste = dao.buscar(nota);
		try {
			if (notaTeste != null) {
				if (dao.deletar(nota) == true)
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

	public boolean alterar(Nota nota) {
		Nota notaTeste = dao.buscar(nota);
		try {
			if (notaTeste != null) {
				if (dao.alterar(nota) == true)
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

	public Nota buscar(Nota nota) {
		Nota notaTeste = dao.buscar(nota);
		try {
			if (notaTeste != null) {
				return notaTeste;
			} else
				return new Nota(); // Classe vazia
		} catch (Exception e) {
			e.printStackTrace();
			return new Nota(); // Classe vazia
		}
	}

	public List<Nota> listar() {
		try {
			List<Nota> notas = dao.listar();
			return notas;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
   
    }
