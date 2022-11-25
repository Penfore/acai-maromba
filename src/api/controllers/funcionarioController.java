package api.controllers;


import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.dao.FuncionarioDao;
import model.Services.FuncionarioBO;
import model.entities.Cliente;
import model.entities.Funcionario;

import java.util.List;

import api.dto.funcionarioDTO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import view.Telas;

public class funcionarioController {

	@FXML private TextField id;
	@FXML private TextField telefone;
	@FXML private TextField nome;
	@FXML private TextField cpf;

	@FXML
	private TableColumn<Funcionario, String> columnNome;
	@FXML
	private TableColumn<Funcionario, String> columnID;
	@FXML
	private TableColumn<Funcionario, String> columnTelefone;

	// TODO: Criar entidade de Funcionario
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

	public void voltar() {
		Telas.telaHomeGerente();
	}

}
