// TODO: Importar as coisinhas já que nada funciona aqui
public class FuncionarioBO implements BaseInterBO<Funcionario> {
    FuncionarioDao funcionarioDao = new FuncionarioDao();

    public boolean adicionar(Funcionario funcionario) {
		Funcionario funcionarioTeste = funcionarioDao.buscar(funcionario);
		try {
			if (funcionarioTeste == null) {
				if (dao.adicionar(funcionario) == true)
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

    public boolean deletar(String funcionarioNome) {
		Funcionario funcionarioTeste = dao.buscar(funcionarioNome);
		try {
			if (funcionarioTeste != null) {
				if (dao.deletar(funcionarioNome) == true)
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
		Funcionario funcionarioTeste = dao.buscar(funcionario);
		try {
			if (funcionarioTeste != null) {
				if (dao.alterar(funcionario) == true)
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
		Funcrionario funcionarioTeste = dao.buscar(funcionario);
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
}
