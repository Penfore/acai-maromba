package controllers;



import model.entities.Cliente;
import view.Telas;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class clienteController {
	@FXML
	private Button adicionarClienteButton;
	@FXML
	private TableView<Cliente> listarTable;

	@FXML
	public void adicionarCliente() {

	}

	// TODO: Implementar o restante na view
	@FXML
	public void deletar() {

	}

	@FXML
	public void alterar() {

	}

	public void voltar() {
		Telas.telaHome();
	}

	@FXML
	public void listar() {

	}

}
