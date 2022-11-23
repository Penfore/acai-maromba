package api.controllers;


import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.dao.FuncionarioDao;
import model.entities.Funcionario;
import api.dto.funcionarioDTO;
import javafx.fxml.FXML;

import view.Telas;

public class funcionarioController {
	
	FuncionarioDao dao = new FuncionarioDao();
	
	@FXML private TextField id;
	@FXML private TextField telefone;
	@FXML private TextField nome;
	
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
		Funcionario fun = new Funcionario();
		fun.setNome(nome.getText());
		fun.setTelefone(telefone.getText());
		fun.setId(id.getText());
		dao.adicionar(fun);
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
