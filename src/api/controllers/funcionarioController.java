package api.controllers;


import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.entities.Funcionario;
import api.dto.funcionarioDTO;
import javafx.fxml.FXML;

import view.Telas;

public class funcionarioController {
	
	@FXML 
	private TableColumn<funcionarioDTO, String> columnNome;
	@FXML 
	private TableColumn<funcionarioDTO, String> columnID;
	@FXML 
	private TableColumn<funcionarioDTO, String> columnTelefone;
	
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
