package api.controllers;

import view.Telas;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class loginController {
	
	@FXML private TextField login;
	@FXML private TextField senha;

	@FXML
	public void autenticar() {
		if(login.getText().equals("admin") && senha.getText().equals("admin")) {
			Telas.telaHomeGerente();
		} else {
			Telas.telaHome();
		}
		
	}
	
	public void cadastrar() {
		Telas.telaCadastro();
	}
	
}
