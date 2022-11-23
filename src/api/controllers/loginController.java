package api.controllers;

import view.Telas;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class loginController {
	
	@FXML private TextField login;
	@FXML private TextField senha;

	@FXML
	public void autenticar() {
		// TODO: Os campos login e senha serão validados aqui dentro
		Telas.telaHome();
	}
}
