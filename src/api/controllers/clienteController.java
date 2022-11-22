package api.controllers;



import model.entities.Cliente;
import view.Telas;
import api.dto.clienteDTO;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class clienteController {
	
	@FXML
	private TableView<Cliente> listarTable;
	@FXML 
	private TableColumn<clienteDTO, String> columnNome;
	@FXML 
	private TableColumn<clienteDTO, String> columnTelefone;

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
