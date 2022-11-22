package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Telas extends Application{
	private static Stage stage;
	public static void main (String args[]) {
		launch();
	}
	private void setStage(Stage st) {
		stage = st;
	}
	
	@Override
	public void start(Stage argu) throws Exception {
		setStage(argu);
		argu.setTitle("Login");
		telaLogin();
		
	}
	
	public static void telaLogin() {
		try {
			Parent root = FXMLLoader.load(Telas.class.getResource("resources/telaLogin.fxml"));
			Scene scene = new Scene (root);
			stage.setScene(scene);
			stage.setTitle("Tela Login");
			stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
}
	
	public static void telaHome() {
		try {
			Parent root = FXMLLoader.load(Telas.class.getResource("resources/telaHome.fxml"));
			Scene scene = new Scene (root);
			stage.setScene(scene);
			stage.setTitle("Tela Home");
			stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
}

	public static void telaFuncionarios() {
		try {
			Parent root = FXMLLoader.load(Telas.class.getResource("resources/telaFuncionarios.fxml"));
			Scene scene = new Scene (root);
			stage.setScene(scene);
			stage.setTitle("Tela Funcionarios");
			stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
}
	
	public static void telaClientes() {
		try {
			Parent root = FXMLLoader.load(Telas.class.getResource("resources/telaClientes.fxml"));
			Scene scene = new Scene (root);
			stage.setScene(scene);
			stage.setTitle("Tela Clientes");
			stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
}
	
	public static void telaPedidos() {
		try {
			Parent root = FXMLLoader.load(Telas.class.getResource("resources/telaPedidos.fxml"));
			Scene scene = new Scene (root);
			stage.setScene(scene);
			stage.setTitle("Tela Pedidos");
			stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
}
	
	public static void telaProdutos() {
		try {
			Parent root = FXMLLoader.load(Telas.class.getResource("resources/telaProdutos.fxml"));
			Scene scene = new Scene (root);
			stage.setScene(scene);
			stage.setTitle("Tela Produtos");
			stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
}
	
	public static void telaRelatorios() {
		try {
			Parent root = FXMLLoader.load(Telas.class.getResource("resources/telaRelatorios.fxml"));
			Scene scene = new Scene (root);
			stage.setScene(scene);
			stage.setTitle("Tela Relatorios");
			stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
}
	
	public static void telaCadastroClientes() {
		try {
			Parent root = FXMLLoader.load(Telas.class.getResource("resources/telaCadastroCliente.fxml"));
			Scene scene = new Scene (root);
			stage.setScene(scene);
			stage.setTitle("Tela Cadastro Clientes");
			stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
}
	
}
