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

}
