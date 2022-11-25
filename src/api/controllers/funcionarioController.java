package api.controllers;


import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import model.dao.FuncionarioDao;
import model.Services.FuncionarioBO;
import model.entities.Funcionario;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import api.dto.funcionarioDTO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import view.Telas;

public class funcionarioController implements Initializable {

	@FXML private TextField id;
	@FXML private TextField telefone;
	@FXML private TextField nome;
	@FXML private TextField cpf;
	@FXML private TextField buscar;

	@FXML
	private TableColumn<Funcionario, String> columnNome;
	@FXML
	private TableColumn<Funcionario, Integer> columnID;
	@FXML
	private TableColumn<Funcionario, String> columnTelefone;

	@FXML
	private TableView<Funcionario> listarFuncionarioTable;
	@FXML
	private ObservableList<Funcionario> listaDeFuncionarios;

	private FuncionarioBO funcionarioBo = new FuncionarioBO();
	private Funcionario funcionario = new Funcionario();
	
	@FXML
	public void listar() {
		List<Funcionario> funcionarios = funcionarioBo.listar();
		listaDeFuncionarios = FXCollections.observableArrayList(funcionarios);
		columnID.setCellValueFactory(new PropertyValueFactory<>("id"));
		columnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		columnTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));
		listarFuncionarioTable.setItems(listaDeFuncionarios);
	}
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		listar();
	}

	@FXML
	public void adicionarFuncionario() {
		funcionario.setNome(nome.getText());
		funcionario.setTelefone(telefone.getText());
		funcionario.setId(Integer.parseInt(id.getText()));
		funcionario.setCpf(cpf.getText());
		funcionarioBo.adicionar(funcionario);
		if (funcionarioBo.adicionar(funcionario)) {
			System.out.println("Funcionario criado com sucesso!");
		} else {
			System.out.println("Erro ao criar um funcionario");
		}
	}

	@FXML
	public void deletar() {
		if (funcionarioBo.deletar(cpf.getText())) {
			System.out.println("Funcionario deletado com sucesso!");
			
		} else {
			System.out.println("Erro ao deletar um cliente");
		}
	}

	@FXML
	public void alterar() {
		funcionario.setNome(nome.getText());
		funcionario.setTelefone(telefone.getText());
		funcionario.setId(id.getText());
		funcionario.setCpf(cpf.getText());
		funcionarioBo.adicionar(funcionario);
		if (funcionarioBo.adicionar(funcionario)) {
			System.out.println("Funcionario alterado com sucesso!");
		} else {
			System.out.println("Erro ao alterar um funcionario");
		}
	}
	

	@FXML
	public void buscar() {
		
	}
	public void voltar() {
		Telas.telaHomeGerente();
    }

}
