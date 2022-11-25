package api.controllers;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.entities.Funcionario;
import view.Telas;

public class homeGerenteController {

	@FXML 
	private TableColumn<Funcionario, String> columnNome;
	@FXML 
	private TableColumn<Funcionario, String> columnID;
	@FXML
	private TableView<Funcionario> listarTable;

	public void paraProdutos() {
		Telas.telaProdutos();
	}

	public void paraRelatorios() {
		Telas.telaRelatorios();
	}

	public void paraFuncionarios() {
		Telas.telaFuncionarios();
	}

	public void paraSair() {
		Telas.telaLogin();
	}

	@FXML
	public void listar() {
		ObservableList<Funcionario> parsedFuncionarios = null;
		// TODO: Implementar uma lista observable e settar no listarTable
		// ObservableList<Funcionario> parsedFuncionarios = FXCollections.observableArrayList();
		// for(funcionario) { // Será feito um map // TODO: Descobrir como fazer map em java
		// :v
		// parsedFuncionarios.add(funcionario)
		// }
		listarTable.setItems(parsedFuncionarios);
	}
}
