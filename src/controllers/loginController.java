package controllers;

import view.Telas;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

public class loginController {
	@FXML
	private TextField login;

	@FXML
	private PasswordField senha;

	@FXML
	private Button loginButton;

	@FXML
	public void autenticar() {
		// TODO: Os campos login e senha serão validados aqui dentro
		Telas.telaHome();
	}
}
