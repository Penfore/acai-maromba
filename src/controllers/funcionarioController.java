package controllers;


import javafx.scene.control.TableView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import view.Telas;

public class funcionarioController {
	@FXML
	private Button adicionarFuncionarioButton;
	@FXML
	private Button alterarFuncionarioButton;
	@FXML
	private Button deletarFuncionarioButton;
	// TODO: Criar entidade de Funcionario
	@FXML
	private TableView<Funcionario> listarFuncionarioTable;

	@FXML
	public void listar() {

	}

	@FXML
	public void adicionarFuncionario() {

	}

	@FXML
	public void deletar() {

	}

	@FXML
	public void alterar() {

	}

	public void voltar() {
		Telas.telaHome();
	}

}
