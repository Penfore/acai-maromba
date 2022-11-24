package model.Services;

import java.util.List;

import model.dao.FuncionarioDao;
import model.entities.Funcionario;

public class FuncionarioBO implements BaseInterBO<Funcionario> {
    
	FuncionarioDao funcionarioDao = new FuncionarioDao();

    public boolean adicionar(Funcionario funcionario) {
		Funcionario funcionarioTeste = funcionarioDao.buscar(funcionario);
		try {
			if (funcionarioTeste == null) {
				if (funcionarioDao.adicionar(funcionario) == true)
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

    public boolean deletar(Funcionario funcionario) {
		Funcionario funcionarioTeste = funcionarioDao.buscar(funcionario);
		try {
			if (funcionarioTeste != null) {
				if (funcionarioDao.deletar(funcionario) == true)
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

    public boolean alterar(Funcionario funcionario) {
		Funcionario funcionarioTeste = funcionarioDao.buscar(funcionario);
		try {
			if (funcionarioTeste != null) {
				if (funcionarioDao.alterar(funcionario) == true)
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

    public Funcionario buscar(Funcionario funcionario) {
		Funcionario funcionarioTeste = funcionarioDao.buscar(funcionario);
		try {
			if (funcionarioTeste != null) {
				return funcionarioTeste;
			} else
				return new Funcionario(); // Classe vazia
		} catch (Exception e) {
			e.printStackTrace();
			return new Funcionario(); // Classe vazia
		}
	}
    
    public List<Funcionario> listar() {
		try {
			List<Funcionario> funcionarios = funcionarioDao.listar();
			return funcionarios;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
