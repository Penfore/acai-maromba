package controllers;

import view.Telas;

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
