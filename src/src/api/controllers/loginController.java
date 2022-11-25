package api.controllers;

import view.Telas;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class loginController {
	
	@FXML private TextField login;
	@FXML private TextField senha;

	@FXML
	public void autenticar() {
		Telas.telaHome();
		// para acessar função de gerente, trocar Telas.telaHome();, para Telas.telaHomeGerente();
	}
	
	public void cadastrar() {
		Telas.telaCadastro();
	}
	
}
