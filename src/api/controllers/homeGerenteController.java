package api.controllers;

import view.Telas;

public class homeGerenteController {


	
	public void paraProdutos() {
		Telas.telaProdutos();
	}

	public void paraRelatorios() {
		Telas.telaRelatorios();
	}

	public void paraFuncionarios() {
		Telas.telaFuncionarios();
	}

	public void paraSair() {
		Telas.telaLogin();
	}

}
