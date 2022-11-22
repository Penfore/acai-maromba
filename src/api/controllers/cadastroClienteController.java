package api.controllers;

import javafx.fxml.FXML;
import view.Telas;

public class cadastroClienteController {
	
	@FXML
	public void adicionarCliente() {
		Telas.telaPedidos();
	}
	
	public void voltar() {
		Telas.telaPedidos();
	}

}
