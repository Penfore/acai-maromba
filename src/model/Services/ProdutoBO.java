package model.Services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Entities.Produto;
import model.dao.ProdutoDao;

public class ProdutoBO implements BaseInterBO<Produto> {

	
	ProdutoDao dao = new ProdutoDao();

	public boolean adicionar(Produto produto) {
		Produto produtoTeste = dao.buscar(produto);
		try {
			if (produtoTeste == null) {
				if (dao.adicionar(produto) == true)
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

	public boolean deletar(Produto produto) {
		Produto produtoTeste = dao.buscar(produto);
		try {
			if (produtoTeste != null) {
				if (dao.deletar(produto) == true)
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

	public boolean alterar(Produto produto) {
		Produto produtoTeste = dao.buscar(produto);
		try {
			if (produtoTeste != null) {
				if (dao.alterar(produto) == true)
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

	public Produto buscar(Produto produto) {
		Produto produtoTeste = dao.buscar(produto);
		try {
			if (produtoTeste != null) {
				return produtoTeste;
			} else
				return new Produto(); // Classe vazia
		} catch (Exception e) {
			e.printStackTrace();
			return new Produto(); // Classe vazia
		}
	}

	public List<Produto> listar() {
		try {
			List<Produto> produtos = dao.listar();
			return produtos;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
    
}
